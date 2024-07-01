// accept a string
// integer adn sepcial characters accepted
// only lowercase
// no need to worry of upper characters
// frequncy and  highesh ffrequency


import java.util.*;
class higheshFreq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                // hm.getOrDefault(s.charAt(i)+1, 0);
                if(hm.containsKey(s.charAt(i))){
                    hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
                }else{
                    hm.put(s.charAt(i), 1);
                }
            }
        }
        System.out.println(hm);
        char maxi=' ';
        int max=Integer.MIN_VALUE;
        for(char i:hm.keySet()){
            if(hm.get(i)>max){
                max=hm.get(i);
                maxi=i;
            }
        }
        
        System.out.print(maxi + " freq: "+hm.get(maxi));




        sc.close();
    }
}
