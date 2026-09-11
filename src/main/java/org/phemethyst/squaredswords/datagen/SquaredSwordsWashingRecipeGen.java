package org.phemethyst.squaredswords.datagen;

import java.util.concurrent.CompletableFuture;

import org.phemethyst.squaredswords.AllItems;
import org.phemethyst.squaredswords.SquaredSwords;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.WashingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Splashing recipe generator.
 */
public class SquaredSwordsWashingRecipeGen extends WashingRecipeGen {

    GeneratedRecipe EXAMPLE = create("squaredswords_washing",
            b -> b.require(Items.DIRT).output(AllItems.EXAMPLE_ITEM.get()));

    public SquaredSwordsWashingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, SquaredSwords.ID);
    }
}
