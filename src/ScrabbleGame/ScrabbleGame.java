package ScrabbleGame;

import java.util.Scanner;
/*
Write a Scrabble Game for two person Rules OK==
1- At the beginning Ask to first Player enter a word for starting game OK
2- Then change the player ask to new player if given word is valid or not OK i) If new player
accepts the given word add number of letters in the word as points to player who wrote the word And go to step
3 OK ii) If new player does not accept the word as valid then print "Invalid word, player X(Current player) won the
game" and finish the game OK
3- Ask to users if user want to continue game or not OK i) If player want to continue,
OK ask to user a letter to add to word OK and ask to user side to add (beginning or end) OK then add letter to word and run step 2
OK ii) If player does not want to continue then print "Game Finished" and print points and winner
 */


public class ScrabbleGame {
    static Scanner scan = new Scanner(System.in);
    public static String player1;
    public static String player2;
    public static int playNumber = 1;
    public static String playedWord = "";
    public static String alphabetsList = "abcdefghijklmnopqrstuvwxyz";
    public static String usedLetters = "";
    public static String currentPlayer;
    public static boolean updateAlphabets = true;
    public static int p1Score = 0;
    public static int p2Score = 0;

    public static void main(String[] args) {
        System.out.print("Welcome to Scrabble Game " + "\nEnter (Y) to Play the game or Enter any key to Exit : ");
        String input = scan.next();
        if (input.equalsIgnoreCase("y")) {
            System.out.print("Enter Player 1 name : ");
            player1 = scan.next();
            System.out.print("Enter Player 2 name : ");
            player2 = scan.next();
            startGame();
        } else {
            System.exit(0);
        }
    }
    private static void startGame() {
        while (!playedWord.equals("#")) {
            curreentPlayer();
            System.out.print("\nremaining alphabets : " + updateAlphabets());
            System.out.print("\n" + currentPlayer + "\nEnter a Word : ");
            playedWord = scan.next();

            validatingPlayedWord();
        }
        playersScore();
    }
    private static void playersScore() {
        System.out.println(player1 + " Score : " + p1Score);
        System.out.println(player2 + " Score : " + p2Score);
    }
    private static void usedLetterSearch() {
        for (int i = 0; i < usedLetters.length(); i++) {
            if (playedWord.contains(usedLetters.charAt(i) + "")) {

                updateAlphabets = false;
            }
        }
    }
    private static void validatingPlayedWord() {
        System.out.println("Enter (Y) if Both Playes Agree on the Word or Enter Any Key to Disagree");
        String input2 = scan.next();
        if (input2.equalsIgnoreCase("y")) {
            usedLetterSearch();
            trimVowels();
            determiningScore();
        } else {
            playedWord = "";
        }
    }
    private static void determiningScore() {
        if (currentPlayer.equals(player1) && playedWord.equals("#")) {
            p1Score++;
        }
        if (currentPlayer.equals(player2) && playedWord.equals("#")) {
            p2Score++;
        }
    }
    private static void trimVowels() {
        String vowels = "aeoiu";
        for (int i = 0; i < playedWord.length(); i++) {
            if (vowels.contains(playedWord.charAt(i) + "")) {
                playedWord = playedWord.replace((playedWord.charAt(i) + ""), "");
            }
        }
    }
    private static void curreentPlayer() {
        if (playNumber == 1) {
            currentPlayer = player1;
            playNumber++;
        } else {
            currentPlayer = player2;
            playNumber--;
        }
    }
    private static String updateAlphabets() {
        if (updateAlphabets == true) {
            for (int i = 0; i < alphabetsList.length(); i++) {
                if (playedWord.contains(alphabetsList.charAt(i) + "")) {
                    usedLetters += alphabetsList.charAt(i) + "";
                    alphabetsList = alphabetsList.replace((alphabetsList.charAt(i) + ""), "-");
                }
            }
            System.out.println(alphabetsList);
        } else {

            System.out.println("Sorry The Played Word is Invalid or it contains Used Alphabets");
            updateAlphabets = true;
        }
        return alphabetsList;
    }
}