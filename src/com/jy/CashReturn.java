package com.jy;

/**
 * 满减具体算法类
 * 
 * @author jiangyu
 *
 */
public class CashReturn extends CashSuper {
	// 满减的满额数
	private int moneyCondition;
	// 满减的返现数
	private int moneyReturn;

	public CashReturn(int moneyCondition, int moneyReturn) {
		super();
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double chargeCash(double money) {
		double result = money;
		if (money > moneyCondition) {
			result = money - moneyReturn * (int) (money / moneyCondition);
		}
		return result;
	}

}
