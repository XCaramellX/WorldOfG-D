package com.Caramell.tutorialmod.items.tools;

import com.Caramell.tutorialmod.Main;
import com.Caramell.tutorialmod.init.ModItems;
import com.Caramell.tutorialmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel{

	public ToolAxe(String name, ToolMaterial material) 
	{    
		super(material,30.0F,-5.2F);
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
