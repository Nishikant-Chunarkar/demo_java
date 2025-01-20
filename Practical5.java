
     public class Practical5 {

    // factorial using for loop
    static int getFact_1(int n) {
        if (n < 0) {
            return -1;
        } else if (n < 2) {
            return 1;
        } else {
            int res = 1;
            for (int i = n; i >= 2; i--) {
                res = res * i;
            }
            return res;
        }
    }

    // factorial using while loop
    static int getFact_2(int n) {
        if (n < 2) {
            return 1;
        }
        int res = 1;
        while (n > 1) {
            res *= n--;
        }
        return res;
    }

    // factorial without using loop (recursive)
    static int getFact_3(int n) {
        if (n < 0) {
            return -1;
        } else if (n < 2) {
            return 1;
        } else {
            return n * getFact_3(n - 1); 
        }
    }

    // getArraySum using recursion
    static int getArraySum(int[] ar, int i) {
        if (i == ar.length) {
            return 0;
        } else {
            return ar[i] + getArraySum(ar, i + 1);
        }
    }

    // main method
    public static void main(String[] args) {
        System.out.println(getFact_1(10));
        System.out.println(getFact_2(10));
        System.out.println(getFact_3(10));

        // creating array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getArraySum(arr, 0));
    }
}
           
                
                
          
            
          
        
       
