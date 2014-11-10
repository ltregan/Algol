/**
 * Created by ltregan on 23/10/2014.
 */
public class PalindromDynamic {


    public static String longestPalindrome(String s){

        int cache[][] = new int[s.length()][s.length()];

        String result = "";

        for( int i=0; i<s.length(); i++) {
            System.out.println("------------- i="+i);
            for (int j = i; j < s.length(); j++) {
             //   printTable( cache );
            //    System.out.println();
                if(  j-i+1 <= result.length() && result.length() >0 )
                    continue;
                if (isPalindrom(s, cache, i ,j))
                    result = s.substring(i, j+1);
            }
        }
        return result;
    }

    public static boolean isPalindrom(String s,int cache[][], int i, int j){
        int x=i, y=j;
        while( i <= j ){
            if( cache[i][j] < 0) {
                cache[x][y] = -1;
                return false;
            }
            if( cache[i][j] > 0) {
                cache[x][y] = 1;
                return true;
            }
            if( s.charAt(i) != s.charAt(j) ) {
                cache[x][y] = -1;
                return false;
            }
            i++;
            j--;
        }
        cache[x][y] = 1;
        return true;
    }


    public static void printTable(int cache[][]){
        for( int i=0 ;i < cache.length; i++){
            System.out.print("[ ");
            for( int j=0 ;j < cache[i].length; j++)
                System.out.print(cache[i][j]+" ");
             System.out.println("]");
        }
    }
}
