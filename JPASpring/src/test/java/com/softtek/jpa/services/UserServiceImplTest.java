package com.softtek.jpa.services;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.softtek.jpa.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(inheritLocations = true)
@DatabaseSetup(value = { "/dataset/default.xml" }, type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class UserServiceImplTest {
	@Autowired
	private UserService userService;

	@Test
	@DatabaseSetup(value = "/dataset/scenario1.xml", type = DatabaseOperation.CLEAN_INSERT)
	public void testUserListService() {
		List<User> userList;
		userList = userService.userList();
		System.out.println(userList);
		System.out.println(userList.size());
		Assert.assertNotNull(userList);
	}

	@Test
	@DatabaseSetup(value = "/dataset/scenario1.xml", type = DatabaseOperation.CLEAN_INSERT)
	public void testUserFindService() {
		User foundUser;
		String username = "ramonlm";
		foundUser = userService.findUser("ramonlm");
		System.out.println(foundUser);
		Assert.assertEquals(username, foundUser.getUsername());
	}
}
