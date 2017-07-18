package com.jy;

/**
 * 上下文
 * 
 * @author jiangyu
 *
 */
public class CashContext {
	// 抽象策略
	private CashSuper mCashSuper;

	public CashContext(CashSuper mCashSuper) {
		super();
		this.mCashSuper = mCashSuper;
	}

	/**
	 * 根据总金额，返回应该收取的金额
	 * 
	 * @param money
	 *            不参加任何活动总共花费的金额
	 * @return 根据总金额，返回应该收取的金额
	 */
	public double getResult(double money) {
		return mCashSuper.chargeCash(money);
	}

}
