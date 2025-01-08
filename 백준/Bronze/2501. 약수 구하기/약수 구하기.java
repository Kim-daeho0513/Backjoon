import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] lst = br.readLine().split(" ");
        int a = Integer.parseInt(lst[0]);
        int b = Integer.parseInt(lst[1]);

        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                result.add(i);
            }
        }
        try{
            System.out.println(result.get(b-1));
        }catch(IndexOutOfBoundsException e){
            System.out.println("0");
        }
    }
}