package NumberGuessGame;

import java.util.Random;
import java.util.*;

class Game {
       public int Number;
       public int InputNumber;
       public int NumberOfGuesses = 0;

       public int getNumber() {
              return NumberOfGuesses;
       }

       public void setNumber(int NumberOfGuesses) {
              this.NumberOfGuesses = NumberOfGuesses;
       }

       Game() {
              Random rand = new Random();
              this.Number = rand.nextInt(100);
       }

       public void TakeUserInput() {
              System.out.println("Guess Your Number....");
              Scanner sc = new Scanner(System.in);
                     InputNumber = sc.nextInt();
              
       }

       public boolean isCorrect() {
              NumberOfGuesses++;
              if (InputNumber == Number) {
                     System.out.format("Yes you have guessed it right, it was %d\nYou guessed it in %d attempts",
                                   Number,
                                   NumberOfGuesses);
                     return true;
              } else if (InputNumber < Number) {
                     System.out.println("Your number is too Low. Please enter correct number.");
              } else if (InputNumber > Number) {
                     System.out.println("Your number is too High. Please enter correct number.");
              }
              return false;
       }
}

public class NumberGuessGame {
       public static void main(String[] args) {
              Game game = new Game();
              boolean flag = false;
              while (!flag) {
                     game.TakeUserInput();
                     flag = game.isCorrect();
              }
       }
}