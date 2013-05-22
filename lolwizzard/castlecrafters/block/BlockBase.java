package com.lolwizzard.castlecrafters.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

import com.lolwizzard.castlecrafters.core.CastleCrafters;
import com.lolwizzard.castlecrafters.lib.Reference;

public class BlockBase extends Block
{
	
    public BlockBase(int id)
    {
        super(id, Material.ground);
        this.setCreativeTab(CastleCrafters.tabCC);
    }
    
    public void registerIcons(IconRegister ir)
    {
        blockIcon = ir.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
