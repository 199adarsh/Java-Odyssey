import java.util.*;
class DateTest{
	int date;
	int month;
	int year;
	
	DateTest(){
		date = 01;
		month = 01;
		year = 2000;
	}
	
	int getDate(){
		return date;
	}
	int getMonth(){
		return month;	
	}
	int getYear(){
		return year;
	}
	
	void setDate(int date){
		this.date = date;
	}
	
	void setMonth(int month){
		this.month=month;
	}
	
	void setYear(int year){
		this.year=year;
	}
	
	void displayDate(){
		System.out.println("Current Date is : "+month+"/"+ date+"/"+year);
	}
} 


public class Date{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	DateTest d1 = new DateTest();
	
	System.out.print("Calling Getters : ");
	System.out.print(d1.getDate()+ " : ");
	System.out.print(d1.getMonth()+ " : ");
	System.out.println(d1.getYear());
	
	
	System.out.println("Calling Setters : ");

	
	System.out.print("Enter Date : ");
	int date = sc.nextInt();
	
	System.out.print("Enter Month : ");	
	int month = sc.nextInt();

	System.out.print("Enter Year : ");
	int year = sc.nextInt();
	
	
	d1.setDate(date);
	d1.setMonth(month);
	d1.setYear(year);
	d1.displayDate();
	
	}
	
	
}