package com.Caramell.tutorialmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.ADAMANTIUM_BLOCK, new ItemStack(ModItems.ADAMANTIUM, 1), 2.5f);
		GameRegistry.addSmelting(ModBlocks.SONATA_BLOCK, new ItemStack(ModItems.SONATA, 1), 3.0f);
	}
}
