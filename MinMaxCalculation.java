public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 8};

        int min_num = Integer.MAX_VALUE;
        int max_num = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            min_num = Math.min(numbers[i], min_num);
            max_num = Math.max(numbers[i], max_num);
        }

        System.out.println("Minimum number: "+min_num);
        System.out.println("Maximum number: "+max_num);
    }
}
