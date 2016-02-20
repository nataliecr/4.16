import java.util.Scanner;

public class RandomCharacter {
  public static void main(String[] args){
    double temp = Math.random()*26 + 65;
    char letter = (char)temp;
    
    System.out.println("Random letter is " + letter);
  } // main   
} // RandomCharacter
