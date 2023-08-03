package org.example;

import java.util.ArrayList;
import java.util.List;

//public class Stars {
//    public static void main(String[] args) {
//        int a[] = {2, 5, 8, 9, 5, 10, 7, 9, 8};
//        for (int i = 0; i < a.length; i++) {
//            boolean kk = false;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[ i ] == a[ j ]) {
//                    kk = true;
//                    break;
//                }
//
//            }
//            if (!kk) {
//                System.out.print(a[ i ]);
//            }
//
//
//        }
//    }
//}
public class Stars {
    public static void main(String[] args) {

  int a[] = {2, 5, 8, 9, 5, 10, 7, 9, 8};
        boolean isRepeated;

        for (int i = 0; i < a.length; i++) {
            isRepeated = false;

            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                System.out.print(a[i] + " ");
            }
        }
            }
        }
