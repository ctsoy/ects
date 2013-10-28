import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;


public class testPipeline {
	
	public Candidate john;
	public Candidate katy;
	
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

}
