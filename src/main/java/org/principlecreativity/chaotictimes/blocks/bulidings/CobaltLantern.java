package org.principlecreativity.chaotictimes.blocks.bulidings;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Material;
import org.principlecreativity.chaotictimes.blocks.BaseBlock;
import org.principlecreativity.chaotictimes.utils.CreativeTabs;

public class CobaltLantern extends BaseBlock {
    public CobaltLantern() {
        super(Properties.of(Material.GLASS).strength(1f, 10f).lightLevel(s -> 15), new Item.Properties().tab(CreativeTabs.BUILDING_TAB), "cobalt_lantern");
    }
}
