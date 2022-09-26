package com.sq3xd.brgb.jei;

import com.sq3xd.brgb.BRGBMod;
import com.sq3xd.brgb.block.ModBlocks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@mezz.jei.api.JeiPlugin
public class JeiPlugin implements IModPlugin {
    Component rgb_block = Component.translatable("gui.jei.description.rgb_block");
    Component rgb_block_switchable = Component.translatable("gui.jei.description.rgb_block_switchable");
    Component rgb_block_redstone = Component.translatable("gui.jei.description.rgb_block_redstone");
    Component rgb_block_slow = Component.translatable("gui.jei.description.rgb_block_slow");
    Component rgb_block_fast = Component.translatable("gui.jei.description.rgb_block_fast");
    Component rgb_block_armored = Component.translatable("gui.jei.description.rgb_block_armored");
    Component rgb_block_light =Component.translatable("gui.jei.description.rgb_block_light");

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(BRGBMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_SWITCHABLE_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_switchable);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_REDSTONE_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_redstone);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_SLOW_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_slow);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_FAST_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_fast);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_ARMORED_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_armored);
        registration.addIngredientInfo(new ItemStack(ModBlocks.RGB_BLOCK_LIGHT_ITEM.get()), VanillaTypes.ITEM_STACK, rgb_block_light);
    }
}