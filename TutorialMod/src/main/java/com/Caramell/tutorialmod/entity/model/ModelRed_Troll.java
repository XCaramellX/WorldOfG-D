package com.Caramell.tutorialmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * redtroll - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelRed_Troll extends ModelBase {
    public ModelRenderer iceGiantRightArm;
    public ModelRenderer iceGiantLeftArm;
    public ModelRenderer iceGiantBody0;
    public ModelRenderer iceGiantBody1;
    public ModelRenderer iceGiantHead;
    public ModelRenderer iceGiantRightLeg;
    public ModelRenderer iceGiantLeftLeg;

    public ModelRed_Troll() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.iceGiantBody1 = new ModelRenderer(this, 0, 70);
        this.iceGiantBody1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.iceGiantBody1.addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, 0.5F);
        this.iceGiantHead = new ModelRenderer(this, 0, 10);
        this.iceGiantHead.setRotationPoint(0.0F, -7.0F, -1.0F);
        this.iceGiantHead.addBox(-6.1F, -14.0F, -6.5F, 12, 13, 12, 0.0F);
        this.setRotateAngle(iceGiantHead, -0.02146754979953026F, 0.0F, 0.007504915783575612F);
        this.iceGiantLeftLeg = new ModelRenderer(this, 37, 0);
        this.iceGiantLeftLeg.setRotationPoint(-4.1F, 11.0F, 0.0F);
        this.iceGiantLeftLeg.addBox(-5.1F, -3.0F, -3.0F, 8, 17, 7, 0.0F);
        this.iceGiantBody0 = new ModelRenderer(this, 0, 40);
        this.iceGiantBody0.setRotationPoint(0.6F, -7.0F, 0.0F);
        this.iceGiantBody0.addBox(-10.7F, -2.0F, -6.0F, 21, 21, 14, 0.0F);
        this.iceGiantRightLeg = new ModelRenderer(this, 60, 0);
        this.iceGiantRightLeg.mirror = true;
        this.iceGiantRightLeg.setRotationPoint(5.0F, 11.0F, 0.0F);
        this.iceGiantRightLeg.addBox(-3.6F, -3.0F, -3.0F, 8, 16, 7, 0.0F);
        this.iceGiantLeftArm = new ModelRenderer(this, 60, 58);
        this.iceGiantLeftArm.setRotationPoint(0.2F, -6.8F, 0.0F);
        this.iceGiantLeftArm.addBox(10.7F, -2.2F, -2.6F, 9, 21, 8, 0.0F);
        this.iceGiantRightArm = new ModelRenderer(this, 60, 21);
        this.iceGiantRightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.iceGiantRightArm.addBox(-18.1F, -2.1F, -2.3F, 8, 21, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.iceGiantBody1.render(f5);
        this.iceGiantHead.render(f5);
        this.iceGiantLeftLeg.render(f5);
        this.iceGiantBody0.render(f5);
        this.iceGiantRightLeg.render(f5);
        this.iceGiantLeftArm.render(f5);
        this.iceGiantRightArm.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.iceGiantLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.iceGiantRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.iceGiantLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.iceGiantRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.iceGiantHead.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.iceGiantHead.rotateAngleY = headPitch * 0.017453292F;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
