package com.gmail.colewombwell.metaphysica;

import com.gmail.colewombwell.metaphysica.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Metaphysica implements ModInitializer {
    public static final String MOD_ID = "metaphysica";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // * runs onInitialize()

    @Override
    public void onInitialize() {

        ModItems.registerModItems();

    }
}
