package com.github.thedcplaya.infinitetools.item;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import com.github.thedcplaya.infinitetools.item.Tool.ItemPickaxe;
import com.github.thedcplaya.infinitetools.item.Tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static ItemBase ingotScandium = new ItemBase("ingot_scandium");
    public static ItemBase ingotEnrichedScandium = new ItemBase("ingot_enrichedscandium" );
    public static ItemSword scandiumSword = new ItemSword(InfiniteTools.enrichedscandiumToolMaterial, "scandium_sword");
    public static ItemPickaxe scandiumPickaxe = new ItemPickaxe(InfiniteTools.enrichedscandiumToolMaterial, "scandium_pickaxe");



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
        registry.registerAll
                (
                        scandiumPickaxe
                );


    }

    public static void registerModels()
    {
        ingotScandium.registerItemModel();
        ingotEnrichedScandium.registerItemModel();
        scandiumSword.registerItemModel();
        scandiumPickaxe.registerItemModel();


    }

}
