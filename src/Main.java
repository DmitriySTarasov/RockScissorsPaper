//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String actionUser = getMoveUser();
        String actionComputer = getMoveComputer();

        if (actionUser.equals(actionComputer)) {
            System.out.println("Ничья.");
        } else if (gameWin(actionUser, actionComputer)) {
            System.out.println("Победа!");
        } else {
            System.out.println("Поражение :(");
        }

        System.out.println("Камень, ножницы, бумага.\n" + "Ваш ход: " + actionUser);
        System.out.println("Ход компьютера : " + actionComputer);
    }
}