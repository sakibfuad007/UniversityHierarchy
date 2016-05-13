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
public class Staff extends Employee {
    private int joinYear;
    private int duration;
    
    Staff(String a, String b, String c, String d, double salary, double incre, int year, int dur)
    {
        super(a, b, c, d, salary, incre);
        joinYear=year;
        duration=dur;
    }
    
    public void view()
    {
        super.view();
        System.out.println("Joining year: "+joinYear);
        System.out.println("Duration: "+duration);
    }
}
