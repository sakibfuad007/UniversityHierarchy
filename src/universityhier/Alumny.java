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
public class Alumny extends Community {
    private String name;
    private int passYear;
    
    Alumny(String a, String b, String c, int year)
    {
        super(a, b);
        name=c;
        passYear=year;
    }
    
    public void view()
    {
        super.view();
        System.out.println("Alumny's Name: "+name);
        System.out.println("Passing Year: "+passYear);
    }
}
