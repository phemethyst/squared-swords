package org.phemethyst.squaredswords.datagen;

import java.util.concurrent.CompletableFuture;

import org.phemethyst.squaredswords.AllItems;
import org.phemethyst.squaredswords.SquaredSwords;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.PressingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Pressing recipe generator.
 */
public class SquaredSwordsPressingRecipeGen extends PressingRecipeGen {

    GeneratedRecipe EXAMPLE = create("squaredswords_pressing", b -> b
            .require(Items.IRON_INGOT)
            .output(AllItems.EXAMPLE_ITEM.get()));

    public SquaredSwordsPressingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, SquaredSwords.ID);
    }
}
