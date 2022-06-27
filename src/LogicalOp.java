public class LogicalOp {

    public static int BiggerNumber(int first, int second){
        if(first > second){
            return first;
            }
        else{
            return second;
        }
    }

    public void CountTheNumbers (int x, int y){
        for(int i=x; i>=y; i--){
            System.out.println(i);
        }

    }

    public double getAverageForEvenInInterval(int start, int finish){
       int sum = 0;
       double count = 0;
       while (start <= finish){

        if(start % 2 ==0){
            sum = sum + start;
            count ++;

        }
           start ++;
    }
        System.out.println(sum);
        return (sum/count);
}}
