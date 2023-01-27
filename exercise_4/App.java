public class App {

    public static void main(String[] args) throws Exception {
    
    //Person Object - Aggregation example
    Person Me =         new Person("Erol",          19);
    Person Friend =     new Person("Karev",         21);
    Person Classmate1 = new Person("Richard",       20);
    Person Classmate2 = new Person("Christopher",   19);
    Person Classmate3 = new Person("Enzo",          21);


    System.out.println("Classmates:");

    Me.addClassmate(Classmate1);
    Me.addClassmate(Classmate2);
    Me.addClassmate(Classmate3);

    System.out.println("\nFriends:");
    
    Me.addFriend(Friend);

    //Pet Object - Composition example
    Pet Dog = new Pet("Doggo", 5, Me);

    System.out.println("\nPets:");

    Dog.showOwner();

    //Car Object- Composition example
    Car newCar = new Car("Ford Everest", "blue", "NUM-104158", Me);

    Car newCar2 = new Car("Toyota Vios", "white", "NUL-203920", Friend);

    System.out.println("\nVehicles:");

    newCar.showCarOwner();
    newCar2.showCarOwner();
    }
}
