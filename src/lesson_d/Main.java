package lesson_d;

public class Main {

    public static void main (String [] args) {

// 1. Создать класс "Сотрудник" с полями: ФИО,зарплата, возраст;
        Employee e = new Employee("Иван", "Иванов", "Иванович", 1000, 1983);

// 4.	Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.
        System.out.println(e.getName() + " " + e.getSurname() + " " + e.getSecondname() + " " + e.getAge ());

// 5.	Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        Employee [] employees = {
                e,
                new Employee ("Петр", "Петров", "Петрович", 2000, 1985),
                new Employee ("Семен", "Семенов", "Семенович", 3000, 1960),
                new Employee ("Сидор", "Сидоров", "Сидорович", 4000, 1992),
                new Employee ("Сергей", "Сергеев", "Сергеевич", 5000, 1974),
        };
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getAge () > 40)
                System.out.println (employees[i].getName());
        }
    }
}