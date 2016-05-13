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
public class Community {
    private String department;
    private String institute;
    
    Community(String a, String b)
    {
        department=a;
        institute=b;
    }
    
    public void view()
    {
        System.out.println("Department: "+ department);
        System.out.println("Institute: "+institute);
    }
}
