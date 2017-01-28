//package com.softtek.jpa.services;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.softtek.jpa.web.CartController;
//
//@RunWith(MockitoJUnitRunner.class)
//@WebAppConfiguration
//public class CartControllerTest {
//	private MockMvc mockMvc;
//	
//	@InjectMocks
//	CartController cartController;
//	
//	@Mock
//	CartService cartService;
//
//	@Before
//	public void setupCartControllerTest() {
//		MockitoAnnotations.initMocks(this);
//		this.mockMvc = MockMvcBuilders.standaloneSetup(cartController).build();
//	}
//
//	@Test
//	@Ignore
//	public void testCartControllerListStatusEqual200() throws Exception {
//		int status = this.mockMvc.perform(MockMvcRequestBuilders.get("/Cart/List", "")).andReturn().getResponse()
//				.getStatus();
//		Assert.assertTrue(status == 200);
//	}
//	
//	@Test
//	public void testCartControllerListStatusEqual204() throws Exception{
//		int status = this.mockMvc.perform(MockMvcRequestBuilders.get("/Cart/ListCarts", "")).andReturn().getResponse()
//				.getStatus();
//		System.out.println(status);
//		Assert.assertTrue(status == 204);
//		
//	}
//
//
//}
