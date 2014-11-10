
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by ltregan on 06/11/2014.
 */
public class AssertCollection {


      private static  StringBuffer _toString(int a[]){
          if( a == null)
              return new StringBuffer("null");
          StringBuffer result = new StringBuffer("[");
          int n=0;
          for( Object x : a){
              if( n>0)
                  result.append(",");
              result.append( x );
              n++;
          }
          result.append("]");
          return result;
      }


    private static StringBuffer _toString(Collection a){
        if( a == null)
            return new StringBuffer("null");
        StringBuffer result = new StringBuffer("[");
        int n=0;
        for( Object x : a){
            if( n>0)
                result.append(",");
            result.append( x );
            n++;
        }
        result.append("]");
        return result;
    }

      public static  void assertEquals( int a[], Collection b ){
        if( a == null && b == null)
            return;
        if( a != null ^ b != null)
            throw new AssertionError("Expected:"+_toString(a)+"\nActual:"+_toString(b) );
        if( a.length != b.size()  )
            throw new AssertionError("Expected: size "+a.length +"\nActual: size "+ b.size()  );


        int n =-1;
        Iterator i = b.iterator();
        for(Object x: a){
            n++;
            Object bi = i.next();
            if( x == null && b == null )
                continue;
            if( ! x.equals(bi)){
                throw new AssertionError("Expected:"+_toString(a) +"\nActual:"+_toString(b) );
            }
        }

    }
}
