class Sports{
	static void cricketTeamMembers(String[] names)
	{
		System.out.println("Enter the CricketTeamMembersNames");
		System.out.println("Total cricketersNames:"+names.length);
		for(int index=0;index<names.length;index++)
		{
			String ref= names[index];
			System.out.println("Cricket Team Member Name:" +ref);		
		}
	}
	static void kabbadiTeamMembersJerseyNo(int []numbers)
	{
	     System.out.println("Enter thekabbaditeammembersjerseyno");	
		System.out.println("Total Jerseyno:"+numbers.length);
		for(int index=0;index<numbers.length;index++)
		{
			int ref= numbers[index];
			System.out.println("kabbadiTeamMembersJerseyNo:"+ref);
		}
	}
	static void FootBallTeamMembersSalary(double[]salary)	
	    {
            System.out.println("entered FootBallTeamMembersSalary"); 
	       	System.out.println("total Salary:"+salary.length);
			for(int index=0 ;index<salary.length;index++)
			{
             double ref=salary[index];			
			System.out.println("FootBallTeamMembersSalary:"+ref);
			}
	    }
		
	static void LudoTeamMobileNumber(long [] numbers)
    {
		   System.out.println("enter LudoTeamMobileNumber ");
		   System.out.println("total Mobilenumber:"+numbers.length);
		   for( int index=0;index<numbers.length;index++)
		   {
			  long ref=numbers[index];
			   System.out.println("LudoTeamMobileNumber:"+ref);
		   }	   
	}   	
		static void HockeyTeamMembersNoOfMatches(int[]matches)
	{
           System.out.println("entered HockeyTeamMembersNoOfMatches");
           System.out.println("total noofmatche:"+matches.length);
           for(int index=0;index<matches.length;index++)  
		   {
			   int ref=matches[index];
			   System.out.println("HockeyTeamMembersNoOfMatche:"+ref);
		   }
	}	
		static void KokoTeamMembersCountryCode(long []names)
		{
			System.out.println("entered KokoTeamMembersCountryCode");
			System.out.println("total memberscode:"+names.length);
			for (int index=0;index<names.length;index++)
			{
				long ref=names[index];
				System.out.println("KokoTeamMembersCountryCode:"+ref);
			}
		}		
		static void LagoriTeamMembersAlive(boolean[]names)
		{
			System.out.println("enterd LagoriTeamMembersAlive");
			System.out.println("total membersalive:"+names.length);
			for(int index=0;index<names.length;index++)
			{
				boolean ref=names[index];
				System.out.println("LagoriTeamMembersAlive:"+ref);
				
			}	
		}
	}
		

