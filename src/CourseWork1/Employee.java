package CourseWork1;

public class Employee {
    private final Integer Id;
    private String fullName;
    private Integer department;
    private Integer salary;

    private static Integer IdCounter = 1;

    public Employee(String fullName, Integer department, Integer salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.Id = IdCounter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id: " + Id + " fullName: " + fullName + " department: " + department + " salary: " + salary;
    }


}
