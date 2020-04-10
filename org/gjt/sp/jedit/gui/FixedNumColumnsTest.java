package org.gjt.sp.jedit.gui;

import static org.junit.Assert.*;

import org.junit.Test;

public class FixedNumColumnsTest {

	@Test
	public void test() {
		FixedNumColumns fnr = new FixedNumColumns();
		int check_column = fnr.getMode();
		assertEquals(check_column, 2);
	}

}
