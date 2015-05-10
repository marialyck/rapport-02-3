import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class TestCalendar {
	@Test
	public void testDate() {
		// GregorianCalendar gc = new GregorianCalendar(2015,5,9);
		Cal cal = new Cal();
		cal.setDate(2015, 20);
		assertEquals(2015, cal.getYear());
		assertEquals(20, cal.getWeekOfYear());
	}
	@Test
	public void testDateWeekOverRunYear(){
		Cal cal = new Cal();
		cal.setDate(2015, 70);
		assertEquals(2016,cal.getYear());
		assertEquals(17,cal.getWeekOfYear());
	}
	
}
