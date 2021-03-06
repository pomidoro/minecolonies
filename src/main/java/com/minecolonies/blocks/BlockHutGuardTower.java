package com.minecolonies.blocks;

import org.jetbrains.annotations.NotNull;

/**
 * Block of the GuardTower hut.
 */
public class BlockHutGuardTower extends AbstractBlockHut
{
    /**
     * Default constructor.
     */
    protected BlockHutGuardTower()
    {
        //No different from Abstract parent
        super();
    }

    @NotNull
    @Override
    public String getName()
    {
        return "blockHutGuardTower";
    }
}
