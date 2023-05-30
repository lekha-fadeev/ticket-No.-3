public class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println("Конструктор по умолчанию");
    }
    public Person(String name, int age){
        System.out.println("Конструктор разработчика");
        this.name = name;
        this.age = age;
    }
}
