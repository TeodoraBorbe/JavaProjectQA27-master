import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {

        List<Integer>myListOfInt = new ArrayList<>();
        for (int i = 0; i<=100; i++) {
            myListOfInt.add(i);
        }
        LogicalOperations op = new LogicalOperations();

        op.printNumbersBackwardsFromList(myListOfInt);

//        op.addToEndOfList(myListOfInt,0);
        op.printNumbersFromList(myListOfInt);
        for (int i = 4; i<=100; i++) {
            myListOfInt.add(i);
        }
        op.startFromTheNumber(myListOfInt);

        op.checkTheNumber(1);
        System.out.println();

        op.checkTheNumbers(-1);
        System.out.println();

        op.theNumbersBetween(5, 30);
        System.out.println();

        op.checkTheBiggestNumber(10, 40);
        System.out.println();

        op.evenNumbers(0);
        System.out.println();

        op.oddNumbers(0);
        System.out.println();

        System.out.println(op.sumNumbers(0));

        System.out.println(op.sumAndAverageOfNumbers(0));





}}
