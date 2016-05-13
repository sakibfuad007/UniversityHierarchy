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
public class Teacher extends Faculty {
    private int noCourses;
    private double weeklyHour;
    
    Teacher(String a, String b, String c, String d, double salary, double incre, int fc, String deg, int year, int no, double hour)
    {
         super(a, b, c, d, salary, incre, fc, deg, year);
         noCourses=no;
         weeklyHour=hour;
    }
    
    public void view()
    {
        super.view();
        System.out.println("No of COurses: "+noCourses);
        System.out.println("Weekly hour: "+weeklyHour);
    }
}

