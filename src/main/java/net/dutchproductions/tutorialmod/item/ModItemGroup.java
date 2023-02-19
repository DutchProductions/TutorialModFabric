package net.dutchproductions.tutorialmod.item;

import net.dutchproductions.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TANZANITE;

    public static void registerItemGroups() {
        TANZANITE = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "tanzanite"))
                .displayName(Text.literal("Tanzanite Item Group"))
                .icon(() -> new ItemStack(ModItems.TANZANITE)).build();
    }
}
