public class ValidParenthesis {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> parenthesis = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (
                    parenthesis.isEmpty() &&
                            (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            ) return false; else {
                if (!parenthesis.isEmpty()) {
                    if (
                            parenthesis.peek() == '(' && s.charAt(i) == ')'
                    ) parenthesis.pop(); else if (
                            parenthesis.peek() == '{' && s.charAt(i) == '}'
                    ) parenthesis.pop(); else if (
                            parenthesis.peek() == '[' && s.charAt(i) == ']'
                    ) parenthesis.pop(); else parenthesis.add(s.charAt(i));
                } else parenthesis.add(s.charAt(i));
            }
        }
        return parenthesis.isEmpty();
    }
}

/*
Synopsis:

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Thought process:
- The final character in string s must be the end of a parenthesis either ) , ] , }
- The string s must have an even number of characters (length must be divided by 2 without remainder)
- Use a stack to keep track of the parenthesis that were taken care of

How the code works:
1. Checks edge cases for if length of s is not divisble by 2 with modulo function
2. Create an empty stack called parenthesis
3. Single for loop iterating through the characters in string s first checks if the stack is empty and if there's still a remaining closed parenthesis. This will return false if conditions are met.
4. If the paranthesis is NOT empty, check top of the stack with the peek method. If the top of the stack has a matched closed parenthesis with the character we're looping through currently, pop the stack and continue on with the loop.
5. If the parenthesis is NOT empty and there isn't a matching parenthesis, add the current character to the stack.
6. If the parenthesis is empty and condition 3 isn't met, add the current character to the stack.
7. return parenthesis.isEmpty() which will be true if it's actually empty.
*/

