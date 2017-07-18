package com.jy;

public class StrategyPattern {
	// 不同的具体策略算法类
	private static final int CASH_NORMAL = 0x1;
	private static final int CASH_DISCOUNT = 0x2;
	private static final int CASH_RETURN = 0x3;

	public static void main(String[] args) {
		CashContext cashContext = null;
		double inputCost = 500.0;

		// 原价
		cashContext = new CashContext(CASH_NORMAL, 0, 0, 0);
		System.out.println("原价:￥" + inputCost + ";" + "折扣后应收:￥" + cashContext.getResult(inputCost));

		// 打折
		cashContext = new CashContext(CASH_DISCOUNT, 0.8, 0, 0);
		System.out.println("原价:￥" + inputCost + ";" + "折扣后应收:￥" + cashContext.getResult(inputCost));

		// 满减
		cashContext = new CashContext(CASH_RETURN, 0, 200, 100);
		System.out.println("原价:￥" + inputCost + ";" + "折扣后应收:￥" + cashContext.getResult(inputCost));

	}

}
