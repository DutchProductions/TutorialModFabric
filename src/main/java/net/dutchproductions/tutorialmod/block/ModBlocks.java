package net.dutchproductions.tutorialmod.block;

import net.dutchproductions.tutorialmod.TutorialMod;
import net.dutchproductions.tutorialmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TANZANITE);
    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);
   public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);
   public static final Block NETHER_TANZANITE_ORE = registerBlock("nether_tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);
   public static final Block END_TANZANITE_ORE = registerBlock("end_tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
