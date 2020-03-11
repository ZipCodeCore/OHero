import engine.GameEngine;

public class Main {
    GameEngine newGame = new GameEngine();
    public static void main(String[] args) {
        //Be your own hero! (AND WRITE TESTS BEFORE YOU START CODING!)
        GameEngine newGame = new GameEngine();
        newGame.gameStart();
        newGame.nameAndStoreHero();
        newGame.startingStats();
        newGame.bagCheck();
        newGame.firstEncounter();
    }
}
