/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityhier;

/**
 *
 * @author sakib
 */
public class Employee extends Community{
    private String name;
    private String employeeID;
    private double salary;
    private double increment;
    
    Employee(String a, String b, String c, String d, double sal, double in)
    {
        super(a, b);
        name=c;
        employeeID=d;
        salary=sal;
        increment=in;
    }
    
    public void view()
    {
        super.view();
        System.out.println("Employee's Name: "+ name);
        System.out.println("ID: "+employeeID);
        System.out.println("Salary: "+salary);
        System.out.println("Increment: "+increment);
    }
}
