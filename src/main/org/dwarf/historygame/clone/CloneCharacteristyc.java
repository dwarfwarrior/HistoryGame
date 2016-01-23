package org.dwarf.historygame.clone;

/**
 * Created by dwarf on 20.01.16.
 */
public class CloneCharacteristyc {
    protected String name = "ДС-3293";
    protected String nameLieutenant = "ВЛ-1029";
    protected String nameLegion;

    protected int rang = 0;


    public String getName() {
        return name;
    }

    public String getNameLegion() {
        return nameLegion;
    }

    public String getNameLieutenant() {
        return nameLieutenant;
    }

    public int getRang() {
        return rang;
    }


    public void setNameLegion(String nameLegion) {
        this.nameLegion = nameLegion;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }


    public static String nameRang(int rang) {
        String nameYourRang = null;
        if (rang == 0) {
            nameYourRang = "Новобранец";
        }
        if (rang == 1) {
            nameYourRang = "Клон-Боец";
        }
        if (rang == 2) {
            nameYourRang = "Клон-Сержант";
        }
        return nameYourRang;
    }


}