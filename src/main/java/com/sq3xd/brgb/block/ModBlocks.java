package com.sq3xd.brgb.block;

import com.sq3xd.brgb.BRGBMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;


public class ModBlocks {
    public static ToIntFunction<BlockState> lightLevel = BlockState -> 5;
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BRGBMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BRGBMod.MOD_ID);

    public static final RegistryObject<Block> RGB_BLOCK = BLOCKS.register("rgb_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel).explosionResistance(6f).destroyTime(1.25f)
                    .speedFactor(1.25f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RGB_BLOCK_ITEM = ITEMS.register("rgb_block",
            () -> new BlockItem(RGB_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    public static final RegistryObject<Block> RGB_BLOCK_SWITCHABLE = BLOCKS.register("rgb_block_switchable",
            () -> new RGBBlockSwitchable(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel).explosionResistance(6f).destroyTime(1.25f)
                    .speedFactor(1.25f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RGB_BLOCK_SWITCHABLE_ITEM = ITEMS.register("rgb_block_switchable",
            () -> new BlockItem(RGB_BLOCK_SWITCHABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
