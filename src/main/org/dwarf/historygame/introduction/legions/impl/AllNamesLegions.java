package org.dwarf.historygame.introduction.legions.impl;

import org.dwarf.historygame.introduction.legions.RomeLegion;
import org.dwarf.historygame.introduction.legions.RomeLegionsFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by dwarf on 18.01.16.
 */
public class AllNamesLegions {

    private static Set<RomeLegion> legions = new HashSet<>();
    private final static String LEGION = "romeLegion";

    static {
        legions.add(createLegion("I Legion"));
        legions.add(createLegion("II Legion"));
        legions.add(createLegion("III Legion"));
        legions.add(createLegion("IV Legion"));
        legions.add(createLegion("V Legion"));
        legions.add(createLegion("VI Legion"));
        legions.add(createLegion("VII Legion"));
        legions.add(createLegion("VIII Legion"));
    }

    protected static RomeLegion createLegion(String name) {
        return RomeLegionsFactory.getUnit(LEGION, name);
    }

    public static Set<RomeLegion> getLegions() {
        return legions;
    }

//    public static Set<RomeLegion> readFromFile8(String name) {
//        try (Stream<String> stream = Files.lines(Paths.get(name))) {
//            return stream.map(x -> createLegion(x)).collect(Collectors.toSet());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return Collections.emptySet();
//    }

    public static Set<RomeLegion> readFromFile7(String name) {
        Set<RomeLegion> legionersNameLegion = new HashSet<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(name));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    legionersNameLegion.add(createLegion(s));
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return legionersNameLegion;
    }

}
