package Simulation;

public class testApp {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
    /**
     * Recursive method to solve the Tower of Hanoi puzzle
     *
     * @param n number of disks
     * @param fromRod the rod from which to move the disks
     * @param toRod the rod to which to move the disks
     * @param auxRod the auxiliary rod to use during the process
     */
    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: only one disk to move
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        // Move n-1 disks from fromRod to auxRod using toRod as auxiliary
        solveHanoi(n - 1, fromRod, auxRod, toRod);

        // Move the nth disk from fromRod to toRod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Move the n-1 disks from auxRod to toRod using fromRod as auxiliary
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }
}
