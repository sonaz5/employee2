package nazansonal_211805027_lab5;

	public  class Invoice implements payable {
		 private String partNumber;
		 private String partDescription;
		 private int quantity;
		 private double pricePerItem;
		
		public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		     this.quantity= quantity;
		     this.pricePerItem = pricePerItem;
		     this.partNumber = partNumber;
		     this.partDescription = partDescription;}
		 public String getPartNumber() {
		     return partNumber;
		 }

		 public void setPartNumber(String partNumber) {
		     this.partNumber = partNumber;
		 }

		 public String getPartDescription() {
		     return partDescription;
		 }

		 public void setPartDescription(String partDescription) {
		     this.partDescription = partDescription;
		 }

		 public int getQuantity() {
		     return quantity;
		 }

		 public void setQuantity(int quantity) {
			 if (quantity>=0)
		     this.quantity = quantity;
		 }

		 public double getPricePerItem() {
		     return pricePerItem;
		 }

		 public void setPricePerItem(double pricePerItem) {
		     if (pricePerItem > 0) 
		     this.pricePerItem = pricePerItem;
		 }
		 @Override
			public double getPaymentAmount() {
				return quantity*pricePerItem;}
		@Override
		public String toString() {
			return "\nInvoice:"+"\nPart number : "+partNumber
					+ "\nQuantity : "+quantity
					+ "\nPrice per item : "+pricePerItem;
		}
		
	}	 

