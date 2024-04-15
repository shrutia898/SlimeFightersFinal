
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shrutiatitkar
 */
public class Driver {
    
    public static void GameDisplay(){
       
        Guardian guardian = new Guardian("", true, 0, 100, 200, 0, false);
        Berserker berserker = new Berserker("", true, 0, 100, 100, 0, false);
        Healer healer = new Healer("", true, 0, 100, 100, 0, false);
        Mage mage = new Mage("", true, 0, 100, 100, 0, false);
        Boss boss = new Boss("", true, 500, 100);
        

        // Initialize variables
        Boolean play = true;
        Boolean stun = false;
        int stuns = 0;
        int healedPlayers = 0;
        int shieldedPlayers = 0;
        int day = 1;
        
        while (boss.getHealth() > 0) {
            // Continue until day reaches 3
            switch (day) { // Boss' health increase each day
                case 1:
                    break;
                case 2:
                    boss.setHealth(boss.getHealth() + 100);
                    break;
                case 3:
                    boss.setHealth(boss.getHealth() + 100);
                    break;
            }
            for (int moves = 0; moves <= 2; moves++) { // For each move
            int currentPlayer = randomPlayer(); // Capture the randomly generated player
            System.out.println("\nDAY " + day); // Print day num + who is being played
            switch (currentPlayer) { // Use the captured currentPlayer instead of randomNumber
                case 1:
                    System.out.println("Guardian is Being Played");
                    break;
                case 2:
                    System.out.println("Berserker is Being Played");
                    break;
                case 3:
                    System.out.println("Healer is Being Played");
                    break;
                case 4:
                    System.out.println("Mage is Being Played");
                    break;
            }
        }
            ActionOptions();
            askOptions();
        
            
        }// end of while loop
    }

    public static void printEndOfDayStats(Guardian guardian, Berserker berserker, Healer healer, Mage mage, Boss boss, int shieldedPlayers, int healedPlayers, int stuns) {
        System.out.println("\nEnd of Day Statistics:");

        // Guardian stats
        System.out.println("\nGuardian Stats");
        System.out.println("Name: " + guardian.getName());
        System.out.println("Health: " + guardian.getHealth());
        System.out.println("Damage Dealt: " + guardian.getDamage());
        System.out.println("Players Shielded: " + shieldedPlayers);

        // Berserker stats
        System.out.println("\nBerserker Stats");
        System.out.println("Name: " + berserker.getName());
        System.out.println("Health: " + berserker.getHealth());
        System.out.println("Damage Dealt: " + berserker.getDamage());

        // Healer stats
        System.out.println("\nHealer Stats");
        System.out.println("Name: " + healer.getName());
        System.out.println("Health: " + healer.getHealth());
        System.out.println("Damage Dealt: " + healer.getDamage());
        System.out.println("Players Healed: " + healedPlayers);

        // Mage stats
        System.out.println("\nMage Stats");
        System.out.println("Name: " + mage.getName());
        System.out.println("Health: " + mage.getHealth());
        System.out.println("Damage Dealt: " + mage.getDamage());
        System.out.println("Stuns: " + stuns);

        // Boss stats
        System.out.println("\nBoss Stats");
        System.out.println("Name: " + boss.getName());
        System.out.println("Health: " + boss.getHealth());
    }
    
   
    public static int randomPlayer() {
        Random rand = new Random();
        int min = 1;
        int max = 5; // Changed max to 5 since nextInt(max) excludes the upper bound
        return rand.nextInt(max - min) + min;
    }
    
   public static void handleDoDamage(int randomNumber, Guardian guardian, Berserker berserker, Healer healer, Mage mage, Boss boss){
       int damageAmount = 0;
            switch (randomNumber) {
                case 1:
                    damageAmount = 50;
                    guardian.setDamage(guardian.getDamage() + damageAmount);
                    break;
                case 2:
                    damageAmount = 50;
                    berserker.setDamage(berserker.getDamage() + damageAmount);
                    break;
                case 3:
                    damageAmount = 20;
                    healer.setDamage(healer.getDamage() + damageAmount);
                    break;
                case 4:
                    damageAmount = 30;
                    mage.setDamage(mage.getDamage() + damageAmount);
                    break;
            }
            boss.setHealth(boss.getHealth() - damageAmount);
   }
   
