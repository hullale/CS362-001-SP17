package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	@Test
	 public void testA()  throws Throwable  {
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


	@Test(timeout = 4000)
public void test00()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar(1, 1, 1);
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		Appt appt0 = new Appt(1, 1, 1, 1, 1734, "HMS", "HMS");
		calDay0.addAppt(appt0);
		calDay0.addAppt(appt0);
}

@Test(timeout = 4000)
public void test01()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.isValid();
}

@Test(timeout = 4000)
public void test02()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar();
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		calDay0.getYear();
}

@Test(timeout = 4000)
public void test03()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.year = (-2851);
		calDay0.getYear();
}

@Test(timeout = 4000)
public void test04()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar((-2147483627), (-2147483627), (-2147483627));
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		calDay0.getSizeAppts();
}

@Test(timeout = 4000)
public void test05()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		Appt appt0 = linkedList0.poll();
		linkedList0.add(appt0);
		calDay0.appts = linkedList0;
		calDay0.getSizeAppts();
}

@Test(timeout = 4000)
public void test06()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.getMonth();
}

@Test(timeout = 4000)
public void test07()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.month = (-767);
		calDay0.getMonth();
}

@Test(timeout = 4000)
public void test08()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.getDay();
}

@Test(timeout = 4000)
public void test09()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar();
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		calDay0.day = (-1517);
		calDay0.getDay();
}

@Test(timeout = 4000)
public void test10()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.getAppts();
}

@Test(timeout = 4000)
public void test11()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
		Appt appt0 = linkedList0.poll();
		linkedList0.add(appt0);
		calDay0.appts = linkedList0;
		calDay0.getAppts();
}

@Test(timeout = 4000)
public void test12()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.valid = true;
		// Undeclared exception!
		try {
			calDay0.toString();
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			 //
			 // no message in exception (getMessage() returned null)
			 //
			 //assertThrownBy("cs362.edu.osu.CalDay", e);
		}
}


@Test(timeout = 4000)
public void test14()  throws Throwable  {
		Appt appt0 = new Appt(6, 6, 6, 6, 6, "Uki@ PV\u0000MZT5k", "Uki@ PV\u0000MZT5k");
		CalDay calDay0 = new CalDay();
		// Undeclared exception!
		try {
			calDay0.addAppt(appt0);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			 //
			 // no message in exception (getMessage() returned null)
			 //
			 //assertThrownBy("cs362.edu.osu.CalDay", e);
		}
}

@Test(timeout = 4000)
public void test15()  throws Throwable  {
		CalDay calDay0 = null;
		try {
			calDay0 = new CalDay((GregorianCalendar) null);
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			 //
			 // no message in exception (getMessage() returned null)
			 //
			 //assertThrownBy("cs362.edu.osu.CalDay", e);
		}
}

@Test(timeout = 4000)
public void test16()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar(31, 31, 0);
		GregorianCalendar0.set(0, 1830);
		CalDay calDay0 = null;
		try {
			calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
			fail("Expecting exception: IllegalArgumentException");

		} catch(IllegalArgumentException e) {
			 //
			 // Invalid era
			 //
			 //assertThrownBy("java.util.GregorianCalendar", e);
		}
}

@Test(timeout = 4000)
public void test17()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar();
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		calDay0.isValid();
}

@Test(timeout = 4000)
public void test18()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.getYear();
}

@Test(timeout = 4000)
public void test19()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar(5, 5, 5, 0, 5, (-794));
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		calDay0.getDay();
}

@Test(timeout = 4000)
public void test20()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar(5, 5, 5, 0, 5, (-794));
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		calDay0.getMonth();
}


@Test(timeout = 4000)
public void test22()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		calDay0.toString();
}

@Test(timeout = 4000)
public void test25()  throws Throwable  {
		GregorianCalendar GregorianCalendar0 = new GregorianCalendar(1, 1, 1, 1, 1);
		CalDay calDay0 = new CalDay((GregorianCalendar) GregorianCalendar0);
		Appt appt0 = new Appt(1, 1, 1, 1, 1, "%jY%z", "%jY%z");
		calDay0.addAppt(appt0);
		appt0.setStartHour(5);
		Appt appt1 = new Appt(1, 1, 1, 1, 5, "%jY%z", "%jY%z");
		calDay0.addAppt(appt1);
		assertEquals(1, calDay0.getDay());
		assertTrue(calDay0.isValid());
		assertEquals(1, calDay0.getMonth());
		assertEquals(1, calDay0.getYear());
}

@Test(timeout = 4000)
public void test26()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		Appt appt0 = new Appt((-2851), 1808, 3803, 1808, 4, "", "");
		calDay0.addAppt(appt0);
		assertFalse(calDay0.isValid());
}

@Test(timeout = 4000)
public void test27()  throws Throwable  {
		CalDay calDay0 = new CalDay();
		// Undeclared exception!
		try {
			calDay0.getSizeAppts();
			fail("Expecting exception: NullPointerException");

		} catch(NullPointerException e) {
			 //
			 // no message in exception (getMessage() returned null)
			 //
			 //assertThrownBy("cs362.edu.osu.CalDay", e);
		}
}


}
