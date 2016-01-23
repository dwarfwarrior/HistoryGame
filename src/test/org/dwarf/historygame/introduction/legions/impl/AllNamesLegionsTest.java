package org.dwarf.historygame.introduction.legions.impl;

import org.dwarf.historygame.introduction.legions.CloneLegion;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

/**
 * Created by dwarf on 19.01.16.
 */
public class AllNamesLegionsTest {

    @Test
    public void testReadFromFile7() throws Exception {

        Set<CloneLegion> legions = AllNamesLegions.readFromFile7("legions.name");
        Assert.assertTrue(legions.contains(AllNamesLegions.createLegion("212-й штурмовой батальон")));
        Assert.assertTrue(legions.contains(AllNamesLegions.createLegion("9-й штурмовой корпус")));
        Assert.assertTrue(legions.contains(AllNamesLegions.createLegion("Галактические пехотинцы")));
        Assert.assertTrue(legions.contains(AllNamesLegions.createLegion("14-я пехотная бригада")));
        Assert.assertTrue(legions.contains(AllNamesLegions.createLegion("85-я пехотная бригада")));
        Assert.assertTrue(legions.contains(AllNamesLegions.createLegion("182-й легион")));
        Assert.assertTrue(legions.contains(AllNamesLegions.createLegion("501-й легион")));
    }
}