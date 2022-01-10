 /**
 * Java 1. Homework #5
 *
 * @author Bakeshko Daria
 * @version 27.12.21
 *
 */
class HomeWorkFifth {
    public static void main(String[] args) {
        //4. Создать массив из 5 сотрудников.
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Popov Nikita Semenovich", "Engineer", "PopovNS@mail.com", "89105601475", 20000, 45);
        emplArray[1] = new Employee("Orlova Irina Efteevna", "Engineer", "OrlovaIE@mail.com", "89195471320", 22000, 41);
        emplArray[2] = new Employee("Varushkin Nikolaj Nikolaevich", "Manager", "VarushkinNN@gmail.com", "89786541078", 30000, 40);
        emplArray[3] = new Employee("Bondar Elena Robertovna", "Secretary", "BondarER@mail.com", "89104002020", 18000, 26);
        emplArray[4] = new Employee("Ivanova Maria Vladimirovna", "Assistant", "IvanovaMV@mail.com", "89107894512", 18000, 55);
        //System.out.println(emplArray[0]);
        for (int i = 0; i < emplArray.length; i++ ) {
            if (emplArray[i].getAge() > 40) {
                System.out.println(emplArray[i]);
            }
        }
        /* по мотивам разбора Сергея
        for (Employee empl : emplArray) {
            if (empl.getAge() > 40) {
                System.out.println(empl);
            }
        }
        */
    }
}
//1. Создать класс Сотрудник с полями
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    //Параметризированный конструктор
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    /*
    //Пустой конструктор
    Employee() {

    }

    //Сеттер - изменение (данных) поля внутри объекта
    public void setFullName(String fullName) {
        if (fullName != null) {//услвие зщты
            this.fullName = fullName;
        }
    }
    */
        //Геттер - получение значения поля из объекта
    public int getAge() {
        return age;
    }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    @Override//Аннотация - наследование
    public String toString() {
        return fullName + ", Position: " + position + ", Email: " + email + ", Phone: " + phone + ", Salary: " + salary + ", Age: " + age;
    }
}