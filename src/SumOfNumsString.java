import java.util.Scanner;

class StringNumSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = s.nextLine();
        int sumOfNum = Summing(name);
        System.out.println("The sum of numbers in the String is : " + sumOfNum);
    }

    public static int Summing(String name) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= '0' && name.charAt(i) <= '9')
                // sum += (int) name.charAt(i) -48;
                 sum += name.charAt(i) -'0';
        }
        return sum;
    }
}