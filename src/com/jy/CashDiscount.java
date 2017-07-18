package com.jy;

/**
 * 打折算法具体算法类
 * 
 * @author jiangyu
 *
 */
public class CashDiscount extends CashSuper {
	// 打折比例
	private double rateDiscount;

	public CashDiscount(double rateDiscount) {
		super();
		this.rateDiscount = rateDiscount;
	}

	@Override
	public double chargeCash(double money) {
		return money * rateDiscount;
	}

}
