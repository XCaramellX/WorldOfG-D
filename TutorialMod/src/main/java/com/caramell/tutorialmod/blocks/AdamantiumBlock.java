package com.caramell.tutorialmod.blocks;

import net.minecraft.block.SoundType;

import net.minecraft.block.material.Material;

public class AdamantiumBlock extends BlockBase
{

	public AdamantiumBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(50.0F);
		setResistance(6000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(10.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

	
}
