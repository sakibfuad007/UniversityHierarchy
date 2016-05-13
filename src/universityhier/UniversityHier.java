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
public class UniversityHier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Teacher ob=new Teacher("CSE", "BUET", "Ashik", "01", 40000, 1000, 102,"Lecturer",2014, 6, 12);
        Faculty ob1=ob;
        ob1.view();//runtime polymorphism
        
        System.out.println("-------------------------------------");
        Administrator ob2=new Administrator("Physics", "DU", "Firoz", "190456", 25000, 500, 345, "Assistant Officer", 2015, "Junior", 5);
        Faculty ob3=ob2;
        ob3.view();//runtime polymorphism
    }
    
}
