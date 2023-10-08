package q1;
import java.util.Scanner;

public class Invoice {
	private String partno;
	private String partdesc;
	private int quantity;
	private double price;
	
	public Invoice() {
		
	}
	public Invoice(String partno, String partdesc, int quantity, double price) {
		this.partno = partno;
		this.partdesc = partdesc;
		if(quantity<0)
			this.quantity =0;
		else
			this.quantity=quantity;
		
		if(price<0)
			this.price =0;
		else
			this.price=price;
	}
	
	
	public String getPartno() {
		return partno;
	}
	
	public void setPartno(String partno) {
		this.partno = partno;
	}
	
	public String getPartdesc() {
		return partdesc;
	}
	
	public void setPartdesc(String partdesc) {
		this.partdesc = partdesc;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		if(quantity<0)
			this.quantity =0;
		else
			this.quantity=quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price<0)
			this.price =0;
		else
			this.price=price;
	}
	
	public void acceptData() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Part No=");
		partno=sc.next();
		System.out.print("Enter Part Description=");
		partdesc=sc.next();
		
		System.out.print("Enter Quantity=");
		quantity=sc.nextInt();
		if(quantity<0)
			this.quantity =0;
		else
			this.quantity=quantity;
		
		System.out.print("Enter Price=");
		price=sc.nextDouble();
		if(price<0)
			this.price =0;
		else
			this.price=price;
	}
	
	public void displayData() {
		System.out.println("Part no is="+ partno);
		System.out.println("Part Description ="+ partdesc);
		System.out.println("Quantity of Parts ="+ quantity);		
		System.out.println("Price of Part ="+ price);		
	}
	
}
