package com.company.Exercise1;

public class DogTester {
    public static void test() {
        Dog dog = new Dog("Sharik", 5, "shepherd");
        dog.setAge(6);
        System.out.println(dog.toString());
        dog.intoHumanAge();
    }
}
