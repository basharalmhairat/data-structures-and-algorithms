package stack.and.queue.brackets;

import stack.and.queue.stack;

public class validateBrackets {
    public static boolean BracketCheck(String input){

        stack<String> Brackets = new stack<>();

        String[] inputSplit = input.split("");
        for (String s : inputSplit) {

            switch (s) {case "(": Brackets.push(s);
                    break;
                case "[": Brackets.push(s);
                    break;
                case "{": Brackets.push(s);
                    break;
                case ")": {String peeked = Brackets.peek();
                    if (peeked.equals("(")) {Brackets.pop();} else {return false;}
                    break;
                }
                case "]": {String peeked = Brackets.peek();

                    if (peeked.equals("[")) {Brackets.pop();} else {return false;}
                    break;
                }
                case "}": {String peeked = Brackets.peek();

                    if (peeked.equals("{")) {Brackets.pop();} else {return false;}
                    break;
                }
            }
        }
        return Brackets.toString() != null;
    }
}
