package org.phemethyst.squaredswords.content.ponder;

import org.phemethyst.squaredswords.AllBlocks;
import org.phemethyst.squaredswords.SquaredSwords;

import net.createmod.ponder.api.registration.PonderPlugin;
import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.resources.ResourceLocation;

/**
 * Ponder plugin for the addon, registered client-side in SquaredSwords. registerScenes
 * associates a storyboard with one or more items. Each scene has two parts: a schematic
 * saved as an nbt file under assets/squaredswords/ponder, whose name matches the id passed
 * to addStoryBoard, and the storyboard code in SquaredSwordsPonderScenes.
 */
public class SquaredSwordsPonderPlugin implements PonderPlugin {

    @Override
    public String getModId() {
        return SquaredSwords.ID;
    }

    @Override
    public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
        helper.forComponents(AllBlocks.EXAMPLE_KINETIC_BLOCK.getId())
                .addStoryBoard("squaredswords_ponder", SquaredSwordsPonderScenes::examplePonder);

        helper.forComponents(com.simibubi.create.AllBlocks.DESK_BELL.getId())
                .addStoryBoard("desk_bell", DeskbellScenes::intro);
    }
}
