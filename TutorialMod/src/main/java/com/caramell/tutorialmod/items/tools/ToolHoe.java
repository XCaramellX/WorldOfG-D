package com.caramell.tutorialmod.items.tools;

import com.caramell.tutorialmod.init.ModItems;

import com.caramell.tutorialmod.util.IHasModel;
import com.caramell.tutorialmod.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {


	public ToolHoe(String name, ToolMaterial material) 
	{    
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	
}
