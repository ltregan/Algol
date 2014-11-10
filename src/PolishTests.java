import junit.framework.Test;
import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

/**
 * Created by ltregan on 23/10/2014.
 */
public class PolishTests {

    @org.junit.Test
    public void testOne() {
        assertEquals(1, Polish.calc(new String[]{"1"}));
        assertEquals(3, Polish.calc(new String[]{"1", "2", "+"}));
        assertEquals(9, Polish.calc(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, Polish.calc(new String[]{"4", "13", "5", "/", "+"}));

    }

    @org.junit.Test
    public void testTwo() {
        assertEquals(true, Palindrom.isPalindrom(""));
        assertEquals(true, Palindrom.isPalindrom("A"));
        assertEquals(true, Palindrom.isPalindrom("AA"));
        assertEquals(false, Palindrom.isPalindrom("XABBAY"));
        assertEquals(true, Palindrom.isPalindrom("XABBAX"));
        assertEquals(true, Palindrom.isPalindrom("XABZBAX"));
        assertEquals(false, Palindrom.isPalindrom("XABZYBAX"));
        assertEquals(false, Palindrom.isPalindrom("ABB"));


        assertEquals("", Palindrom.longestPalindrome(""));
        assertEquals("A", Palindrom.longestPalindrome("A"));
        assertEquals("AA", Palindrom.longestPalindrome("AA"));
        assertEquals("BB", Palindrom.longestPalindrome("ABB"));
        assertEquals("ABBA", Palindrom.longestPalindrome("ABBA"));
        assertEquals("ABBA", Palindrom.longestPalindrome("XABBAY"));
        assertEquals("AYZZYA", Palindrom.longestPalindrome("XABBAYZZYA"));
    }


    @org.junit.Test
    public void testDynamic() {
        assertEquals("", PalindromDynamic.longestPalindrome(""));
        assertEquals("A", PalindromDynamic.longestPalindrome("A"));
        assertEquals("AA", PalindromDynamic.longestPalindrome("AA"));
        assertEquals("BB", PalindromDynamic.longestPalindrome("ABB"));
        assertEquals("ABBA", PalindromDynamic.longestPalindrome("ABBA"));
        assertEquals("ABBA", PalindromDynamic.longestPalindrome("XABBAY"));
        assertEquals("AYZZYA", PalindromDynamic.longestPalindrome("XABBAYZZYA"));
        assertEquals("AYZZYA", PalindromDynamic.longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        assertEquals("AYZZYA", PalindromDynamic.longestPalindrome("321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123"));

    }


    @org.junit.Test
    public void testWordBreak() {
        java.util.Set<String> s = new java.util.HashSet<String>();
        s.add( "leet"); s.add("code");

        assertEquals(true, WordBreak.wordBreak("", s));
        assertEquals(true, WordBreak.wordBreak("leet", s));
        assertEquals(true, WordBreak.wordBreak("leetcode", s));
        assertEquals(false, WordBreak.wordBreak("leetxcode", s));

        System.out.println("----------");
        s.clear();
        s.add("a"); s.add("abc"); s.add("b");s.add("cd");
        assertEquals(true, WordBreak.wordBreak("abcd", s));


        s.clear();
        s.add("a");
        s.add("aa");
        s.add("aaa");
        s.add("aaaa");
        s.add("aaaaa");
        s.add("aaaaaa");
        s.add("aaaaaaa");
        s.add("aaaaaaaa");
        s.add("aaaaaaaaa");
        s.add("aaaaaaaaaa");
        Assert.assertEquals(false, WordBreak.wordBreak( "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", s ));


        s.clear();
        s.add("programcree");
        s.add("program");
        s.add("creek");
        Assert.assertEquals(true, WordBreak.wordBreak( "programcreek", s ));
    }

    @org.junit.Test
    public void testMatches() {
        assertEquals(true, Matches.isMatch("", ""));
        assertEquals(true, Matches.isMatch("bbbba", ".*a*a"));
        assertEquals(false, Matches.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c"));
        assertEquals(true, Matches.isMatch("a", "a"));
        assertEquals(false, Matches.isMatch("a", "a."));
        assertEquals(true, Matches.isMatch("a", "*"));
        assertEquals(true, Matches.isMatch("", "b*"));
        assertEquals(true, Matches.isMatch("", "*"));
        assertEquals(true, Matches.isMatch("abbbbxxxxxxxxx", "*"));
        assertEquals(true, Matches.isMatch("a", "a*"));
        assertEquals(true, Matches.isMatch("ab", "ab*"));
        assertEquals(true, Matches.isMatch("a", "ab*"));
        assertEquals(false, Matches.isMatch("aaa", "aa"));
        assertEquals(true, Matches.isMatch("aaa", ".*"));
        assertEquals(true, Matches.isMatch("aab", "c*a*b"));
        assertEquals(true, Matches.isMatch("aab", "a*a*b"));

    }

    @org.junit.Test
    public void testBinaryTreePreorderTraversal() {

        TreeNode n = new TreeNode(2);
        n.left = new TreeNode(1);
        n.right = new TreeNode(3);

       AssertCollection.assertEquals(new int[0], BinaryTreePreorderTraversal.preorderTraversal(null));
       AssertCollection.assertEquals(new int[]{2, 1, 3}, BinaryTreePreorderTraversal.preorderTraversal(n));


    }


    @org.junit.Test
    public void testFourSum() {


        List<List<Integer>> x = FourSum.fourSum(new int[]{1, 0, -1, 0 ,-2, 2}, 0);
        AssertCollection.assertEquals( new int[]{-1,0,0,-1}, x.get(0) );
        AssertCollection.assertEquals( new int[]{-2,-1,1,2}, x.get(1) );
        AssertCollection.assertEquals( new int[]{-2,0,0,2}, x.get(2) );



    }


}
