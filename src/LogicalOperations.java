import java.sql.SQLOutput;
import java.util.List;

public class LogicalOperations {

    public static int BiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public void CountTheNumbers(int x, int y) {
        for (int i = x; i >= y; i--) {
            System.out.println(i);
        }

    }

    public double getAverageForEvenInInterval(int start, int finish) {
        int sum = 0;
        double count = 0;
        while (start <= finish) {

            if (start % 2 == 0) {
                sum = sum + start;
                count++;

            }
            start++;
        }
        System.out.println(sum);
        return (sum / count);

    }

    public boolean isValueInArray(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }


    public void printNumbersBackwardsFromList(List<Integer> myList) {
        for (int i = myList.size() - 1; i > 0; i--) {
            System.out.println(myList.get(i));
        }
    }
public void addToEndOfList(List<Integer> list, int a){
    list.add(a);
    System.out.println(list);

}
    public void printNumbersFromList(List<Integer> myList) {
        for (int i = 0;  i< myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    public void startFromTheNumber (List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


    }
    //  Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void checkTheNumber (int x){
        for( int i = 1; i <=100; i++ ){
            System.out.println(i);

        }

    }
// Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

public void checkTheNumbers (int x){
        for(int i = -1; i >= -100; i--){
            System.out.println(i);
        }
}

// Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void theNumbersBetween (int x , int y){
        for(int i = x; i <= y; i++){
            System.out.println(i);
        }
    }

    // Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void checkTheBiggestNumber (int x, int y){
        if(x<y){
            for(int i = x; i <= y; i++){
                System.out.println(i);
            }
        }else if(y<x){
            for(int i = y; i <= x; i++){
                System.out.println(i);
            }
        }
    }
//  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

public void evenNumbers(int x){
        for(int i = 0; i<= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
}

// Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void oddNumbers(int x){
        for(int i = 0; i<= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);

            }
        }
    }

// Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

public int sumNumbers(int x){
        int sum = 0;
        for(int i = x; i<=100; i++){
sum += i;
        }
        return sum;
}

// Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int sumAndAverageOfNumbers(int x){
        int sum = 0;
        int average = 0;
        for ( int i = x; i<= 100; i++){
            sum += i;
            average ++;

        }
        return sum/average;
    }
}