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
    
////////////////////////////////////////////////////Task6////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static List<Integer> Task6(List<Integer> lst){
        List<Integer> newLst = new ArrayList<Integer>();//new list to append to 

            for(int i=0;i<lst.size();i++){
                if(lst.get(i)%100==0){ //check if the elements in the list are in 100s 
                    newLst.add(lst.get(i));//if so adds number in the list as it is 
                }
                else{
                    newLst.add((int)(Math.ceil(lst.get(i)/100.0)*100));//if not round up to the nearest 100s 
                }

            }

        return newLst; //retuen the list with elements rounded up to the nearest 100s
        }
}
