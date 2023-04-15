import java.io.*;

public class P1 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
        
        System.out.println("enter no of rows");
        int row=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=row;i++){
            int n=row;
            
            for(int j=1;j<=row;j++){

                if(i%2!=0){
                    int ch1 =64+n;
                    System.out.print((char)ch1);
                    System.out.print(n+" ");
                    n--;
                }
                else{
                    int ch2=64+j;
                    System.out.print((char)ch2);
                    System.out.print(j+" ");
                    n++;
                }
                
            }
            System.out.println();
        }

    
    }
}
