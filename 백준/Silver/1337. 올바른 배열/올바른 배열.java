import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        
        Collections.sort(arr);
        ArrayList<Integer> cntArr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = arr.get(i); j < arr.get(i)+5; j++) {
                if(arr.contains(j)) cnt++;
            }
            cntArr.add(cnt);
        }
        
        System.out.println(5 - Collections.max(cntArr));
    }
}