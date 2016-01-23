package org.dwarf.historygame.level_1;

import org.dwarf.historygame.clone.CloneCharacteristyc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dwarf on 22.01.16.
 */
public class Start {
    public static void startLevel1() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CloneCharacteristyc cloneCharacteristyc = new CloneCharacteristyc();
        System.out.println("Добро Пожаловать На Службу");
        reader.readLine();
        System.out.println("Я - " + cloneCharacteristyc.getNameLieutenant());
        reader.readLine();
        System.out.println("Непосредственно Командир Твоего Взвода");
        reader.readLine();
        System.out.println("По Указу Генерала Магистра Йоды - Мы Выступаем В Первый Наш Бой");
        reader.readLine();
        System.out.println("...");
        reader.readLine();

    }
}
