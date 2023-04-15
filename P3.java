import java.io.*;

public class P3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of rows");
        int row = Integer.parseInt(br.readLine());
        int num=row;
       for (int i=1;i<=row;i++){
            int n=num*i;
        for(int j=1;j<=row-i+1;j++){
            
            System.out.print(n+" ");
            n=n-i;
        }
        num--;
        System.out.println();
       }
    }
}
