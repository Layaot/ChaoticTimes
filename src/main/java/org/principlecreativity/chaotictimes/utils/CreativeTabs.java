package org.principlecreativity.chaotictimes.utils;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;


public class CreativeTabs {
    public static final CreativeModeTab BUILDING_TAB = new CreativeModeTab("chaotictimes_buildings") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Blocks.DIRT);
        }
    };
}
