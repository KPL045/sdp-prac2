package sdp.prac2;

import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {
    public SimpleFunctions() {}


    public static int Task1(ArrayList<Integer> lista, ArrayList<Integer> listb)
{ //g22l3735 task 1
    int sum = 0;

    for (int k = 0; k < listb.size(); k ++)
    {
        if (listb.get(k) < 0 || listb.get(k) > lista.size()) //check out of bounds based on the two standards
        {
            continue;//if out of bounds go to next listb value
        }
        else
        {
            sum = sum + lista.get(listb.get(k));//if the list b index is inbounds then use the value at that index to get the list a value and add it to the final sum
        }
    }

    return sum;
}

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
    
    // Task 5 by Munashe (g23M8754)
    // Check if the list is sorted in ascending order
    // Returns true if sorted, false otherwise
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
