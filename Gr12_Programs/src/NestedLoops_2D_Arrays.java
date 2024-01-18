/*
 * March 1, 2022
 * 
 * Nested loops and 2D arrays
 * very important iteration to be comfortable with
 * requires alot of practise
 * 
 * Nested loop- loop within a loop
 */
public class NestedLoops_2D_Arrays 
{
	public static void main(String[] args) 
	{
		// Variable Declarations & Initializations
		double total = 0;
		double classTotal = 0;
		/*Simple trace through a nested loop
		*Presume we have a rectangular floor
		*		Iterate through the coords of each tile
		* for i... ,         <--- rows
		* 		for j...     <--- columns
		*/
		//ex 3 by 4 rectagle
		for (int i = 0; i < 3; i++)                           //Inner loop will loop i times, and j
		{ 													  //will loop through j times for each i
			for(int j = 0; j < 4; j++)
			{
				System.out.print("{" + i + "," + j + "}  ");
			}//end loop
			System.out.print("\n");
		}//end loop
		System.out.println("\n\n2D Arrays:\n");
								/** 2D Array is an array of arrays **/
		//EX. Array of classes: each class has an array of students' grades  4grades/per class (5 classes)
		/**         String[] teachers = new String[5];   **/
		/**         int[][] grades = new int[5][4]; //5 classes of 4 grades  **/
		//we can assign a literal declaration to 2D arrays
		String[] teachers = {"Ms. Annetta", "Mr morazo", "Mr. Engels", "Mr. Mama", "Mr. Sedran"};
		int[][] numCourses = new int[5][4];
		numCourses[0][0] = 35;
		numCourses[0][1] = 35;
		numCourses[0][2] = 36;
		numCourses[0][3] = 37;
		//ANOTHER CLASS                           //NOT EFFICIENT: USE NESTED LOOP CUHH
		numCourses[1][0] = 35;
		numCourses[1][1] = 35;
		numCourses[1][2] = 36;
		numCourses[1][3] = 37;
		
		int[][] courseGrades = { 	{90,92,95,97}, 
									{90,100,75,87}, 
									{74,64,99,23}, 
									{64,96,82,78}, 
									{90,92,95,97} };
		for (int i = 0; i < teachers.length; i++)
		{
			System.out.println(teachers[i]);
			for(int j = 0; j < courseGrades[0].length; j++)
			{
				System.out.print(courseGrades[i][j] + "%,   ");
			}//end loop
			System.out.print("\n");
		}//end loop
		System.out.println("\n\n");
		for (int i = 0; i<teachers.length;i++)
		{
			for (int j = 0; j < courseGrades[0].length; j++)
			{
				classTotal += courseGrades[i][j];
			}//end loop
			System.out.println("The average for " + teachers[i] + "'s class is: " + classTotal/courseGrades[0].length);
			total+=classTotal;
			classTotal = 0;
		}//end loop
		System.out.println("The average for all marks is: " + total/(teachers.length*courseGrades[0].length));
	}//end main()
}//end class()
