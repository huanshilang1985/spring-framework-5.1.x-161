package com.zh.test;

import com.zh.conf.AppConfig;
import com.zh.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AnnotationConfigApplicationContext构造方法里包含了register和refresh方法，也可以这么分开写
 * @author he.zhang
 * @date 2020/3/2 7:12
 */
public class Test2 {

	public static void main(String[] args) {
		// 准备Spring所有的前提环境
		// 1. 准备工厂=DefaultListableBeanFactory，实例化一个dbReader和一个scanner
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// 注册配置文件，读取所有的bean信息
		// 把一个class转成bd，最后put到map，map位置DefaultListableBeanFactory的属性beanDefinitionMap
		context.register(AppConfig.class);
		// 初始化Spring的环境
		context.refresh();

		IndexDao bean = context.getBean(IndexDao.class);
		bean.query();
	}

}
