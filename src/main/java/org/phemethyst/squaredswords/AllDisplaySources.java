package org.phemethyst.squaredswords;

import org.phemethyst.squaredswords.content.display.SquaredSwordsDisplaySource;
import com.simibubi.create.api.behaviour.display.DisplaySource;
import com.tterrag.registrate.util.entry.RegistryEntry;

/**
 * Display source registration. Attach an entry to a block in AllBlocks with
 * transform(DisplaySource.displaySource(entry)).
 */
public class AllDisplaySources {

    public static final RegistryEntry<DisplaySource, SquaredSwordsDisplaySource> EXAMPLE_SOURCE = SquaredSwords.REGISTRATE
            .displaySource("squaredswords_source", SquaredSwordsDisplaySource::new)
            .register();

    public static void register() {
        // Force class loading to trigger Registrate calls
    }
}
