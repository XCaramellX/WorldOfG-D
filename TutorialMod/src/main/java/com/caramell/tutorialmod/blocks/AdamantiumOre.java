package com.caramell.tutorialmod.blocks;

import java.util.Random;


import com.caramell.tutorialmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AdamantiumOre extends BlockBase{

	public AdamantiumOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GLASS);
		setHardness(20.0F);
		setResistance(1000.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(20.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	return ModItems.ADAMANTIUM;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
		
	}
	
}
