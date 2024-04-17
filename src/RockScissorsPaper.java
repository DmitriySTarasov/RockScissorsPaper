import java.util.Random;

public class RockScissorsPaper {
    enum Move {
        Rock, Scissors, Paper;

        String getValue1(String Rock) {
            return Rock;
        }
             String getValue2(String Scissors) {
            return Scissors;
         }
        String getValue3(String Paper) {
            return Paper;
        }

        String value1 = getValue1("Rock");
        String value2 = getValue2("Scissors");
        String value3 = getValue3("Paper");
    }
    class Move

    static String getMoveUser() {
        Random rand = new Random(3);
        int randomNum = rand.nextInt(3);
        String actionUser = Move.values()[randomNum].value1;
        return actionUser;
    }

    static String getMoveComputer() {
        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        String actionComputer = Move.values()[randomNum].value2;
        return actionComputer;
    }

    static boolean gameWin(String actionUser, String actionComputer) {
        return actionUser.equals(Move.Rock.value) && actionComputer.equals(Move.Scissors.value)
                || (actionUser.equals(Move.Scissors.value)) && actionComputer.equals(Move.Paper.value)
                || (actionUser.equals(Move.Paper.value)) && actionComputer.equals(Move.Rock.value);
    }
}
