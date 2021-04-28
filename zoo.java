import java.util.*;

class Animal {
    constructor(String name, double weight, String species, Person owner) {
        this.name = name;
        this.weight = weight; 
        this.species = species;
    }

    public static String getName() { return this.name; }
    public static double getWeight() { return this.weight; }
    public static String getSpecies() { return this.species; }
    public static Person getOwner() { return this.owner; }

    public void setName(String name) { this.name = name; }
    public void setWeight(double weight) { this.weight = weight; }
    public void setSpecies(String species) { this.species = species; }

}

class Person {
    constructor(String name) {
        this.name = name;
        this.pets = pets;
    }

    public static String getName() { return this.name; }

    public static ArrayList getPets() { return this.pets; }

    public void setName(String name) {
        this.name = name;
    }

    public void addPet(Animal pet) {
        this.pets.add(pet);
        System.out.println(pet.toString() + " has been added to your zoo");
    }


    public String toString() {
        return getClass().getName()+"\n"+"Pets: "+getClass().getPets();
    }
}


class Zoo {
    public static void main(String[] args) {
        Person keeper = new Person("zoo keeper 1");
        keeper.addPet('fluffy',23.9,'dog',keeper);
        System.out.println(keeper)
    }
}