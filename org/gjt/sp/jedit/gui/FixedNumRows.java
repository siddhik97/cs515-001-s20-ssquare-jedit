package org.gjt.sp.jedit.gui;


/**
 * @see org.gjt.sp.jedit.gui.VariableGridLayout#FIXED_NUM_ROWS
 */
public class FixedNumRows extends Mode {
	public int getMode() {
		return VariableGridLayout.FIXED_NUM_ROWS;
	}

	public void update(int ncomponents, VariableGridLayout variableGridLayout) {
		variableGridLayout.setNrows(variableGridLayout.getSize());
		variableGridLayout.setNcols((ncomponents + variableGridLayout.getNrows() - 1) / variableGridLayout.getNrows());
	}
}