package Games;

public class ShaolimWarriorGame {
    private int enemyHealth = 100;
    private String enemyName;
    private double enemyMoveChoice = Math.ceil(Math.random()*3);
    private String playerName = "playerHero.getName()";
    private int playerHealth;
    private boolean alive = false;


    public void checkGameHealth(){
        if (enemyHealth <= 0) {
            System.out.println("Your training was tested and you chi is strong, " + playerName + " you have defeated " + enemyName + ".\n" + "This battle is over but there are more who must answer for your masters betrayal ");
            alive = false;
        } else if (playerHealth <= 0) {
            System.out.println(playerName + " ,you have failed your master. " + enemyName + "'s chi was stronger. Master Li betrayal will not be avenged by you.");
            alive = false;
        }
    }
}
