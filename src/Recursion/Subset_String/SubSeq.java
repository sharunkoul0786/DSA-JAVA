package Recursion.Subset_String;

import java.util.ArrayList;

//sub sequence is for Strings
public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subseqArrayList("", "abc"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqArrayList(p + ch, up.substring(1));
        ArrayList<String> right = subseqArrayList(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseqascii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqascii(p + ch, up.substring(1));
        ArrayList<String> right = subseqascii(p, up.substring(1));
        ArrayList<String> third = subseqascii(p + (ch + 0), up.substring(1));

        left.addAll(right);
        left.addAll(third);
        return left;
    }
}
