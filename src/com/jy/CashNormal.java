package com.jy;

/**
 * 不参加任何活动的具体算法类
 * 
 * @author jiangyu
 *
 */
public class CashNormal extends CashSuper {

	@Override
	public double chargeCash(double money) {
		return money;
	}

}
