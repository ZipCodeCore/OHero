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

}
