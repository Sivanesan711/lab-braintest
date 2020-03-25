package service;

public class PersonalityCalculator
{
	public int[] findAnswers(String options) 
	{

		String c[]=options.split(",");
		 int n=c.length;
		int a[]=new int[n];
		int sum=0,count=1;
		for(int i=0;i<=n-1;i++)
        {
            a[i]=Integer.parseInt(c[i]);
            count=count+i;
            System.out.println("The answer - "+count+" is "+a[i]+".");
        }
		
		return a;	
	}

	public String findYourBrainType(String options)
	{
		int value[]=findAnswers(options);
		int n=value.length;
		int a=value[0]+value[1]+value[2]+value[4]+value[7]+value[9]+value[10]+value[11]+value[13]+value[17]+value[19];
		int b=value[3]+value[5]+value[6]+value[8]+value[12]+value[14]+value[15]+value[16]+value[18];
		int sum=66-a+b;
		System.out.println("Your total score is "+sum+".");
		if((sum>=22)&&(sum<=55))
			return "leftbrained";
		if((sum>=56)&&(sum<=64))
			return "No clear preference ";
		if((sum>=65)&&(sum<=100))
             return "rightbrained";
		else
		     return "false";	
		
	}	
}
