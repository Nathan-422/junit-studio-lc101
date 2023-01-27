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
    public void isTrueWhenGivenOnePairOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void isFalseWhenNotGivenAPairOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void isFalseWhenBracketsGivenOutOfOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void isFalseWhenGivenUnevenNumberOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void isTrueWithBalancedBracketsAndSomeWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello[there]general][kenobi]"));
    }
    @Test
    public void isTrueWithNestedBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[[[][]][]][]][]"));
    }

    @Test
    public void isTrueWithNoBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Some text"));
    }

    @Test
    public void isTrueWhenGivenTwoPairsOfNonNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }


}
