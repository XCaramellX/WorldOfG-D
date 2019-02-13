package com.Caramell.tutorialmod.blocks;

import java.util.Random;

import com.Caramell.tutorialmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SonataOre extends BlockBase{

	public SonataOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(150.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	return ModItems.SONATA;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
		
	}
}
