package org.principlecreativity.chaotictimes.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.principlecreativity.chaotictimes.init.ItemRegister;

public class BaseBlock extends Block {
    public BaseBlock(Properties properties, Item.Properties properties1, String name) {
        super(properties);
        ItemRegister.ITEMS.register(name, () -> new BlockItem(this, properties1));
    }
}
