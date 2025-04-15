package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    

    //A Method for removing the first character of each string in a list of strings
    public static List<String> task2(List<String> lst){

       List<String> newList = new ArrayList<>();
       
       // we to interate through all the element in the list and  remove the first character of each element
       for(int i = 0; i < lst.size(); i++){
           String str = lst.get(i); // we get the element at index i

           // we check if the string is not empty before removing the first character

           if (str.length() > 1) {// this will also help remove elements that will result in empty string
               str = str.substring(1); // remove the first character
           }
           newList.add(i, str); // update the list with the modified string
       }
        return newList;
    }


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

   /*Task 4 by Christina(g20m4892)*/
    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        // Check if the lists have the same size
        if (a.size() != b.size()) {
            return null;
        }
        
        List<Integer> answer = new ArrayList<>();
        int length = a.size();
        
        for (int k = 0; k < length; k++) {
            // Multiply k th element from start of a with the last element in list b
            int product = a.get(k) * b.get(length - 1 - k);
            answer.add(product);
        }
        
        return answer;
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
     public static void Task6 (List<Integer> lst){
        List<Integer> newLst = new ArrayList<Integer>();

            for(int i=0;i<lst.size();i++){
                if(lst.get(i)%100==0){
                    newLst.add(lst.get(i));
                }
                else{
                    newLst.add((int)(Math.ceil(lst.get(i)/100.0)*100));
                }

            }

        for (int num : newLst) {
            System.out.println(num);
        }
    }
}
