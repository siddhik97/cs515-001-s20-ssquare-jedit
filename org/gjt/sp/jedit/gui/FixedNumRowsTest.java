package org.gjt.sp.jedit.gui;

import static org.junit.Assert.*;

import org.junit.Test;

public class FixedNumRowsTest {

	@Test
	public void test() {
		FixedNumRows fnr = new FixedNumRows();
		int check_row = fnr.getMode();
		assertEquals(check_row, 1);
	}

}
