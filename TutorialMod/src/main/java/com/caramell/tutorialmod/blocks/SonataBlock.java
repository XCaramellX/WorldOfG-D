package com.caramell.tutorialmod.blocks;

import net.minecraft.block.SoundType;

import net.minecraft.block.material.Material;

public class SonataBlock extends BlockBase
{


	public SonataBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(10.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 2);
	}
}
