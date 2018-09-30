package org.vharcq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTestCase {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup tests");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("cleanup stuffs");
	}

	@Test
	void testOK() {
		if (1 == 2)
			fail("Not yet implemented");
	}

	@Test
	void testKO() {
		fail("Not yet implemented");
	}

}
