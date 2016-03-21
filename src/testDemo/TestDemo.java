package testDemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println(c.getTime());
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
		String payMonth = sdf.format(c.getTime());
		System.out.println(payMonth);
	}

}
