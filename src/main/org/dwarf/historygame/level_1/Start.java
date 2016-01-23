package org.dwarf.historygame.level_1;

import org.dwarf.historygame.clone.CloneProfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dwarf on 22.01.16.
 */
public class Start {
    public static void startLevel1() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CloneProfile cloneProfile1 = new CloneProfile("Del", 1);
        cloneProfile1.assignLieutenant("Del-l");
        cloneProfile1.promote();
        cloneProfile1.promote();
        cloneProfile1.promote();


        System.out.println("Добро Пожаловать На Службу");
        reader.readLine();
        System.out.println("Я - " + cloneProfile1.getNameLieutenant());
        reader.readLine();
        System.out.println("Непосредственно Командир Твоего Взвода");
        reader.readLine();
        System.out.println("По Указу Генерала Магистра Йоды - Мы Выступаем В Первый Наш Бой");
        reader.readLine();
        System.out.println("...");
        reader.readLine();

    }
}
