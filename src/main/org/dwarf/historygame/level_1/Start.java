package org.dwarf.historygame.level_1;

import org.dwarf.historygame.legioner.LegionerProfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dwarf on 22.01.16.
 */
public class Start {

    private LegionerProfile profile;

    public Start(LegionerProfile profile) {
        this.profile = profile;
    }

    public void startLevel1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Добро Пожаловать На Службу");
        reader.readLine();
        System.out.println("Я - " + profile.getNameLieutenant());
        reader.readLine();
        System.out.println("Непосредственно Командир Твоего Взвода");
        reader.readLine();
        System.out.println("По Указу Генерала Магистра Йоды - Мы Выступаем В Первый Наш Бой");
        reader.readLine();
        System.out.println("...");
        reader.readLine();
    }
}
