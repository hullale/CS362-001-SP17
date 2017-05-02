package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable test = new TimeTable();
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;

         CalDay caltest = new CalDay();
		 GregorianCalendar greg = new GregorianCalendar(2017,4,3,23,54);
		 GregorianCalendar greg1 = new GregorianCalendar(2018,4,5,21,52);
		 CalDay caltest1 = new CalDay(greg);
		 Appt appointment1 = new Appt(startHour,startMinute,startDay,startMonth, startYear, "test", "test");

		 Appt appointment2 = new Appt(startHour-1,startMinute,startDay,startMonth, startYear, "test", "test");
		 caltest1.addAppt(appointment1);
		 caltest1.addAppt(appointment2);

         //get the appointments in a range of dates.
		 test.getApptRange(caltest1.getAppts(), greg, greg1);

         try{
             //get the range when the first argument is before the second.
             test.getApptRange(caltest1.getAppts(), greg1, greg);
         }catch(IllegalArgumentException e){

         }
         //delete an appointment from a calendar
		 test.deleteAppt(caltest1.getAppts(), appointment1);
		 //try to delete an appointment from an empty calendar
		 test.deleteAppt(caltest.getAppts(), appointment1);
	 }



}
