package com.caramell.tutorialmod.init;

import com.caramell.tutorialmod.entity.EntityRed_Troll;
import com.caramell.tutorialmod.util.Reference;
import com.caramell.tutorialmod.Main;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity 
{
	  public static void registerEntities() 
	  {
		  registerEntity("red_troll", EntityRed_Troll.class, Reference.ENTITY_RED_TROLL, 50, 16711680, 000000);
	  }
     private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) 
     {
    	 EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
     }
}
