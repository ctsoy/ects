import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;


public class testCandidate {
	public Date d1;
	
	@Before
	public void setDate(){
		try{
			d1 = new SimpleDateFormat("MM-dd-yyyy", Locale.ENGLISH).parse("10-03-2013");
		} catch (Exception e){
			System.out.println(e);
		}
	}

	@Test
	// Candidate creation
	public void testCreateCandidate() {
		Candidate t1 = new Candidate("Mary Wang");
		assertNotNull("Candidate is created.", t1);
	}
	
	@Test
	// Retrieve candidate name
	public void testGetName(){
		Candidate t2  = new Candidate("Mary Wong");
		assertEquals("Candidate name is retrieved.", "Mary Wong", t2.getName());
	}
	
	@Test
	// Retrieve candidate resume
	public void testGetResume(){
		Candidate t3 = new Candidate("Mary Wong", d1, "http://somethingresume.com");
		assertEquals("Candidate resume is found.", "http://somethingresume.com", t3.getResume());
	}
	
	@Test
	// Add candidate resume
	public void testEditResume(){
		Candidate t4 = new Candidate("Peter Chan");
		t4.editResume("http://peter.resume.com");
		assertEquals("Candidate resume is added.", "http://peter.resume.com", t4.getResume() );
	}
	
	@Test
	// Retrieve date candidate is added
	public void testEntryDate(){
		Candidate t5 = new Candidate("John Wang", d1);
		assertEquals("Candidate entry date found.", d1, t5.getEntryDate());
		
	}
	
	@Test
	// Create candidate with source info. Retrieve candidate source.
	public void testGetSource(){
		Candidate t6 = new Candidate("Sandy Go", d1);
		t6.editSource(1);
		assertEquals("Candidate is found by recruiters.", 1, t6.getSource());
	}

}
