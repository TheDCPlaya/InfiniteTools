package com.github.thedcplaya.infinitetools;

import com.github.thedcplaya.infinitetools.ModRecipes.ModRecipes;
import com.github.thedcplaya.infinitetools.block.ModBlocks;
import com.github.thedcplaya.infinitetools.item.ModItems;
import com.github.thedcplaya.infinitetools.proxy.CommonProxy;
import com.github.thedcplaya.infinitetools.util.InfiniteToolsTab;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = InfiniteTools.MODID, name = InfiniteTools.NAME, version = InfiniteTools.VERSION)
public class InfiniteTools
{

    public static final String MODID = "infinitetools";
    public static final String NAME = "InfiniteTools";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(MODID)
    public static InfiniteTools instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        ModRecipes.init();
    }

    @SidedProxy(serverSide = "com.github.thedcplaya.infinitetools.proxy.CommonProxy", clientSide = "com.github.thedcplaya.infinitetools.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

    }
    public static final InfiniteToolsTab creativeTab = new InfiniteToolsTab();


    public static final Item.ToolMaterial enrichedscandiumToolMaterial = (Item.ToolMaterial) EnumHelper.addToolMaterial("ENRICHED SCANDIUM", 25, 0, 6, 999999, 14);
    public static final Item.ToolMaterial enrichedscandiumToolMaterial1 = (Item.ToolMaterial) EnumHelper.addToolMaterial("ENRICHED SCANDIUM", 25, 0, 6, 4, 14);
    public static final ItemArmor.ArmorMaterial enrichedscandiumArmorMaterial = EnumHelper.addArmorMaterial("ENRICHED SCANDIUM", MODID + ":enrichedscandium", 0, new int[]{25, 25, 25, 25}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 500.0F);
}

