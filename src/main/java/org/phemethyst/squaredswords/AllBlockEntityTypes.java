package org.phemethyst.squaredswords;

import org.phemethyst.squaredswords.content.kinetics.SquaredSwordsGeneratorBlockEntity;
import org.phemethyst.squaredswords.content.kinetics.SquaredSwordsKineticBlockEntity;
import org.phemethyst.squaredswords.content.kinetics.SquaredSwordsShaftRenderer;
import com.simibubi.create.content.kinetics.base.ShaftVisual;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

/**
 * Block entity type registration.
 */
public class AllBlockEntityTypes {

    /**
     * Block entity for EXAMPLE_KINETIC_BLOCK, rendered with SquaredSwordsShaftRenderer so a
     * shaft visibly spins through the casing.
     */
    public static final BlockEntityEntry<SquaredSwordsKineticBlockEntity> EXAMPLE_KINETIC = SquaredSwords.REGISTRATE
            .blockEntity("squaredswords_kinetic", SquaredSwordsKineticBlockEntity::new)
            // visual for flywheel renderer
            .visual(() -> ShaftVisual::new)
            .validBlock(AllBlocks.EXAMPLE_KINETIC_BLOCK)
            // fallback renderer if flywheel is not available
            .renderer(() -> SquaredSwordsShaftRenderer::new)
            .register();

    /**
     * Block entity for EXAMPLE_GENERATOR_BLOCK, also rendered with SquaredSwordsShaftRenderer.
     */
    public static final BlockEntityEntry<SquaredSwordsGeneratorBlockEntity> EXAMPLE_GENERATOR = SquaredSwords.REGISTRATE
            .blockEntity("squaredswords_generator", SquaredSwordsGeneratorBlockEntity::new)
            .visual(() -> ShaftVisual::new)
            .validBlock(AllBlocks.EXAMPLE_GENERATOR_BLOCK)
            .renderer(() -> SquaredSwordsShaftRenderer::new)
            .register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
