package com.cw;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Student> students = new ArrayList<Student>();
	static List<StuBelowAverage> stuBelowAverages = new ArrayList<StuBelowAverage>();
	static List<StuAboveAverage> stuAboveAverages = new ArrayList<StuAboveAverage>();
	static List<ResitStudent> resitStudents = new ArrayList<ResitStudent>();
	static List<RetakeStudent> retakeStudents = new ArrayList<RetakeStudent>();
	static int overallAverage = 0;
	static String ovravv="";
	static String passednumber="";
	static String highestmarks=" ";
	static String lowestmarks=" ";

	public static void main(String[] args) {
		boolean stopLoop = false;
		String please = "Please Enter your ";
		Scanner cjSc = new Scanner(System.in);
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		System.out.println("**** Welcome to University of Gugsi, No where in Particular ****");
		System.out.println("****************************************************************");
		System.out.println("****************************************************************");
		do {
			System.out.println(please + "Registration Number :");
			String regNo = cjSc.nextLine();
			 String fName=nameValidator(cjSc,please+"First Name :");
			 String lName=nameValidator(cjSc,please+"Last Name :");
		//	String fName = cjSc.nextLine();
		//	String lName = cjSc.nextLine();
			int ict1mark = markvalid(cjSc, please + "ICT 1 Marks :");
			int ict2mark = markvalid(cjSc, please + "ICT 2 Marks :");
			int grpcw1mark = markvalid(cjSc, please + "Group Course Work 1 Marks :");
			int grpcw2mark = markvalid(cjSc, please + "Group Course Work 2 Marks :");
			int ovrModulemarks = (int) Math
					.round(ict1mark * 0.2 + (ict2mark * 0.2) + (grpcw1mark * 0.3) + (grpcw2mark * 0.3));
			Boolean EligibilityToGetAGrade = false;
			if ((ict1mark >= 30 && ict2mark >= 30 || (((ict1mark + ict2mark) / 2) >= 30) && grpcw1mark >= 30
					&& grpcw2mark >= 30 && ovrModulemarks >= 40)) {
				EligibilityToGetAGrade = true;
			}
			Grade grade = Grade.Fail;
			if (EligibilityToGetAGrade = true) {
				if (ovrModulemarks >= 70) {
					grade = Grade.First_Class;
				}
				if (ovrModulemarks >= 60 && ovrModulemarks <= 69) {
					grade = Grade.Second_Upper_Class;
				}
				if (ovrModulemarks >= 50 && ovrModulemarks <= 59) {
					grade = Grade.Second_Lower_Class;
				}
				if (ovrModulemarks >= 40 && ovrModulemarks <= 49) {
					grade = Grade.General_Pass;
				}
			}
			Boolean reSit;
			if (ovrModulemarks > 40
					&& (!((ict1mark >= 30) && (ict2mark >= 30) && (grpcw1mark) >= 30) && (grpcw2mark) >= 30)) {
				reSit = true;
			} else {
				reSit = false;
			}
			Boolean reTake;
			if (ovrModulemarks >= 30) {
				reTake = false;
			} else {
				reTake = true;
			}
			Student object1 = new Student(regNo, fName, lName, ict1mark, ict2mark, grpcw1mark, grpcw2mark,
					ovrModulemarks, grade, EligibilityToGetAGrade, reSit, reTake);
			students.add(object1);
			System.out.println("Do you want to continue (Type N to discontinue / any other to continue)");
			String answer = cjSc.next();
			cjSc.nextLine();
			if (answer.equalsIgnoreCase("N")) {
				stopLoop = true;
			}
		} while (!stopLoop);

		// String hist29="",hist39="",hist69="",hist100="";
		for (Student object1 : students) {
			if (object1.getOvrModulemarks() < 30) {
				hist29 += "*";
			}
			if (object1.getOvrModulemarks() > 29 && object1.getOvrModulemarks() < 40) {
				hist39 += "*";
				
			}
			if (object1.getOvrModulemarks() > 39 && object1.getOvrModulemarks() < 70) {
				hist69 += "*";
			}
			if (object1.getOvrModulemarks() > 69) {
				hist100 += "*";
			}
		}
		
		hist29v=verticalprinter(hist29);
		hist39v=verticalprinter(hist39);
		hist69v=verticalprinter(hist69);
		hist100v=verticalprinter(hist100);
		
		
		//Find passed number for the histogram
		int passnum=0;
		for (Student object1 : students)
		{
			if(object1.getOvrModulemarks()>=40)
					{
				passnum++;
					}
		}
		passednumber = String.valueOf(passnum);
		
		//Find Highest Mark
		
		int highest=0;
		
		for (Student object1 : students)
		{
			if (object1.getOvrModulemarks()>highest)
			{
				highest=object1.getOvrModulemarks();
			}
		}
		highestmarks = String.valueOf(highest);
		//Find lowest marks
		
		int lowest=100;
		
		for (Student object1: students)
		{
			if (object1.getOvrModulemarks()<lowest)
			{
				lowest=object1.getOvrModulemarks();
			}
		}
		
		lowestmarks = String.valueOf(lowest);

		// To find the average Module Marks
		int overallAveragesum = 0;
		for (Student object1 : students) {
			overallAveragesum += object1.getOvrModulemarks();
		}
		overallAverage = Math.round(overallAveragesum / students.size());
		ovravv = String.valueOf(overallAverage);

		int noStudentsLessThanAverage = 0, noStudentsAboveAverage = 0, noStudentsForResit = 0, noStudentsForRetake = 0;
		for (Student object1 : students) {
			// To find students less than the average
			if (object1.getOvrModulemarks() < overallAverage) {
				noStudentsLessThanAverage++;
				String regNo = object1.getRegNo();
				String fName = object1.getfName();
				String lName = object1.getlName();
				int ict1mark = object1.getIct1mark();
				int ict2mark = object1.getIct2mark();
				int grpcw1mark = object1.getGrpcw1mark();
				int grpcw2mark = object1.getGrpcw2mark();
				int ovrModulemarks = object1.getOvrModulemarks();
				boolean reSit = object1.getReSit();
				boolean reTake = object1.getReTake();
				Grade grade = object1.getGrade();
				StuBelowAverage object2 = new StuBelowAverage(regNo, fName, lName, ict1mark, ict2mark, grpcw1mark,
						grpcw2mark, ovrModulemarks, grade, reSit, reTake);
				stuBelowAverages.add(object2);
			}
			// To find students more than the average
			if (object1.getOvrModulemarks() > overallAverage) {
				noStudentsAboveAverage++;
				String regNo = object1.getRegNo();
				String fName = object1.getfName();
				String lName = object1.getlName();
				int ict1mark = object1.getIct1mark();
				int ict2mark = object1.getIct2mark();
				int grpcw1mark = object1.getGrpcw1mark();
				int grpcw2mark = object1.getGrpcw2mark();
				int ovrModulemarks = object1.getOvrModulemarks();
				Grade grade = object1.getGrade();
				boolean reSit = object1.getReSit();
				boolean reTake = object1.getReTake();
				StuAboveAverage object3 = new StuAboveAverage(regNo, fName, lName, ict1mark, ict2mark, grpcw1mark,
						grpcw2mark, ovrModulemarks, grade, reSit, reTake);
				stuAboveAverages.add(object3);
			}
			// To find the Resit Students
			if (object1.getReSit() == true && object1.getReTake() == false) {
				noStudentsForResit++;
				String regNo = object1.getRegNo();
				String fName = object1.getfName();
				String lName = object1.getlName();
				int ict1mark = object1.getIct1mark();
				int ict2mark = object1.getIct2mark();
				int grpcw1mark = object1.getGrpcw1mark();
				int grpcw2mark = object1.getGrpcw2mark();
				int ovrModulemarks = object1.getOvrModulemarks();
				Grade grade = object1.getGrade();
				boolean reSit = object1.getReSit();
				boolean reTake = object1.getReTake();
				ResitStudent object4 = new ResitStudent(regNo, fName, lName, ict1mark, ict2mark, grpcw1mark, grpcw2mark,
						ovrModulemarks, grade, reSit, reTake);
				resitStudents.add(object4);
			}
			if (object1.getReTake() == true) {
				++noStudentsForRetake;
				String regNo = object1.getRegNo();
				String fName = object1.getfName();
				String lName = object1.getlName();
				int ict1mark = object1.getIct1mark();
				int ict2mark = object1.getIct2mark();
				int grpcw1mark = object1.getGrpcw1mark();
				int grpcw2mark = object1.getGrpcw2mark();
				int ovrModulemarks = object1.getOvrModulemarks();
				Grade grade = object1.getGrade();
				boolean reSit = object1.getReSit();
				boolean reTake = object1.getReTake();
				RetakeStudent object5 = new RetakeStudent(regNo, fName, lName, ict1mark, ict2mark, grpcw1mark,
						grpcw2mark, ovrModulemarks, grade, reSit, reTake);
				retakeStudents.add(object5);

			}
		}

		double avict1 = 0, avict2 = 0, avgrpcw1 = 0, avgrpcw2 = 0;
		int averageIct1 = 0, averageIct2 = 0, averageGroupCW1 = 0, averageGroupCW2 = 0;
		for (Student object1 : students) {
			avict1 += object1.getIct1mark();
			avict2 += object1.getIct2mark();
			avgrpcw1 += object1.getGrpcw1mark();
			avgrpcw2 += object1.getGrpcw2mark();
		}
		averageIct1 = (int) Math.round(avict1 / students.size());
		averageIct2 = (int) Math.round(avict2 / students.size());
		averageGroupCW1 = (int) Math.round(avgrpcw1 / students.size());
		averageGroupCW2 = (int) Math.round(avgrpcw2 / students.size());

		int less30ict1 = 0, less30ict2 = 0, less30grpcw1 = 0, less30grpcw2 = 0;
		for (Student object1 : students) {
			if (object1.getIct1mark() <= 30) {
				less30ict1++;
			}
			if (object1.getIct2mark() <= 30) {
				less30ict2++;
			}
			if (object1.getGrpcw1mark() <= 30) {
				less30grpcw1++;
			}
			if (object1.getGrpcw2mark() <= 30)
				less30grpcw2++;
		}
		System.out.println("Total Number of Students Enrolled is :- " + students.size());
		String input2;
		boolean stop2 = false;
		do {
			System.out.println(
					"******************************************************************************************");
			System.out.println(
					"Please Enter :-\n\t\"A\" to Display Class Average\n\t\"B\" to Display Number of Students who"
					+ " have scored less than 30 for each component.\n\t\"C\" to Display the Students who have scored "
					+ "less than the Class Average\n\t\"D\" to Display the Students who have scored more than the Class "
					+ "Average\n\t\"E\" to Display re-Take Students\n\t\"F\" to Display re-Sit Students");
			
			System.out.println("\t\"G\" to Display Horizontal Histogram\n\t\"H\" to Display Vertical Histogram");
			System.out.println("\t\"I\" to Add more details of Students");
			System.out.println("******************************************************************************************\nAny other to Quit");
			input2 = cjSc.nextLine();
			switch (input2) {
			case "a": {
				System.out.println("*\tAverage marks for Components\n\tICT 01 :- " + averageIct1 + "\n\tICT 02 :- "
						+ averageIct2 + "\n\tGCW 01 :- " + averageGroupCW1 + "\n\tGCW 02 :- " + averageGroupCW2);
			}
				break;
			case "b": {
				System.out.println("*\tNumber of Students who have Scored less than 30 for Components\n\tICT 01 :- "
						+ less30ict1 + "\n\tICT 02 :- " + less30ict2 + "\n\tGCW 01 :- " + less30grpcw1
						+ "\n\tGCW 02 :- " + less30grpcw2);
			}
				break;

			case "c": {
				if (noStudentsLessThanAverage == 0) {
					System.out.println("There are no Students below the Average");
				} else {
					System.out.println("*\tOverall Average Mark is :- " + overallAverage);
					System.out.println("No. of Students below the Class Average is :- " + noStudentsLessThanAverage
							+ "\nTheir Details :- ");
					int counter1 = 1;
					for (StuBelowAverage object2 : stuBelowAverages) {
						System.out.println("Student " + counter1 + "\n\tRegistration Number :- " + object2.getRegNo()
								+ "\n\tFirst Name :- " + object2.getfName() + "\n\tLast Name :- " + object2.getlName()
								+ "\n\tICT 01 :- " + object2.getIct1mark() + "\n\tICT 02 :- " + object2.getIct2mark()
								+ "\n\tGCW 01 :- " + object2.getGrpcw1mark() + "\n\tGCW 02 :- "
								+ object2.getGrpcw2mark());
						counter1++;
					}
				}
			}
				break;
			case "d": {
				if (noStudentsAboveAverage == 0) {
					System.out.println("There are no Students above the Average");
				} else {
					System.out.println("*\tOverall Average Mark is :- " + overallAverage);
					System.out.println("No. of Students above the Class Average is :- " + noStudentsAboveAverage
							+ "\nTheir Details :- ");
					int counter2 = 1;
					for (StuAboveAverage object3 : stuAboveAverages) {
						System.out.println("Student " + counter2 + "\n\tRegistration Number :- " + object3.getRegNo()
								+ "\n\tFirst Name :- " + object3.getfName() + "\n\tLast Name :- " + object3.getlName()
								+ "\n\tICT 01 :- " + object3.getIct1mark() + "\n\tICT 02 :- " + object3.getIct2mark()
								+ "\n\tGCW 01 :- " + object3.getGrpcw1mark() + "\n\tGCW 02 :- "
								+ object3.getGrpcw2mark());
						counter2++;
					}
				}
			}
				break;
			case "e": {
				if (noStudentsForRetake == 0) {
					System.out.println("There are no Students for Retake");
				} else {
					System.out.println("No of Retake Students are :- " + noStudentsForRetake + "\nTheir Details");
					int counter4 = 1;
					for (RetakeStudent object5 : retakeStudents) {
						System.out.println("Student " + counter4 + "\n\tRegistration Number :- " + object5.getRegNo()
								+ "\n\tFirst Name :- " + object5.getfName() + "\n\tLast Name :- " + object5.getlName()
								+ "\n\tICT 01 :- " + object5.getIct1mark() + "\n\tICT 02 :- " + object5.getIct2mark()
								+ "\n\tGCW 01 :- " + object5.getGrpcw1mark() + "\n\tGCW 02 :- "
								+ object5.getGrpcw2mark());
						counter4++;
					}
				}
			}
				break;
			case "f": {
				if (noStudentsForResit == 0) {
					System.out.println("There are no Students for Resit");
				} else {
					System.out.println("No of Resit Students are :- " + noStudentsForResit);
					int counter3 = 1;
					for (ResitStudent object4 : resitStudents) {
						System.out.println("Student " + counter3 + "\n\tRegistration Number :- " + object4.getRegNo()
								+ "\n\tFirst Name :- " + object4.getfName() + "\n\tLast Name :- " + object4.getlName()
								+ "\n\tICT 01 :- " + object4.getIct1mark() + "\n\tICT 02 :- " + object4.getIct2mark()
								+ "\n\tGCW 01 :- " + object4.getGrpcw1mark() + "\n\tGCW 02 :- "
								+ object4.getGrpcw2mark());
						counter3++;
					}
				}
			}
				break;
			case "g": {
				Histo.main(args);
			}
				break;
			case "h": {
				VerHisto.main(args);
			}
				break;
			case "i": {
				main(args);
			}
			default:
				System.exit(0);
				//stop2 = true;
			}
			
			System.out.println("******************************************************************************************");

		} while (!stop2);
	}
	/* private String printStudent () {
		sstudent="Registration : "
	} */

	private static int markvalid(Scanner cj, String charith) {
		int marks;
		do {
			System.out.println(charith);
			while (!cj.hasNextInt()) {
				System.err.println("Your Input is Invalid\nPlease enter an Integer value : ");
				cj.next();
			}
			marks = cj.nextInt();
			if (!(marks >= 0 && marks <= 100)) {
				System.err.println("Your Input value should be within the range of 0 to 100");
			}
		} while (!(marks >= 0 && marks <= 100));

		return marks;
	}

	private static String nameValidator(Scanner cj, String label2) {
		String nameV = " ";
		do {
			System.out.println(label2);
			nameV = cj.nextLine();
			if (!(nameV.matches("[a-zA-Z]+"))) {
				System.err.println("Name should only contain Letters");
			}

		} while (!(nameV.matches("[a-zA-Z]+")));
		return nameV;
	}
	
	public static String verticalprinter(String verticallyprint) {
	    String ans = "<html>";
	    String br = "<br>";
	    String[] cjarray = verticallyprint.split("");
	    for (String letter : cjarray) {
	        ans += letter + br;
	    }
	    ans += "</html>";
	    return ans;
	}

	public static String hist29 = "", hist39 = "", hist69 = "", hist100 = "", hist29v="", hist39v="",hist69v="",hist100v="";
}
