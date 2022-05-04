package meca;

public abstract class WeaponUnit extends UnitBase{

	int type;
	int weight;
	public static final int MainCanon=1;
	public static final int SubCanon=2;
	public static final int Radar=3;
	public static final int AirCraft=4;
	public static final int Other=5;

	public WeaponUnit(int sizein,int typein,int weightin) {
		super(sizein);
		weight = weightin;
		type=typein;
	}

}
