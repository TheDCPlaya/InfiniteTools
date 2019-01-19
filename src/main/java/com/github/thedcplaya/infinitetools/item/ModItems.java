package com.github.thedcplaya.infinitetools.item;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import com.github.thedcplaya.infinitetools.Tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static ItemBase ingotScandium = new ItemBase("ingot_scandium");
    public static ItemBase ingotEnrichedScandium = new ItemBase("ingot_enrichedscandium" );


    public static ItemSword scandiumSword = new ItemSword(InfiniteTools.enrichedscandiumToolMaterial, "scandium_sword");



    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll
                (
                        ingotScandium
                );
        registry.registerAll
                (
                        ingotEnrichedScandium
                );
        registry.registerAll
                (
                        scandiumSword
                );

    }

    public static void registerModels()
    {
        ingotScandium.registerItemModel();
        ingotEnrichedScandium.registerItemModel();

    }

}
