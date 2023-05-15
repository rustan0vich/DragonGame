public class Hero implements BitAble{
    private int HP;
    private int defence;
    private int strengh;
    private int weapon;
    private int shield;

    public Hero(int HP, int defence, int strengh, int weapon, int shield) {
        this.HP = HP;
        this.defence = defence;
        this.strengh = strengh;
        this.weapon = weapon;
        this.shield = shield;
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

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "HP=" + HP +
                ", defence=" + defence +
                ", strengh=" + strengh +
                ", weapon=" + weapon +
                ", shield=" + shield +
                '}';
    }

    @Override
    public int udarDragonToHeroPlusShield(Dragon dragon,Hero hero1,int ranChislo2) {
        if (ranChislo2 >= 30) {
            System.out.println("Дракон нанес урон: " + dragon.getStrengh());
            int defenceOfShield=shield+defence;
            if (dragon.getStrengh()<defenceOfShield){

            }else {
                int aaa=defenceOfShield-dragon.getStrengh();
                this.HP-=aaa;
            }


        } else {
            System.out.println("Дракон не стал атаковать Героя");
        }


        return HP;
    }

    @Override
    public int udarDragon(Dragon dragon) {

        return this.HP=this.HP-dragon.getStrengh();
    }

}
