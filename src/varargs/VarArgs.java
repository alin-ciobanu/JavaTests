package varargs;

import java.math.BigDecimal;

public class VarArgs {

	public static BigDecimal sum (BigDecimal... args) {

		BigDecimal sum = new BigDecimal(0);

		for (BigDecimal current : args) {
			sum = sum.add(current);
		}

		return sum;

	}

	public static void main(String[] args) {

		BigDecimal sum = VarArgs.sum(new BigDecimal(1), new BigDecimal(2), new BigDecimal(3), new BigDecimal(4),
				new BigDecimal(5), new BigDecimal(6), new BigDecimal(7), new BigDecimal(8));

		System.out.println(sum);

	}

}
