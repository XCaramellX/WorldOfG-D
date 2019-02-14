package com.caramell.tutorialmod.util.handlers;

import com.caramell.tutorialmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
   public static final ResourceLocation RED_TROLL = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "red_troll"));
}
