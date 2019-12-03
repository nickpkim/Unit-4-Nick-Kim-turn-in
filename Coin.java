/*
  This is the Coin class
  It is in the blueprint for how to make a coin object
*/
public class Coin{
  // these are the declarations for the attributes (instance vairables) of a coin
  private int face;
  // constants defining heads and tails
  private final int HEADS = 0;
  private final int TAILS = 1;
  // coin constructor that defines what happens when a coin object is made
  // when a new coin is made it gets flipped
  public Coin(){
    flip();
  }
  // this is the section of the class containing the methods (behaviors) of a coin
  // the accessor method for the face variable (a getter)
  public int getFace(){
    return face;
  }
  // the mutator method for a face variable (a setter)
  public void setFace(int newFace){
    face = newFace;
  }
  // the flip method assigns a randomly chosen value to the face of the coin
  public void flip(){
    face = (int)(Math.random()*2);
  }
  // the isHeads() method tells us if the coin's face is heads or not
  public boolean isHeads(){
    return(face == HEADS);
  }
  // prints out information about the current state of a coin
  public String toString(){
    String result = "";
    if (face == HEADS){
      result = "Heads";
    } else {
      result = "Tails";
    }
    return result;
  }
}
