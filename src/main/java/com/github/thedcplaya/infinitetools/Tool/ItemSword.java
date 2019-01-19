package com.github.thedcplaya.infinitetools.Tool;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import net.minecraft.item.Item;

public class ItemSword extends net.minecraft.item.ItemSword
{
    private String name;

    public ItemSword(ToolMaterial material, String name)
    {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel()
    {
        InfiniteTools.proxy.registerItemRenderer(this, 0, name);

    }
}
