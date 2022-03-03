package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("Test class Started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	System.out.println("Test class finished");
	}

	@BeforeEach
	void setUp() throws Exception {
	System.out.println("Test method started");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test method finished");
	}

	@Test
	void test1() {
		assertEquals(true,true);
	}
	@Test
	void test2() {
		assertEquals(true,true);
	}
	@Test
	void test3() {
		assertEquals(true,true);
	}

}
