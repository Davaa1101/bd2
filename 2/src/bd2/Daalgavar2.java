package bd2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Daalgavar2{
	static int[] Weeks = new int [16];
		static int[] Work_days = new int [16];
		static int[] Work_days1 = new int [16];
		static int baga13_15 = 4 ;
		static int dund48 = 34 ;
		static int togsoh910_612 = 6 ;
		static int deed1 = 3 ;
		static int dund1_neg_tsag = 45 ;
		static int deed_neg_tsag = 90 ;
		static int dund2_neg_tsag_15 = 30;
		static int dund2_neg_tsag_612 = 35 ;	
		public int getWorkDays(int i) {
			return Work_days[i];
		}
		public int getWorkDays1(int i) {
			return Work_days1[i];
		}
		public int getWeeks(int i) {
			return Weeks[i];
		}
		public void setWeeks() {
			 for (int i = 1978 ; i<1994; i++) {
				 LocalDate date1 = LocalDate.of(i, 9, 1);
				 Weeks[i-1978] = 38;
				 if(date1.getDayOfWeek() == DayOfWeek.MONDAY) {
					 Weeks[i-1978] = 39 ;
				 }
				 else if(date1.getDayOfWeek() == DayOfWeek.SUNDAY) {
					 if(i%4==0) {
						 Weeks[i-1978] = 39 ;
					 }
				 }
			 }
		}
		public void setWorkdays() {
			for (int i = 1978 ; i<1994; i++) {
		        LocalDate date1 = LocalDate.of(i, 9, 1); // First date
		        LocalDate date2 = LocalDate.of(i+1, 5, 31); // Second date
		        
		        // Initialize counter for Mondays
		        int mondaysCount = 0;
		        int tuesdayCount = 0;
		        int wednesdayCount = 0;
		        int thursdayCount = 0;
		        int fridayCount = 0;
		        int saturdayCount = 0;
		        // Iterate through the dates between date1 and date2
		        LocalDate currentDate = date1;
		        while (!currentDate.isAfter(date2)) {
		            if (currentDate.getDayOfWeek() == DayOfWeek.MONDAY) {
		                mondaysCount++;
		            }
		            else if (currentDate.getDayOfWeek() == DayOfWeek.TUESDAY) {
		                tuesdayCount++;
		            }
		            else if (currentDate.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
		                wednesdayCount++;
		            }
		            else if (currentDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
		                thursdayCount++;
		            }
		            else if (currentDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
		                fridayCount++;
		            } else if (currentDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
		                saturdayCount++;
		            }
		            // Move to the next day
		            currentDate = currentDate.plus(1, ChronoUnit.DAYS);
		        }
		    Work_days[i-1978] = mondaysCount + tuesdayCount + wednesdayCount + thursdayCount + fridayCount + saturdayCount;
		    Work_days1[i-1978] = mondaysCount + tuesdayCount + wednesdayCount + thursdayCount + fridayCount ; 
		    }
		}
		public static double dund1_13(int i) {
	        return baga13_15 * Work_days[i] * dund1_neg_tsag;
	    }

	    public static double dund1_48(int i) {
	        return dund48 * Weeks[i] * dund1_neg_tsag;
	    }

	    public static double dund1_910(int i) {
	        return togsoh910_612 * Work_days[i] * dund1_neg_tsag;
	    }
	    public static double ih1(int i) {
	    	return (Work_days[i]-48)*deed1*deed_neg_tsag ;
	    }

	    public static double dund2_15(int i) {
	        return baga13_15 * Work_days1[i] * dund2_neg_tsag_15;
	    }

	    public static double dund2_612(int i) {
	        return togsoh910_612 * Work_days1[i] * dund2_neg_tsag_612;
	    }

	    public static double ih2(int i) {
	        return deed1 * (Work_days1[i]-40) * deed_neg_tsag;
	    }

	    public static int sonirhson1(int i) {
	        return Weeks[i] * 4* dund1_neg_tsag;
	    }

	    public static int sonirhson2(int i) {
	            if (i < 6) {
	                return Weeks[i] * 4 * dund2_neg_tsag_15;
	            } else {
	                return Weeks[i] * 4 * dund2_neg_tsag_612;
	            }
	        }		
		public static void main(String[] args) {
			Daalgavar2 daalgavar = new Daalgavar2();
			daalgavar.setWeeks();
			daalgavar.setWorkdays();
			for (int i =0; i<16 ;i++) {
				System.out.print(" "+Work_days1[i]);
			}
		}
}
