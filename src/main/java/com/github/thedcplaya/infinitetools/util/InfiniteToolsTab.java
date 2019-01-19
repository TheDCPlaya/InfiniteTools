package com.github.thedcplaya.infinitetools.util;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import com.github.thedcplaya.infinitetools.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class InfiniteToolsTab extends CreativeTabs
{
    public InfiniteToolsTab()
    {
     super(InfiniteTools.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ingotScandium);


    }
}
