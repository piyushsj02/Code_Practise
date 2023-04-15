import java.io.*;

public class P4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Start-->");
        int start = Integer.parseInt(br.readLine());
        System.out.println("End-->");
        int end = Integer.parseInt(br.readLine());

        for(int i=1;i<=2;i++){
           
            if(i==1){ 
                for(int j=end;j>=start;j--){
                    if(j%2==0){
                System.out.print(j+" ");
                    }
                    else{}
                }
            }      
            else{
                for(int j=start;j<=end;j++){
                    if(j%2!=0){
                        System.out.print(j+" ");
                    }
                }
           } 
           System.out.println();
        }

            
    }

}
