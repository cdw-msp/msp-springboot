package com.msp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SampleApplicationTest {
	@Before
	public void setup() {
		System.out.println("setup method");
	}

	@Test
	public void thatApplicationTest() {
		System.out.println("thatApplicationTest method");
	}
	@Test
	public void thatApplicationTest1() {
		System.out.println("thatApplicationTest1 method");
		
	}
	@After
	public void teardown() {
		System.out.println("teardown method");
	}
}
