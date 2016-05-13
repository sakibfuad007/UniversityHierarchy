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
public class Student extends Community {
    private String name;
    private String studentID;
    private String status;
    
    Student(String a, String b, String c, String d, String e)
    {
        super(a,b);
        name=c;
        studentID=d;
        status=e;
    }
    
    public void view()
    {
        super.view();
        System.out.println("Student's Name: "+name);
        System.out.println("StudentID: "+studentID);
        System.out.println("Status: "+status);
    }
}
