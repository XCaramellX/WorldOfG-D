package com.caramell.tutorialmod.init;

import java.util.ArrayList;

import java.util.List;

import com.caramell.tutorialmod.blocks.AdamantiumBlock;
import com.caramell.tutorialmod.blocks.AdamantiumOre;
import com.caramell.tutorialmod.blocks.BlockBase;
import com.caramell.tutorialmod.blocks.SonataBlock;
import com.caramell.tutorialmod.blocks.SonataOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block ADAMANTIUM_BLOCK = new AdamantiumBlock("adamantium_block", Material.GLASS);
	public static final Block SONATA_BLOCK = new SonataBlock("sonata_block", Material.IRON);
	public static final Block ADAMANTIUM_ORE= new AdamantiumOre("adamantium_ore", Material.ROCK);
	public static final Block SONATA_ORE= new SonataOre("sonata_ore", Material.ROCK);
}
