// Exercise 4: Employee Management System
class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int id, String name, String pos, double sal) {
        this.employeeId = id;
        this.name = name;
        this.position = pos;
        this.salary = sal;
    }
}

class EmployeeArray {
    Employee[] employees = new Employee[100];
    int count = 0;

    void add(Employee emp) {
        employees[count++] = emp;
    }

    Employee search(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) return employees[i];
        }
        return null;
    }

    void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                break;
            }
        }
    }

    void traverse() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].employeeId + ": " + employees[i].name);
        }
    }
}
