public class BalanceableString implements BalanceableStream{
    private final String data;

    public BalanceableString(String input) {
        this.data = input;
    }

    @Override
    public BalanceableUnit get(int index) {
        return new BalanceableChar(data.charAt(index));
    }

    @Override
    public boolean isBalanced() {

        int count =0;

        for (int i = 0; i < data.length(); i++) {
            if (get(i).isClosed()) count--;
            if (get(i).isOpen()) count++;

            if (count<0) return false;
        }

        return 0 == count;
    }
}
