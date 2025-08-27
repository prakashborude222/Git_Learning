package com.copilotTest;

import java.text.DecimalFormat;

public class TestQuantityCalculationCode {

	public static void main(String[] args) {
		String expiry = "1224";
		DecimalFormat df = new DecimalFormat("0.00");

		long QytPrice = 0;
		Double QyntityPriceAmt = 0.00;
		QyntityPriceAmt = Double.parseDouble("0.58");

		QyntityPriceAmt = QyntityPriceAmt * 100;
		QytPrice = (long) Double.parseDouble(df.format(QyntityPriceAmt));
		String QyantityPriceafterConvert = String.valueOf(QytPrice);
		System.out.println("Amount Is :" + QyantityPriceafterConvert);
		// QyantityPriceafterConvert =
		// Utilities.rightJustifyZeroFill(QyantityPriceafterConvert,10);

		double quantity = Double.parseDouble("50");
		double perProductprice = Double.parseDouble("0.58");
		QyntityPriceAmt = quantity * perProductprice;

		QyantityPriceafterConvert = String.valueOf(QyntityPriceAmt);

		long QytPrice123 = (long) Double.parseDouble(df.format(Double.parseDouble(QyantityPriceafterConvert)));

		System.out.println("QyantityPriceafterConvert: " + QyantityPriceafterConvert);

	}

	public static double calculateProductTotalAmount(String quantity, String productUnitPrice) {
		double quantityDouble = Double.parseDouble(quantity);
		double perProductprice = Double.parseDouble(productUnitPrice);
		double QyntityPriceAmt = quantityDouble * perProductprice;
		System.out.println("Amount : " + QyntityPriceAmt);

		return QyntityPriceAmt;

	}
}
