package org.dwarf.historygame;

import org.dwarf.historygame.clonelegions.CloneLegions;
import org.dwarf.historygame.clonelegions.CloneLegionsFactory;

/**
 * Created by dwarf on 17.01.16.
 */
public class MainGame {
    public static void main(String[] args) {

        CloneLegions nines = CloneLegionsFactory.getUnit("hero");
        String legionname = nines.getName();
        System.out.println(legionname);
    }
}
