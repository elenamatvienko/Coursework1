package CourseWork1;

import static CourseWork1.CourseWork.indexingSalary;

public abstract class Main {

    public static void main(String[] args) {
        CourseWork.printEmployees();
        System.out.println();
        System.out.println("Cумма затрат на зарплаты в месяц: " + CourseWork.calculateSalaryTotal());
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + CourseWork.definitionEmployeeMinSalary());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + CourseWork.definitionEmployeeMaxSalary());
        System.out.println();
        System.out.println("Среднее значение зарплат: " + CourseWork.calculateAverageSalary());
        System.out.println();
        CourseWork.printFullNames();
        System.out.println();





        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.createEmployee("Батагов Вадим Владимирович", 1, 27520);
        employeeBook.createEmployee("Боярских Анатолий Ярославович", 1, 32540);
        employeeBook.createEmployee("Ермолаев Вячеслав Евгеньевич", 2, 35640);
        employeeBook.createEmployee("Каблукова Людмила Олеговна", 2, 28970);
        employeeBook.createEmployee("Костюкова Татьяна Ивановна", 3, 36580);
        employeeBook.createEmployee("Левченко Лев Даниилович", 3, 36810);
        employeeBook.createEmployee("Спиваковский Георгий Родионович", 4, 31560);
        employeeBook.createEmployee("Табаков Валерий Филиппович", 4, 45240);
        employeeBook.createEmployee("Трофимова Анна Станиславовна", 5, 29560);
        employeeBook.createEmployee("Яковлева Надежда Ростиславовна", 5, 38210);

        employeeBook.printDepartment();
    }

}

