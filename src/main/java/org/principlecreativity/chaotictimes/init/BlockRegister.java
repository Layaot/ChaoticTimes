package org.principlecreativity.chaotictimes.init;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.principlecreativity.chaotictimes.Main;
import org.principlecreativity.chaotictimes.blocks.bulidings.*;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK_UPPER_CORNER;
    public static final RegistryObject<Block> STEEL_BLOCK_UPPER;
    public static final RegistryObject<Block> STEEL_BLOCK_LEFT;
    public static final RegistryObject<Block> STEEL_BLOCK_SURFACE;
    public static final RegistryObject<Block> STEEL_BLOCK_RIGHT;
    public static final RegistryObject<Block> STEEL_BLOCK_DOWNER_CORNER;
    public static final RegistryObject<Block> STEEL_BLOCK_DOWNER;
    public static final RegistryObject<Block> COBALT_LANTERN;

    static {
        STEEL_BLOCK_UPPER_CORNER = BLOCKS.register("steel_block_upper_corner", () -> new SteelFacingBlock("steel_block_upper_corner"));
        STEEL_BLOCK_UPPER = BLOCKS.register("steel_block_upper", () -> new SteelFacingBlock("steel_block_upper"));
        STEEL_BLOCK_LEFT = BLOCKS.register("steel_block_left", () -> new SteelFacingBlock("steel_block_left"));
        STEEL_BLOCK_SURFACE = BLOCKS.register("steel_block_surface", () -> new SteelFacingBlock("steel_block_surface"));
        STEEL_BLOCK_RIGHT = BLOCKS.register("steel_block_right", () -> new SteelFacingBlock("steel_block_right"));
        STEEL_BLOCK_DOWNER_CORNER = BLOCKS.register("steel_block_downer_corner", () -> new SteelFacingBlock("steel_block_downer_corner"));
        STEEL_BLOCK_DOWNER = BLOCKS.register("steel_block_downer", () -> new SteelFacingBlock("steel_block_downer"));
        COBALT_LANTERN = BLOCKS.register("cobalt_lantern", CobaltLantern::new);
    }
}
