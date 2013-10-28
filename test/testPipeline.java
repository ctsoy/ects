import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;


public class testPipeline {
	
	public Candidate john;
	public Candidate katy;
	public Candidate ryan;
	
	@Before
	public void prepare(){
		Date d1 = null;
		
		try{
			d1 = new SimpleDateFormat("MM-dd-yyyy", Locale.ENGLISH).parse("10-03-2013");
		} catch (Exception e){
			System.out.println(e);
		}
		
		john = new Candidate("John Dough", d1);
		katy = new Candidate("Katy Perry", d1);
		ryan = new Candidate ("Ryan Bug", d1);
		ryan.editPosition("Intern");
		ryan.editResume("http://drive.google.com/ryanbugresume.pdf");
		ryan.editSource(0);
	}

	@Test
	public void testAddCandidate() {
		Pipeline p1 = new Pipeline();
		p1.addCandidate(john);
		p1.addCandidate(katy);
		assertEquals("There are 2 candidates in the pipeline.", 2, p1.getCandidates().size());
	}
	
	@Test
	public void testFindCandidateByName(){
		Pipeline p2 = new Pipeline();
		p2.addCandidate(john);
		assertEquals("John is found", 1, p2.findCandidateByName("John Dough").size());
	}
	
	@Test
	public void testGetDisplayDate(){
		Pipeline p3 = new Pipeline();
		assertEquals("Display John's entry date", "10-03-2013", p3.getDisplayDate(john.getEntryDate()));
	}
	
	@Test
	public void testGetDisplaySource(){
		Pipeline p5 = new Pipeline();
		assertEquals("Display source name", "UR", p5.getDisplaySource(ryan.getSource()));
	}
	
	@Test
	public void testCandidateToString(){
		Pipeline p4 = new Pipeline();
		p4.addCandidate(ryan);
		assertEquals("Print out Ryan's info.", "Ryan Bug, 10-03-2013, Intern, http://drive.google.com/ryanbugresume.pdf, UR", p4.candidateToString(ryan));
	}

}
