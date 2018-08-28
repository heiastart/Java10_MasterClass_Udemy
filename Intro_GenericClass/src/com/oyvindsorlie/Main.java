package com.oyvindsorlie;

// An ordinary (non-generic) class;
class Person{
    private String name;
    private int password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}


// Our generic class is Login. The T in <> represents a template, a blueprint which we don't know the content of at first.
// In other words, Login is a generic (class) that excepts T...type of T is defined/decided in main, when we create an object of the class :D
class Login<T>{
    private T name;
    private T password;

    // Constructor
    public Login(T name, T password) {
        this.name = name;
        this.password = password;
    }

    // Getters and setters
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getPassword() {
        return password;
    }

    public void setPassword(T password) {
        this.password = password;
    }
}



public class Main {

    public static void main(String[] args) {

	    // Instantiating, object'ing our generic class, thus using the constructor
        Login<String> login = new Login<>("Oyvind","password");

        // Here, the beauty of generic classes is that we can change THE TYPE of the input parameters when instantiating the class...like this;
        Login<Integer> integerLogin = new Login<>(10,1024);

        Person person = new Person();
        person.setName("Oyvind");
        person.setPassword(12345);

        // Now we can use the person object (of type Person) as parameters for a new Login object :)
        Login<Person> personLogin = new Login<>(person, person);
        System.out.println(personLogin.getName().getName());
        System.out.println(personLogin.getName().getPassword());

    }
}
