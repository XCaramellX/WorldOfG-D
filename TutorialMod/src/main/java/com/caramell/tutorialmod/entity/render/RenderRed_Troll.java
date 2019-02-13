package com.caramell.tutorialmod.entity.render;

import com.caramell.tutorialmod.entity.EntityRed_Troll;
import com.caramell.tutorialmod.entity.model.ModelRed_Troll;
import com.caramell.tutorialmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.client.renderer.entity.layers.LayerElytra;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerVillagerArmor;
import net.minecraft.util.ResourceLocation;

public class RenderRed_Troll extends RenderLiving<EntityRed_Troll>
{
	public static final ResourceLocation TEXTURES =  new ResourceLocation(Reference.MOD_ID + ":textures/entity/red_troll.png");
	
	public RenderRed_Troll(RenderManager manager) 
	{
		super(manager, new ModelRed_Troll(), 0.5F);
		this.addLayer(new LayerElytra(this));
		this.addLayer(new LayerHeldItem(this));
		
		
	}
    
	@Override
	protected ResourceLocation getEntityTexture(EntityRed_Troll entity) 
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityRed_Troll entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
