import java.io.*;

public class P6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("char 1 -->");
        char ch1 = br.readLine().charAt(0);

        System.out.println("char 2 -->");
        char ch2 = br.readLine().charAt(0);

        if(ch1==ch2){
            System.out.println(ch1+" "+ch2);

        }
        else{
            int diff=ch1-ch2;
            if(diff<0){
                System.out.println("The Difference between "+ch1+" and "+ch2+" is "+(int)(ch2-ch1));
            }
            else{
            System.out.println("The Difference between "+ch1+"and "+ch2+"is"+diff);
        }

    }

    }
}
