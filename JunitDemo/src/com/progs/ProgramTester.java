package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTester {

	@Test
	void test1() {
		try {
			int res=new Program1().Solution("a#n90");
		}
		catch(BugException e) {
			assertEquals("Invalid Character",e.getMessage());
		}
		
	}
	@Test
	void test2() {
		try {
			int res=new Program1().Solution("a123");
		assertEquals(6,res);
		}
		catch(BugException e) {
			fail();
		}
		
	}

}
