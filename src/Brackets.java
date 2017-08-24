
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drabkov
 */
public class Brackets {
    
    //create map 
    static Map<Character, Character> oposites = new HashMap<>();
    //fiil map
    static {
        oposites.put('{','}');
        oposites.put('[',']');
        oposites.put('(',')');
    }
    public int solution(String S) {
        //create qeque
        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : S.toCharArray()) {
            if (oposites.keySet().contains(c)) {
                stack.addFirst(c);
            } else {
                Character closed = stack.pollFirst();
                if (!c.equals(oposites.get(closed))) {
                    return 0;
                }
            }
        }
        return 0 == stack.size() ? 1 : 0;
    }
    
    public static void main(String[] args) {
        Brackets s = new Brackets();
        s.solution("{[()()]}");
        s.solution("([)()]");

    }
}
