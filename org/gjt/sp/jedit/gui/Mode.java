package org.gjt.sp.jedit.gui;


public abstract class Mode {
	public abstract int getMode();

	public abstract void update(int ncomponents, VariableGridLayout variableGridLayout);
}