package com.jy;

/**
 * 上下文
 * 
 * @author jiangyu
 *
 */
public class CashContext {
	// 不同的具体策略算法类
	private static final int CASH_NORMAL = 0x1;
	private static final int CASH_DISCOUNT = 0x2;
	private static final int CASH_RETURN = 0x3;
	// 抽象策略
	private CashSuper mCashSuper;

	/**
	 * 带参数的构造函数
	 * 
	 * @param type
	 *            活动类型
	 * @param rateDiscount
	 *            打折比例
	 * @param moneyCondition
	 *            返现活动满额
	 * @param moneyReturn
	 *            返现活动返额
	 */
	public CashContext(int type, double rateDiscount, int moneyCondition, int moneyReturn) {
		super();
		switch (type) {
		case CASH_NORMAL: // 正常情况
			mCashSuper = new CashNormal();
			break;
		case CASH_DISCOUNT: // 打折活动
			mCashSuper = new CashDiscount(rateDiscount);
			break;
		case CASH_RETURN: // 返现活动
			mCashSuper = new CashReturn(moneyCondition, moneyReturn);
			break;
		default:
			break;
		}
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
