package com.situ.crm.util;

import org.apache.commons.lang3.StringUtils;

public class Util {

	public static String formatLike(String str) {
		if (StringUtils.isNotBlank(str)) {
			return "%" + str + "%";
		} else {
			return null;
		}
	}
}