public class EvenDigits {
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,7896};

        System.out.println(findNumbers(nums));

    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofDigits=digits(num);
        return numberofDigits % 2 == 0;

    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }

        int count=0;
        while(num>0){
            count+=1;
            num=num/10;
        }

        return count;

    }
}
