package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {


	@Test
	 public void test0()  throws Throwable  {
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


	@Test(timeout = 4000)
public void test00()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		Appt appt0 = new Appt(1, 0, 0, 0, 0, (String) null, "");
		linkedList0.addLast(appt0);
		Appt appt1 = new Appt(0, 0, 1, 1, 0, (String) null, (String) null);
		linkedList0.add(appt1);
		timeTable0.deleteAppt(linkedList0, appt1);
}

@Test(timeout = 4000)
public void test02()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		// Undeclared exception!
		try {
			timeTable0.getApptRange(linkedList0, (GregorianCalendar) null, (GregorianCalendar) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			 //
			 // no message in exception (getMessage() returned null)
			 //
			 //assertThrownBy("cs362.edu.osu.TimeTable", e);
		}
}

@Test(timeout = 4000)
public void test03()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		linkedList0.addLast((Appt) null);
		Appt appt0 = new Appt(0, 0, 1, 1, 0, (String) null, (String) null);
		// Undeclared exception!
		try {
			timeTable0.deleteAppt(linkedList0, appt0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			 //
			 // no message in exception (getMessage() returned null)
			 //
			 //assertThrownBy("cs362.edu.osu.TimeTable", e);
		}
}

@Test(timeout = 4000)
public void test04()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		Appt appt0 = new Appt(0, 0, 1, 1, 0, (String) null, (String) null);
		linkedList0.add(appt0);
		timeTable0.deleteAppt(linkedList0, appt0);
}

@Test(timeout = 4000)
public void test05()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		Appt appt0 = new Appt(1, 0, 0, 0, 0, (String) null, "");
		linkedList0.addLast(appt0);
		Appt appt1 = new Appt(0, 0, 1, 1, 0, (String) null, (String) null);
		timeTable0.deleteAppt(linkedList0, appt1);
}

@Test(timeout = 4000)
public void test06()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		timeTable0.deleteAppt(linkedList0, (Appt) null);
}

@Test(timeout = 4000)
public void test07()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		Appt appt0 = new Appt(1, 0, 0, 0, 0, (String) null, "");
		timeTable0.deleteAppt(linkedList0, appt0);
}

@Test(timeout = 4000)
public void test08()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		Appt appt0 = new Appt(17, 17, 17, 17, 17, (String) null, (String) null);
		timeTable0.deleteAppt((LinkedList<Appt>) null, appt0);
}


@Test(timeout = 4000)
public void test14()  throws Throwable  {
		TimeTable timeTable0 = new TimeTable();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar();
		// Undeclared exception!
		try {
			timeTable0.getApptRange(linkedList0, GregorianCalendar0, GregorianCalendar0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			 //
			 // Second date specified is not before the first date specified.
			 //
			 //assertThrownBy("cs362.edu.osu.TimeTable", e);
		}
}
}
