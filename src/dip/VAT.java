package dip;

public class VAT extends VATAbstract {
	
	public float calcVAT (float billAmount) {
		return  (float) (billAmount * 0.16);
	}
}