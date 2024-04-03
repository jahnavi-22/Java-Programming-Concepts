package comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortById {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1510, "Kush" , 100000.0, LocalDate.of(2020,4,9)));
        employees.add(new Employee(1011, "John" , 23000.0, LocalDate.of(2021,5,10)));
        employees.add(new Employee(1012, "Mac" , 12345.0, LocalDate.of(2022,6,11)));


        System.out.println("Employees before sorting by id: " + employees);

        for(Employee emp : employees){
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getJoiningDate());
        }

        Collections.sort(employees);

        System.out.println("Employees after sorting by id: " + employees);

        for(Employee emp : employees){
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getJoiningDate());
        }
    }
}
