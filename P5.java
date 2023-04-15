import java.io.*;

public class P5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of rows");
        int row = Integer.parseInt(br.readLine());
        
        int a=0;
        int b=1;
        int sum=0;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){

            System.out.print(sum+" ");
           
           //fivonacci series
            a=b;
            b=sum;
            sum=a+b;

            }
            System.out.println();
        }
  
    }

}