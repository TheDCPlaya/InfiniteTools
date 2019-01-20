package com.github.thedcplaya.infinitetools.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{
    public static BlockOre oreScandium = new BlockOre("ore_scandium");







    public static void register(IForgeRegistry<Block> registry)
    {
    registry.registerAll
            (oreScandium);

    }


    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll
                (oreScandium.createItemblock());



    }

    public static void registerModels()
    {
        oreScandium.registerItemModel(Item.getItemFromBlock(oreScandium));




    }


}
