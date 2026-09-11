package org.phemethyst.squaredswords.datagen;

import java.util.concurrent.CompletableFuture;

import org.phemethyst.squaredswords.SquaredSwords;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.CuttingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Cutting recipe generator.
 */
public class SquaredSwordsCuttingRecipeGen extends CuttingRecipeGen {

    GeneratedRecipe EXAMPLE = create("squaredswords_cutting", b -> b
            .require(Items.OAK_LOG)
            .output(Items.OAK_PLANKS, 6)
            .duration(50));

    public SquaredSwordsCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, SquaredSwords.ID);
    }
}
