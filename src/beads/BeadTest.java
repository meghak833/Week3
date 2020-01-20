/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beads;

/**
 *
 * @author Megha
 */
public class BeadTest {
    
    public static void main(String[] args)
    {// Using setters and getters
        Beads b1=new Beads();
        b1.setColor("blue");
        b1.setLetter('A');
        System.out.print("color: "+b1.getColor()+"\n"+"letter: "+b1.getLetter()+"\n");
      // Using default constructor
        Beads b2=new Beads();
        System.out.print("color: "+b2.color+"\n"+"letter: "+b2.letter+"\n");
      // Using parameterized constructor
        Beads b3=new Beads("green",'G',6);
    System.out.print("color: "+b3.color+"\n"+"letter: "+b3.letter+"\n");
     
    }
    
}
