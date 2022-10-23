package com.sq3xd.brgb.jei;

import com.sq3xd.brgb.BRGBMod;
import com.sq3xd.brgb.block.ModBlocks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@mezz.jei.api.JeiPlugin
public class JeiPlugin implements IModPlugin {
    TranslatableComponent rgb_block = new TranslatableComponent("gui.jei.description.rgb_block");
    TranslatableComponent rgb_block_switchable = new TranslatableComponent("gui.jei.description.rgb_block_switchable");
    TranslatableComponent rgb_block_redstone = new TranslatableComponent("gui.jei.description.rgb_block_redstone");
    TranslatableComponent rgb_block_slow = new TranslatableComponent("gui.jei.description.rgb_block_slow");
    TranslatableComponent rgb_block_fast = new TranslatableComponent("gui.jei.description.rgb_block_fast");
    TranslatableComponent rgb_block_armored = new TranslatableComponent("gui.jei.description.rgb_block_armored");
    TranslatableComponent rgb_block_light = new TranslatableComponent("gui.jei.description.rgb_block_light");
    TranslatableComponent full_rgb_block = new TranslatableComponent("gui.jei.description.full_rgb_block");
    TranslatableComponent full_rgb_block_light = new TranslatableComponent("gui.jei.description.full_rgb_block_light");
    TranslatableComponent full_rgb_block_armored = new TranslatableComponent("gui.jei.description.full_rgb_block_armored");
    TranslatableComponent full_rgb_block_redstone = new TranslatableComponent("gui.jei.description.full_rgb_block_redstone");
    TranslatableComponent full_rgb_block_slow = new TranslatableComponent("gui.jei.description.full_rgb_block_slow");
    TranslatableComponent full_rgb_block_fast = new TranslatableComponent("gui.jei.description.full_rgb_block_fast");

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(BRGBMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_SWITCHABLE_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_switchable);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_REDSTONE_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_redstone);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_ARMORED_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_armored);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_LIGHT_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_light);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_SLOW_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_slow);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_FAST_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_fast);
        registration.addIngredientInfo(new ItemStack(ModBlocks.FULL_RGB_BLOCK_ITEM.get()), VanillaTypes.ITEM_STACK, full_rgb_block);
        registration.addIngredientInfo(new ItemStack(ModBlocks.FULL_RGB_BLOCK_LIGHT_ITEM.get()), VanillaTypes.ITEM_STACK, full_rgb_block_light);
        registration.addIngredientInfo(new ItemStack(ModBlocks.FULL_RGB_BLOCK_ARMORED_ITEM.get()), VanillaTypes.ITEM_STACK, full_rgb_block_armored);
        registration.addIngredientInfo(new ItemStack(ModBlocks.FULL_RGB_BLOCK_REDSTONE_ITEM.get()), VanillaTypes.ITEM_STACK, full_rgb_block_redstone);
        registration.addIngredientInfo(new ItemStack(ModBlocks.FULL_RGB_BLOCK_SLOW_ITEM.get()), VanillaTypes.ITEM_STACK, full_rgb_block_slow);
        registration.addIngredientInfo(new ItemStack(ModBlocks.FULL_RGB_BLOCK_FAST_ITEM.get()), VanillaTypes.ITEM_STACK, full_rgb_block_fast);
    }
}