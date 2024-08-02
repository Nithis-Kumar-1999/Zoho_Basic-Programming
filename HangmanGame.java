package zohointerviewpreparation;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Good Luck! " + name);

        ArrayList<String> words = new ArrayList<>();
        words.add("rainbow");
        words.add("computer");
        words.add("science");
        words.add("programming");
        words.add("python");
        words.add("mathematics");
        words.add("player");
        words.add("condition");
        words.add("reverse");
        words.add("water");
        words.add("board");
        words.add("geeks");

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        System.out.println("Guess the characters");

        StringBuilder guesses = new StringBuilder();
        int turns = 12;

        while (turns > 0) 
        {
            int failed = 0;

            for (char c : word.toCharArray()) 
            {
                if (guesses.toString().contains(String.valueOf(c))) 
                {
                    System.out.print(c + " ");
                } else {
                    System.out.print("_ ");
                    failed++;
                }
            }

            System.out.println();

            if (failed == 0) 
            {
                System.out.println("You Win");
                System.out.println("The word is: " + word);
                break;
            }

            System.out.print("Guess a character: ");
            String guess = scanner.nextLine();
            guesses.append(guess);

            if (!word.contains(guess))
            {
                turns--;
                System.out.println("Wrong");
                System.out.println("You have " + turns + " more guesses");

                if (turns == 0) 
                {
                    System.out.println("You Lose");
                }
            }
        }
    }
}