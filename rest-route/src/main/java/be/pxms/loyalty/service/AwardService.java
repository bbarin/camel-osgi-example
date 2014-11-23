/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.pxms.loyalty.service;

import be.pxms.loyalty.Award;

/**
 *
 * @author id835238
 */
public class AwardService {

	public Award getAward(String id) {
		final Award award = new Award();
		award.setId(id);
		award.setInStock(true);
		return award;
	}
}
