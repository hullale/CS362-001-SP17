package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;

	     CalDay caltest = new CalDay();
	     GregorianCalendar greg = new GregorianCalendar(2017,4,3,23,54);
         CalDay caltest1 = new CalDay(greg);
         Appt appointment1 = new Appt(startHour,startMinute,startDay,startMonth, startYear, "test", "test");

         Appt appointment2 = new Appt(startHour-1,startMinute,startDay,startMonth, startYear, "test", "test");
         caltest1.addAppt(appointment1);
         caltest1.addAppt(appointment2);
         caltest1.iterator();
         caltest.iterator();
         String output = caltest1.toString();
         int nAppointments = caltest1.getSizeAppts();
         assertEquals(2,nAppointments);
	 }
	
}
