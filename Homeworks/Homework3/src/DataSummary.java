import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 
 */
/**
 * Name: Braelynne Sandreth
     * Course: MIST 352 001
     *HW3
     *Chat GPT: YES
     *Promt: Copy and pasted the code and then the instructions and told it to code it. And if i got errors i asked it why it was wrong and tried to learn from it.
     *
     

 */
/**
 * @author MJ
 *
 */
public class DataSummary {
	public static final String ViewEmployeesForCeratinRole = null;
	private String fileLocation;
	private double averageSalary;
	public Object ViewAverageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return dblSum: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	public double getAverage() throws FileNotFoundException
	{File myFile = new File(fileLocation);
    Scanner inputFile = new Scanner(myFile);
    int count = 0;
    double totalSalary = 0.0;

    while (inputFile.hasNextLine()) {
        String strData2Show = inputFile.nextLine();
        String[] dataParts = strData2Show.split(",");
        
        // Assuming salary is the sixth element in the array (index 5)
        double salary = Double.parseDouble(dataParts[5].trim());
        totalSalary += salary;
        count++;
    }

    inputFile.close();

    if (count > 0) {
        return totalSalary / count;
    } else {
        // Return 0 if there are no employees
        return 0.0;
    }
}
		
	
	

	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeAndIDs() throws FileNotFoundException
	{
		File data = new File(fileLocation);
		Scanner scnReader = new Scanner(data);
		while(scnReader.hasNext()) {
			String strLine = scnReader.nextLine();
			
			System.out.println(strLine.split(",")[0]);
		}
			scnReader.close();
			
		
	}
	
	
	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void SearchEmployee(String strEmployee) throws FileNotFoundException
	{
		 File data= new file (fileLocation)
		 Scanner scnReader = new Scanner (System.in);
		 while(scnReader.hasNext()) {
			 System.out.println(scnReader.next());
			 scnReader.close();
		 

		
	}
	
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException
	{File myFile = new File(fileLocation);
    Scanner inputFile = new Scanner(myFile);
    StringBuilder result = new StringBuilder();
    boolean found = false;

    while (inputFile.hasNextLine()) {
        String strData2Show = inputFile.nextLine();
        String[] dataParts = strData2Show.split(",");
        String employeeRole = dataParts[2].trim(); // Assuming employee role is in the third column

        if (employeeRole.equalsIgnoreCase(strRole)) {
            // Employee in the specified role found, append the info to the result
            result.append("Employee Info: ").append(strData2Show).append("\n");
            found = true;
        }
    }

    inputFile.close();

    if (found) {
        // Display the result in a GUI
        JOptionPane.showMessageDialog(null, result.toString(), "Role Search Result", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // No employees found in the specified role
        JOptionPane.showMessageDialog(null, "No Employees Found in the Specified Role", "Role Search Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
		

		
	}
	

	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }

	public void ViewCertainRoles() {
		// TODO Auto-generated method stub
		
	}

	public void ViewAverageSalary() {
		// TODO Auto-generated method stub
		
	}

	public void SummarizeAndWriteData() {
		// TODO Auto-generated method stub
		
	}
	
}
