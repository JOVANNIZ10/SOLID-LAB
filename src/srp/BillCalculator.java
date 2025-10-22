package srp;

public class BillCalculator {
	private BillDeduction billDeduction=new BillDeduction();
	private BillTotal billTotal=new BillTotal();
	private Vat vat=new Vat(0.18f);
	public void calculate (Bill bill) {
		bill.billDeduction=billDeduction.billDeduction(bill.billAmount, bill.deductionPercentage);
		bill.VAT=vat.vat(bill.code, bill.billAmount);
		bill.billTotal=billTotal.billTotal(bill.billAmount, bill.billDeduction, bill.VAT);
	}
}
