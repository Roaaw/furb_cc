package Unidade_1;

public class playertest {
    public static void main(String[] args) {
       player();
    }
    static void player() {
        String playerName = "Alice";
        int playerMaxHealth = 100;
        int playerHealth = 99;
        int playerLevel = 1;
        int playerOldLevel = 0;
        int playerExperience = 0;
        // int playerStr = 10;
        // int playerDef = 7;
        // int playerAgi = 3;
        int formula = 0;
        int x = 0;
        

        if (playerOldLevel == 0){
            playerOldLevel = playerLevel;
        }

        while (true) {

            if (playerHealth < playerMaxHealth || playerLevel > playerOldLevel) {
                System.out.println("Player: " + playerName);
                System.out.println("Health: " + playerHealth + "/" + playerMaxHealth);
                System.out.println("Level: " + playerLevel);
                System.out.println("Experience: " + playerExperience);
            }
            
            try {
                Thread.sleep(1000);
                if (playerMaxHealth > playerHealth){
                    playerHealth++;
                }
            } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            while (playerExperience >= formula){
                x = playerLevel;
                formula = (50 * (x) * (x) * (x) - 150 * (x) * (x) + 400 * (x))/3;
                if (playerExperience == formula || playerExperience > formula){
                    playerLevel++;
                    if (x != playerLevel){
                        x = playerLevel;
                    }
                }
            }
            while (playerExperience <= formula-1 && playerLevel >= 2){
                    if (playerLevel > 1 ){
                        x = playerLevel - 1;
                        formula = (50 * (x) * (x) * (x) - 150 * (x) * (x) + 400 * (x))/3;
                        if (playerExperience < formula){
                            playerLevel--;
                        }
                    }
            }
            continue;
        }
    }
    static void monster() {
        String monsterName = "Goblin";
        int monsterMaxHealth = 100;
        int monsterHealth =  99;
        int monsterLevel = 1;
        int monsterOldLevel = 0;
        int monsterExperience = 15;
        // int monsterStr = 10;
        // int monsterDef = 7;
        // int monsterAgi = 3;
        int formula = 0;
        int x = 0;

        if (monsterOldLevel == 0){
            monsterOldLevel = monsterLevel;
        }

        while(true){
            if (monsterHealth < monsterMaxHealth || monsterLevel > monsterOldLevel) {
                System.out.println("Monster: " + monsterName);
                System.out.println("Health: " + monsterHealth + "/" + monsterMaxHealth);
                System.out.println("Level: " + monsterLevel);
                System.out.println("Experience: " + monsterExperience);
            }
            try {
                Thread.sleep(1000);
                if (monsterMaxHealth > monsterHealth){
                    monsterHealth++;
                }
            } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            while (monsterExperience >= formula){
                x = monsterLevel;
                formula = (50 * (x) * (x) * (x) - 150 * (x) * (x) + 400 * (x))/3;
                if (monsterExperience == formula || monsterExperience > formula){
                    monsterLevel++;
                    if (x != monsterLevel){
                        x = monsterLevel;
                    }
                }
            }
            // while (monsterExperience <= formula-1){
            //         if (monsterLevel != 1 ){
            //             x = monsterLevel - 1;
            //             formula = (50 * (x) * (x) * (x) - 150 * (x) * (x) + 400 * (x))/3;
            //             if (monsterExperience < formula){
            //                 monsterLevel--;
            //             }
            //         }
            // }
            // continue;
        }
    }
    // static void battle(String[] args){
    //     import static monster*monster;
    //     System.out.println(">" monsterName);
    // }
}