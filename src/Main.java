public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Altceva!");
        Shopping();
        Operations();
        System.out.println("Rezultatul adunarii este: " + Sum(2, 3));
        System.out.println("Rezultatul scaderii este: " + Scadere(2, 3));
        System.out.println("Rezultatul inmultirii este: " + Inmultire(2, 3));
        System.out.println("Rezultatul impartirii este: " + Impartire(2, 3));
        printLetters();
        System.out.println("Rezultatul mediei este: " + Media( 2,3,4));
        printModel();
        System.out.println("Rezultatul restului este: " + Rest (2,3));
        System.out.println("Temperatura in Celsius este: " + Temperature(90));
        System.out.println("Distanta in metrii este: "+ Distanta(1));
    }

    public static void Shopping() {
        String author = "Cristina";
        int busNumber = 35;
        float kgDeMereAuthor = 4.5F;
        int additionalApplesKg = 2;
        System.out.println(author + " vrea sa cumpere mere.\n" +
                "Pentru a cumpara mere, " + author + " trebuie sa mearga la piata,\n" +
                "pe strada Avram Iancu. Pe strada Avram Iancu, exista\n" +
                "cea mai mare piata agricola. " + author + " va merge la piata \n" +
                "cu autobuzul numarul " + busNumber + ". Pe autobuz, " + author + " se intalneste cu\n" +
                "George, care si el merge sa cumpere mere. " + author + " vrea sa cumpere\n" +
                kgDeMereAuthor + " kg de mere, iar George 10 ca e barbat. Pe drum inapoi \n" + author +
                "se razgandeste, si se intoarce sa mai cumpere " + additionalApplesKg + " kg de mere. " + author + " are acum\n" +
                (kgDeMereAuthor + additionalApplesKg) + " kg de mere.");

    }

    public static void Operations() {
        int x = 2;
        double y = 4;
        double z = x + y;
        System.out.println(z);

        z++;
        System.out.println(z);
//        x+=2; // x = x + 2;
        x += x += x++ + ++x;
        System.out.println("primul rezultat " + x);

        System.out.println("al doilea rezultat al lui x este " + x++);
        System.out.println("al treilea rezultat al lui x este " + x);
    }

    public static int Sum(int x, int y) {
        return x + y;
    }

    public static int Scadere(int x, int y) {
        return x - y;
    }

    public static int Inmultire(int x, int y) {
        return x * y;
    }

    public static int Impartire(int x, int y) {
        return x / y;
    }

    public static void printLetters() {
        System.out.println(
                        "   J    a   v     v   a   \n" +
                        "   J   a a   V   V   a a  \n" +
                        "J  J  aaaaa   V V   aaaaa \n" +
                        " JJ  a     a   V   a     a");
    }
    public static int Media(int x, int y, int z){
            return (x +y +z)/3;
    }
    public static void printModel(){
            System.out.println(
                    "  + \"\"\"\"\" +  \n" +
                    " [|  o o  |] \n" +
                    "  |   ^   |  \n" +
                    "  |  '_'  |  \n" +
                    "  + ----- +  \n");
    }
    public static int Rest(int x, int y){
            return x % y;
    }

    public static int Temperature (int fahr){
            int celsius =(fahr - 32) * 5/9;
            return celsius;
    }

    public static double Distanta(double inch){
        double metri= inch*0.02;
        return metri;
    }

}

