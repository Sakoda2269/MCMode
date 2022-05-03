package meca.Entities.FlareBullet;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

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
		this.setGlowing(true);
		this.setSilent(true);
		timer=0;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		world.spawnParticle(EnumParticleTypes.FLAME, posX, posY, posZ, rnd.nextFloat(), 0.05, rnd.nextFloat());
		timer++;
		if(timer>=350) {
			this.setDead();
		}
	}





}
