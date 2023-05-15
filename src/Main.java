import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        HellHound hellHound1 = new HellHound(1500, 100, 120, 0);
        Dragon dragon1 = new Dragon(2000, 120, 150, 0);
        Hero hero1 = new Hero(1000, 100, 120, 250, 150);
        Scanner scanner = new Scanner(System.in);
        boolean bbb = true;
        sprosPerson();
        while (bbb) {
            if (dragon1.getHP()>0||hellHound1.getHP()>0 &&hero1.getHP()> 0){
                char aa = scanner.next().charAt(0);

                int ranChislo1 = random.nextInt(0, 90);
                int ranChislo = random.nextInt(0, 100);
                switch (aa) {
                    case '1':
                            heroAttackToDracon(dragon1,hero1,ranChislo);
                        if (dragon1.getHP()>0||hellHound1.getHP()>0){
                            draconAttackToHero(dragon1,hero1,ranChislo1);

                        }
                            break;
                    case '2':
                        System.out.println("Герой ничего не сделал");
                        draconAttackToHero(dragon1,hero1,ranChislo1);
                        break;
                    case '3':
                        System.out.println("Герой поставил щит");
                        System.out.println("do Hero HP: " + hero1.getHP());
                        hero1.udarDragonToHeroPlusShield(dragon1,hero1,ranChislo1);
                        System.out.println("posle Hero HP: " + hero1.getHP() + "\n");
                        break;
                }
            }
            else{
            if (dragon1.getHP() <= 0) {
                System.out.println("Герой победил");
                break;
            } else if (hero1.getHP() <= 0) {
                System.out.println("Дракон победил");
                break;
            }
            }



        }

    }

   


    public static void sprosPerson() {
        System.out.println("Нажмите '1' чтобы атаковать");
        System.out.println("Нажмите '2' чтобы ничего не делать");
        System.out.println("Нажмите '3' чтобы защищаться");
    }
    public static void draconAttackToHero(Dragon dragon1,Hero hero1, int ranChislo1) {
        System.out.println("do Hero HP: " + hero1.getHP());

        if (ranChislo1 >= 30) {
            System.out.println("Дракон нанес урон: " + dragon1.getStrengh());
            hero1.udarDragon(dragon1);
        } else {
            System.out.println("Дракон не стал атаковать Героя");
        }
        System.out.println("posle Hero HP: " + hero1.getHP() + "\n");
    }

    public static void heroAttackToDracon(Dragon dragon1,Hero hero1, int ranChislo) {
        System.out.println("do Dragons HP: " + dragon1.getHP());
        dragon1.udarHero(hero1, ranChislo);
        System.out.println("posle Dragons HP: " + dragon1.getHP() + "\n");
    }
}