/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps_game;


/**
 *
 * @author seokhyun
 */
public class Craps_Game {
    
    //Methods
    static int rollingDice() {
        return (int)(Math.random()*6+1);
    }
    //class
    private static class GameCounter {
        int winCount=0;
        int loseCount=0;
        int roundCount=0;
        int rollCount=1;
        public void winCount() {
            winCount=winCount+1;
            roundCount=roundCount+1;
        }
        public void loseCount() {
            loseCount=loseCount+1;
            roundCount=roundCount+1;
        } 
        public void rollCount() {
            rollCount=rollCount+1;
        }
        public void rollSet() {
            rollCount=1;
        }
    }
    static int firstRollCheck(int a, int b) {
        int result=0;
        switch (a + b) {
            case 7:
            case 11:
                result = 1;
                break;
            case 2:
            case 3:
            case 12:
                result = 2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numDice1=0;
        int numDice2=0;
        int iTotal=0;
        int iPoint=0;
        GameCounter gCount = new GameCounter();
        // TODO code application logic here
        for (int i = 0 ; i < 100000 ; i++) {
            numDice1=rollingDice();
            numDice2=rollingDice();
            iTotal=numDice1+numDice2;
            switch (firstRollCheck(numDice1,numDice2)) {
                case 1:
                    if (i<10) {
                        gCount.winCount();
                        System.out.print("Round "+gCount.roundCount);
                        System.out.println(" , Roll "+gCount.rollCount+" -- Die1: "
                        +numDice1+" , Die2: "+numDice2+" -- Total: "+iTotal);
                        System.out.println("Win!");
                    } else { 
                        gCount.winCount();
                    }
                    break;
                    
                case 2:
                    if (i<10) {
                        gCount.loseCount();
                        System.out.print("Round "+gCount.roundCount);
                        System.out.println(" , Roll "+gCount.rollCount+" -- Die1: "
                        +numDice1+" , Die2: "+numDice2+" -- Total: "+iTotal);
                        System.out.println("Loss!"); } else {
                            gCount.loseCount();
                        }
                    break;
                case 0:
                    if (i<10) {
                    iPoint=iTotal;
                    System.out.print("Round "+(gCount.roundCount+1));
                    System.out.println(" , Roll "+gCount.rollCount+" -- Die1: "
                    +numDice1+" , Die2: "+numDice2+" -- Total: "+iTotal);
                    System.out.println("Point is "+iTotal);
                    
                    while(true) {
                        //여기까지 했음.
                        //첫번째 롤 이후 포인트 나올때까지 루프문부터 시작
                        numDice1=rollingDice();
                        numDice2=rollingDice();
                        iTotal=numDice1+numDice2;
                        gCount.rollCount();
                        if (iPoint==iTotal) {
                            
                            gCount.winCount();
                            System.out.print("Round "+gCount.roundCount);
                            System.out.println(" , Roll "+gCount.rollCount+" -- Die1: "
                            +numDice1+" , Die2: "+numDice2+" -- Total: "+iTotal);
                            System.out.println("Win!");
                            break;
                        } else if (7==iTotal) {
                            
                            gCount.loseCount();
                            System.out.print("Round "+gCount.roundCount);
                            System.out.println(" , Roll "+gCount.rollCount+" -- Die1: "
                            +numDice1+" , Die2: "+numDice2+" -- Total: "+iTotal);
                            System.out.println("Loss!");
                            break;
                        } else {
                            System.out.print("Round "+(gCount.roundCount+1));
                            System.out.println(" , Roll "+gCount.rollCount+" -- Die1: "
                            +numDice1+" , Die2: "+numDice2+" -- Total: "+iTotal);
                        }   
                    }   
                    gCount.rollSet();
                    break;
                    } else {
                    iPoint=iTotal;
                    while(true) {
                        //여기까지 했음.
                        //첫번째 롤 이후 포인트 나올때까지 루프문부터 시작
                        numDice1=rollingDice();
                        numDice2=rollingDice();
                        iTotal=numDice1+numDice2;
                        gCount.rollCount();
                        if (iPoint==iTotal) {
                            gCount.winCount();
                            break;
                        } else if (7==iTotal) {
                            gCount.loseCount();
                            break;
                        } else {
                            }   
                    }   
                    gCount.rollSet();
                    }
            }
            if (i<10) {
            System.out.println(gCount.winCount+" win(s) , "+gCount.loseCount+" loss(es)");
            }
        }
        System.out.println("OVERALL: \n"+gCount.winCount+" win(s) , "+gCount.loseCount+" loss(es)");
    }
}
