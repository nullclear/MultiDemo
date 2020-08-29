/**
 * 
 */
package com.yxy.model;

/** 
 * @ClassName ExModelMap
 * @Description 
 * @author Nuclear
 */
public class ExModelMap extends ModelMap implements Model{

	@Override
	public ExModelMap Add(String username, String userid) {
		super.Add(username, userid);
		return this;
	}
	
}
