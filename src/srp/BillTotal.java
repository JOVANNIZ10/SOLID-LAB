package srp;

import java.util.Date;

public class BillTotal {
	public float billTotal(float billAmount, float billDeduction, float vat) {
		return (billAmount - billDeduction) + vat;
	}
	
	

}
