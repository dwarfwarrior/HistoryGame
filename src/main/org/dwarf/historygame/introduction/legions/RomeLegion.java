package org.dwarf.historygame.introduction.legions;

/**
 * Created by dwarf on 17.01.16.
 */
public class RomeLegion {
    public String getName() {
        return name;
    }

    protected String name;

    public RomeLegion(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "\"" + name + "\"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RomeLegion)) return false;

        RomeLegion that = (RomeLegion) o;

        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
