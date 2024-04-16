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
			for(int i = 1978; i<1994 ; i++){
			    LocalDate date1 = LocalDate.of(i, 9, 1);
				LocalDate date2 = LocalDate.of(i+1, 5, 31);
			    LocalDate currentDate = date1 ; 
			    int counter = 0, count = 0 ;
			    while (!currentDate.isAfter(date2)){
			        if (currentDate.getDayOfWeek() == DayOfWeek.MONDAY) {
					                count++;
					            }
					            else if (currentDate.getDayOfWeek() == DayOfWeek.TUESDAY) {
					                count++;
					            }
					            else if (currentDate.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
					                count++;
					            }
					            else if (currentDate.getDayOfWeek() == DayOfWeek.THURSDAY) {
					                count++;
					            }
					            else if (currentDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
					                count++;
					            }
			                     else if (currentDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
					                count++;
					            }
			                    else if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
					                count++;
			                        if(count == 7){
			                            counter++ ;
			                        }
			                            count = 0;
					            }
			    currentDate = currentDate.plus(1, ChronoUnit.DAYS);
			    }
					  Weeks[i-1978] = counter;      
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
		}
}
