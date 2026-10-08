public class LoopExercises {
    public static void main(String[] args){
        System.out.println("Exercise 1 - counting down");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("Exercise 2 - counting with step = 2");
        for (int i = 2; i<= 20; i+=2){
            System.out.println(i);
        }

        System.out.println("Exercise 3 - sum of numbers");
        int sum = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 != 0 && i % 5 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum is equal to: "+ sum);

        System.out.println("Exercise 4 - mean of numbers");
        int n = 10;
        double total = 0;
        for (int i = 1; i <= n; i++){
            total += i;
        }
        System.out.println("Mean of nubers form 1 to 10 equals: " + (total/n) );

        System.out.println("Exercise 5 - * pyramid");
        int h = 5;
        for (int i = 0; i < h; i++){
            for(int j = 0; j < h - i - 1; j++){
                System.out.print(' ');
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("Exercise 6 - Fibonacci");
        int a = 1;
        int b = 1;
        int c;
        for (int i = 1; i <= 20; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        System.out.println("Exercise 6a - Fibonacci - first greater than 1000");
        a = 1;
        b = 1;
        do{
            c = a + b;
            a = b;
            b = c;
        }while(c <= 1000);
        System.out.println(c);
        System.out.println("Exercise 6b - Fibonacci - first greater than int scope");
        long x = 1;
        long y = 1;
        long z;
        for (int i = 1; i <= 1000; i++){
            z = x + y;
            if(z > Integer.MAX_VALUE){
                System.out.printf("max value in int scope: %d; steps: %d", y , i);
                break;
            }
            x = y;
            y = z;
        }
        System.out.println("Exercise 7a - int reversion");
        int num = 121;
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
        System.out.println("Exercise 7b - is int a palindrome");
        num = -121;
        int num_copy = num;
        reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (num_copy == reversed && num_copy >= 0){
            System.out.println("Number: " + num_copy + " is a palindrome");
        }else {
            System.out.println("Number: " + num_copy + " is not a palindrome");
        }

        System.out.println("Exercise 8a - Collatz");
        n = 27;
        int i = 0;
        do {
            if (n % 2 == 0){
                n /= 2;
            }else{
                n = 3 * n + 1;
            }
            i++;
        }while (n != 1);
        System.out.printf("Start: %d; Steps: %d", n, i);

        System.out.println("\nExercise 8a - Collatz - longest series below 1 000 000 start point");
        int maxSteps = 0;
        int longestStart = 0;
        for(i = 1; i < 1000000; i++){
            long iCopy = i;
            int j = 0;
            do {
                if (iCopy % 2 == 0){
                    iCopy /= 2;
                }else{
                    iCopy = 3 * iCopy + 1;
                }
                j++;
            }while (iCopy != 1);
            if (j > maxSteps){
                maxSteps = j;
                longestStart = i;
            }
        }
        System.out.printf("%d; %d", maxSteps, longestStart);
    }
}