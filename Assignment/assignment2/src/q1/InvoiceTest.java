package q1;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice i = new Invoice();
		i.acceptData();
		i.displayData();
		
		i.setPrice(-10);
		i.displayData();
		
		i.setQuantity(-9);
		i.displayData();

	}

}
