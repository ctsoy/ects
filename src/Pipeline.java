import java.util.ArrayList;


public class Pipeline {
	
	private ArrayList<Candidate> canList = new ArrayList<Candidate>();

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

}
