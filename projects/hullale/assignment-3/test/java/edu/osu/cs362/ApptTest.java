package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	/*
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	 public void test02()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		String output = appt.toString();
		//assertEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.", output);
		System.out.println(output);

		appt.setStartMonth(100);
		appt.setStartDay(100);
		appt.setStartMinute(100);
		appt.setStartHour(100);
		appt.setStartHour(12);

		appt.setStartYear(2007);
		appt.setTitle(null);
		appt.setDescription(null);

		output = appt.toString();
		assertEquals(output, null);
		System.out.println(output);
	 }

	*/
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 7, (String) null, (String) null);
      String string0 = appt0.toString();
      assertEquals("\t7/7/7 at 7:7am ,, \n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 23, 23, 23, (String) null, (String) null);
      assertEquals(23, appt0.getStartDay());
      assertEquals(23, appt0.getStartMonth());
      assertEquals(23, appt0.getStartYear());
      assertEquals(23, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(23, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt((-1387), (-1387), (-1), (-1512), 0, "Millisecond", "Millisecond");
      boolean boolean0 = appt0.getValid();
      assertEquals(-1512, appt0.getStartMonth());
      assertEquals(-1387, appt0.getStartMinute());
      assertFalse(boolean0);
      assertEquals(-1, appt0.getStartDay());
      assertEquals(-1387, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals("Millisecond", appt0.getTitle());
      assertEquals("Millisecond", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt((-1220), (-548), (-1220), (-1220), 0, ":", ":");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals(-1220, appt0.getStartHour());
      assertEquals(-548, appt0.getStartMinute());
      assertEquals(-1220, appt0.getStartMonth());
      assertEquals(":", appt0.getTitle());
      assertEquals(-1220, appt0.getStartDay());
      assertEquals(":", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-779), (-779), (-779), "HMS", "HMS");
      int int0 = appt0.getStartYear();
      assertEquals(-779, appt0.getStartMonth());
      assertEquals((-779), int0);
      assertEquals(0, appt0.getStartHour());
      assertEquals("HMS", appt0.getDescription());
      assertEquals("HMS", appt0.getTitle());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(-779, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-2688), 0, 59, "rD+dC>", "rD+dC>");
      int int0 = appt0.getStartMonth();
      assertEquals(59, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, int0);
      assertEquals("rD+dC>", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals("rD+dC>", appt0.getTitle());
      assertEquals(-2688, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(0, 999, 0, 999, 0, "6", "6");
      int int0 = appt0.getStartMonth();
      assertEquals(0, appt0.getStartYear());
      assertEquals(999, int0);
      assertEquals("6", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertEquals(999, appt0.getStartMinute());
      assertEquals("6", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(11, 3254, 3254, 3254, 3254, "t/3sCb0Y|", "t/3sCb0Y|");
      int int0 = appt0.getStartMinute();
      assertEquals(11, appt0.getStartHour());
      assertEquals(3254, appt0.getStartYear());
      assertEquals("t/3sCb0Y|", appt0.getDescription());
      assertEquals(3254, int0);
      assertEquals("t/3sCb0Y|", appt0.getTitle());
      assertEquals(3254, appt0.getStartMonth());
      assertEquals(3254, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt((-2176), (-2176), (-2176), (-2176), (-2176), "qq+rjTs", "V");
      int int0 = appt0.getStartMinute();
      assertEquals((-2176), int0);
      assertEquals(-2176, appt0.getStartHour());
      assertEquals(-2176, appt0.getStartYear());
      assertEquals(-2176, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals("qq+rjTs", appt0.getTitle());
      assertEquals(-2176, appt0.getStartDay());
      assertEquals("V", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-2688), 0, 59, "rD+dC>", "rD+dC>");
      int int0 = appt0.getStartHour();
      assertEquals("rD+dC>", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(59, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-2688, appt0.getStartDay());
      assertEquals(0, int0);
      assertEquals("rD+dC>", appt0.getDescription());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 2778, 627, "", "");
      int int0 = appt0.getStartHour();
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartDay());
      assertEquals(627, appt0.getStartYear());
      assertEquals(1, int0);
      assertEquals(1, appt0.getStartMinute());
      assertEquals(2778, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(145, 145, 145, 115, 115, "org.apache.xerces.jaxp.datatype.DurationImpl", "org.apache.xerces.jaxp.datatype.DurationImpl");
      appt0.setStartDay(0);
      int int0 = appt0.getStartDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(11, 2023, 1539, 3838, 183, "UnknownField", "UnknownField");
      int int0 = appt0.getStartDay();
      assertEquals("UnknownField", appt0.getDescription());
      assertEquals(2023, appt0.getStartMinute());
      assertEquals(11, appt0.getStartHour());
      assertEquals(3838, appt0.getStartMonth());
      assertEquals(1539, int0);
      assertFalse(appt0.getValid());
      assertEquals("UnknownField", appt0.getTitle());
      assertEquals(183, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", (String) null);
      String string0 = appt0.getDescription();
      assertEquals(11, appt0.getStartDay());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(11, appt0.getStartYear());
      assertTrue(appt0.getValid());
      assertEquals(11, appt0.getStartHour());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-2688), 0, 59, "rD+dC>", "rD+dC>");
      appt0.setDescription("rD+dC>");
      assertEquals(59, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-2688, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals("rD+dC>", appt0.getDescription());
      assertEquals("rD+dC>", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(104, 104, 0, 104, 1540, "DS", "");
      assertEquals("", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertEquals(104, appt0.getStartMinute());
      assertEquals(104, appt0.getStartMonth());
      assertEquals("DS", appt0.getTitle());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(104, appt0.getStartHour());
      assertEquals(1540, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt((-1397), 0, 0, 0, (-1122), "", "");
      appt0.setTitle("");
      assertEquals(-1122, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-1397, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-370), (-370), 0, 0, 0, "$xqg6jpIJ\";^}1wN7", (String) null);
      assertEquals("$xqg6jpIJ\";^}1wN7", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt((-2717), (-2717), (-2717), (-2717), 3838, "UnknownField", "UnknownField");
      int int0 = appt0.getStartDay();
      assertEquals(-2717, appt0.getStartMinute());
      assertEquals(-2717, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals((-2717), int0);
      assertEquals(3838, appt0.getStartYear());
      assertEquals(-2717, appt0.getStartHour());
      assertEquals("UnknownField", appt0.getTitle());
      assertEquals("UnknownField", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, (-4049), 11, "3d]", "3d]");
      String string0 = appt0.getTitle();
      assertEquals(11, appt0.getStartHour());
      assertEquals("3d]", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(11, appt0.getStartYear());
      assertEquals(-4049, appt0.getStartMonth());
      assertEquals(11, appt0.getStartDay());
      assertEquals("3d]", string0);
      assertEquals(11, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-2179), 880, 11, 11, (-128), "", "");
      int int0 = appt0.getStartHour();
      assertFalse(appt0.getValid());
      assertEquals((-2179), int0);
      assertEquals(-128, appt0.getStartYear());
      assertEquals(11, appt0.getStartDay());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(880, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-692), (-2219), (-692), 4095, (-692), "GMT", "GMT");
      String string0 = appt0.getDescription();
      assertEquals(-692, appt0.getStartYear());
      assertEquals(-692, appt0.getStartHour());
      assertEquals(-692, appt0.getStartDay());
      assertEquals(4095, appt0.getStartMonth());
      assertEquals("GMT", appt0.getTitle());
      assertEquals(-2219, appt0.getStartMinute());
      assertEquals("GMT", string0);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt((-1387), (-1387), (-1), (-1512), 0, "Millisecond", "Millisecond");
      int int0 = appt0.getStartMonth();
      assertEquals("Millisecond", appt0.getDescription());
      assertEquals((-1512), int0);
      assertEquals(-1, appt0.getStartDay());
      assertEquals("Millisecond", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-1387, appt0.getStartHour());
      assertEquals(-1387, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 23, "Second", "");
      int int0 = appt0.getStartMinute();
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertEquals("", appt0.getDescription());
      assertEquals("Second", appt0.getTitle());
      assertEquals(0, appt0.getStartDay());
      assertEquals(23, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 7, (String) null, (String) null);
      boolean boolean0 = appt0.getValid();
      assertEquals(7, appt0.getStartYear());
      assertEquals(7, appt0.getStartHour());
      assertEquals(7, appt0.getStartMinute());
      assertEquals(7, appt0.getStartDay());
      assertEquals(7, appt0.getStartMonth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(145, 145, 145, 115, 115, "org.apache.xerces.jaxp.datatype.DurationImpl", "org.apache.xerces.jaxp.datatype.DurationImpl");
      int int0 = appt0.getStartYear();
      assertEquals("org.apache.xerces.jaxp.datatype.DurationImpl", appt0.getDescription());
      assertEquals(145, appt0.getStartHour());
      assertEquals(145, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(115, int0);
      assertEquals(145, appt0.getStartDay());
      assertEquals("org.apache.xerces.jaxp.datatype.DurationImpl", appt0.getTitle());
      assertEquals(115, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, (String) null, (String) null);
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t12/12/12 at 12:12pm ,, \n", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(145, 145, 145, 115, 115, "org.apache.xerces.jaxp.datatype.DurationImpl", "org.apache.xerces.jaxp.datatype.DurationImpl");
      appt0.setStartMinute(59);
      appt0.setStartHour(0);
      appt0.setStartDay(0);
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(7, (-2763), 7, 7, (-2763), (String) null, (String) null);
      String string0 = appt0.getTitle();
      assertEquals(-2763, appt0.getStartYear());
      assertEquals(7, appt0.getStartHour());
      assertNotNull(string0);
      assertEquals(-2763, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(7, appt0.getStartDay());
      assertEquals(7, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 31, 288, 0, (String) null, (String) null);
      appt0.setStartHour((-946));
      assertEquals(-946, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", (String) null);
      appt0.setStartYear(11);
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, appt0.getStartDay());
      assertEquals(11, appt0.getStartHour());
      assertTrue(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", (String) null);
      appt0.setStartMonth((-4100));
      appt0.toString();
      assertEquals(-4100, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", (String) null);
      String string0 = appt0.toString();
      assertEquals("\t11/11/11 at 11:11am ,, \n", string0);
      assertNotNull(string0);
  }


	
}
