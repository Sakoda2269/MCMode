package meca;

import net.minecraft.item.Item;

public abstract class UnitBase extends Item{

	int size;//1=小型2=中型3=大型4=超大型
	public static final int Small = 1;
	public static final int Middle = 2;
	public static final int Large = 3;
	public static final int Huge = 4;


	int parent;

	public UnitBase(int sizein){
		size=sizein;
	}

	public void setParent(int pin) {
		parent=pin;
	}
	public int getParent() {
		return parent;
	}

}