package com.caramell.tutorialmod.init;

import java.util.ArrayList;

import java.util.List;

import com.caramell.tutorialmod.items.armor.ArmorBase;
import com.caramell.tutorialmod.items.tools.ToolHoe;
import com.caramell.tutorialmod.items.tools.ToolPickaxe;
import com.caramell.tutorialmod.items.tools.ToolSpade;
import com.caramell.tutorialmod.items.tools.ToolSword;
import com.caramell.tutorialmod.util.Reference;
import com.caramell.tutorialmod.items.ItemBase;
import com.caramell.tutorialmod.items.tools.ToolAxe;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Materials
	public static final ToolMaterial MATERIAL_ADAMANTIUM = EnumHelper.addToolMaterial("material_adamantium", 3, 1561, 20.0F, 20.0F, 20);
	public static final ArmorMaterial ARMOR_MATERIAL_ADAMANTIUM = EnumHelper.addArmorMaterial("armor_material_adamantium", Reference.MOD_ID + ":adamantium", 25, 
		new int[] {5, 8, 10, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ToolMaterial MATERIAL_SONATA = EnumHelper.addToolMaterial("material_sonata", 2, 500, 10.0F, 10.0F, 30);
	//boots, leggings, chest plate, helmet
	//Items
	public static final Item ADAMANTIUM= new ItemBase("adamantium");
	public static final Item SONATA= new ItemBase("sonata");
	public static final Item GOLDEN_RED= new ItemBase("golden_red");
	
	//Tools
	public static final ItemSword ADAMANTIUM_SWORD = new ToolSword("adamantium_sword", MATERIAL_ADAMANTIUM);
	public static final ItemSpade ADAMANTIUM_SHOVEL =  new ToolSpade("adamantium_shovel", MATERIAL_ADAMANTIUM);
	public static final ItemPickaxe ADAMANTIUM_PICKAXE =  new ToolPickaxe("adamantium_pickaxe", MATERIAL_ADAMANTIUM);
	public static final ItemAxe ADAMANTIUM_AXE =  new ToolAxe("adamantium_axe", MATERIAL_ADAMANTIUM);
	public static final ItemHoe ADAMANTIUM_HOE =  new ToolHoe("adamantium_hoe", MATERIAL_ADAMANTIUM);
	
	public static final ItemSword SONATA_SWORD = new ToolSword("sonata_sword", MATERIAL_SONATA);
	public static final ItemSpade SONATA_SHOVEL =  new ToolSpade("sonata_shovel", MATERIAL_SONATA);
	public static final ItemPickaxe SONATA_PICKAXE =  new ToolPickaxe("sonata_pickaxe", MATERIAL_SONATA);
	public static final ItemAxe SONATA_AXE =  new ToolAxe("sonata_axe", MATERIAL_SONATA);
	public static final ItemHoe SONATA_HOE =  new ToolHoe("sonata_hoe", MATERIAL_SONATA);
	
	//Armor
	public static final Item ADAMANTIUM_HELMET = new ArmorBase("adamantium_helmet", ARMOR_MATERIAL_ADAMANTIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item ADAMANTIUM_CHESTPLATE = new ArmorBase("adamantium_chestplate", ARMOR_MATERIAL_ADAMANTIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item ADAMANTIUM_LEGGINGS = new ArmorBase("adamantium_leggings", ARMOR_MATERIAL_ADAMANTIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item ADAMANTIUM_BOOTS = new ArmorBase("adamantium_boots", ARMOR_MATERIAL_ADAMANTIUM, 1, EntityEquipmentSlot.FEET);
}
