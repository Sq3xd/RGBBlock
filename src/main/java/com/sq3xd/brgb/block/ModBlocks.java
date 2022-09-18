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
    public static ToIntFunction<BlockState> lightLevel = BlockState -> 5; // Light level
    public static final float speed = 1.25f; // Faster than default
    public static final float destroy_time = 1.25f; // Faster than stone
    public static final float resistance = 6f; // Stone resistance

     // Adding blocks and items

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BRGBMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BRGBMod.MOD_ID);

    public static final RegistryObject<Block> RGB_BLOCK = BLOCKS.register("rgb_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel).explosionResistance(resistance).destroyTime(destroy_time)
                    .speedFactor(speed).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RGB_BLOCK_ITEM = ITEMS.register("rgb_block",
            () -> new BlockItem(RGB_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    public static final RegistryObject<Block> RGB_BLOCK_FAST = BLOCKS.register("rgb_block_fast",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel).explosionResistance(resistance).destroyTime(destroy_time)
                    .speedFactor(speed).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RGB_BLOCK_FAST_ITEM = ITEMS.register("rgb_block_fast",
            () -> new BlockItem(RGB_BLOCK_FAST.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    public static final RegistryObject<Block> RGB_BLOCK_SLOW = BLOCKS.register("rgb_block_slow",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel).explosionResistance(resistance).destroyTime(destroy_time)
                    .speedFactor(speed).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RGB_BLOCK_SLOW_ITEM = ITEMS.register("rgb_block_slow",
            () -> new BlockItem(RGB_BLOCK_SLOW.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    public static final RegistryObject<Block> RGB_BLOCK_SWITCHABLE = BLOCKS.register("rgb_block_switchable",
            () -> new RGBBlockSwitchable(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel).explosionResistance(resistance).destroyTime(destroy_time)
                    .speedFactor(speed).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RGB_BLOCK_SWITCHABLE_ITEM = ITEMS.register("rgb_block_switchable",
            () -> new BlockItem(RGB_BLOCK_SWITCHABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    public static final RegistryObject<Block> RGB_BLOCK_REDSTONE = BLOCKS.register("rgb_block_redstone",
            () -> new RGBBlockRedstone(BlockBehaviour.Properties.of(Material.STONE).lightLevel(lightLevel).explosionResistance(resistance).destroyTime(destroy_time)
                    .speedFactor(speed).requiresCorrectToolForDrops()));

    public static final RegistryObject<Item> RGB_BLOCK_REDSTONE_ITEM = ITEMS.register("rgb_block_redstone",
            () -> new BlockItem(RGB_BLOCK_REDSTONE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
