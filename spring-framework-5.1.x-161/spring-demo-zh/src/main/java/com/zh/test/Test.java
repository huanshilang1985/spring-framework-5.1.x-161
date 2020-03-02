package com.zh.test;

import com.zh.conf.AppConfig;
import com.zh.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 启动类
 * @author he.zhang
 * @date 2020/3/1 20:46
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao dao = context.getBean(IndexDao.class);
		dao.query();
	}

}
