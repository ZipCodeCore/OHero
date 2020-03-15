import engine.GameEngine;

public class Main {
    GameEngine newGame = new GameEngine();
    public static void main(String[] args) {
        //Be your own hero! (AND WRITE TESTS BEFORE YOU START CODING!)
        GameEngine newGame = new GameEngine();
        newGame.gameStart();
        newGame.nameAndStoreHero();
        newGame.startingStats();
<<<<<<< HEAD
        newGame.bagCheck();
=======
        //newGame.bagCheck();
>>>>>>> a6b165c901a3e499266153cb933efb0d8549663d
        newGame.encounter();
    }

}
