import java.util.*;
class Solution {
    public static String mergeAlternately(String word1, String word2) {
        char ans[]=new char[word1.length()+word2.length()];
        int w1=word1.length();
        int w2=word2.length();
        int i=0,j=0,k=0;
        while(i<w1 || j<w2)
        {
            if(i<w1)
            {
                ans[k++]=word1.charAt(i++);
            }
            if(j<w2)
            {
                ans[k++]=word2.charAt(j++);
            }
        }

        return new String(ans);
    }
    public static void main(String[] args)
    {
        String s1=new String("abc");
        String s2=new String("pqr");

        System.out.println(mergeAlternately(s1,s2));
    }
}