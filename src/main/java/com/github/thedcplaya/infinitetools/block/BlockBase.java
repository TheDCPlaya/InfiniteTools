package com.github.thedcplaya.infinitetools.block;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{
    protected String name;
    public BlockBase(Material material, String name)
    {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(InfiniteTools.creativeTab);
    }

    public void registerItemModel(Item itemBlock)
    {
        InfiniteTools.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemblock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }
}
