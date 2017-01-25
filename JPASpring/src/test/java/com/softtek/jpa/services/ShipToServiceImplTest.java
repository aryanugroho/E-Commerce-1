package com.softtek.jpa.services;

import java.util.List;

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
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.softtek.jpa.domain.ShipTo;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(inheritLocations = true)
@DatabaseSetup(value = { "/dataset/default.xml" }, type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class ShipToServiceImplTest {

	@Autowired
	private ShipToService shipToService;

	@Test
	@ExpectedDatabase("/dataset/scenario1.xml")
	public void testShipToListService() {
		List<ShipTo> shipToList;
		shipToList = shipToService.shipToList();
		System.out.println(shipToList);
	}
	
	
	@Test
	@DatabaseSetup(value="/dataset/scenario1.xml", type=DatabaseOperation.CLEAN_INSERT)
	public void testShipToServiceListNotNull(){
			List<ShipTo> shipToList;
			shipToList = shipToService.shipToList();
			System.out.println(shipToList);
			Assert.assertNotNull(shipToList);
	}

}
