package edu.osu.cs362;


import org.junit.Test;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 1000; /* Timeout at 1 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	@Test
	public void radnomtest()  throws Throwable  {

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...");

		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed =10;
			Random random = new Random(randomseed);

			int startHour= ValuesGenerator.getRandomIntBetween(random, 0, 23);
			int startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 59);
			int startDay=ValuesGenerator.getRandomIntBetween(random, 0, 28);
			int startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 12);
			int startYear=ValuesGenerator.getRandomIntBetween(random, 2000, 3000);
			GregorianCalendar greg = new GregorianCalendar(startYear, startMonth, startDay, startHour, startMinute);
			CalDay day = new CalDay(greg);

			for (int i = 0; i < NUM_TESTS; i++) {
				startHour= ValuesGenerator.getRandomIntBetween(random, 0, 23);
				startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 59);
				startDay=ValuesGenerator.getRandomIntBetween(random, 0, 28);
				startMonth=ValuesGenerator.getRandomIntBetween(random, 0, 12);
				startYear=ValuesGenerator.getRandomIntBetween(random, 2000, 3000);

				String title=(String) ValuesGenerator.getString(random);
				String description=(String) ValuesGenerator.getString(random);
				//Construct a new Appointment object with the initial data
				Appt appt = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
						description);

				day.addAppt(appt);
			}

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		}


		System.out.println("Done testing...");
	}


	
}
