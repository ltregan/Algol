/**
 * Created by ltregan on 23/10/2014.
 */
public class Palindrom {

    public static String longestPalindrome(String s){
        String result = "";

        for( int i=0; i<s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(  j-i+1 <= result.length() && result.length() >0 )
                    continue;
                String candidate = s.substring(i, j+1);
                if (isPalindrom(candidate))
                    result = candidate;
            }
        }
        return result;
    }

    public static boolean isPalindrom(String s){
        int i =0, j = s.length()-1;
        while( i <= j ){
            if( s.charAt(i) != s.charAt(j) )
                return false;
            i++;
            j--;
        }
        return true;
    }
}
