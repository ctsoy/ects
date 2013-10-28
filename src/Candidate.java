import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;




public class Candidate {

	private String name;
	private String resume;
	private Date entryDate;
	private int source;
	
	public Candidate(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public Candidate(String name, Date date) {
		// TODO Auto-generated constructor stub
		this.entryDate = date;
		this.name = name;
	}

	public Candidate(String name, Date date, String resume){
		// TODO Auto-generated constructor stub
		this.name = name;
		this.entryDate = date;
		this.resume = resume;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public Object getResume() {
		// TODO Auto-generated method stub
		return this.resume;
	}

	public void editResume(String link) {
		// TODO Auto-generated method stub
		this.resume = link;
	}

	public Date getEntryDate() {
		// TODO Auto-generated method stub
		return this.entryDate;
	}

	public void editSource(int source) {
		// TODO Auto-generated method stub
		this.source = source;
	}

	public int getSource() {
		// TODO Auto-generated method stub
		return source;
	}

}
