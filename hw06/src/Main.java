public class Main {
    Person person1 = new Person();
    Person person2 = new Person("Иван Иванов", 25);

    Phone phone1 = new Phone("123456789", "Samsung Galaxy S21", 0.17);
    Phone phone2 = new Phone("987654321", "iPhone 13", 0.14);
    Phone phone3 = new Phone("555555555", "Nokia 3310", 0.14);

System.out.println(phone1.getNumber());
phone1.receiveCall("Василий Петров");

System.out.println(phone2.getNumber());
phone2.receiveCall("Мария Иванова");

System.out.println(phone3.getNumber());
phone3.receiveCall("Иван Петров");

}
