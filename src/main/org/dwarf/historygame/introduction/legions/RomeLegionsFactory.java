package org.dwarf.historygame.introduction.legions;

/**
 * Created by dwarf on 18.01.16.
 */
public class RomeLegionsFactory {
    public static RomeLegion getUnit(String type, String legionName) {

        switch (type) {
            case "romeLegion":
                return new RomeLegion(legionName);
            default:
                throw new UnsupportedOperationException(type);
        }
    }
}
