package com.softtek.jpa.services;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.softtek.jpa.domain.ShipTo;

import junit.framework.Assert;


@RunWith(MockitoJUnitRunner.class)
public class ShipToServiceTest {
	
	@Mock
	ShipToService shipToService;
	
	@Test
	@Ignore
	public void testShipToServiceGetListNotNull() {
		shipToService = Mockito.mock(ShipToService.class);
		System.out.println(shipToService);
		Assert.assertNotNull(shipToService);
	}
	
	
	
	@Test
	@Ignore
	public void testShipToService2ListsEquals(){
		shipToService = Mockito.mock(ShipToService.class);
		ShipTo s1 = new ShipTo("Jose", "Ensenada");
		List<ShipTo> list = new ArrayList<ShipTo>();
		list.add(s1);
		when(shipToService.shipToList()).thenReturn(list);
		List<ShipTo> list2 =shipToService.shipToList();
		System.out.println(list);
		Assert.assertEquals(list, list2);
		System.out.println(list2);
	}
	
	@Test
	public void testShipToServiceTestListSize(){
		shipToService = Mockito.mock(ShipToService.class);
		ShipTo s1 = new ShipTo("Jose", "Ensenada");
		ShipTo s2= new ShipTo("Juan", "Ensenada");
		ShipTo s3= new ShipTo("Pepe", "Ensenada");
		List<ShipTo> list = new ArrayList<ShipTo>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		when(shipToService.shipToList()).thenReturn(list);
		List<ShipTo> list2 = shipToService.shipToList();
		verify(shipToService).shipToList();
		Assert.assertEquals(list.size(), list2.size());
	}
	
	@Test
	@Ignore
	public void testShipToServiceFunctionValid(){
		
		verify(shipToService).shipToList();
	}
	
}
