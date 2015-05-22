
abstract class BalanceableStream implements Balanceable {
	abstract BalanceableUnit get(int index);
	abstract int	size();

	@Override
	public boolean isBalanced() {

		int count =0;

		for (int i = 0; i < size(); i++) {
			if (get(i).isClosed()) count--;
			if (get(i).isOpen()) count++;

			if (count<0) return false;
		}

		return 0 == count;
	}
}
