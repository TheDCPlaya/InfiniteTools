package com.github.thedcplaya.infinitetools.item.Tool;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import net.minecraft.item.ItemSpade;

public class ItemShovel extends ItemSpade {

    private String name;

    public ItemShovel(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(InfiniteTools.creativeTab);
    }

    public void registerItemModel() { InfiniteTools.proxy.registerItemRenderer(this, 0, name); }
 }
