package com.github.thedcplaya.infinitetools.item.Tool;

import com.github.thedcplaya.infinitetools.InfiniteTools;



public class ItemSword extends net.minecraft.item.ItemSword {

    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(InfiniteTools.creativeTab);
    }

    public void registerItemModel() {
        InfiniteTools.proxy.registerItemRenderer(this, 0, name);
    }

}