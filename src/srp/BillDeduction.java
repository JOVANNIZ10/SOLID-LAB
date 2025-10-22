package srp;

public class BillDeduction {
	public float billDeduction(float billAmount, int deductionPercentage) {

		if (billAmount > 50000) {
			return (billAmount * deductionPercentage + 5) / 100f;
		} else {
			return (billAmount * deductionPercentage) / 100f;
		}

	}
}
