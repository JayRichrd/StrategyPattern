package com.jy;

public class StrategyPattern {

	public static void main(String[] args) {
		CashContext cashContext = null;
		// 原价
		double inputCost = 500.0;

		// 打折
		cashContext = new CashContext(new CashDiscount(0.8));
		System.out.println("原价:￥" + inputCost + ";" + "打折后应收:￥" + cashContext.getResult(inputCost));

		// 满减
		cashContext = new CashContext(new CashReturn(200, 100));
		System.out.println("原价:￥" + inputCost + ";" + "满减后应收:￥" + cashContext.getResult(inputCost));

	}

}
