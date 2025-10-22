package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	private BillDeduction billDeductionClass=new BillDeduction();
	private BillTotal billTotalClass=new BillTotal();
	private Vat vatClass=new Vat();
	
	public void totalCalc() {
		billDeduction=billDeductionClass.billDeduction(billAmount, deductionPercentage);
		VAT=vatClass.vat(billAmount);
		billTotal=billTotalClass.billTotal(billAmount, billDeduction, VAT);
	}
}
