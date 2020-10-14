package com.JoshuaVanBaalen.LabB;

public class NoBobClub {
	
	String [] names;
	
	public NoBobClub() {
	}
	
	public void setClubNames(String [] names) throws Exception{
		this.names = names;
		bobCheck();
	}
	
//	in this block, we had to comment out the try catch statements so that the test would see the exception
//	however, if we were not specifically trying to see this exception in a test, this try catch block would handle
//	the exception
	public void bobCheck() throws BobCheckException{
//		try {
			for(int x = 0; x < names.length; x++) {
			
				if(names[x].equals("bob")) {
					throw new BobCheckException();
				}
			}
//		}catch(BobCheckException e){
//			System.out.println("BOB CHECK FAILED");
//			e.printStackTrace();
//		}
	}
}


