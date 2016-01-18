package org.dwarf.historygame.clonelegions;

import org.dwarf.historygame.clonelegions.impl.AssaultCorps9th;

/**
 * Created by dwarf on 18.01.16.
 */
public class CloneLegionsFactory {
    public static CloneLegions getUnit(String type) {

        switch (type) {
            case "hero":
                return new AssaultCorps9th();

        }
        throw new UnsupportedOperationException(type);
    }
}
