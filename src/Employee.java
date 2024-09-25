import java.util.Objects;

public class Employee {
    private final Employee[] employee;
    private String nameEmployee;
    private int sallary;
    private int numberDepartment;
    private static int count=0;
    int id;

    public Employee(String nameEmployee, int sallary, int numberDepartment) {
        this.nameEmployee = nameEmployee;
        this.sallary = sallary;
        this.numberDepartment = numberDepartment;
        this.employee = new Employee[10];
        this.id=++count;
    }

    public int getCount() {
        return count;
    }
    public String getNameEmployee() {
        return this.nameEmployee;

    }

    public int getSallary() {
        return this.sallary;
    }

    public int getNumberDepartment() {
        return this.numberDepartment;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    public void setNumberDepartment(int numberDepartment) {
        this.numberDepartment = numberDepartment;
    }
    // id - идентификатор конкретного сотрудника поэтому в euals и hashCode достаточно сравнивать Id.
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee1 = (Employee) object;
        return id == employee1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Ф.И.О: " + this.nameEmployee + "." + " Зарпалата: " + this.sallary + "." +
                " Отдел: " + this.numberDepartment + ".";
    }
}
