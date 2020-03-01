package vehicles;

import java.util.ArrayList;

public class Person {
    private int yearOfBirth;
    private String name;
    private String address;
    private ArrayList<Vehicle> cars;

    public Person(int yearOfBirth, String name, String address) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.address = address;
        this.cars = new ArrayList<>();
    }

    public void addCar(Vehicle car) {
        this.cars.add(car);
        car.setOwner(this);
    }

    public void listCars() {
        for(Vehicle car : cars) {
            System.out.println(car.toString());
        }
    }

    public void removeCar(String platenum) {
        try {
            Vehicle car = findCar(platenum);
            this.cars.remove(car);
            car.setOwner(null);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Vehicle findCar(String platenum) throws Exception {
        for (Vehicle car : cars) {
            if (car.getPlateNumb().equals(platenum)) {
                return car;
            }
        }
        throw new Exception("Hibás rendszám!");
    }

//getters and setters
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return yearOfBirth + " | " + name + " | " + address;
    }
}
