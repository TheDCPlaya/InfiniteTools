package com.github.thedcplaya.infinitetools.item;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    protected String name;

    public ItemBase(String name)
    {
     this.name = name;
     setUnlocalizedName(name);
     setRegistryName(name);
    }

    public void registerItemModel()
    {
        InfiniteTools.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab)
    {
    super.setCreativeTab(tab);
    return this;
    }
}
