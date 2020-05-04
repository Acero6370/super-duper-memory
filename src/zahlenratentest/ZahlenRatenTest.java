package zahlenratentest;

import java.util.Random;
import java.util.Scanner;


public class ZahlenRatenTest {
    
    public static void main(String[] args) {
        int number = randomNumber();
        int guess;
        int botnum;
        boolean loop = false;
        boolean bot = false;
        Scanner sc = new Scanner(System.in);
        
        //testing
        int tst;
        int tst2;
        int v1;
        int v2;
        int v3;
        int bothardnum;
        int botmidnum;
        int boteasynum;
        boolean bothard = false;
        boolean botmid = false;
        boolean boteasy = false;
        
        for (int i = 0; i < 5; i++) {
            System.out.println(randbotnum());
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(number);
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
        }
        
        
        tst = 344;
        botnum = 1000;
        bothardnum = 1000;
        botmidnum = 1000;
        boteasynum = 1000;
        while (!bothard) {
            bothardnum = number + randbotnum();
            if (bothardnum == number) {
                bothard = true;
                System.out.println("Bot got the number t1 " + bothardnum);
                try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
            }   else if (bothardnum < number) {
                System.out.println("test running t1 " + bothardnum);
                try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
            }   else if (bothardnum > number) {
                System.out.println("test running t1 " + bothardnum);
                try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
            } 
        }
        
        while (!botmid) {
            
            if (botmidnum == tst) {
                botmid = true;
                System.out.println("Bot got the number t2 " + botmidnum);
                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            }   
            else if (botmidnum < tst) {
                System.out.println("test running t2 " + botmidnum);                    
                v1 = botmidnum;
                v2 = botmidnum / 2;
                v3 = v1 + v2;
                botmidnum = v3 / 2;
//                v2 = tst2;
//                if () {
//                    
//                }
//                else if () {
//                    
//                }
                
                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            }   
            else if (botmidnum > tst) {
                System.out .println("test running t2 " + botmidnum);
                botmidnum = botmidnum / 2;
                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            } 
        }
//        
//        while (!boteasy) {
//            tst = 15;
//            botnum2 = botnum / 2;
//            botnum = botnum2;
//            
//            if (boteasynum == tst) {
//                boteasy = true;
//                System.out.println("Bot got the number t3 " + botnum);
//                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
//            }   else if (boteasynum < tst) {
//                System.out.println("test running t3 " + botnum);
//                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
//            }   else if (boteasynum > tst) {
//                System.out.println("test running t3 " + botnum);
//                try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
//            } 
//        }
        
        
        
        while (!loop) {
            System.out.print("Rate: ");
            guess = sc.nextInt();
            
            if (guess == number) {
                loop = true;
                System.out.println("Richtig");
            }   else if (guess < number) {
                System.out.println("Zu klein");
            }   else if (guess > number) {
                System.out.println("Zu gross");
            }
        }
    }
    public static int randomNumber() {
        Random rand = new Random();
        int rn = rand.nextInt(1000);
        rn += 1;
        return rn;
    }
    public static int randbotnum() {
        Random randbot = new Random();
        int rnb = randbot.nextInt(10);
        return rnb;
    }
}