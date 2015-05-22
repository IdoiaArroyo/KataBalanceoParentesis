import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalanceStringTest {

    @Test
    public void TestCase1() {
        String input = "(0.0)";
        assertTrue( new BalanceableString(input).isBalanced());
    }

    @Test
    public void TestCase2() {
        String input = "(((0.0)))";
        assertTrue( new BalanceableString(input).isBalanced());
    }
    @Test
    public void TestCase3() {
        String input = ")(0.0)";
        assertFalse(new BalanceableString(input).isBalanced());
    }
    @Test
    public void TestCase4() {
        String input = "(0.(0))";
        assertTrue(new BalanceableString(input).isBalanced());
    }
    @Test
    public void TestCase5() {
        String input = "(0.(0)";
        assertFalse( new BalanceableString(input).isBalanced());
    }
    @Test
    public void TestCase6() {
        String input = "(0.0)(";
        assertFalse( new BalanceableString(input).isBalanced());
    }

}
