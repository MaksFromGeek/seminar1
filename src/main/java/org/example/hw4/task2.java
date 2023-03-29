package org.example.hw4;

/**
 * 2) 20. Допустимые скобки с leetcode.com
 * Дана строка строки, содержащая только символы '(', ')', '{', '}', '[' и ']',
 * определите, является ли входная строка допустимой.
 */
public class task2 {
    public static void main(String[] args) {
        String s = "(}[]{}"; // указываем входные данные
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i += 2) {
            if (charArray[i] == '(' && charArray[i + 1] != ')') {
                return false;
            } else if (charArray[i] == '[' && charArray[i + 1] != ']') {
                return false;
            } else if (charArray[i] == '{' && charArray[i + 1] != '}') {
                return false;
            }
        }
        return true;
    }
}
