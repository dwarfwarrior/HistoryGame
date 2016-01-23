package org.dwarf.historygame.clonelegions;

/**
 * Created by dwarf on 18.01.16.
 */
public class CloneLegionsFactory {
    public static CloneLegion getUnit(String type, String legionName) {

        switch (type) {
            case "cloneLegion":
                return new CloneLegion(legionName);
            default:
                throw new UnsupportedOperationException(type);
        }
    }
}
