package com.hcl.canceltrx.utils;
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


public class TimeUtil {

	private static final String TIME_FORMAT="([01]?[0-9]|2[0-3]):[0-5][0-9]";
	private static String date = "00/00/0000";
	private static String dateFormat = "MM/dd/yyyy hh:mm";
	private static String timestampFormat = "MM/dd/yyyy HH:mm:ss";


	public static long getDifferance(String time1,String time2) {
		long diffmin =0;
		try {

			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			Date dateObj1 = sdf.parse(date + " " + formatTime(time1));
			Date dateObj2 = sdf.parse(date + " " + formatTime(time2));
			long diff = dateObj2.getTime() - dateObj1.getTime();
			diffmin = (long) (diff / (60 * 1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return diffmin;
	}
	
	public static long getDifferance(Time time1,String time2) {
		long diffmin =0;
		try {

			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			Date dateObj1 = sdf.parse(date + " " + time1.getTime());
			Date dateObj2 = sdf.parse(date + " " + formatTime(time2));
			long diff = dateObj2.getTime() - dateObj1.getTime();
			diffmin = (long) (diff / (60 * 1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return diffmin;
	}

	private static String formatTime(String time) {
		try {
			return time.replaceAll("\\\"", "").replaceAll("\\s", "").replaceAll("\\'", "");
		}
		catch (Exception e) {
		}
		return time;
	}

	public static boolean isTime(String time)  {
		try {
			return formatTime(time).matches(TIME_FORMAT);
		}
		catch (Exception e) {
		}
		return false;
	}

	public static boolean isTime(Time time)  {
		return true;
	}

	public static Time getTime(String time) throws ParseException {
		Time t =null;
		if(isTime(time))
		{
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			Date dateObj = sdf.parse(date + " " + formatTime(time));
			long ms = dateObj.getTime();
			t = new Time(ms);
		}
		return t;
	}


	public static Time getTime(String time,String dateFormat) throws ParseException {
		Time t =null;
		if(isTime(time))
		{
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			Date dateObj = sdf.parse(date + " " + formatTime(time));
			long ms = dateObj.getTime();
			t = new Time(ms);
		}
		return t;
	}

	public static Timestamp getTimeStamp(String timestap) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(timestampFormat);
		Date dateObj = sdf.parse(timestap);
		return new Timestamp(dateObj.getTime());
	}

	public static Timestamp getTimeStamp(String timestap,String dateFormat) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Date dateObj = sdf.parse(timestap);
		return new Timestamp(dateObj.getTime());
	}

	public static boolean greaterthan(String time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin<0;
	}

	public static boolean greaterthanorEqual(String time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin<0||diffmin==0;
	}

	public static boolean lessthan(String time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin>0;
	}

	public static boolean lessthanorEqual(String time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin>0||diffmin==0;
	}

	public static boolean greaterthan(Time time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin<0;
	}

	public static boolean greaterthanorEqual(Time time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin<0||diffmin==0;
	}

	public static boolean lessthan(Time time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin>0;
	}

	public static boolean lessthanorEqual(Time time1,String time2) {
		long diffmin =getDifferance(time1,time2);
		return diffmin>0||diffmin==0;
	}


}
