package net.satisfyu.meadow;

import dev.architectury.hooks.item.tool.AxeItemHooks;
import net.minecraft.world.level.block.Blocks;
import net.satisfyu.meadow.registry.*;
import net.satisfyu.meadow.util.WoodenCauldronBehavior;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Meadow {
    public static final String MOD_ID = "meadow";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        TabRegistry.init();
        ObjectRegistry.init();
        MeadowWoodRegistry.init();
        EntityRegistry.init();
        BlockEntityRegistry.init();
        EffectRegistry.init();
        RecipeRegistry.init();
        SoundRegistry.init();
        ScreenHandlerRegistry.init();
        FeatureRegistry.init();
    }

    public static void commonSetup() {
        FlammableBlockRegistry.init();
        CompostableRegistry.init();
        WoodenCauldronBehavior.bootStrap();

        AxeItemHooks.addStrippable(ObjectRegistry.PINE_LOG.get(), ObjectRegistry.STRIPPED_PINE_LOG.get());
        AxeItemHooks.addStrippable(ObjectRegistry.PINE_WOOD.get(), ObjectRegistry.STRIPPED_PINE_WOOD.get());
        AxeItemHooks.addStrippable(ObjectRegistry.ALPINE_BIRCH_LOG.get(), Blocks.STRIPPED_BIRCH_LOG);
        AxeItemHooks.addStrippable(ObjectRegistry.ALPINE_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
    }
}

