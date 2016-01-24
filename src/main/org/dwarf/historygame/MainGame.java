package org.dwarf.historygame;

import org.dwarf.historygame.legioner.LegionerProfile;
import org.dwarf.historygame.introduction.Introduction;
import org.dwarf.historygame.level_1.Start;

import java.io.IOException;

/**
 * Created by dwarf on 17.01.16.
 */
public class MainGame {
    public static void main(String[] args) throws IOException {
        // Start the game
        LegionerProfile legionerProfile = new LegionerProfile();


        // Introduction
        Introduction introduction = new Introduction();
        introduction.introduction(legionerProfile);

        System.out.println(legionerProfile);

        // Level 1
        Start start = new Start(legionerProfile);
        start.startLevel1();


    }


}