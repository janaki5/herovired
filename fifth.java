import java.io.*;
import java.lang.Math;
class fifth
{
  public static void main(String args[])
  {
     String line=null;
     
     int total_Count=0;
     float total_Salary=0;
     double maximumBillAmount = Double.MIN_VALUE;
     double minimumBillAmount = Double.MAX_VALUE;
      try{
     BufferedReader sc = new BufferedReader(new FileReader("file1.csv"));
             while((line=sc.readLine())!=null){
           String[] employee = line.split(","); 
          //float billamount=Float.parseFloat()

	          total_Salary=Float.parseFloat(employee[3]);
            total_Count++;
            total_Salary++;
            maximumBillAmount=Math.max(maximumBillAmount,total_Salary);
            minimumBillAmount=Math.min(minimumBillAmount,total_Salary);
             }
             sc.close();
        }	   
	catch (IOException e)   
	{  
		e.printStackTrace();  
	}  
	System.out.println("Total Number of Records: "+total_Count);
        System.out.println("Total Salary paid to all the Employees: "+total_Salary);
        System.out.println("maximum amount"+maximumBillAmount);
        System.out.println("maximum amount"+minimumBillAmount);
 }
}