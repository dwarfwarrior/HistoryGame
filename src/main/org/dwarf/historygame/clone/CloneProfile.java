package org.dwarf.historygame.clone;

/**
 * Created by dwarf on 20.01.16.
 */
public class CloneProfile {
    protected String name; // = "ДС-3293";
    protected CloneProfile lieutenant; // = "ВЛ-1029";
    protected String nameLegion;
    protected int rang = 0;

    public CloneProfile(String name) {
        this.name = name;
    }

    public CloneProfile(String name, int rang) {
        this.name = name;
        this.rang = rang;
    }

    public void assignLieutenant(CloneProfile lieutenant) {
        this.lieutenant = lieutenant;
    }

    public void promote() {
        if (this.rang + 1 <= 10) {
            this.rang++;
        } else {
            System.out.println("Could not promote");
        }
    }

    public String getName() {
        return name;
    }

    public String getNameLegion() {
        return nameLegion;
    }

    public String getNameLieutenant() {
        return lieutenant.getName();
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

    public String getRangName() {
        return nameRang(rang);
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