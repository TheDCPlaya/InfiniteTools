package com.github.thedcplaya.infinitetools.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static ItemBase ingotScandium = new ItemBase("ingot_scandium").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll
                (
                        ingotScandium
                );
    }

    public static void registerModels()
    {
        ingotScandium.registerItemModel();
    }

}
