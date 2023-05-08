package com.gmail.colewombwell.metaphysica.item;

import com.gmail.colewombwell.metaphysica.Metaphysica;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item CHICKEN_FETUS = registerItem("chicken_fetus",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item CHARRED_FETUS = registerItem("charred_fetus",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item PUTRID_MILK = registerItem("putrid_milk",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item sacrificial_lamb = registerItem("sacrificial_lamb",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));


    //methods
    private static Item registerItem(String name, Item item) {
     return Registry.register(Registry.ITEM, new Identifier(Metaphysica.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Metaphysica.LOGGER.debug("Registering Mod Items for " + Metaphysica.MOD_ID);
    }
}
