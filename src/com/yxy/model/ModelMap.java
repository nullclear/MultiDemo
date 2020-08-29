/**
 * 
 */
package com.yxy.model;

import java.util.LinkedHashMap;

/** 
 * @ClassName ModelMap
 * @Description 
 * @author Nuclear
 */
@SuppressWarnings("serial")
public class ModelMap extends LinkedHashMap<String, String>{

	public ModelMap(){
		
	}
	
	public ModelMap(String username,String userid){
		Add(username,userid);
	}
	
	public ModelMap Add(String username,String userid){
		if (username!=null&&userid!=null) {
			put(username, userid);
		}
		return this;
	}
}
