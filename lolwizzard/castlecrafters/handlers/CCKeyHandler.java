package com.lolwizzard.castlecrafters.handlers;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

import com.lolwizzard.castlecrafters.core.CastleCrafters;

import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class CCKeyHandler extends KeyHandler
{

	public CCKeyHandler(KeyBinding kb)
	{
		super(new KeyBinding[]{kb}, new boolean[]{false});
	}

	@Override
	public String getLabel() {
		return "mykeybindings";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
	{
		if(CastleCrafters.ctrlKey)
		{
			if(kb == CastleCrafters.statsKey && Minecraft.getMinecraft().currentScreen.isCtrlKeyDown())
			{
				//open stat gui
			}
		}
		else
		{
			if(kb == CastleCrafters.statsKey)
			{
				//open stat gui
			}
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
	{
	}

	@Override
	public EnumSet<TickType> ticks()
	{
		return EnumSet.of(TickType.CLIENT);
	}
}