   public static void handleSpecialAbility(int randomNumber, Guardian guardian, Berserker berserker, Healer healer, Mage mage, Boss boss, int shieldedPlayers, int healedPlayers, int stun, boolean stunned) {
    switch (randomNumber) {
        case 1: // Guardian
            if (guardian.getMana() == 100) {
                System.out.println("Choose player to shield for 1 turn: ");
                Scanner scanner = new Scanner(System.in);
                int playerChoice = Integer.parseInt(scanner.nextLine());
                switch (playerChoice) {
                    case 1:
                        guardian.setShielded(true);
                        System.out.println("Guardian is Shielded!");
                        break;
                    case 2:
                        berserker.setShielded(true);
                        System.out.println("Berserker is Shielded!");
                        break;
                    case 3:
                        healer.setShielded(true);
                        System.out.println("Healer is Shielded!");
                        break;
                    case 4:
                        mage.setShielded(true);
                        System.out.println("Mage is Shielded!");
                        break;
                    default:
                        System.out.println("Invalid Player Selection!");
                        break;
                }
                shieldedPlayers++;
                guardian.setMana(0);
            } else {
                System.out.println("Not enough mana!");
            }
            break;
        case 2: // Berserker
            if (berserker.getMana() == 100) {
                boss.setHealth(boss.getHealth() - 100);
                berserker.setDamage(berserker.getDamage() + 100);
                berserker.setMana(0);
            } else {
                System.out.println("Not enough mana!");
            }
            break;
        case 3: // Healer
            if (healer.getMana() == 100) {
                System.out.println("Choose player to heal: ");
                System.out.println("1. Guardian");
                System.out.println("2. Berserker");
                System.out.println("3. Healer");
                System.out.println("4. Mage");
                System.out.print("Player Number: ");
                Scanner healPlayer = new Scanner(System.in);
                int playerNumber = Integer.parseInt(healPlayer.nextLine());

                switch (playerNumber) {
                    case 1:
                        guardian.setHealth(guardian.getHealth() + 15);
                        break;
                    case 2:
                        berserker.setHealth(berserker.getHealth() + 15);
                        break;
                    case 3:
                        healer.setHealth(healer.getHealth() + 15);
                        break;
                    case 4:
                        mage.setHealth(mage.getHealth() + 15);
                        break;
                    default:
                        System.out.println("Invalid Player Selection!");
                        break;
                }
                healedPlayers++;
                healer.setMana(0);
            } else {
                System.out.println("Not enough mana!");
            }
            break;
        case 4: // Mage
            if (mage.getMana() == 100) {
                stunned = true;
                stun++;
                System.out.println("Boss is stunned for 1 turn!");
                mage.setMana(0);
            } else {
                System.out.println("Not enough mana!");
            }
            break;
        default:
            break;
    }
}
public static void eatFood(int randomNumber, Guardian guardian, Berserker berserker, Healer healer, Mage mage) {
    int foodAmount = 10;
    switch (randomNumber) {
        case 1:
            guardian.setHealth(guardian.getHealth() + foodAmount);
            break;
        case 2:
            berserker.setHealth(berserker.getHealth() + foodAmount);
            break;
        case 3:
            healer.setHealth(healer.getHealth() + foodAmount);
            break;
        case 4:
            mage.setHealth(mage.getHealth() + foodAmount);
            break;
        default:
            System.out.println("Invalid player number!");
            break;
    }
}
public static void exitGame(){
    System.exit(0);
    
}
public static void ActionOptions(){
    System.out.println("Choose Player Action");
    System.out.println("1. Do Damage");
    System.out.println("2. Special Ability");
    System.out.println("3. Eat Food");
    System.out.println("4. Quit Game");

}

public static int askOptions() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Action Number: ");
    // Prompt the user for input
    String askPlayer = scan.nextLine();
    int actionNumber = 0;
    try {
        // Try parsing the input string to an integer
        actionNumber = Integer.parseInt(askPlayer);
    } catch (NumberFormatException e) {
        // Handle the case where the input is not a valid integer
        System.out.println("Invalid input! Please enter a number.");
    }
    // Close the scanner
    scan.close();
    return actionNumber;
}
}

