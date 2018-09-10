package com.gmail.a1ekskosyak.dictionaries.and.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RansomNote {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> magazineMap = new HashMap();
        HashMap<String, Integer> noteMap = new HashMap();
        for (String line : magazine) {
            if (magazineMap.containsKey(line)) {
                magazineMap.replace(line, magazineMap.get(line) + 1);
            } else {
                magazineMap.put(line, 1);
            }
        }

        for (String line : note) {
            if (noteMap.containsKey(line)) {
                noteMap.replace(line, noteMap.get(line) + 1);
            } else {
                noteMap.put(line, 1);
            }
        }

        Set<String> set = noteMap.keySet();
        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String str = it.next();
            if (!magazineMap.containsKey(str) || magazineMap.get(str) < noteMap.get(str)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
