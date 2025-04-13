public class Task6{
    public static void main (String [] args){
        int[] arr ={1,200,3,477};
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
