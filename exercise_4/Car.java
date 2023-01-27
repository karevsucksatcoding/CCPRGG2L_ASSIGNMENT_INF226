public class Car {
    
    String name;
    String color;
    String plateNumber;
    Person owner;

    Car(String carName, String carColor, String carPlateNumber, Person carOwner) {
        this.name=carName;
        this.owner=carOwner;
        this.color=carColor;
        this.plateNumber=carPlateNumber;
    }

    void showCarOwner(){
        System.out.println("The car (" + this.name + ") is owned by " + owner.name + ". They are rocking the " + this.color + " color variation and bears the plate number " + this.plateNumber +".");
    }
}
