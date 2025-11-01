package dip;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc(BillDeductionAbstract bda, VATAbstract va) {
	    billDeduction = bda.calcBillDeduction (billAmount, deductionPercentage);
	    VAT= va.calcVAT (billAmount);
	    billTotal = (billAmount - billDeduction) + VAT;
	    
	}
}