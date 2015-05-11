public class P19 {

	public static void main(String[] args) throws ParseException {
	
		int SunNo = 0;
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = formatter.parse("1901-01-01");
		Date endDate = formatter.parse("2000-12-31");
		
		Calendar start = Calendar.getInstance();
		start.setTime(date1);
		Calendar end = Calendar.getInstance();
		end.setTime(endDate);

	while(!start.after(end)){
			int day = start.get(Calendar.DAY_OF_WEEK);
			int mon = start.get(Calendar.DAY_OF_MONTH);
			if(day == 1 && mon==1) 
			{
				SunNo++;
			}
			start.add(Calendar.DATE, 1);
	}
				System.out.println(SunNo);
		
	}

}
