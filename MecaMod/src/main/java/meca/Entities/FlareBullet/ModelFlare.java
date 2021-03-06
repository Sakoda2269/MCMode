package meca.Entities.FlareBullet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFlare extends ModelBase{

	private final ModelRenderer bb_main;

	public ModelFlare() {
		textureWidth=9;
		textureHeight=9;
		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.addBox( -2.0F, -2.0F, 0.0F, 2, 2, 2);
		//bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}
