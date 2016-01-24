package org.dwarf.historygame.introduction;

import org.dwarf.historygame.legioner.LegionerProfile;
import org.dwarf.historygame.introduction.legions.chooser.ChoosingMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dwarf on 20.01.16.
 */
public class Introduction {

    public void introduction(LegionerProfile profile) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ChoosingMethod choosingMethod = new ChoosingMethod();
        choosingMethod.text();
        System.out.println("\n" + "\n");
        reader.readLine();
        choosingMethod.start();
        reader.readLine();
        System.out.println();
        System.out.println((char) 27 + "[32m[Каминонианец] Здравствуй!");
        reader.readLine();
        System.out.println("[Каминонианец] Твое Имя: " + profile.getName());
        reader.readLine();
        System.out.println("[Каминонианец] Твой Путь Начинаеться Сейчас");
        reader.readLine();
        System.out.println("[Каминонианец] Ты Должен Выбрать В Котором Легионе Будешь Воевать");
        reader.readLine();
        System.out.println();

        System.out.println((char) 27 + "[32m" +
                "[Система] Выберите Легион Из Списка В Котором Вы Будете Служить");
        System.out.println();
        System.out.println((char) 27 + "[30m[Система] что бы появился список легионов нажмите \"ENTER\"");
        System.out.println((char) 27 + "[32m");
        reader.readLine();

        String nameLegion = choosingMethod.choosingMethod();

        profile.setNameLegion(nameLegion);

    }
}
