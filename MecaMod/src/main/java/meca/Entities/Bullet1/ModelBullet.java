package meca.Entities.Bullet1;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;


public class ModelBullet extends ModelBase{

	ModelRenderer model1;
	ModelRenderer model2;

	public ModelBullet(){
		super();

		 textureWidth=18;
		 textureHeight=9;
		 model1 = new ModelRenderer(this,0,0);
		 model1.setRotationPoint(0.0f, 22.0f, 0.0f);
		 model1.addBox(0.1f,0,0, 3, 3, 6);
		 model2 = new ModelRenderer(this,0,0);
		 model2.setRotationPoint(0.0f, 22.0f, 0.0f);
		 model2.addBox(0.1f,0,0, 3, 3, 6);

	}



	public void render(net.minecraft.entity.Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch, float scale) {
		model1.render(scale);
		model2.render(scale);

	}

}
