package org.dwarf.historygame.chooseyourlegion;

import org.dwarf.historygame.clonelegions.CloneLegion;
import org.dwarf.historygame.clonelegions.impl.AllNamesLegions;
import org.dwarf.historygame.introduction.ChoosingMethod;

import java.io.IOException;
import java.util.Set;

/**
 * Created by dwarf on 17.01.16.
 */
public class ChoosingYourLegion {
    public String chooseyourlegion() throws IOException {
        ChoosingMethod choosingMethod = new ChoosingMethod();
        String yourLegion = choosingMethod.nameLegion();
        Set<CloneLegion> cloneNameLegion;
        cloneNameLegion = readFromFileNamesLegions();

        for (CloneLegion legion : cloneNameLegion) {

            if (legion.getName().equals(yourLegion)) {
                return yourLegion;
            }

        }
        return null;
    }


    public static Set<CloneLegion> readFromFileNamesLegions() {
        Set<CloneLegion> cloneNameLegion;
        cloneNameLegion = AllNamesLegions.getLegions();

        return cloneNameLegion;
    }

    public String returnNameLegion() throws IOException {
        while (true) {
            String name = chooseyourlegion();
            if (name == null) {
                System.out.println("Вы Ввели Не Правильно Название, Повторите Попытку Снова");
            } else

                return name;

        }
    }

    public String nameLegion() {

        return null;
    }
}
/*
   1. ввести назву легіону
   2. перевірити чи є назва цього легіону в списку легіонів
      2.1. якщо імя яку ввів користувач є в цьому списку, то повертаємо цю назву
        2.2 якщо не має її там, то ми видаємо що ввели не вірну назву, спробуйте ще
            2.2.1 повернення до пункту 1.


 */

