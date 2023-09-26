// Створіть проект з класом Main.java.
//Потрібно: Створити клас  Address. У тілі класу потрібно створити поля: index, country, city, street, house, apartment.
// Для кожного поля створити метод з двома методами доступу (get, set) Створити екземпляр класу Address.
// У поля экземпляра записати інформацію. Виведіть на екран значення полів, що описують адресу.
package task4_02;

public class Main {
    public static void main(String[] args) {
        Address myAddress=new Address();

        myAddress.setIndex(1);
        myAddress.setApartment(123);
        myAddress.setHouse(76);
        myAddress.setCity("Kyiv");
        myAddress.setCountry("Ukraine");
        myAddress.setStreet("Dybrovicka");

        System.out.println(myAddress);
    }
}
