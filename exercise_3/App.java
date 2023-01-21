public class App {
    public static void main(String[] args) {

        Weapon sword = new Weapon();

        sword.name= "Sovereign Sword";
        sword.damage= 75;
        sword.rarity= 4;
        sword.attack();
        sword.addDamage(75);
        sword.showNameandRarity();
    }
}
