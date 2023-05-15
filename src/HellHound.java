public class HellHound {
    private int HP;
    private int defence;
    private int strengh;
    private int weapon;

    public HellHound(int HP, int defence, int strengh, int weapon) {
        this.HP = HP;
        this.defence = defence;
        this.strengh = strengh;
        this.weapon = weapon;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "HellHound{" +
                "HP=" + HP +
                ", defence=" + defence +
                ", strengh=" + strengh +
                ", weapon=" + weapon +
                '}';
    }
    public int udarHero(Hero hero,int chislo){
        if (chislo>25){

            int uron=hero.getStrengh()+hero.getWeapon()-this.defence;
            System.out.println("Герой попал по дракону: "+uron);
            this.HP = this.HP - uron;
        }else {
            System.out.println("Udar ne popal po dragonu");
        }
        return this.HP;
    }
}


