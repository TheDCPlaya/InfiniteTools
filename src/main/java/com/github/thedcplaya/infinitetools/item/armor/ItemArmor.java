package com.github.thedcplaya.infinitetools.item.armor;

import com.github.thedcplaya.infinitetools.InfiniteTools;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemArmor extends net.minecraft.item.ItemArmor
{
    private String name;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        setCreativeTab(InfiniteTools.creativeTab);
    }

    public void registerItemModel() {
        InfiniteTools.proxy.registerItemRenderer(this, 0, name);
    }
}