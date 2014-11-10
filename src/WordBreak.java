/**
 * Created by ltregan on 27/10/2014.
 */
public class WordBreak {

    public static boolean wordBreak( String s, java.util.Set<String> dic ) {
        int cache[] = new int[ s.length() ];
        return wordBreak( s, dic, cache );
    }

    public static boolean wordBreak( String s, java.util.Set<String> dic, int cache[] ){
        if( s.length() ==0)
            return true;
     // check in cache
        if( cache[ s.length() -1] > 0)
            return true;
        if( cache[ s.length() -1] < 0)
            return false;
    // else compute
        for( String word : dic){
            int l = word.length();
            if( l > s.length() )
                continue;
            if( !s.substring(0,l).equals(word) )
                continue;
            String o = s.substring( l );
            if( wordBreak( o, dic, cache ) ) {
                cache[s.length() -1 ] = 1;
                return true;
            }
        }
        cache[s.length() -1 ] = -1;
        return false;
    }
}
