package input;

import java.util.Scanner;

public class ConsoleManager {

    private Scanner playerConsoleInput;

    public ConsoleManager() {
        this.playerConsoleInput = new Scanner(System.in);
    }

    public String playerInput(){
        return playerConsoleInput.nextLine();
    }

//    public int playerInt(){
//        int returnInt = 0;
//        while (returnInt != 0){
//            System.out.println("Please enter number.");
//            returnInt = Integer.parseInt(playerConsoleInput.nextLine());
//        }
//        return returnInt;
//    }
}
