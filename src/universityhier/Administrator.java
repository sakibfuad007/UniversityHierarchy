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
public class Administrator extends Faculty {
    private String position;
    private double duration;
    
    Administrator(String a, String b, String c, String d, double salary, double incre, int fc, String deg, int year, String pos, double dur)
    {
        super(a, b, c, d, salary, incre, fc, deg, year);
        position=pos;
        duration=dur;
    }
    
    public void view()
    {
        super.view();
        System.out.println("Position: "+position);
        System.out.println("Duration: "+duration);
    }
    
}
