package javamanideep;

public class Coustomer {
	String cname;
	int cnum;
	String ccity;
	String cemail;
	static String item;
	static int amount;
	public Coustomer(String cname, int cnum, String ccity, String cemail,String item,int amount) {
		this.cname = cname;
		this.cnum = cnum;
		this.ccity = ccity;
		this.cemail = cemail;
		this.item=item;
		this.amount=amount;
	}
	public Coustomer() {
		this.cname ="raj";
		this.cnum = 676767;
		this.ccity = "vizag";
		this.cemail = "cemail";
		this.item="potato";
		this.amount=80;
	}
	void disp()
	{
		System.out.println(cname);
		System.out.println(cnum);
		System.out.println(ccity);
		System.out.println(cemail);
		System.out.println(item);
		System.out.println(amount);
	}
	public static void main(String[] args) {
		Coustomer c=new Coustomer("mani",9878,"vijayawada","deep@gmail.com","onnion",25);
		Coustomer c1=new Coustomer();
		c.disp();
		c1.disp();
	}
	

}
