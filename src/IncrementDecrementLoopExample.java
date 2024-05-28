public class IncrementDecrementLoopExample {

    public static void main(String[] args) {
        int i = 5;

        System.out.println("Initial value of i: " + i);
                                                     
                                                      
                                     
        for (int j = 0; j < 5; j++) {
            int resultA = ++i; // Pre-increment 6 6 
            int resultB = i++; // Post-increment 6 
            int resultC = --i; // Pre-decrement 6
            int resultD = i--; // Post-decrement 6

            System.out.println("Iteration " + (j + 1));
            System.out.println("i after pre-increment: " + resultA);
            System.out.println("i after post-increment: " + resultB);
            System.out.println("i after pre-decrement: " + resultC);
            System.out.println("i after post-decrement: " + resultD);
        }
    }
}
