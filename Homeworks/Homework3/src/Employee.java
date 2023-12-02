public class Employee {
    private String name;
    private String dateOfBirth;
    private String role;
    private int employeeId;
    private String email;
    private double salary;
    private boolean aboveAvg ;
    private String bar;
    
    
    /**
     * 
     */Name: Braelynne Sandreth
     * Course: MIST 352 001
     *HW3
     *Chat GPT: NO
     

    // Constructor 
     /**
      * 
      
    /**
     * You need to code this
     * This constructor accepts one line from a text file
     * It should split it up and initialize all attributes in this class using the values from the line
     * For example, name should equal to the first portion of the splited line and dateOfBirth is second and so on.
     * Lastly, set aboveAvg to false 
     * @param line
     */
    public Employee1(String line)   		
    		 
    	public Employee(String line)
 	   //Split the line
 	   String strLine = scnReader.NextLine();
 	   System.out.println(strLine.split(","));
 	   if (tokens.length>0) {
 		   this.name=tokens[0].trim();
 		   if (tokens.length>1) {
 			   this.dateOfBirth=tokens[1].trim();
 			   if (tokens.length > 2) {
 		            this.role = tokens[2].trim();
 		            if (tokens.length > 3) {
 		                this.employeeId = Integer.parseInt(tokens[3].trim());
 		            }
 		            if (tokens.length > 4) {
 		                this.email = tokens[4].trim();
 		                if (tokens.length > 5) {
 		                    this.salary = Double.parseDouble(tokens[5].trim());
 		                }
 		                this.aboveAvg=false;
 		                

        setAboveAvg(salary);
        
    }
    
    /**
     * You need to code this
     * This method accepts the average salary from the main and decide whether this employee's salary is above average or not
     * If it is, then set aboveAvg to true
     * @param intAverage
     */
   public void setAboveAvg(double dblAverage)
   
   public void setAboveAvg (double dblAverage) {
	   if (this.salary > dblAverage) {
		   this.aboveAvg =true;
	   } else {
		   this.aboveAvg = false;
	   }
   }
 
   
 			 
	
   /**
	 * You need to code this.
	 * This method accepts an employee's salary and returns a bar chart of stars representation of the salary
	 * For example, 
	 * 				if the salary is 60,000, then the bar should return 6 stars:  ******
	 * 				if the salary is 95,600, then the bar should return 9 stars:  *********
	 * @param salary: the employee salary
	 * @return bar: representation in start of the salary. Each * represents $10,000
	 */
   public String SalaryBarChart(double salary) {
	   int numStars =(int) (salary/10000);
	   StringBuilder barChart= new StringBuilder();
	   for (int i = 0; i <numStars; i++) {
		   barChart.append("*");
		   
	   }
	   }
	   return barChart.toString();
	   
			

	    	
   
   /**
    * You need to code this.
    * This method provides a summary of each employee.
    * It returns a string formatted to include: employee name, employee ID, the bar chart of the salary, and whether salary is above average or not.
    * @return : Formatted string of employees basic information.
    */
   public String SummerizeEmployee()
	
	 {String AboveAvg= AboveAvg ? "Above" : "Below";
	 return "Employee Name:" + "Employee ID:" + employeeId + name + "Salary Bar Chart:" + bar + "Salary Above Average" + AboveAvg;
		
	 }
	 
