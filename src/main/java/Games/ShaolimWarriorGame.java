package Games;

import output.Display;

public class ShaolimWarriorGame {
    private int enemyHealth = 100;
    private String enemyName;
    private double enemyMoveChoice = Math.ceil(Math.random()*3);
    private String playerName = "playerHero.getName()";
    private int playerHealth;
    private boolean alive = false;
    private Display gameDisplay = new Display();


    public void ShaolinWarriorGameStart() {
        gameDisplay.printMessage("There has been a travesty at the Shoalin monastery. \n" +
                "Your master Huang Zongxi has been found slain. \n" +
                "All signs show that it was the diciples of Wang Shichong. \n" +
                "You have traveled to Kāimíng to exact your revenge for the the honor of your master");
    }

    public void checkGameHealth(){
        if (enemyHealth <= 0) {
            gameDisplay.printMessage("Your training was tested and you chi is strong, " + playerName + " you have defeated " + enemyName + ".\n" + "This battle is over but there are more who must answer for your masters betrayal ");
            alive = false;
        } else if (playerHealth <= 0) {
            gameDisplay.printMessage(playerName + " ,you have failed your master. " + enemyName + "'s chi was stronger. Master Li betrayal will not be avenged by you.");
            alive = false;
        }
    }




}
