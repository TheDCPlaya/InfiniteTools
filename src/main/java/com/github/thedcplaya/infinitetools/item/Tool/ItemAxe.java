package com.github.thedcplaya.infinitetools.item.Tool;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import net.minecraft.item.Item;

public class ItemAxe extends net.minecraft.item.ItemAxe {

    private String name;

    public ItemAxe(ToolMaterial material, String name) {
        super(material, 10f, -3.1f);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        InfiniteTools.proxy.registerItemRenderer(this, 0, name);
    }

}