package com.sjl.dsl4xml.support.convert;

import com.sjl.dsl4xml.support.StringConverter;

public class PrimitiveIntStringConverter extends StringConverter<Integer> {

	@Override
	public boolean canConvertTo(Class<?> aClass) {
		return aClass.isAssignableFrom(Integer.TYPE);
	}

	@Override
	public Integer convert(String aValue) {
		return ((aValue == null) || ("".equals(aValue))) ? 0 : new Integer(aValue);
	}

}
