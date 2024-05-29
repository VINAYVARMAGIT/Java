public class WarehouseCounter {

    public static void main(String[] args) {
        int items = 10;11 10 11
        int incoming = 5;6 5 4
        int outgoing = 3;2 3 4

        int countA = items++ + ++incoming; 10+6=16
        int countB = --items + outgoing--; 10+3=13
        int countC = incoming-- + ++outgoing;6+3=9
        int countD = ++items + --incoming + outgoing++; 11+ 4+ 3 =18

        System.out.println("items: " + items);
        System.out.println("incoming: " + incoming);
        System.out.println("outgoing: " + outgoing);
        System.out.println("countA: " + countA);
        System.out.println("countB: " + countB);
        System.out.println("countC: " + countC);
        System.out.println("countD: " + countD);
    }
}

