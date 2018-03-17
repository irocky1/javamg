/**
 * 
 */
package com.rocky.javamg.common.utils.excel.fieldtype;

import com.rocky.javamg.common.utils.StringUtils;
import com.rocky.javamg.modules.sys.entity.Area;
import com.rocky.javamg.modules.sys.utils.UserUtils;

/**
 * 字段类型转换
 * 
 * @version 2013-03-10
 */
public class AreaType {

	/**
	 * 获取对象值（导入）
	 */
	public static Object getValue(String val) {
		for (Area e : UserUtils.getAreaList()){
			if (StringUtils.trimToEmpty(val).equals(e.getName())){
				return e;
			}
		}
		return null;
	}

	/**
	 * 获取对象值（导出）
	 */
	public static String setValue(Object val) {
		if (val != null && ((Area)val).getName() != null){
			return ((Area)val).getName();
		}
		return "";
	}
}