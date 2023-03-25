public class Person {
    private String fullName;
    private int age;
    Person person1 = new Person();
    Person person2 = new Person("Иван Иванов", 25);

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " движется");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}
