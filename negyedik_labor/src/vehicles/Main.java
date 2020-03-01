package vehicles;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        Vehicle toyota = new Vehicle(2020,"ABC123","Toyota");
        Vehicle bmw = new Vehicle(2006,"QWE456","Bmw");
        Person p1 = new Person(1996,"Víz Elek","Budapest");
        Person p2 = new Person(1996,"Pór Nóra","Debrecen");
        vehicles.add(toyota);
        vehicles.add(bmw);
        people.add(p1);
        people.add(p2);


        p1.addCar(toyota);
        p1.addCar(bmw);
        p1.listCars();
        p1.removeCar("ABC123");
        System.out.println("__________________________________");
        p1.listCars();
        System.out.println(oldCars(vehicles,2000));
        System.out.println(oldOwners(people));
    }

    public static int oldCars(ArrayList<Vehicle> vehicles,int year) {
        int counter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getConstructionYear() > year) {
                counter++;
            }
        }
        return counter;
    }

    public static ArrayList<Person> oldOwners(ArrayList<Person> people) {
        ArrayList<Person> haveOldCar = new ArrayList<>();
        for(Person p : people) {
            for(Vehicle v : p.getCars()) {
                if (2020-v.getConstructionYear() < 2010) {
                    haveOldCar.add(p);
                }
            }
        }
        return haveOldCar;
    }
}
