public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle bike = new Bicycle("Cervelo", 2, 29);
    System.out.println(bike.getName());
    System.out.println(bike.getWheels());
    System.out.println(bike.getGearCount());
    bike.ringBell();
    bike.move(35);
    bike.brake(20);
    bike.turn(65);

    LittleTikes tike = new LittleTikes("Baby Roller", 4, 2, 2);
    System.out.println(tike.getName());
    System.out.println(tike.getWheels());
    System.out.println(tike.getDoors());
    System.out.println(tike.getEyes());
    tike.spin();
    tike.squeak();
    tike.openDoors();
    tike.closeDoors();
    tike.move(35);
    tike.brake(20);
    tike.turn(65);
  }
}