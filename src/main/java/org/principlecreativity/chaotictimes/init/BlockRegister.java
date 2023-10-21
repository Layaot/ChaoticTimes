package org.principlecreativity.chaotictimes.init;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.principlecreativity.chaotictimes.Main;
import org.principlecreativity.chaotictimes.blocks.bulidings.SteelBlockUpperCorner;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK_UPPER_CORNER;

    static {
        STEEL_BLOCK_UPPER_CORNER = BLOCKS.register("steel_block_upper_corner", SteelBlockUpperCorner::new);
    }
}
