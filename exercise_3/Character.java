public class Character {
    String name;
    int damage;
    int rarity;

    public void attack() {
        System.out.println("I am attacking with a: " + name );
    }
    
    public void addDamage(int x) {
        System.out.println("Damage increased from " + damage + " to " + (damage + x) + "\n");
        return;
    }

    public String showNameandRarity() {
        System.out.println("The weapon name is: " + name);
        System.out.println("The weapon rarity is: " + rarity);
        return"";
    }
}
