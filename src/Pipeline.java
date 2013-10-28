import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Pipeline {
	
	private ArrayList<Candidate> canList = new ArrayList<Candidate>();
	private DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
	private String[] sourceName = {"UR", "Recruiters", "Internal", "Referral", "Outside"};
	
	public void addCandidate(Candidate c) {
		// TODO Auto-generated method stub
		canList.add(c);
	}

	public ArrayList<Candidate> getCandidates() {
		// TODO Auto-generated method stub
		return canList;
	}

	public ArrayList<Candidate> findCandidateByName(String name) {
		// TODO Auto-generated method stub
		ArrayList<Candidate> nameList = new ArrayList<Candidate>();
		for (int i = 0; i< canList.size(); i++){
			if (canList.get(i).getName().equalsIgnoreCase(name)){
				nameList.add(canList.get(i));
			}
		}
		return nameList;
	}

	public String candidateToString(Candidate c) {
		// TODO Auto-generated method stub
		return c.getName()+", "+getDisplayDate(c.getEntryDate())+", "+c.getPosition()+", "
				+c.getResume()+", "+getDisplaySource(c.getSource());
	}

	public String getDisplayDate(Date entryDate) {
		// TODO Auto-generated method stub
		return df.format(entryDate);
	}

	public String getDisplaySource(int source) {
		// TODO Auto-generated method stub
		return sourceName[source];
	}

}
