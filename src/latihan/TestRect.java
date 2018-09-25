/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author User
 */
public class TestRect {
    public static void main (String [] args){
        Rect baru1 = new Rect (1,1,4,4);
        Rect baru2 = new Rect (2,3,5,8);
        
        System.out.println("2,3 Is Inside the Union");
        System.out.println(baru1 + "union "+ baru2+"="+baru1.union(baru2));
        System.out.println(baru1 + "intersection "+ baru2+"="+baru1.intersection(baru2));
        
        System.out.println(baru1.intersection(baru2)+"Digeser Sejauh (3,3");
        baru1.move(3,3);
        baru2.move(3,3);
        System.out.println(baru1.intersection(baru2));
    }
    
}
