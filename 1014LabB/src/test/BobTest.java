package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JoshuaVanBaalen.LabB.BobCheckException;
import com.JoshuaVanBaalen.LabB.NoBobClub;

class BobTest {
	
	NoBobClub club = new NoBobClub();
	String [] clubNames = {"Bobby", "Robert", "Rob", "Robby", "bob"};

	
	@Test
	void testBobCheckException() {
		assertThrows(BobCheckException.class,() -> club.setClubNames(clubNames), "WE ALLOW NO BOBS HERE!!!");
	}
	
}
