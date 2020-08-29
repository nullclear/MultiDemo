/**
 * 
 */
package com.yxy.model;

/** 
 * @ClassName demo
 * @Description 
 * @author Nuclear
 */
public class demo {

	public static void main(String[] args) {
		Model model = new ExModelMap();
		model.Add("mayun", "111");
		
		ModelMap modelMap=(ModelMap) model;
		System.out.println(modelMap.get("mayun"));
	}
}
