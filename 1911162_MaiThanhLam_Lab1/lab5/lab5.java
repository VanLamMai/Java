/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author PC103
 */
public class lab5 {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        
        staff[0] = new Employee("Carl Cracker", 75000,1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        
        for (int i = 0; i < staff.length; i++)
            staff[i].raiseSalary(5);
        
        for (int i = 0; i<staff.length; i++)
        {
            Employee e = staff[i];
            System.out.println("name = " + e.getName()
            + ", salary = " + e.getSalary()
            + ", hireDay = " + e.getHireDay());
        }
    }
}
class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month -1, day);
        this.hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }
    
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    
}
        
