package lesson_d;

public class Employee {

    private static final int CURRENT_YEAR = 2019;

    private String name;
    private String surname;
    private String secondname;
    private float salary;
    private int birthyear;

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;
    Employee (String name, String surname, String secondname, float salary, int birthyear) {
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.salary = salary;
        this.birthyear = birthyear;
    }

    // 3.	Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    int getAge (){
        return CURRENT_YEAR - birthyear;
    }
    String getName () {
        return name;
    }
    String getSurname () {
        return surname;
    }
    String getSecondname () {
        return secondname;
    }
}