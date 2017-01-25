package com.softtek.jpa.services;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.softtek.jpa.domain.User;
import com.softtek.jpa.web.UserController;

@RunWith(MockitoJUnitRunner.class)
@WebAppConfiguration
public class UserControllerTest {

	private MockMvc mockMvc;

	@InjectMocks
	UserController userController;
	
	@Mock
	UserService userService;

	@Before
	public void setupUserControllerTest() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	@Test
	public void testUserControllerListViewStatusEqual200() throws Exception {
		int status = this.mockMvc.perform(MockMvcRequestBuilders.get("/User/List", "")).andReturn().getResponse()
				.getStatus();
		Assert.assertTrue(status == 200);
	}

	@Test
	public void testUserControllerListStatusEqual204() throws Exception {
		int status = this.mockMvc.perform(MockMvcRequestBuilders.get("/User/ListUsers", "")).andReturn().getResponse()
				.getStatus();
		Assert.assertTrue(status == 204);
	}
	
	@Test
	public void testUserControllerListStatusEqual200() throws Exception {
		User u = new User("a", "b", "v", "1", "a", "a");
		List<User> users = new ArrayList<User>();
		users.add(u);
		when(userService.userList()).thenReturn(users);
		int status = this.mockMvc.perform(MockMvcRequestBuilders.get("/User/ListUsers", "")).andReturn().getResponse()
				.getStatus();
		Assert.assertTrue(status == 200);
	}
	
	@Test
	public void testUserControllerListSIsEmptyStatusEqual204() throws Exception {
		User u = new User("a", "b", "v", "1", "a", "a");
		List<User> users = new ArrayList<User>();
		users.add(u);
		System.out.println(users);
		users.remove(u);
		System.out.println(users);
		when(userService.userList()).thenReturn(users);
		int status = this.mockMvc.perform(MockMvcRequestBuilders.get("/User/ListUsers", "")).andReturn().getResponse()
				.getStatus();
		Assert.assertTrue(status == 204);
	}

}