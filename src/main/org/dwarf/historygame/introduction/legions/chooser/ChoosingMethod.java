package org.dwarf.historygame.introduction.legions.chooser;

import org.dwarf.historygame.introduction.legions.RomeLegion;
import org.dwarf.historygame.introduction.legions.impl.AllNamesLegions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

/**
 * Created by dwarf on 20.01.16.
 */
public class ChoosingMethod {
    public static String choosingMethod() throws IOException {
        Set<RomeLegion> legions = AllNamesLegions.readFromFile7("legions.name");
        legions.forEach(System.out::println);
        System.out.println((char) 27 + "[36m");


        System.out.println("Для Его Имени Введите Его Полное Название");
        System.out.println((char) 27 + "[33m");

        ChoosingYourLegion yourNameLegion = new ChoosingYourLegion();
        final String yourLegionName = yourNameLegion.returnNameLegion();
        System.out.println();
        System.out.println("Вы Выбрали Легион, Название Которого:  "
                + (char) 27 + "[31m\"" + yourLegionName + "\"");
        return yourLegionName;

    }

    public static void text() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println((char) 27 + "[34mДавным-давно,");
        System.out.println("в далёкой-далёкой галактике...");


        reader.readLine();
        System.out.println();

        System.out.println((char) 27 + "[33m");
        System.out.println("В Галактическом Сенате неспокойно.\n" +
                "Несколько тысяч звёздных\n" +
                "систем объявили о намерении\n" +
                "выйти из состава Республики.\n" +
                "\n" +
                "Движение сепаратистов,\n" +
                "возглавляемых загадочным\n" +
                "графом Дуку, создало трудности\n" +
                "малочисленным джедаям\n" +
                "сохранять мир и порядок\n" +
                "в галактике.\n" +
                "\n" +
                "Сенатор Амидала, бывшая\n" +
                "королева Набу, возвращается\n" +
                "в Галактический Сенат, чтобы\n" +
                "голосовать по принципиальному\n" +
                "вопросу: созданию\n" +
                "АРМИИ РЕСПУБЛИКИ\n" +
                "в помощь несправляющимся\n" +
                "джедаям…");
    }

    public static void start() throws IOException{
        System.out.println("****************************************");
        System.out.println("****************START*******************");
        System.out.println("****************************************");
        System.out.println();
    }

    public static String nameLegion() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameYourLegion = reader.readLine();
        return nameYourLegion;
    }



}
