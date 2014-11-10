import junit.framework.Test;
import org.junit.Assert;

/**
 * Created by ltregan on 23/10/2014.
 */
public class PolishTests {

    @org.junit.Test
    public void testOne() {
        Assert.assertEquals(1, Polish.calc(new String[]{"1"}));
        Assert.assertEquals(3, Polish.calc(new String[]{"1", "2", "+"}));
        Assert.assertEquals(9, Polish.calc(new String[]{"2", "1", "+", "3", "*"}));
        Assert.assertEquals(6, Polish.calc(new String[]{"4", "13", "5", "/", "+"}));

    }

    @org.junit.Test
    public void testTwo() {
        Assert.assertEquals(true, Palindrom.isPalindrom(""));
        Assert.assertEquals(true, Palindrom.isPalindrom("A"));
        Assert.assertEquals(true, Palindrom.isPalindrom("AA"));
        Assert.assertEquals(false, Palindrom.isPalindrom("XABBAY"));
        Assert.assertEquals(true, Palindrom.isPalindrom("XABBAX"));
        Assert.assertEquals(true, Palindrom.isPalindrom("XABZBAX"));
        Assert.assertEquals(false, Palindrom.isPalindrom("XABZYBAX"));
        Assert.assertEquals(false, Palindrom.isPalindrom("ABB"));


        Assert.assertEquals("", Palindrom.longestPalindrome(""));
        Assert.assertEquals("A", Palindrom.longestPalindrome("A"));
        Assert.assertEquals("AA", Palindrom.longestPalindrome("AA"));
        Assert.assertEquals("BB", Palindrom.longestPalindrome("ABB"));
        Assert.assertEquals("ABBA", Palindrom.longestPalindrome("ABBA"));
        Assert.assertEquals("ABBA", Palindrom.longestPalindrome("XABBAY"));
        Assert.assertEquals("AYZZYA", Palindrom.longestPalindrome("XABBAYZZYA"));
    }


    @org.junit.Test
    public void testDynamic() {
        Assert.assertEquals("", PalindromDynamic.longestPalindrome(""));
        Assert.assertEquals("A", PalindromDynamic.longestPalindrome("A"));
        Assert.assertEquals("AA", PalindromDynamic.longestPalindrome("AA"));
        Assert.assertEquals("BB", PalindromDynamic.longestPalindrome("ABB"));
        Assert.assertEquals("ABBA", PalindromDynamic.longestPalindrome("ABBA"));
        Assert.assertEquals("ABBA", PalindromDynamic.longestPalindrome("XABBAY"));
        Assert.assertEquals("AYZZYA", PalindromDynamic.longestPalindrome("XABBAYZZYA"));
        Assert.assertEquals("AYZZYA", PalindromDynamic.longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        Assert.assertEquals("AYZZYA", PalindromDynamic.longestPalindrome("321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123"));

    }


    @org.junit.Test
    public void testWordBreak() {
        java.util.Set<String> s = new java.util.HashSet<String>();
        s.add( "leet"); s.add("code");

        Assert.assertEquals(true, WordBreak.wordBreak( "", s ));
        Assert.assertEquals(true, WordBreak.wordBreak( "leet", s ));
        Assert.assertEquals(true, WordBreak.wordBreak( "leetcode", s ));
        Assert.assertEquals(false, WordBreak.wordBreak( "leetxcode", s ));

        System.out.println("----------");
        s.clear();
        s.add("a"); s.add("abc"); s.add("b");s.add("cd");
        Assert.assertEquals(true, WordBreak.wordBreak( "abcd", s ));


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
        Assert.assertEquals(true, Matches.isMatch( "", "" ));
        Assert.assertEquals(true, Matches.isMatch( "bbbba", ".*a*a" ));
        Assert.assertEquals(false, Matches.isMatch( "aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*c" ));
        Assert.assertEquals(true, Matches.isMatch( "a", "a" ));
        Assert.assertEquals(false, Matches.isMatch( "a", "a." ));
        Assert.assertEquals(true, Matches.isMatch( "a", "*" ));
        Assert.assertEquals(true, Matches.isMatch( "", "b*" ));
        Assert.assertEquals(true, Matches.isMatch( "", "*" ));
        Assert.assertEquals(true, Matches.isMatch( "abbbbxxxxxxxxx", "*" ));
        Assert.assertEquals(true, Matches.isMatch( "a", "a*" ));
        Assert.assertEquals(true, Matches.isMatch( "ab", "ab*" ));
        Assert.assertEquals(true, Matches.isMatch( "a", "ab*" ));
        Assert.assertEquals(false, Matches.isMatch( "aaa", "aa" ));
        Assert.assertEquals(true, Matches.isMatch( "aaa", ".*" ));
        Assert.assertEquals(true, Matches.isMatch("aab", "c*a*b"));
        Assert.assertEquals(true, Matches.isMatch("aab", "a*a*b"));

    }

    @org.junit.Test
    public void testBinaryTreePreorderTraversal() {
        TreeNode n = new TreeNode(2);
        n.left = new TreeNode(1);
        n.right = new TreeNode(3);

        AssertCollection.assertEquals( 1 );


        AssertCollection.assertEquals( new int[]{}, BinaryTreePreorderTraversal.preorderTraversal(null) );
        AssertCollection.assertEquals( new int[]{1,2,3}, BinaryTreePreorderTraversal.preorderTraversal(n) );

    }


}
