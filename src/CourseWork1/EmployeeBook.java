package CourseWork1;

public class EmployeeBook {
    private static final Integer DEPARTMENT_COUNT = 5;
    private static final Integer EMPLOYEES_SIZE = 10;
    private final Employee[] employees = new Employee[EMPLOYEES_SIZE];

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public int calculateSalaryTotal() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee definitionEmployeeMinSalary() {
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

    public Employee definitionEmployeeMaxSalary() {
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
    public float calculateAverageSalary() {
        return calculateSalaryTotal() / (float) employees.length;
    }

    public void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
    public void indexingSalary (int percent){
        for (Employee employee : employees) {
            int currentSalary = (int) employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f +1)));
        }
    }
    public Employee definitionEmployeeMinSalaryDepartment(int department) {
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
    public Employee definitionEmployeeMaxSalaryDepartment(int department) {
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
    public int calculateSalaryTotalOfDepartment (int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public float calculateAverageSalaryOfDepartment (int department){
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
    public void indexingSalaryOfDepartment (int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int currentSalary = (int) employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }
    public void printDepartment (int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }
    public void printEmployeeLessSalary (int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }
    public void printEmployeeMoreSalary (int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee);
            }
        }
    }
    public void createEmployee (String fullName, int department, int salary) {
        int index = findFreeIndex();
        if (index == -1) {
            System.out.println("Хранилище сотрудников заполнено. Нельзя создать нового сотрудника");
            return;
        }
        employees[index] = new Employee(fullName, department, salary);
    }
    private int findFreeIndex() {
        for (int i = 0; i < employees.length; i++) {
          if (employees[i] == null) {
              return i;
          }
        }
        return -1;
    }

    public void removeEmployee(String fullName){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
            }
        }
    }
    public void changeSalaryEmployee(String fullName, int salary){
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
            }
        }
    }
    public void changeDepartmentEmployee(String fullName, int department) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setDepartment(department);
            }
        }
    }
    public void printDepartment () {
        for (int i = 0; i <= DEPARTMENT_COUNT; i++) {
            System.out.println("Department " + i + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i){
                    System.out.println(employee);
                }
            }
        }
    }
}


