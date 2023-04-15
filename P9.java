import java.io.*;

public class P9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int n = Integer.parseInt(br.readLine());
        int num=n;
        int sum = 0;

        while (n != 0) {
            int multi = 1;
            int rem = n % 10;

            while (rem != 0) {
                multi = multi * rem;
                rem--;
            }

            sum = sum + multi;
            n = n / 10;

        }
        System.out.println("Addtion of factorials of each digit from "+num+" = "+sum);

    }
    
}