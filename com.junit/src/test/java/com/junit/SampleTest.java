package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void m1Test() {
		Sample s=new Sample();
		assertEquals("welcome",s.m1());
	}

}
