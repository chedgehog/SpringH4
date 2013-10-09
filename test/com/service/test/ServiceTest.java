package com.service.test;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cc.smh.bean.User;
import cc.smh.service.UserService;


public class ServiceTest {
	private ApplicationContext context;

	@Before
	public void before() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		UserService userService =  (UserService) context.getBean("userService");
		User user = new User();
		user.setPassword("111");
		user.setUsername("ddddddddd");
		userService.editSave(user);
		
		List list = userService.queryAll(" from User");
		for (int i = 0; i < list.size(); i++) {
			User u = (User)list.get(i);
			System.out.println(u.getUsername());
		}
	}
}
