package com.github.thedcplaya.infinitetools.ModRecipes;

import com.github.thedcplaya.infinitetools.block.ModBlocks;
import com.github.thedcplaya.infinitetools.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
    public static void init()

        {
            GameRegistry.addSmelting(ModBlocks.oreScandium, new ItemStack(ModItems.ingotScandium), 0.7f);

        }
}
