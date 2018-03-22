package user.rockpaperscissors;

/* Created by dmart on 11/10/2017.
  Sets up and plays a single game of Rock, Paper, Scissors
  */

import java.security.PublicKey;

public class RockPaperScissorsV1
{
    public int numUWins = 0; //records number of user wins
    public int numCPWins = 0; //records number of computer wins;

    //Scanner scan = new Scanner(System.in);
    //return("How many rounds do you want to play? ");
    //int numGames = scan.nextInt();
    //int numToWin = numGames/2 + 1; //number of games needed to win
    int setNum; //number that represents the users choice
    int setNumCP;
    String userChoice = "";
    String compChoice = "";
    String result;
    String numUserWinsString;
    String numCompWinsString;
    boolean playerWon;
    boolean playerLost;

    public String makeCompChoice() {


        setNumCP = (int) (Math.random() * 3);
        if (setNumCP == 0) {
            compChoice = "rock";
        } else if (setNumCP == 1) {
            compChoice = "paper";
        } else if (setNumCP == 2) {
            compChoice =  "scissors";
        }
        return compChoice;
    }

    public String getCompChoice(){
        return compChoice;
    }

    public String playGame(String cChoice, String uChoice){

        //userChoice = scan.next();
        compChoice = cChoice;
        userChoice = uChoice;

        if (userChoice.equals(compChoice)) {
            result = "Draw";

            return("You chose " + userChoice + ". The computer chose " + compChoice + ".");

        }
        else if ((userChoice.equals("rock") && compChoice.equals("scissors")) || (userChoice.equals("paper") && compChoice.equals("rock")) ||
                (userChoice.equals("scissors") && compChoice.equals("paper"))) {
            result = "You win this round";
            numUWins++;

            playerWon = true;
            return("You chose " + userChoice + ". The computer chose " + compChoice + ".");
        }
        else{
            result = "You lose this round";
            numCPWins++;
            playerLost = false;
            return("You chose " + userChoice + ". The computer chose " + compChoice + ".");
        }

        }

    public String getResults() {

        return result;
    }

    public String numWins(){
        numUserWinsString = String.valueOf(numUWins);
        return numUserWinsString;
    }
    public String numLosses(){
        numCompWinsString = String.valueOf(numCPWins);
        return numCompWinsString;
    }
}

