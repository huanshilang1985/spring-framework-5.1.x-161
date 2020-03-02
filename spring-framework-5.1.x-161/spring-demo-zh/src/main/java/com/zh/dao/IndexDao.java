package com.zh.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * 测试Dao
 * @author he.zhang
 * @date 2020/3/1 20:44
 */
@Repository
public class IndexDao {

	public IndexDao(){
		System.out.println("构造方法");
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	public void query(){
		System.out.println("IndexDao query");
	}
}
