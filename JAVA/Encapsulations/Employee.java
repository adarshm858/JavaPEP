package Encapsulations;

public class Employee {
    private String name;
    private int empID;
    String companyName;
    boolean isPermanentEmployee;
    private long salary;
    private long phoneNumber;
    //

    private  String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private Employee(String companyName) {
        this.companyName = companyName;
    }

    private int getEmpID() {
        return empID;
    }

    private void setEmpID(int empID) {
        this.empID = empID;
    }

    private boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    private void setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
    }

    private long getSalary() {
        return salary;
    }

    private void setSalary(long salary) {
        this.salary = salary;
    }

    private long getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
