public class App {

    public static void main(String[] args) throws Exception {

        //Polymorphic variables
        GroceryItem item1 = new Diaper();
        item1.name = "Pampers";
        item1.showItemName();
        item1.itemPrice(59);

        GroceryItem item2 = new Softdrinks();
        item2.name = "Mountain Dew";
        item2.showItemName();
        item2.itemPrice(15);

        //Cashier object
        Cashier c1= new Cashier();


        //Polymorphic parameter
        c1.checkOut(item1);
        c1.showItemPrice(item1);
        c1.checkOut(item2);
        c1.showItemPrice(item2);

        System.out.println("================RECEIPT===================");

        //Polymorphic array
        GroceryItem[] itemArray= new GroceryItem[2];

        itemArray[0] = item1;
        itemArray[1] = item2;
        double totalAmount = 0.00;

        for (int i = 0; i < itemArray.length; i++) {
           itemArray[i].showItemName();
           System.out.println(itemArray[i].price);
           
           totalAmount += itemArray[i].price;
    }

    System.out.println("You owe " + totalAmount + " pesos to the grocery.");

    Dog myDog = new Dog();
    myDog.eat();
}
}
