package com.leetcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongji on 2017/4/22.
 */
//定义一棵字典树，并且实现插入、查找操作
class Node{
        char content;   //节点的字母值
        boolean isEnd;  //该节点是否是一个单词的结束
        int number;    //以该子母作为单词前缀一部分的单词数量
        List<Node> childList;  //孩子节点的序列，大小不超过字符集
    public Node(char c){
        this.childList=new ArrayList<>();
        this.content=c;
        isEnd=false;
        number=0;
    }
    public Node subNode(char c){
        if(this.childList!=null){
            for(Node temp:this.childList){
                if(temp.content==c)
                    return temp;
            }
        }
        return null;
    }
}
public class Trie {
    Node root;  //根节点
    /** Initialize your data structure here. */
    public Trie() {
        root=new Node('/');  //初始化根节点
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word==null)
            return;
        int wordLen=word.length();
        if(wordLen==0)
            return;
        char []wordArr=word.toCharArray();
        Node tempNode=root;
        for(int i=0;i<wordLen && Character.isLetter(wordArr[i]);i++){   //只能插入小写字母
            if(tempNode.subNode(wordArr[i])==null){
                Node newNode=new Node(wordArr[i]);
                newNode.number=1;
                if(i==wordLen-1)
                    newNode.isEnd=true;
                tempNode.childList.add(newNode);
                tempNode=newNode;
            }else{
                Node oldNode=tempNode.subNode(wordArr[i]);
                oldNode.number++;
                tempNode=oldNode;
            }
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word!=null) {
            char wordArr[] = word.toCharArray();
            int wordLen=word.length();
//            if(wordLen==0)
//                return false;
            Node tempRoot=root;
            for(int i=0;i<wordLen;i++){
                if(tempRoot.subNode(wordArr[i])!=null){
                        tempRoot = tempRoot.subNode(wordArr[i]);
                    }
                }
            return tempRoot.isEnd;
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix!=null) {
            char wordArr[] = prefix.toCharArray();
            int wordLen=prefix.length();
//            if(wordLen==0)
//                return false;
            Node tempRoot=root;
            for(int i=0;i<wordLen;i++){
                if(tempRoot.subNode(wordArr[i])!=null){
                    tempRoot=tempRoot.subNode(wordArr[i]);
                }else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
