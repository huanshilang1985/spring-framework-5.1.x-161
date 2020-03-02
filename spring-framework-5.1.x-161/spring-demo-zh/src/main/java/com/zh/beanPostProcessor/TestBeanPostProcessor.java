package com.zh.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * 自定义Spring后置处理器
 * 同时继承PriorityOrdered设置执行顺序，order值越小越早执行
 * @author he.zhang
 * @date 2020/3/2 7:51
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {

	/**
	 * 在bean初始化之前执行的方法
	 * @param bean 表示原始bean对象
	 * @param beanName bean名称
	 * @return 只能返回bean或bean的代理类，null会报错
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("BeforeInitialization");
		}
		// 在这里可以使用Proxy.newProxyInstance()创建这个bean的代理，并返回代理类
		return bean;
	}

	/**
	 * 在bean初始化之后执行的方法
	 * @param bean 表示bean的原始对象
	 * @param beanName bean名称
	 * @return 只能返回bean或bean的代理类，null会报错
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(beanName.equals("indexDao")){
			System.out.println("AfterInitialization");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 101;
	}
}
