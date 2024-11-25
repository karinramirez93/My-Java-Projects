import java.util.Scanner;

public class TowerSolver {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many disk: ");
        int numDisks = Integer.parseInt(scanner.nextLine());
        solverTower( numDisks,1,3);



    } // end main

    public static void solverTower(int numDisks, int startPeg, int destPeg){
        if(numDisks == 1){
            System.out.println("Move disk from " + startPeg + " to " + destPeg);
        }
        else{
            int other = 6 - (startPeg + destPeg);
            solverTower(numDisks -1, startPeg, other);
            solverTower(1, startPeg, destPeg);
            solverTower(numDisks-1, other, destPeg);
        }
    }


}// end class
