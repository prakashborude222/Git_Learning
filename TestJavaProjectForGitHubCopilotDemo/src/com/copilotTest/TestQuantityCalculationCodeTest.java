package com.copilotTest;

import java.text.DecimalFormat;

public class TestQuantityCalculationCodeTest {

public static void main(String[] args) {
	testCalculateProductTotalAmount_ReturnsTwoDecimalPlaces();
}
	
	public static void testCalculateProductTotalAmount_ReturnsTwoDecimalPlaces() {
    double result = TestQuantityCalculationCode.calculateProductTotalAmount("50", "0.58");
    DecimalFormat df = new DecimalFormat("0.00");
    String formattedResult = df.format(result);
    System.out.println("The product total amount is: " + formattedResult);
    
}
}