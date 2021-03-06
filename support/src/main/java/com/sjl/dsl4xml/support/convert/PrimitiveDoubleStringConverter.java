package com.sjl.dsl4xml.support.convert;

import com.sjl.dsl4xml.support.StringConverter;

public class PrimitiveDoubleStringConverter extends StringConverter<Double> {

	@Override
	public boolean canConvertTo(Class<?> aClass) {
		return aClass.isAssignableFrom(Double.TYPE);
	}

	@Override
	public Double convert(String aValue) {
		return ((aValue == null) || ("".equals(aValue))) ? 0 : new Double(aValue);
	}

}
