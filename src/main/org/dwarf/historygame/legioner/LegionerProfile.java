package org.dwarf.historygame.legioner;

/**
 * Created by dwarf on 20.01.16.
 */
public class LegionerProfile {
    protected String name; // = "ДС-3293";
    protected LegionerProfile lieutenant; // = "ВЛ-1029";
    protected String nameLegion;
    protected int rang = 0;

    public LegionerProfile() {
        init();
    }

    public LegionerProfile(String name) {
        this.name = name;
        init();
    }

    public LegionerProfile(String name, int rang) {
        this.name = name;
        this.rang = rang;
        init();
    }

    public void assignLieutenant(LegionerProfile lieutenant) {
        this.lieutenant = lieutenant;
    }

    private void init() {
        System.out.println("Created unit with profile " + this);
    }

    @Override
    public String toString() {
        return "Legioner [" + name +", " +getRangName() + ", " + lieutenant + ", " + nameLegion + "]";
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