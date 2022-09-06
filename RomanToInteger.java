// Roman To Integer
// Roman numericals are represented by seven different symbols:
// I, V, X, L, C, D and M is 1, 5, 10, 50, 100, and 1000 respectively.
// For example: 2 is written as II in Roman numericals, just two one's added together , 12 is XII, which is simply
// X + II. Roman numeriacls are usually written largest to smallest from left to right. And numerical of $ is IV. 
// As I before V we subtract it making four. Same case is with IX. Given roman numerical convert it to an integer.
// Input: S = "IX"
// Output: 9

import java.util.*;

class RomanToInteger {
    public static int romanToInt(String S) {
        int answer = 0;
        int num = 0;

        for (int i = S.length() - 1; i >= 0; i--) {

            switch (S.charAt(i)) {

                case 'I':
                    num = 1;
                    break;

                case 'V':
                    num = 5;
                    break;

                case 'X':
                    num = 10;
                    break;

                case 'L':
                    num = 50;
                    break;

                case 'C':
                    num = 100;
                    break;

                case 'D':
                    num = 500;
                    break;

                case 'M':
                    num = 1000;
                    break;
            }

            if (4 * num < answer) {
                answer -= num;
            } 
            
            else {
                answer += num;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = romanToInt(str);
        System.out.println(ans);
        sc.close();
    }
}