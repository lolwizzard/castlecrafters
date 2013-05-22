package com.lolwizzard.castlecrafters.core;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

import org.lwjgl.input.Keyboard;

import com.lolwizzard.castlecrafters.core.proxy.CommonProxy;
import com.lolwizzard.castlecrafters.creativetab.CreativeTabRPG;
import com.lolwizzard.castlecrafters.handlers.CCKeyHandler;
import com.lolwizzard.castlecrafters.item.ItemBase;
import com.lolwizzard.castlecrafters.lib.Reference;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID,
name = Reference.MOD_NAME,
version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CastleCrafters
{
	@Instance(Reference.MOD_ID)
	public static CastleCrafters instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	public static Item testItem;
	public static int testItemId;
	
	public static KeyBinding statsKey = new KeyBinding("Statistics GUI", Keyboard.KEY_X);
	public static boolean ctrlKey;
	
	public static CreativeTabs tabCC = new CreativeTabRPG("tabCC");

	@Init
	public void init(FMLInitializationEvent event)
	{
        KeyBindingRegistry.registerKeyBinding(new CCKeyHandler(statsKey));
        
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabCC", Reference.TABNAME);

		//testItem
		testItem = new ItemBase(testItemId).setUnlocalizedName("testItem");
		LanguageRegistry.addName(testItem, Reference.TEST_ITEM);
	}

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		testItemId = config.get(Configuration.CATEGORY_ITEM, "testItem", 500 - Reference.ITEM_ID_FIX).getInt();
		ctrlKey = config.get(Configuration.CATEGORY_GENERAL, "useControlKeyForGui", false).getBoolean(true);

		config.save();

	}
}