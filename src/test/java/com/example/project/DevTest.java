package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class DevTest {

	@Test
	void myDevTest(TestInfo testInfo) {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.div(1,1), "1 / 1  should equal 1");
		
	}

}
