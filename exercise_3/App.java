public class App {
    public static void main(String[] args) {

        Character sword = new Character();

        sword.name= "Sovereign Sword";
        sword.damage= 75;
        sword.rarity= 4;
        sword.attack();
        sword.addDamage(75);
        sword.showNameandRarity();
    }
}
