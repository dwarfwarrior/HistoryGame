package org.dwarf.historygame;

import org.dwarf.historygame.introduction.CloneCharacteristyc;
import org.dwarf.historygame.introduction.Introduction;

import java.io.IOException;

/**
 * Created by dwarf on 17.01.16.
 */
public class MainGame {
    public static void main(String[] args) throws IOException {
        // Start the game

        Introduction introduction = new Introduction();
        introduction.introduction();
        CloneCharacteristyc cloneCharacteristyc = new CloneCharacteristyc();
        System.out.println(cloneCharacteristyc.getNameLegion());
    }


}
