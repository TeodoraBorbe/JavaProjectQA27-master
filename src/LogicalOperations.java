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

    // Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void verifyTheNumber(int number){
        while (number <= 100){
            System.out.println(number);
            number++;
    }

}
// Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void verifyTheNumber2(int theNumber){
        while (theNumber >= -100){
            System.out.println(theNumber);
            theNumber--;
        }
    }

    // Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void twoNumbers(int first, int second){
        while(first <= second){
            System.out.println(first);
            first ++;

        }
    }
    //  Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void whatNumberIstheBiggest(int firstNumber, int secondNumber){
        if(firstNumber < secondNumber){
            while(firstNumber <= secondNumber){
                System.out.println(firstNumber);
                firstNumber++;

            }
        }
        else if(secondNumber < firstNumber){
            while (secondNumber <= firstNumber){
                System.out.println(firstNumber);
                firstNumber ++;

            }
        }
    }

    // Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100

    public void theEvenNumbers(){
        int x = 1;
        while (x <= 100){
            x ++;
            if(x % 2 == 0){
                System.out.println(x);
            }
        }
    }
// Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void theOddNumbers(){
        int y = 0;
        while (y < 100){
            y++;
            if(y % 2!= 0){
                System.out.println(y);
            }
        }
    }
    // Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void sumAndAverageNumbers(){
        int first = 111;
        int second = 8899;
        double sum = 0;
        int count = 0;
        while (first <= second){
            sum+= first;
            first++;
            count++;

        }
        System.out.println(sum);
        System.out.println("Media numerelor este: " + count);
    }

    // Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int divisibleNumbers(int first, int second){
        int sum = 0;
        int average = 0;

        while (first <= second){
            if(first % 7 ==0){
            sum+= first;
            average++;
            }
            first++;
        }

        return average;
    }

    // Creati o metoda numita CozaLozaWoza.
    public void wozaCozaLoza(){
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;

        }

    }
// In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.

public int[] getArray(){
    int[] myArray = new int[100];
    for(int i = 1; i <= 100; i++){
        myArray[i-1] =i;
        System.out.println(myArray[i-1]);
    }
    return myArray;
    }
    // Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza. Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

    public int[] getEvenArray (){
int[]evenArr = new int[100];
int a = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 ==0){
                evenArr[a] = i;
                a++;
                System.out.println(evenArr[a]=i);
            }

        }
        return evenArr;
    }
    // Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza.

    public double getAverageArray(int [] myArray){
double sum = 0;
        for(int i = 0; i < myArray.length; i++ ){
            sum += myArray[i];

        }
        return sum/ myArray.length;
    }

    // Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean checkArray( String[] array, String arr){
        for(int i = 1; i < array.length; i++){
            if(array[i].equals(arr)){
                return true;
            }
        }
        return false;
    }

    // Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.  Apelati metoda in main() pentru a verifica daca functioneaza.

    public int getPosition (int[] numbers, int number){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]==number){
                return i;
            }

        }
return 0;
    }

    // Creati o metoda care sa afiseze urmatoarea grila, folosind un array.

    public void lines(){
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};
        for(int i = 0; i< 10; i++){
            System.out.println(line);
        }
    }
}


