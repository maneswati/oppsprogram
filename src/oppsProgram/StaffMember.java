package oppsProgram;

public class StaffMember   {
	
	String memberName, memberQualification;
	
	public StaffMember(String memberName, String memberQualification)
	{
		this.memberName=memberName;
		this.memberQualification=memberQualification;
	}

	public void showMemberDetails()
	{
		System.out.println("\n Staff Member Details : ");

		System.out.println("The Staff Member Name is : "+memberName);
		
		System.out.println("The Staff Member Name is : "+memberQualification);

	}
}
