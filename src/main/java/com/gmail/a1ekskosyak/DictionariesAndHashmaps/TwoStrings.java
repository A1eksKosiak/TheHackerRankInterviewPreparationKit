package com.gmail.a1ekskosyak.DictionariesAndHashmaps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Character[] ch1 = s1.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Character[] ch2 = s2.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        for (Character element : ch1) {
            set1.add(element);
        }
        for (Character element : ch2) {
            set2.add(element);
        }

        for (Iterator<Character> it = set2.iterator(); it.hasNext(); ) {
            Character chr = it.next();
            if (set1.contains(chr)) {
                return "YES";
            }
        }
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            System.out.print(result);
            System.out.println();
        }

        scanner.close();
    }
}
