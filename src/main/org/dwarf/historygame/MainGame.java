package org.dwarf.historygame;

import org.dwarf.historygame.clone.CloneProfile;
import org.dwarf.historygame.introduction.Introduction;
import org.dwarf.historygame.level_1.Start;

import java.io.IOException;

/**
 * Created by dwarf on 17.01.16.
 */
public class MainGame {
    public static void main(String[] args) throws IOException {
        // Start the game
        CloneProfile cloneProfile = new CloneProfile();


        // Introduction
        Introduction introduction = new Introduction();
        cloneProfile.setNameLegion(introduction.introduction());

        // Level 1
        Start start = new Start();
        start.startLevel1();
        System.out.println(cloneProfile.nameRang(cloneProfile.getRang()));
        cloneProfile.setRang(1);
        System.out.println(cloneProfile.nameRang(cloneProfile.getRang()));

    }


}