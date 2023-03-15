
import java.util.Scanner;

public class Simulation {
    int numberOfDice;
    int numberOfTosses;
    Dice dice;
    public static void main(String[] args){
        //Scanner numScanner = new Scanner(System.in);
        //int numOfDie = numScanner.nextInt();
        //int numOfRolls = numScanner.nextInt();
        Simulation sim = new Simulation(2, 1000000);

        sim.runSimulation();

        sim.printResults();
    }
    public Simulation(int numberOfDice, int numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        dice = new Dice(numberOfDice);
    }
    public void runSimulation(){
        for (int i = 0; i <= numberOfTosses; i++) {
            dice.rollDice();
        }
    }
    public String printResults(){
        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " dice tossed " + numberOfTosses + " times");
        System.out.println("***\n");
/*
        int binResult = 0;
        int results = 0;
        for (int i = 1; i <= 12; i++) {
            binResult = binResult.getBins(i);
            double percent =

        }*/
        return null;
    }



}
