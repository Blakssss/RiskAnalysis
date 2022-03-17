package com.company;
import java.util.Random;

public class Analysis {
    void Risk() {
        Random rand = new Random();
        int upperbound = 6;
        System.out.println("""
                RISK ANALYSIS:
                
                No.  Risk name                   Pro Con Sev  Level""");
        for (int i = 1; i < 26; i++) {
            int probabilty = rand.nextInt(upperbound) + 1;
            int consequence = rand.nextInt(upperbound) + 1;
            char name0 = (char) ('a' + rand.nextInt(26));
            char name = Character.toUpperCase(name0);
            int severity = probabilty * consequence;
            String level = "";
            String RESET = "\u001B[0m";
            String YELLOW = "\u001B[33m";
            String GREEN = "\u001B[32m";
            String RED = "\u001B[31m";
            String PURPLE = "\u001B[35m\t";

            if (severity >= 25) {
                level = PURPLE + "VERY HIGH" + RESET;
            }
            if (severity > 15 && severity < 25) {
                level = RED + "HIGH" + RESET;
            }
            if (severity < 16 && severity > 10) {
                level = YELLOW + "MEDIUM" + RESET;
            }
            if (severity < 11 && severity > 5) {
                level = GREEN + "LOW" + RESET;
            }
            if (severity <= 5) {
                level = GREEN + "VERY LOW" + RESET;
            }
            System.out.println("# " + i + ": Risk " + "Mr." + name + "                    " + probabilty + "   " + consequence + "   " + severity + "   " + level);

        }
    }
}
