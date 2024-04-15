/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shrutiatitkar
 */
public class SlimeFightersGame {
    private Guardian guardian;
    private Berserker berserker;
    private Healer healer;
    private Mage mage;
    private Boss boss;
    private int shieldedPlayers;
    private int healedPlayers;
    private int stuns;
    private int day;

    public SlimeFightersGame(String guardianName, String berserkerName, String healerName, String mageName) {
        // Initialize players
        this.guardian = new Guardian(guardianName, true, 0, 100, 200, 0, false);
        this.berserker = new Berserker(berserkerName, true, 0, 100, 100, 0, false);
        this.healer = new Healer(healerName, true, 0, 100, 100, 0, false);
        this.mage = new Mage(mageName, true, 0, 100, 100, 0, false);
        // Initialize boss
        this.boss = new Boss("Boss", true, 500, 100);
        // Initialize variables
        this.shieldedPlayers = 0;
        this.healedPlayers = 0;
        this.stuns = 0;
        this.day = 1;
    
}
}
