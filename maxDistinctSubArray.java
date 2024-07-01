import java.util.*;
public class maxDistinctSubArray {
    public static void main(String[] args) {
        String s="abcdckjkljkk";
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0;
        int j=0;
        int maxSize=0;
        int size=0;
        for(int index=0;index<s.length();index++){
            if(hm.containsKey(s.charAt(j))){
                while(hm.containsKey(s.charAt(j))){
                    hm.remove(s.charAt(i));
                    size--;
                    i++;
                }
                
                hm.put(s.charAt(j),1);
            }else{
                hm.put(s.charAt(j),1);
                size++;
                if(size>maxSize){
                    maxSize=size;
                }
                j++;
            }
        }
        System.out.println(maxSize);
    }
}
