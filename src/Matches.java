/**
 * Created by ltregan on 27/10/2014.
 */
public class Matches {

    public static boolean isMatch(String s, String pattern){
        if( pattern.length() ==0 && s.length() ==0)
            return true;
        if(  pattern.length() ==0 )
            return false;
        char c = pattern.charAt(0);
        char c2 = pattern.length() > 1 ? pattern.charAt(1) : 0;
     // . match any char
        if( c == '.') {
            if( s.length() == 0 )
                return false;
            else
                return isMatch(s.substring(1), pattern.substring(1));
        }
     // * match any substring
        if( c == '*') {
            if( isMatch(s, pattern.substring(1) ) )
                return true;
            if( s.length() >0)
                return isMatch(s.substring(1), pattern) || isMatch(s.substring(1), pattern.substring(1)) ;
        }
    // a* match any number of a specific char
        if( c2 == '*') {
            if( isMatch(s, pattern.substring(2) ) )
                return true;
            if( s.length() >0 && (c == s.charAt(0) ))
                return isMatch(s.substring(1), pattern.substring(2)) || isMatch(s.substring(1), pattern.substring(0));
        }
    // a match a char
        if( s.length()>0 && c == s.charAt(0) )
            return isMatch(s.substring(1), pattern.substring(1) );
        else
            return false;
    }
}
