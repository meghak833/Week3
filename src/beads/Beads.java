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
public class Beads {
    public String color;
    public char letter;

    Beads()
    {
            color="red";
            letter='R';
    }
    
    public Beads(String clr,char ltr)
    {
        color=clr;
        letter=ltr;    
    }
    /** getter for color
     * @return the color
     */
        public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    /**
     * @param args the command line arguments
     */
    
    
}
