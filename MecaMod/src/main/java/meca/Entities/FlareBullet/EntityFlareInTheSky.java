package meca.Entities.FlareBullet;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityFlareInTheSky extends EntityLiving{

	Random rnd = new Random();
	int timer;

	public EntityFlareInTheSky(World worldIn) {
		super(worldIn);
	}

	public EntityFlareInTheSky(World worldIn,Entity entityin) {
		super(worldIn);
		this.setSize(0.1f, 0.1f);
		this.setPosition(entityin.posX, entityin.posY+1.5, entityin.posZ);
		this.setNoGravity(true);
		this.setGlowing(false);
		this.setSilent(true);
		timer=0;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		for(int i=0;i<5;i++)
			world.spawnParticle(EnumParticleTypes.FLAME, posX, posY, posZ, 0.5-rnd.nextFloat(), -0.1, 0.5-rnd.nextFloat());
		timer++;
		if(timer>=350) {
			this.setDead();
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender() {
		// TODO 自動生成されたメソッド・スタブ
		return 15728880;
	}

	@Override
	public float getBrightness() {
		// TODO 自動生成されたメソッド・スタブ
		return 50.0f;
	}






}
