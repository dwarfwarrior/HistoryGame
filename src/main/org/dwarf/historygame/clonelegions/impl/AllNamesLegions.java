package org.dwarf.historygame.clonelegions.impl;

import org.dwarf.historygame.clonelegions.CloneLegion;
import org.dwarf.historygame.clonelegions.CloneLegionsFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dwarf on 18.01.16.
 */
public class AllNamesLegions {

    private static Set<CloneLegion> legions = new HashSet<>();
    private final static String LEGION = "cloneLegion";

    static {
        legions.add(createLegion("212-й штурмовой батальон"));
        legions.add(createLegion("9-й штурмовой корпус"));
        legions.add(createLegion("Галактические пехотинцы"));
        legions.add(createLegion("14-я пехотная бригада"));
        legions.add(createLegion("85-я пехотная бригада"));
        legions.add(createLegion("182-й легион"));
        legions.add(createLegion("501-й легион"));
    }

    protected static CloneLegion createLegion(String name) {
        return CloneLegionsFactory.getUnit(LEGION, name);
    }

    public static Set<CloneLegion> getLegions() {
        return legions;
    }

//    public static Set<CloneLegion> readFromFile8(String name) {
//        try (Stream<String> stream = Files.lines(Paths.get(name))) {
//            return stream.map(x -> createLegion(x)).collect(Collectors.toSet());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return Collections.emptySet();
//    }

    public static Set<CloneLegion> readFromFile7(String name) {
        Set<CloneLegion> cloneNameLegion = new HashSet<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(name));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    cloneNameLegion.add(createLegion(s));
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cloneNameLegion;
    }

}
