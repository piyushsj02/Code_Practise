import java.io.*;

public class P7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter no of rows");
        int row = Integer.parseInt(br.readLine());

        int n=(row*(row+1))/2;
        int ch=64+(row*(row+1))/2;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
            if(row%2!=0){
            if(i%2!=0){
                System.out.print((char)ch+" ");
            }
            else{
                System.out.print(n+" ");
            }
            ch--;
            n--;
            
            }

            else{
                if(i%2==0){
                    System.out.print((char)ch+" ");
                }
                else{
                    System.out.print(n+" ");
                }
                ch--;
                n--;
            }
        }

            System.out.println();
        }
    }
}
        