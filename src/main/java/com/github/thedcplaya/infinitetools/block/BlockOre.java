package com.github.thedcplaya.infinitetools.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOre extends BlockBase
{
    public BlockOre(String name)
    {
        super(Material.ROCK, name);

        setHardness(10f);
        setResistance(1f);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
