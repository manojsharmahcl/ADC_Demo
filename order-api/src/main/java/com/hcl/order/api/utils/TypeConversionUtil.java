package com.hcl.order.api.utils;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;


public class TypeConversionUtil {

	public static <T> T  getType( Class<T> clazz, Object value ) {
		if( Boolean.class == clazz || Boolean.TYPE == clazz) return (T)Boolean.valueOf(Boolean.parseBoolean(String.valueOf(value)));
		if( Byte.class == clazz || Byte.TYPE == clazz) return (T)Byte.valueOf(Byte.parseByte(String.valueOf(value)));
		if( Short.class == clazz || Short.TYPE == clazz) return (T)Short.valueOf(Short.parseShort(String.valueOf(value)));
		if( Integer.class == clazz || Integer.TYPE == clazz) return (T)Integer.valueOf(Integer.parseInt(String.valueOf(value)));
		if( Long.class == clazz || Long.TYPE == clazz) return (T)Long.valueOf(Long.parseLong(String.valueOf(value)));
		if( Float.class == clazz || Float.TYPE == clazz) return (T)Float.valueOf(Float.parseFloat(String.valueOf(value)));
		if( Double.class == clazz || Double.TYPE == clazz) return (T)Double.valueOf(Double.parseDouble(String.valueOf(value)));
		if( Time.class == clazz)
			try {
				return (T) TimeUtil.getTime(String.valueOf(value));
			} catch (Exception e) {
			}
		if( Timestamp.class == clazz)
			try {
				return (T) TimeUtil.getTimeStamp(String.valueOf(value));
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	
	public static <T> T  getType( Class<T> clazz, Object value ,String format) {
		if( Boolean.class == clazz || Boolean.TYPE == clazz) return (T)Boolean.valueOf(Boolean.parseBoolean(String.valueOf(value)));
		if( Byte.class == clazz || Byte.TYPE == clazz) return (T)Byte.valueOf(Byte.parseByte(String.valueOf(value)));
		if( Short.class == clazz || Short.TYPE == clazz) return (T)Short.valueOf(Short.parseShort(String.valueOf(value)));
		if( Integer.class == clazz || Integer.TYPE == clazz) return (T)Integer.valueOf(Integer.parseInt(String.valueOf(value)));
		if( Long.class == clazz || Long.TYPE == clazz) return (T)Long.valueOf(Long.parseLong(String.valueOf(value)));
		if( Float.class == clazz || Float.TYPE == clazz) return (T)Float.valueOf(Float.parseFloat(String.valueOf(value)));
		if( Double.class == clazz || Double.TYPE == clazz) return (T)Double.valueOf(Double.parseDouble(String.valueOf(value)));
		if( Time.class == clazz)
			try {
				return (T) TimeUtil.getTime(String.valueOf(value),format);
			} catch (Exception e) {
			}
		if( Timestamp.class == clazz)
			try {
				return (T) TimeUtil.getTimeStamp(String.valueOf(value),format);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}

}
