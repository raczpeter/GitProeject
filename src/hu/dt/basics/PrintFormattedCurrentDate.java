package hu.dt.java.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintFormattedCurrentDate {
	public static void main(String[] args) {
		Date currentDate = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String formattedDate = formatter.format(currentDate);
		System.out.println(formattedDate);
	}
}
