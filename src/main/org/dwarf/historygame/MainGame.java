package org.dwarf.historygame;

import org.dwarf.historygame.clone.CloneCharacteristyc;
import org.dwarf.historygame.introduction.Introduction;
import org.dwarf.historygame.level_1.Start;

import java.io.IOException;

/**
 * Created by dwarf on 17.01.16.
 */
public class MainGame {
    public static void main(String[] args) throws IOException {
        // Start the game
        CloneCharacteristyc cloneCharacteristyc = new CloneCharacteristyc();


        // Introduction
        Introduction introduction = new Introduction();
        cloneCharacteristyc.setNameLegion(introduction.introduction());

        // Level 1
        Start start = new Start();
        start.startLevel1();
        System.out.println(cloneCharacteristyc.nameRang(cloneCharacteristyc.getRang()));
        cloneCharacteristyc.setRang(1);
        System.out.println(cloneCharacteristyc.nameRang(cloneCharacteristyc.getRang()));

    }


}
