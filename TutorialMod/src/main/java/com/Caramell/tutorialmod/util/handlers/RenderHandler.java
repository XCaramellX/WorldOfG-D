package com.Caramell.tutorialmod.util.handlers;

import com.Caramell.tutorialmod.entity.EntityRed_Troll;
import com.Caramell.tutorialmod.entity.render.RenderRed_Troll;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
   public static void registerEntityRenders() 
   {
	   RenderingRegistry.registerEntityRenderingHandler(EntityRed_Troll.class, new IRenderFactory<EntityRed_Troll>() 
	   {
		   @Override
		public Render<? super EntityRed_Troll> createRenderFor(RenderManager manager) 
		   {
			// TODO Auto-generated method stub
			return new RenderRed_Troll(manager);
		}
	   });
   }
}
