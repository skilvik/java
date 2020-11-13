package ru.geekbrains.java23102020.lessonfive;

public class HomeWorkLessonFive {

    public static class Employee {

        String name;
        String position;
        String email;
        String phone;
        int salary;
        int age;

        public Employee (String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
            }
        @Override
        public String toString(){
            return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                    name, position, email, phone, salary, age);}

        public void print(){
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        empArray[1] = new Employee("Petrov Petr", "Engineer", "petrov@mailbox.com", "81111111111", 30000, 30);
        empArray[2] = new Employee("Sidorov Sidor", "Engineer", "sidorov@mailbox.com", "82222222222", 30000, 40);
        empArray[3] = new Employee("Fedorov Fedor", "Engineer", "fedorov@mailbox.com", "83333333333", 30000, 50);
        empArray[4] = new Employee("Denisov Denis", "Engineer", "denisov@mailbox.com", "84444444444", 30000, 60);

        for (Employee employee : empArray) if (employee.age > 40) employee.print();
    }
}
