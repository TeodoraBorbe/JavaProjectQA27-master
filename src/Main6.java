import javax.swing.*;
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

        op.verifyTheNumber(0);
        System.out.println();

        op.verifyTheNumber2(0);
        System.out.println();

        op.twoNumbers(10,20);
        System.out.println();

        op.whatNumberIstheBiggest(40, 80);
        System.out.println();

        op.theEvenNumbers();
        System.out.println();

        op.theOddNumbers();
        System.out.println();

        op.sumAndAverageNumbers();
        System.out.println();

        System.out.println(op.divisibleNumbers(1,50));

        op.wozaCozaLoza();
        System.out.println();

        System.out.println(op.getArray());

        System.out.println(op.getEvenArray());

        int [] myArray ={3,4,5,6,7};
        System.out.println(op.getAverageArray(myArray));

String [] array = {"Teo", "Teodora", "Cristina"};
if(op.checkArray(array, "Teo")){
        System.out.println("Valoarea este in array.");

}
else
    System.out.println("Valoarea nu este in array.");

int [] number = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Numarul este in array.");

        op.lines();
        System.out.println();

}

    }
