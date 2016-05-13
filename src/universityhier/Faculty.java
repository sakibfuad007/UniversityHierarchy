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
public class Faculty extends Employee{
    private int facultyCode;
    private String designation;
    private int joinYear;
    
    Faculty(String a, String b, String c, String d, double salary, double incre, int fc, String deg, int year)
    {
        super(a, b, c, d, salary, incre);
        facultyCode=fc;
        designation=deg;
        joinYear=year;
    }
    
    public void view()
    {
        super.view();
        System.out.println("Faculty code: "+facultyCode);
        System.out.println("Designation: "+designation);
        System.out.println("Joining Year: "+joinYear);
    }
    
}
