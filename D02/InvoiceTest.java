import java.util.*;
class Invoice {
	
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public Invoice(String partNumber, String partDescription, int quantity, double price){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	

	
	String getPartNumber()	{ return partNumber;}
	String getPartDescription()	{ return partDescription;}
	int getQuantity()	{ return quantity;}
	double getPrice()	{ return price;}
	
	void setPartDescription(String partDescription){this.partDescription = partDescription;}
	void setPartNumber (String partNumber) {this.partNumber = partNumber;}
	void setPrice (double price) {this.price = price;}
	void setQuantity (int quantity) {this.quantity = quantity;}
	
	void getInvoiceAmount(){
		if( quantity < 0) quantity = 0;
		if( price < 0) price = 0.0;
		System.out.println("The invoice for "+ partDescription+ " is : \nPrice is"+ price + "Quantity  is : "+ quantity+ "\nTotal Amount is : "+ price*quantity );
	}
}

public class InvoiceTest{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Invoice i = new Invoice("F1225F","HP-Laptop",12,15000);
		
		System.out.println("Using Getter Meathods : ");
		System.out.println("Part Number : " + i.getPartNumber());
		System.out.println("Part Description : " + i.getPartDescription());
		System.out.println("Quantity : " + i.getQuantity());
		System.out.println("Price : " + i.getPrice());
		
		System.out.println("");
		System.out.print("Enter Part Description :");
		String partDescription = sc.nextLine();
		
		System.out.print("Enter Part Number :");
		String partNumber = sc.nextLine();
		
		System.out.print("Enter the price : ");
		double price = sc.nextDouble();
		
		System.out.print("Enter the Quantity :");
		int quantity = sc.nextInt();
		
		System.out.println("");
		
		System.out.println("Using Setter Meathods :");
		i.setPartDescription(partDescription);
		i.setPartNumber(partNumber);
		i.setPrice(price);
		i.setQuantity(quantity);
		
		System.out.println("Part Number : "+  i.getPartNumber());
		System.out.println("Part Description : "+ i.getPartDescription());
		System.out.println("Quantity : " + i.getQuantity());
		System.out.println("Price : "+ i.getPrice());
		
		System.out.println("");
		i.getInvoiceAmount();
		
		
	}
}