package meca;

public abstract class WeaponUnit extends UnitBase{

	int type;
	int weight;
	static final int MainCanon=1;
	static final int SubCanon=2;
	static final int Radar=3;
	static final int AirCraft=4;
	static final int Other=5;

	public WeaponUnit(int sizein,int typein,int weightin) {
		super(sizein);
		weight = weightin;
		type=typein;
	}

}
