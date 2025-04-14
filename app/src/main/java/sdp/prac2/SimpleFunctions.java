package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    
    public static boolean Task3(String s) {
        int balance = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0; 
    }

    public static boolean Task5(List<Integer> lst) {
        if (lst.size() == 0) {
            return true;
        }
        for (int i = 0; i < lst.size() - 1; i++) {
            if (lst.get(i) > lst.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

        public static void Task6 (int[] arr){
        int[] newArr = new int[arr.length];

            for(int i=0;i<arr.length;i++){
                if(arr[i]%100==0){
                    newArr[i]=arr[i];
                }
                else{
                    newArr[i]=(int)(Math.ceil(arr[i]/100.0)*100);
                }

            }

        for (int num : newArr) {
            System.out.println(num);
        }
    }
}
