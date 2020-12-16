package org.edu;

public class Arts extends Education {
	
	
	public void ug() {
		System.out.println("75%");
	}
	
	
    public void pg() {
	System.out.println("80%");
    }
   public void bsc() {
	System.out.println("70%");
  }

    public void bed() {
	System.out.println("85%");
	
  }
   public void ba() {
	
	System.out.println("65%");
  }
  public static void main(String[] args){
	Arts e =new Arts();
	
	
	e.ug();
	e.pg();
	e.bsc();
	e.bed();
	e.ba();
}
}
