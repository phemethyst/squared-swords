package org.phemethyst.squaredswords.datagen;

import java.util.concurrent.CompletableFuture;

import org.phemethyst.squaredswords.SquaredSwords;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.MillingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Milling recipe generator.
 */
public class SquaredSwordsMillingRecipeGen extends MillingRecipeGen {

    GeneratedRecipe EXAMPLE = create("squaredswords_milling", b -> b
            .require(Items.COBBLESTONE)
            .output(Items.SAND)
            .duration(100));

    public SquaredSwordsMillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, SquaredSwords.ID);
    }
}
