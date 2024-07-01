public class rotation {
    public static void main(String[] args) {
        int[]arr={18,20,21,-1,28,1};
        int k=2;
        int[] newArr=new int[k];
        for(int i=0;i<k;i++){
            newArr[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            //System.out.println(newArr[i]);
            arr[i]=newArr[j];
            j++;
        }
        //System.out.println(newArr[0]);
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
    }
}
