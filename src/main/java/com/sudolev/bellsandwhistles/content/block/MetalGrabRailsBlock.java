package com.sudolev.bellsandwhistles.content.block;

import com.simibubi.create.content.decoration.MetalLadderBlock;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class MetalGrabRailsBlock extends MetalLadderBlock implements IWrenchable {
    public MetalGrabRailsBlock(Properties pProperties) {
        super(pProperties);
    }
    public float getShadeBrightness(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState pState, BlockGetter pReader, BlockPos pPos) {
        return true;
    }
}