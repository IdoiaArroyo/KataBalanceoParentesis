public class BalanceableChar implements BalanceableUnit {
    private final char data;

    public BalanceableChar(char c) {
        this.data = c;
    }

    @Override
    public boolean isOpen() {
        return data == '(';
    }

    @Override
    public boolean isClosed() {
        return data == ')';
    }
}
