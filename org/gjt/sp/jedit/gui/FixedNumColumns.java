package org.gjt.sp.jedit.gui;


/**
 * @see org.gjt.sp.jedit.gui.VariableGridLayout#FIXED_NUM_COLUMNS
 */
public class FixedNumColumns extends Mode {
	public int getMode() {
		return VariableGridLayout.FIXED_NUM_COLUMNS;
	}

	public void update(int ncomponents, VariableGridLayout variableGridLayout) {
		variableGridLayout.setNcols(variableGridLayout.getSize());
		variableGridLayout.setNrows((ncomponents + variableGridLayout.getNcols() - 1) / variableGridLayout.getNcols());
	}
}