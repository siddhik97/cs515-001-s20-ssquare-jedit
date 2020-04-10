package org.gjt.sp.jedit.buffer;

import static org.junit.Assert.*;

import org.gjt.sp.jedit.buffer.UndoManager.CompressedReplace;
import org.gjt.sp.jedit.buffer.UndoManager.Replace;
import org.junit.Test;

public class UndoManagerTest {

	@Test
	public void testAddReplace() {
		Replace rep = new Replace(0, "aaaaa", "b");
		Replace rep1 = new Replace(0, "aaaaa", "b");
		CompressedReplace cr = new CompressedReplace(rep);
		CompressedReplace check = cr.add(rep1);
		//assertEquals("b", check);
	}

}
