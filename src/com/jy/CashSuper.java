package com.jy;

/**
 * 抽象算法类
 * 
 * @author jiangyu
 *
 */
public abstract class CashSuper {
	/**
	 * 最终应该收取多少现金
	 * 
	 * @param money
	 *            不参加任何活动时的总数
	 * @return 通过活动后最后应该收取的现金数
	 */
	public abstract double chargeCash(double money);
}
