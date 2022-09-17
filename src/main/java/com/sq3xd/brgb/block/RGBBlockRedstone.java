package com.sq3xd.brgb.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class RGBBlockRedstone extends Block {
    public RGBBlockRedstone(Properties properties){
        super(properties);
    }

    @Override
    public boolean canConnectRedstone(BlockState state, BlockGetter level, BlockPos pos, @Nullable Direction direction) {
        return true;
    }

    @Override
    public boolean isSignalSource(BlockState p_60571_) {
        return true;
    }

    @Override
    public int getSignal(BlockState p_60483_, BlockGetter p_60484_, BlockPos p_60485_, Direction p_60486_) {
        return 15;
    }
}
