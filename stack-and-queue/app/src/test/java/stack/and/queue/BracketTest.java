package stack.and.queue;
import org.junit.Test;
import stack.and.queue.brackets.validateBrackets;

import static org.junit.Assert.*;

public class BracketTest {



        @Test
        public void testBracketCheckTrue() {

            assertTrue(validateBrackets.BracketCheck(" [][]"));
        }
        @Test
        public void testBracketCheckFalse() {

            assertFalse(validateBrackets.BracketCheck(" {[}]"));
        }


    }

