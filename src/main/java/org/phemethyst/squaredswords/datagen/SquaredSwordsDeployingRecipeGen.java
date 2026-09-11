package org.phemethyst.squaredswords.datagen;

import java.util.concurrent.CompletableFuture;

import org.phemethyst.squaredswords.AllItems;
import org.phemethyst.squaredswords.SquaredSwords;
import com.simibubi.create.api.data.recipe.BaseRecipeProvider.GeneratedRecipe;
import com.simibubi.create.api.data.recipe.DeployingRecipeGen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

/**
 * Deploying recipe generator. A single standalone step, unlike the multi-step
 * sequenced assembly example.
 */
public class SquaredSwordsDeployingRecipeGen extends DeployingRecipeGen {

    GeneratedRecipe EXAMPLE = create("squaredswords_deploying", b -> b
            .require(Items.IRON_INGOT)
            .require(Items.COPPER_INGOT)
            .output(AllItems.EXAMPLE_RESULT.get()));

    public SquaredSwordsDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, SquaredSwords.ID);
    }
}
