package com.Caramell.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;

import com.Caramell.tutorialmod.blocks.AdamantiumBlock;
import com.Caramell.tutorialmod.blocks.AdamantiumOre;
import com.Caramell.tutorialmod.blocks.BlockBase;
import com.Caramell.tutorialmod.blocks.SonataBlock;
import com.Caramell.tutorialmod.blocks.SonataOre;

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
