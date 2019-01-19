package com.github.thedcplaya.infinitetools.item;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import com.github.thedcplaya.infinitetools.item.Tool.ItemAxe;
import com.github.thedcplaya.infinitetools.item.Tool.ItemPickaxe;
import com.github.thedcplaya.infinitetools.item.Tool.ItemShovel;
import com.github.thedcplaya.infinitetools.item.Tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static ItemBase ingotScandium = new ItemBase("ingot_scandium");
    public static ItemBase ingotEnrichedScandium = new ItemBase("ingot_enrichedscandium" );
    public static ItemSword scandiumSword = new ItemSword(InfiniteTools.enrichedscandiumToolMaterial, "scandium_sword");
    public static ItemPickaxe scandiumPickaxe = new ItemPickaxe(InfiniteTools.enrichedscandiumToolMaterial1, "scandium_pickaxe");
    public static ItemAxe scandiumAxe = new ItemAxe(InfiniteTools.enrichedscandiumToolMaterial1, "scandium_axe");
    public static ItemShovel scandiumShovel = new ItemShovel(InfiniteTools.enrichedscandiumToolMaterial1, "scandium_shovel");




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
        registry.registerAll
                (
                        scandiumAxe
                );
        registry.registerAll
                (
                        scandiumShovel
                );



    }

    public static void registerModels()
    {
        ingotScandium.registerItemModel();
        ingotEnrichedScandium.registerItemModel();
        scandiumSword.registerItemModel();
        scandiumPickaxe.registerItemModel();
        scandiumAxe.registerItemModel();
        scandiumShovel.registerItemModel();




    }

}
