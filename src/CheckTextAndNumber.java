public class CheckTextAndNumber {
    public static String CheckTextNumber(String text, int number) {
        if (text.equals("FastTrackIt") && number <= 3) {
            return (text + " " + number);
        } else if (!text.equals("FastTrackIt") && number >= 4) {
            return (number + " " + text);
        } else return "Not acceptable";
    }
}
