package com.infinitygauntlet;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * Phase 1: plain, non-functional items (no abilities yet).
 * Each stone and the gauntlet exist as real registered items you can
 * craft/give/hold in-game. Abilities (Section 6-11 of the spec) come
 * in later phases once this foundation is confirmed working.
 */
public class ModItems {

    public static final Item INFINITY_GAUNTLET = register("infinity_gauntlet",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item POWER_STONE = register("power_stone",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item SPACE_STONE = register("space_stone",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item MIND_STONE = register("mind_stone",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item REALITY_STONE = register("reality_stone",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item TIME_STONE = register("time_stone",
            new Item(new Item.Settings().maxCount(1)));

    public static final Item SOUL_STONE = register("soul_stone",
            new Item(new Item.Settings().maxCount(1)));

    private static Item register(String path, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(InfinityGauntletMod.MOD_ID, path), item);
    }

    public static void initialize() {
        // Add every item to the vanilla "Combat" creative tab so they're easy to find.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(INFINITY_GAUNTLET);
            entries.add(POWER_STONE);
            entries.add(SPACE_STONE);
            entries.add(MIND_STONE);
            entries.add(REALITY_STONE);
            entries.add(TIME_STONE);
            entries.add(SOUL_STONE);
        });
    }
}
