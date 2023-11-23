package Assignment7;

public class Bank {
 
	private int bno;
	private String bname;
	private String loc;
	
	public Bank(int bno,String bname,String loc) {
		this.bno = bno;
		this.bname = bname;
		this.loc = loc;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
