package com.leetcoder;

import junit.framework.TestCase;
import toOffer.Question6;

/**
 * Created by hongji on 2017/4/7.
 */
public class Solution5Test extends TestCase {
    String str,str1,str2,str3,str4;
    Solution5 s;
    public void setUp() throws Exception {
        super.setUp();
        s=new Solution5();
        str="babad";
        str1="cbbd";
        str2="abcdasdfghjkldcba";
        str3="abcddcba";
        str4="esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukiv" +
                "lpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuh" +
                "dmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseor" +
                "ykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkv" +
                "svrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetuf" +
                "qvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsy" +
                "afqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnri" +
                "fvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqy" +
                "pyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreel" +
                "nlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkk" +
                "jayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyj" +
                "ziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekk" +
                "mhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcm" +
                "urdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiaf" +
                "jqaionbrjbjksxaezosxqmncejjptcksnoq";
    }

    public void testLongestPalindrome() throws Exception {
        assert (s.longestPalindrome(str).equals("bab")==true);
        assert (s.longestPalindrome(str1).equals("bb")==true);
        assert (s.longestPalindrome(str2).equals("a")==true);

        System.out.println(s.longestPalindrome(str4));
    }

}