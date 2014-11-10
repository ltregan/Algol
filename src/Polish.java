import java.util.Stack;

/**
 * Created by ltregan on 23/10/2014.
 */
public class Polish {

    static public int calc( String args[]){
        System.out.println("----------");
        Stack<Integer> s = new Stack<Integer>();
        for( int n=0; n< args.length; n++){
            String arg = args[n];
            if( arg.matches("[0-9]*") ){
                System.out.println("parse="+arg);
                s.push(Integer.parseInt(arg));
                continue;
            }
            int a = s.pop();
            int b = s.pop();
            if( arg.equals("+") )
                s.push( a + b);
            else if( arg.equals("*"))
                s.push(a * b);
            else if( arg.equals("-"))
                s.push( a - b);
            else if( arg.equals("/"))
                s.push( b / a);
            else
                throw new IllegalArgumentException("unknown operator "+s);
        }
        if( s.size() > 1)
            throw new IllegalArgumentException("stack is not empty; missing operator");

        return s.pop();

    }
}
