package Day07;

public class even_odd_sum {
    public static void main(String[] args) {
        int oddsum=0;
        int evensum=0;
        int []id={2,5,3,7,5,9,6,7,1,0,3,5,};

            for (int num : id) {
                int org = num;
                int count = 0;
                while (num != 0) {

                    int pop = num % 10;
                    count++;
                    num /= 10;


                    if (count % 2 == 0) {
                        evensum += org;
                    } else {
                        oddsum += org;
                    }


                    System.out.println("sum of even num:" + evensum);
                    System.out.println("sum of odd sum:" + oddsum);
                }
            }
        }
    }