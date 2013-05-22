package com.lolwizzard.castlecrafters.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabRPG extends CreativeTabs
{
    public CreativeTabRPG(String par1Str)
    {
        super(par1Str);
    }

    @SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex()
    {
        return Item.enderPearl.itemID;
    }
}
