/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shrutiatitkar
 */
import javax.swing.*;
import java.util.Random;

public class SlimeFightersGUI extends javax.swing.JFrame {
    //variables
    private Guardian guardian;
    private Berserker berserker;
    private Healer healer;
    private Mage mage;
    private Boss boss;
    private int shieldedPlayers;
    private int healedPlayers;
    private int stuns;
    private boolean stunned;
    private int day = 1;
    private int moves = 0;
    

    /**
     * Creates new form SlimeFightersGUI
     */
    public SlimeFightersGUI() {
        initComponents();
        createPlayerObjects();
        
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        SlimeFightersLabel = new javax.swing.JLabel();
        GuardianL = new javax.swing.JLabel();
        BerserkerL = new javax.swing.JLabel();
        HealerL = new javax.swing.JLabel();
        MageL = new javax.swing.JLabel();
        GuardianTL = new javax.swing.JTextField();
        BerserkerTL = new javax.swing.JTextField();
        HealerTL = new javax.swing.JTextField();
        MageTL = new javax.swing.JTextField();
        DoDamageButton = new javax.swing.JButton();
        SpecialAbilityButton = new javax.swing.JButton();
        EatFoodButton = new javax.swing.JButton();
        ExitGameButton = new javax.swing.JButton();
        showStatsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SlimeFightersLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        SlimeFightersLabel.setText("Slime Fighters");

        GuardianL.setText("Guardian Name:");

        BerserkerL.setText("Berserker Name:");

        HealerL.setText("Healer Name:");

        MageL.setText("Mage Name:");

        DoDamageButton.setText("Do Damage");
        DoDamageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoDamageButtonActionPerformed(evt);
            }
        });

        SpecialAbilityButton.setText("Special Ability");
        SpecialAbilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialAbilityButtonActionPerformed(evt);
            }
        });

        EatFoodButton.setText("Eat Food");
        EatFoodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EatFoodButtonActionPerformed(evt);
            }
        });

        ExitGameButton.setText("Exit Game");
        ExitGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitGameButtonActionPerformed(evt);
            }
        });

        showStatsButton.setText("Show Stats");
        showStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStatsButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Player Action");

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuBar.add(jMenu1);

        jMenu2.setText("About");
        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SlimeFightersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GuardianL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GuardianTL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BerserkerL)
                                        .addComponent(HealerL)
                                        .addComponent(MageL)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MageTL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HealerTL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BerserkerTL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(showStatsButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpecialAbilityButton)
                                    .addComponent(DoDamageButton)
                                    .addComponent(EatFoodButton)
                                    .addComponent(ExitGameButton))
                                .addGap(159, 159, 159)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SlimeFightersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardianL)
                    .addComponent(GuardianTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BerserkerL)
                    .addComponent(BerserkerTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HealerL)
                    .addComponent(HealerTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MageL)
                    .addComponent(MageTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(showStatsButton)
                .addGap(18, 18, 18)
                .addComponent(DoDamageButton)
                .addGap(18, 18, 18)
                .addComponent(SpecialAbilityButton)
                .addGap(18, 18, 18)
                .addComponent(EatFoodButton)
                .addGap(18, 18, 18)
                .addComponent(ExitGameButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // exits code
            System.exit(0);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void EatFoodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EatFoodButtonActionPerformed
        // TODO add your handling code here:
        eatFood();
        updateDisplay();
        
        
    }//GEN-LAST:event_EatFoodButtonActionPerformed

    private void ExitGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitGameButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitGameButtonActionPerformed

    private void showStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStatsButtonActionPerformed
        // TODO add your handling code here:
       String message = "Welcome to Slime Fighters\n\nHere are the player statistics:\n\n";
        message += "Guardian Stats\nHealth: " + guardian.getHealth() + "\nDamage: " + guardian.getDamage() + "\n\n";
        message += "Berserker Stats\nHealth: " + berserker.getHealth() + "\nDamage: " + berserker.getDamage() + "\n\n";
        message += "Mage Stats\nHealth: " + mage.getHealth() + "\nDamage: " + mage.getDamage() + "\n\n";
        message += "Healer Stats\nHealth: " + healer.getHealth() + "\nDamage: " + healer.getDamage() + "\n\n";
        message += "Boss Stats\nHealth: " + boss.getHealth() +"\n\n\n";


    // Display the message using JOptionPane
    JOptionPane.showMessageDialog(null, message);
                      
       
    }//GEN-LAST:event_showStatsButtonActionPerformed

    private void DoDamageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoDamageButtonActionPerformed
        // TODO add your handling code here:
        handleDoDamage();
        updateDisplay();
        bossIsDead();
        
        
        
    }//GEN-LAST:event_DoDamageButtonActionPerformed

    private void SpecialAbilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialAbilityButtonActionPerformed
        // TODO add your handling code here:
        handleSpecialAbility();
        updateDisplay();
        bossIsDead();
    }//GEN-LAST:event_SpecialAbilityButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SlimeFightersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlimeFightersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlimeFightersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlimeFightersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlimeFightersGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BerserkerL;
    private javax.swing.JTextField BerserkerTL;
    private javax.swing.JButton DoDamageButton;
    private javax.swing.JButton EatFoodButton;
    private javax.swing.JButton ExitGameButton;
    private javax.swing.JLabel GuardianL;
    private javax.swing.JTextField GuardianTL;
    private javax.swing.JLabel HealerL;
    private javax.swing.JTextField HealerTL;
    private javax.swing.JLabel MageL;
    private javax.swing.JTextField MageTL;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel SlimeFightersLabel;
    private javax.swing.JButton SpecialAbilityButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JButton showStatsButton;
    // End of variables declaration//GEN-END:variables
    private void  createPlayerObjects(){
        guardian = new Guardian("Guardian", true, 0, 100, 200, 0, false);
        berserker = new Berserker("Berserker", true, 0, 100, 100, 0, false);
        healer = new Healer("Healer", true, 0, 100, 100, 0, false);
        mage = new Mage("Mage", true, 0, 100, 100, 0, false);
        boss = new Boss("Boss", true, 500, 1);
        
        //initialize
        shieldedPlayers = 0;
        healedPlayers = 0;
        boolean stunned;
        stuns = 0;
        moves = 0;
        
        
    }
        
       
    public static int randomPlayer() {
        Random rand = new Random();
        int min = 1;
        int max = 5; // Changed max to 5 since nextInt(max) excludes the upper bound
        return rand.nextInt(max - min) + min;
    }
    
     private void handleDoDamage() {
        int randomNumber = randomPlayer(); // Generate random player
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
        if (randomNumber == 1){
            JOptionPane.showMessageDialog(this,
            "Guardian dealt " + damageAmount + " damage to the boss.",
            "Damage Dealt",
            JOptionPane.INFORMATION_MESSAGE );
            
        }
        else if(randomNumber == 2){
         JOptionPane.showMessageDialog(this,
            "Berserker dealt " + damageAmount + " damage to the boss.",
            "Damage Dealt",
            JOptionPane.INFORMATION_MESSAGE );
     }
        else if(randomNumber == 3){
         JOptionPane.showMessageDialog(this,
            "Healer dealt " + damageAmount + " damage to the boss.",
            "Damage Dealt",
            JOptionPane.INFORMATION_MESSAGE );
     }
        else if(randomNumber == 4){
         JOptionPane.showMessageDialog(this,
            "Mage dealt " + damageAmount + " damage to the boss.",
            "Damage Dealt",
            JOptionPane.INFORMATION_MESSAGE );
        
    }
        moves++;
        newDay();
       
    
     
}
     
    private void eatFood(){
    int foodAmount = 10;
    int randomNumber = randomPlayer(); // Generate random player
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
            break;
    }
    if (randomNumber == 1){
            JOptionPane.showMessageDialog(this,
            "Guardian increased health: " + guardian.getHealth(),
            "Increased Health",
            JOptionPane.INFORMATION_MESSAGE );
            
        }
        else if(randomNumber == 2){
         JOptionPane.showMessageDialog(this,
            "Berserker increased health " + guardian.getHealth(),
            "Increased Health",
            JOptionPane.INFORMATION_MESSAGE );
     }
        else if(randomNumber == 3){
         JOptionPane.showMessageDialog(this,
            "Healer increased health " + healer.getHealth(),
            "Increased Health",
            JOptionPane.INFORMATION_MESSAGE );
     }
        else if(randomNumber == 4){
         JOptionPane.showMessageDialog(this,
            "Mage increased health " + mage.getHealth(),
            "Increased Health",
            JOptionPane.INFORMATION_MESSAGE );
        
    }
    moves++;
    newDay();
    
    
}
    private void handleSpecialAbility(){
        int randomNumber = randomPlayer();
        switch (randomNumber) {
        case 1: // Guardian
            if (guardian.getMana() == 100) {
                switch (randomNumber) {
                    case 1:
                        guardian.setShielded(true);
                        break;
                    case 2:
                        berserker.setShielded(true);
                        break;
                    case 3:
                        healer.setShielded(true);
                        break;
                    case 4:
                        mage.setShielded(true);
                        break;
                    default:
                        break;
                }
                shieldedPlayers++;
                guardian.setMana(0);
                if (randomNumber == 1){
                    JOptionPane.showMessageDialog(null, "Guardian is shielded! Guardian mana is now 0.");
                }
                else if(randomNumber == 2){
                   JOptionPane.showMessageDialog(null, "Berserker is shielded! Guardian mana is now 0."); 
                }
                else if(randomNumber == 3){
                    JOptionPane.showMessageDialog(null, "Healer is shielded! Guardian mana is now 0."); 
                }
                else if(randomNumber == 4){
                    JOptionPane.showMessageDialog(null, "Mage is shielded! Guardian mana is now 0."); 
                }
            }else
            {
                JOptionPane.showMessageDialog(null, "Guardian does not have enough mana to use special ability!");
            }
            break;
        case 2: // Berserker
            if (berserker.getMana() == 100) {
                boss.setHealth(boss.getHealth() - 100);
                berserker.setDamage(berserker.getDamage() + 100);
                berserker.setMana(0);
            } else {
                JOptionPane.showMessageDialog(null, "Berserker dealt 100 damage to boss! Berserker does not have enough mana to use special ability!");
            }
            break;
        case 3: // Healer
            if (healer.getMana() == 100) {
                switch (randomNumber) {
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
                        break;
                }
                healedPlayers++;
                healer.setMana(0);
                if (randomNumber == 1){
                    JOptionPane.showMessageDialog(null, "Guardian is healed by 15!");
                }
                else if(randomNumber == 2){
                   JOptionPane.showMessageDialog(null, "Berserker is healed by 15!"); 
                }
                else if(randomNumber == 3){
                    JOptionPane.showMessageDialog(null, "Healer is healed by 15!"); 
                }
                else if(randomNumber == 4){
                    JOptionPane.showMessageDialog(null, "Mage is healed by 15!"); 
                }
            } else {
                JOptionPane.showMessageDialog(null, "Healer does not have enough mana to use special ability!");
            }
            break;
        case 4: // Mage
            if (mage.getMana() == 100) {
                stunned = true;
                stuns++;
                JOptionPane.showMessageDialog(null,"Boss is stunned for 1 turn!");
                mage.setMana(0);
            } else {
                JOptionPane.showMessageDialog(null,"Mage does not have enough mana to use special ability!");
            }
            break;
        default:
            break;
    }
        moves++;
        newDay();
        
        
        
        
    }
    private void bossIsDead(){
        if(boss.getHealth() <=0){
            boss.setIsAlive(false);
            JOptionPane.showMessageDialog(null,"Boss is dead!");
            JOptionPane.showMessageDialog(null,"You Win!");
            JOptionPane.showMessageDialog(null,"Hope you enjoyed playing!!!");
        }
    
    }
     private void updateDisplay(){
          String message = "\nHere are the player statistics:\n\n";
        message += "Guardian Stats\nHealth: " + guardian.getHealth() + "\nDamage: " + guardian.getDamage() + "\n\n";
        message += "Berserker Stats\nHealth: " + berserker.getHealth() + "\nDamage: " + berserker.getDamage() + "\n\n";
        message += "Mage Stats\nHealth: " + mage.getHealth() + "\nDamage: " + mage.getDamage() + "\n\n";
        message += "Healer Stats\nHealth: " + healer.getHealth() + "\nDamage: " + healer.getDamage() + "\n\n";
        message += "Boss Stats\nHealth: " + boss.getHealth()+"\n\n\n"
              ;

    
    JOptionPane.showMessageDialog(null, message);
         
     }
     
     private void newDay(){
        
         if (moves == 3){
             moves = 0;
             day++;
             JOptionPane.showMessageDialog(null,"New Day: \n Day " + day);
             
         }
     }
   
     
         
     }



