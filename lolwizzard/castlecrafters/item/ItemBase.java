package com.lolwizzard.castlecrafters.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import com.lolwizzard.castlecrafters.core.CastleCrafters;

public class ItemBase extends Item
{	
	public ItemBase(int par1)
	{
		super(par1);
		this.setCreativeTab(CastleCrafters.tabCC);
	}

	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("lolwizzard:blank");
	}
}
