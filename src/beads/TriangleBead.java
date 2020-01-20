
package beads;

/** This class +++Insert Description Here+++
 *
 * @author Megha Patel
 */
public class TriangleBead {
    private String color;
    private char letter;
    private int side;

    
    TriangleBead()
    {
        color="red";
        letter='c';
        side=4;
    }
    
    /**
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
     * @return the side
     */
    public int getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.side = side;
    }
    
    
    

}
