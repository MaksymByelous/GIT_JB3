package Lesson10;

import static java.lang.System.*;

public class CaesarAlgorithm {
    public static StringBuilder encodeString(StringBuilder string) {
        String alphabet = new String("0123456789 ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.,");
        String codedAlphabet = new String("JKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.,0123456789 ABCDEFGHI");

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (string.charAt(i) == alphabet.charAt(j)) {
                    string.setCharAt(i, codedAlphabet.charAt(j));
                    break;
                }
            }
        }
        System.out.println("encoded string: " + string);
        return string;
    }

    public static StringBuilder decodeString(StringBuilder string) {
        String alphabet = new String("0123456789 ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.,");
        String codedAlphabet = new String("JKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.,0123456789 ABCDEFGHI");

        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < codedAlphabet.length(); j++) {
                if (string.charAt(i) == codedAlphabet.charAt(j)) {
                    string.setCharAt(i, alphabet.charAt(j));
                    break;
                }
            }
        }
        System.out.println("decoded string: " + string);
        return string;
    }
}