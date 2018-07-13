package wtyDemo;

import java.util.Stack;

public class Day0607 {
    public static void main(String[] args) {
        String s = "({})";
        boolean flag = isValid(s);
        System.out.println(s);
        System.out.println(flag);
        System.out.println("===============================================");
    }

    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }

        //创建一个栈对象
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        Character pop = null;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop != '(') {
                        return false;
                    }
                    break;
                case '}':

                    pop = stack.pop();
                    if (pop != '{') {
                        return false;
                    }
                    break;
                case ']':

                    pop = stack.pop();
                    if (pop != '[') {
                        return false;
                    }
                    break;


            }


        }
        if (stack.size() == 1) {
            return true;
        }
        return false;
    }
}
