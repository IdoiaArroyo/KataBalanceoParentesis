public class BalanceableString extends BalanceableStream {
    private final String data;

    public BalanceableString(String input) {
        this.data = input;
    }

    @Override
    public BalanceableUnit get(int index) {
        return new BalanceableChar(data.charAt(index));
    }

    @Override
    public int size() {
        return data.length();
    }


}
