public class Pet {

    //Attributes
    String name;
    int age;
    Person owner;

    //Constructor
    Pet(String petName, int petAge, Person ownerName) {
        this.age= petAge;
        this.name= petName;
        this.owner= ownerName;
    }

    void showOwner() {
        System.out.println("My name is " + this.name + " and my owner is " + owner.name);
    }
}
