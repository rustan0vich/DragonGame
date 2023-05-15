public interface BitAble  {
    abstract int udarDragonToHeroPlusShield(Dragon dragon, Hero hero1, int ranChislo2);

    default int udarDragon(Dragon dragon){return 0;}
    default int udarDragonToHeroPlusShield(Dragon dragon,Hero hero1,HellHound hellHound1,int ranChislo2){return 0;}
    default int udarHero(Hero hero){return 0;}



}
