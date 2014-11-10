
import java.util.*;

/**
 * Created by ltregan on 06/11/2014.
 */
public class BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversalRec(TreeNode root) {
        if( root == null)
            return new ArrayList<Integer>();

        List<Integer> result = new ArrayList<Integer>();
        result.add( root.val );
        result.addAll( preorderTraversalRec(root.left) );
        result.addAll(preorderTraversalRec(root.right));
        return result;

    }

    public static List<Integer> preorderTraversalx(TreeNode root) {
        if( root == null)
            return new ArrayList<Integer>();

        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> s = new ArrayDeque<TreeNode>();
        s.add( root );

        while( ! s.isEmpty() ){
            TreeNode pop = s.remove();
            result.add( pop.val );
            if( pop.left != null )
                s.add( pop.left );
            if( pop.right != null )
                s.add( pop.right );
        }

        return result;

    }


    public static List<Integer> preorderTraversal(TreeNode root)
    {
        LinkedList<Integer> integers = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        // start with the root of the tree even if it is null
        stack.push(root);

        while (!stack.empty())
        {
            TreeNode n = stack.pop();
            if (n != null)
            {
                integers.add(n.val);
                stack.push(n.right);
                stack.push(n.left);
            }
        }

        return integers;

    }

}
