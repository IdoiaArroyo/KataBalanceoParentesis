
public interface BalanceableStream extends Balanceable {
	BalanceableUnit get(int index);
	int	size();
}
