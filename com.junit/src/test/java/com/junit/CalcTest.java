package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
    Calc c;
    @BeforeAll
    static void initall() {
    	System.out.println("Test Started");
    }
    @AfterAll
    static void destroyAll() {
    	System.out.println("Tests Completed");
    }
    @BeforeEach
    void init() {
    	c=new Calc();
    }
    @AfterEach
    void destroy() {
    	System.out.println("Test Done");
    }
	@Test
	void calcAvg() {
		assertEquals(15,c.avg(10,20),()->"Logic Error in method");
		System.out.println("Avg Test Done");
	}
	@Test
	void calcAdd() {
		assertEquals(c.expectedAdd,c.avg(10,20),()->"Add Logic Error in method");
	}

}
