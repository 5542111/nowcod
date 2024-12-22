package com.luwis.code;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    Map<Character, Trie> children;

    public Trie() {
        children = new HashMap<>();
    }
}
