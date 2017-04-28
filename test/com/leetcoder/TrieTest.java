package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/22.
 */
public class TrieTest extends TestCase {
    Trie testTrie;
    String str;
    String str1;
    public void setUp() throws Exception {
        super.setUp();
        testTrie=new Trie();
        str="hello";
        str1="hi";
    }

    public void testInsert() throws Exception {
        testTrie.insert(str);
        testTrie.insert(str1);
    }

    public void testSearch() throws Exception {
        testTrie.insert(str);
        testTrie.insert(str1);
        testTrie.insert("abc");
        System.out.println(testTrie.search("hello"));
        System.out.println(testTrie.search("hi"));
        System.out.println(testTrie.search(""));
        System.out.println(testTrie.search(null));
        System.out.println(testTrie.search("he"));
        System.out.println(testTrie.search("ab"));
        System.out.println(testTrie.search("abc"));
    }

    public void testStartsWith() throws Exception {
        testTrie.insert(str);
        testTrie.insert(str1);
        testTrie.insert("abc");
        System.out.println(testTrie.startsWith("hello"));
        System.out.println(testTrie.startsWith("hi"));
        System.out.println(testTrie.startsWith(""));
        System.out.println(testTrie.startsWith(null));
        System.out.println(testTrie.startsWith("him"));
        System.out.println(testTrie.startsWith("ab"));
        System.out.println(testTrie.startsWith("abc"));

    }

}