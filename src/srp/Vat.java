package srp;

public class Vat {

	private float vatRate;

	public Vat(float vatRate) {
		this.vatRate = vatRate;
	}

	public float vat(String billCode, float billAmount) {

		if (billCode.equals("0")) {
			return 0f; // Ez da VAT aplikatzen
		}
		return billAmount * vatRate;

	}

}
