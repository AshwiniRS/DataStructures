import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class test{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 8.45;
		System.out.println(d==Math.floor(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
//		DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
//		Date date = formatter.parse(testDate);
//		System.out.println(date);
		
		List<Date> dateList = new ArrayList<Date>();
		String s1 = "2016-01-05";
		Date d2;
		try {
			d2 = sdf.parse(s1);
			System.out.println(d2);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
//	    minDate = new SimpleDateFormat("dd MMM yyyy").parse(finalFormatcomplete);
		try {
			dateList.add(sdf.parse("2016-01-05"));
			dateList.add(sdf.parse("2015-12-29"));
			dateList.add(sdf.parse("2017-02-05"));
			dateList.add(sdf.parse("2016-01-02"));
			Collections.sort(dateList);		
			for(Date date : dateList){
				System.out.println(sdf.format(date));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

//
//	@Override
//	public int compareTo(Object d) {
//		// TODO Auto-generated method stub
//		return this.compareTo(d);	}	
	

}
