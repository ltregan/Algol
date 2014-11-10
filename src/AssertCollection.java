
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by ltregan on 06/11/2014.
 */
public class AssertCollection<Object T> {


    public static void assertEquals( Object a ) {

    }

        public static void assertEquals<T>( T a[], Collection b ){
        if( a == null && b == null)
            return;
        if( a != null && b == null)
            throw new AssertionError("Expected:"+a+"\nActual:"+b);
        if( a == null && b != null)
            throw new AssertionError("Expected:"+a+"\nActual:"+b);

        int n =-1;
        Iterator i = b.iterator();
        for(Object x: a){
            n++;
            Object bi = i.next();
            if( x == null && b == null )
                continue;
            if( ! x.equals(bi)){
                throw new AssertionError("Expected:"+a+"\nActual:"+b);
            }
        }

    }
}
