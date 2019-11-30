package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void missingRtBracketReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[Launch"));
    }

    @Test
    public void missingLtBracketReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("Launch]"));
    }

    @Test
    public void missingBothBracketsReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertEquals(false, test_Class.hasBalancedBrackets("Launch"));
    }

    @Test
    public void missingLtBracketFirst() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertEquals(false, test_Class.hasBalancedBrackets("La]unch"));
    }
}
