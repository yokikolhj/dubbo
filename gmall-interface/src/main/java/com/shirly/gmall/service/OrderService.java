package com.shirly.gmall.service;

import java.util.List;

import com.shirly.gmall.bean.UserAddress;

/**
* @author shirly
* @CreateTime 2019年8月7日 上午11:04:31
* @description 
*/
public interface OrderService {
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);
}
