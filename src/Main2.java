import com.sun.source.doctree.SummaryTree;

import java.sql.SQLOutput;

public class Main2 {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        int biggest = op.BiggerNumber(3, 4);
        System.out.println("Numarul mai mare este: " + biggest);


        GetText gt = new GetText();
        String showText = gt.GetText("FastTrackIt");
        System.out.println("Textul este "+ showText);

        CheckTextAndNumber gta = new CheckTextAndNumber();
        String displayTextAndNumber = gta.CheckTextNumber("FastTrackIt", 3);
        System.out.println("Varianta finala este " + displayTextAndNumber);

        NewMethod whithnumbers = new NewMethod();
        String showTheTextAndNumber = whithnumbers.NewMethod(8);
        System.out.println("Varianta este "+ showTheTextAndNumber);

        isNumberEven trueOrFalse = new isNumberEven();
        Boolean ShowTrueOrFalse = trueOrFalse.isNumberEven(2);
        System.out.println("Varianta corecta este: " + ShowTrueOrFalse);

        isEligibileToVote trueorfalse = new isEligibileToVote();
        Boolean ShowTheAge = trueorfalse.isEligibileToVote(19);
        System.out.println("Are persoana drept de vot?: " + ShowTheAge);

        methodWithNumbers CheckNumbers = new methodWithNumbers();
        String ShowTheNumbers = CheckNumbers.methodWithNumbers(5);
        System.out.println("Varianta finala este: "+ ShowTheNumbers);

        op.CountTheNumbers(20,10);
        System.out.println(op.getAverageForEvenInInterval(1,100));


    }


}

