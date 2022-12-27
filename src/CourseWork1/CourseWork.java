package CourseWork1;

public class CourseWork {
    // Базовая сложность
    private static final Employee[] employees = {

            new Employee("Батагов Вадим Владимирович", 1, 27520),
            new Employee("Боярских Анатолий Ярославович", 1, 32540),
            new Employee("Ермолаев Вячеслав Евгеньевич", 2, 35640),
            new Employee("Каблукова Людмила Олеговна", 2, 28970),
            new Employee("Костюкова Татьяна Ивановна", 3, 36580),
            new Employee("Левченко Лев Даниилович", 3, 36810),
            new Employee("Спиваковский Георгий Родионович", 4, 31560),
            new Employee("Табаков Валерий Филиппович", 4, 45240),
            new Employee("Трофимова Анна Станиславовна", 5, 29560),
            new Employee("Яковлева Надежда Ростиславовна", 5, 38210),
    };

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateSalaryTotal() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee definitionEmployeeMinSalary() {
        Employee result = employees[0];
        int minSalary = (int) employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee definitionEmployeeMaxSalary() {
        Employee result = employees[0];
        int maxSalary = (int) employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        return calculateSalaryTotal() / (float) employees.length;
    }
    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    // Повышенная сложность
    public static void indexingSalary (int percent){
            for (Employee employee : employees) {
            int currentSalary = (int) employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f +1)));
        }
    }
    public static Employee definitionEmployeeMinSalaryDepartment(int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee definitionEmployeeMaxSalaryDepartment(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = (int) employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static int calculateSalaryTotalOfDepartment (int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static float calculateAverageSalaryOfDepartment (int department){
        int membersEmployee = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                membersEmployee++;
            }
        }
        return sum / (float) membersEmployee;
    }
    public static void indexingSalaryOfDepartment (int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int currentSalary = (int) employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }
    public static void printDepartment (int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }
    public static void printEmployeeLessSalary (int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }
    public static void printEmployeeMoreSalary (int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }
}
