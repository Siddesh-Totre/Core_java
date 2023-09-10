package auto;

public interface Payment {
	public void cash(int amount,int tax);
	public  void upi(int amount,int tax);
	 public void emi(int amount,int tax);

}
