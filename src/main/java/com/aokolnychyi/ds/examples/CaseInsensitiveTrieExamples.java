package com.aokolnychyi.ds.examples;

import com.aokolnychyi.ds.trie.CaseInsensitiveTrie;

public class CaseInsensitiveTrieExamples {

  public static void main(String[] args) {
    final CaseInsensitiveTrie trie = new CaseInsensitiveTrie();
    trie.addWord("Afterwards");
    trie.addWord("Liverpool");
    trie.addWord("Afterparty");
    trie.addWord("Live");
    trie.addWord("Most");
    trie.addWord("Lile");

    System.out.println("Contains");
    System.out.println(trie.contains("Lile"));
    System.out.println(trie.contains("Lily"));
    System.out.println(trie.contains("Lil"));

    System.out.println("Words with prefix Li");
    System.out.println(trie.getWordsWithPrefix("Li"));

    System.out.println("Words with prefix After");
    System.out.println(trie.getWordsWithPrefix("After"));

  }
}