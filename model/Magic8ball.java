package model;

import java.util.Random;

public class Magic8ball {
    


    public  String answer(){

        Random randNum = new Random();
        // nextInt() picks any random number passing an argument allows 
        // the numbers to be selected between 0(and whatever)
        int choice = 1 + randNum.nextInt(20);
        String answer = "";
        switch (choice) {
            case 1: answer = "no"; break;
            case 2: answer = "yes"; break;
            case 3: answer = "idk ask again"; break;
            case 4: answer = "MOST DEF"; break;
            case 5: answer = "doubtful"; break;
            case 6: answer = "Dount count on it"; break;
            case 7: answer = "Maybe some day"; break;
            case 8: answer = "reply hazy"; break;
            case 9: answer = "HELL NO"; break;
            case 10: answer = "Nooooooooooooo"; break;
            case 11: answer = "Never in a million years"; break;
            case 12: answer = "I cant believe you would ask that"; break;
            case 13: answer = "HOW ABOUT NOOOOO!"; break;
            case 14: answer = "YES YES YES YES YES "; break;
            case 15: answer = "my mom said no"; break;
            case 16: answer = "my dad said yes"; break;
            case 17: answer = "possibly if you believe enough"; break;
            case 18: answer = "yea fam"; break;
            case 19: answer = "Dont sweat it"; break;
            case 20: answer = "who are you, why are you asking?"; break;









        }
        return answer;

    }    

    
}