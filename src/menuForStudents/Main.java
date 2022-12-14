package menuForStudents;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static BigInteger factorial(int num) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean userNeed = true;
		boolean exit = true;
		boolean studentDetails = true;
		boolean myCurrency = true;
		Stack<String> st1 = new Stack<>();
		HashSet<String> emails = new HashSet<>();
		int currency;
		String currencyName = " ";
		Map<String, Double> studentsFees = new HashMap<>();
		Map<String, Map<String, Double>> studentsFeesAmount = new HashMap<>();
		Double studentFeesAmount = 0.0;
		Double studentsFeesCalculatedAmount = 0.0;
		Double amount;
		List<String> listOfEmails = new ArrayList<>();
		List<School> mySchools = new ArrayList<>();
		Mark mark1 = new Mark();

		System.out.println(" \n ");

		System.out.println("\t Welcome To My School Registration System Where You can Keep \n"
				+ "\t All Your Data and modify It Any Time and Anywhere !\n \t Please Provide Your Us With Information ! "
				+ " \n \t To Start The Journey Select One Of The Options Provided Below Please  ! ");
		System.out.println(" \n ");

		Boolean login = true;
		while (login = true) {
			System.out.println("\n Please Enter The User Name: ");
			String uName = sc.nextLine();

			try {
				if (!uName.equals("Rawdha")) {

					throw new Exception(" Oops ! User Name Is Not Found ! Try Again ");
				}
			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
				continue;
			}
			if (uName.equals("Rawdha")) {
				System.out.println(" Please Enter The User's passowrd: ");
				String uPas = sc.nextLine();
				try {
					if (uName.equals("Rawdha") && uPas.equals("12s1436")) {
						System.out.println(" Welcome Rawdha ! Access Accepted !! ");

					}

					else {
						login = false;
						throw new Exception("Wrong Password");
					}
				} catch (Exception e) {
					System.out.println("Exception : " + e.getMessage());
					continue;
				}
			}

			do {
				System.out.println(" \n ");

				System.out.println(" \t Select One Option : ");
				System.out.println(" \t 0 : Write it to File ");
				System.out.println(" \t 1 : My Students Details   ");
				System.out.println(" \t 2 : Show Me My School Details ");
				System.out.println(" \t 3 : Show Me My History ");
				System.out.println(" \t 4 : Show Me My Duplicated Data ");
				System.out.println(" \t 5 : Show Me My Fees ");
				System.out.println(" \t 6 : Coding Mathematical Problems ");
				System.out.println(" \t 7 : Show Me The Student Status ");

				System.out.println(" \n ");

				String option = sc.next();
				int op = Integer.parseInt(option);
				switch (op) {
				case 0:
					try {

						FileOutputStream fout = new FileOutputStream("output.txt");
						ObjectOutputStream out = new ObjectOutputStream(fout);
						out.writeObject(st1);
						out.flush();
						out.close();
						System.out.println("Serialization And DeSerialization Is SuccessFul ");
					}

					catch (Exception e) {
						System.out.println(e);
					}
					break;

				case 1:

					while (userNeed) {

						School school1 = new School();
						System.out.println("Enter School Name :");
						studentDetails = true;// reseting the loop to true
						String schoolName = sc.next();
						st1.push(schoolName);
						school1.setSchoolName(schoolName);
						System.out.println("Enter School Registrtaion Number :");
						Integer registrtaionNum = sc.nextInt();
						String ScoolRegistrtaionNum = Integer.toString(registrtaionNum);
						st1.push(ScoolRegistrtaionNum);
						school1.setSchoolRegisterationNumber(registrtaionNum);

						List<Student> myStudents = new ArrayList<>();
						String studentdName = "";
						Integer sId = 0;
						while (studentDetails) {

							Student student1 = new Student();
							System.out.println("Enter Student Name :");
							studentdName = sc.next();
							st1.push(studentdName);
							student1.setnameOfStudent(studentdName);

							try {
								System.out.println("Enter Student Id :");
								sId = sc.nextInt();
								String stdidS = Integer.toString(sId);
								st1.push(stdidS);
								student1.setidOfStudent(sId);

							} catch (InputMismatchException e) {
								System.out.println("\"This Id Contains Characters that are not accepted \"");
								sc.nextLine();
								continue;
							}

							System.out.println("Enter Student Date Of Birth :");
							String sDop = sc.next();
							st1.push(sDop);
							student1.setdobOfStudent(sDop);

							System.out.println("Enter Student Email :");
							String sE = sc.next();
							st1.push(sE);
							student1.setstudentEmail(sE);
							listOfEmails.add(sE);

							myCurrency = Boolean.TRUE;

							CurrencyInterface currencyManager = new Currency();

							while (myCurrency) {

								currencyManager.showStudentFeesAmount(studentdName, studentsFees, studentsFeesAmount);

								System.out.println("\t \n If You Want To Add A Currency Please Press 1 ");
								System.out.println("\t If You Want To Exit Please Press 0 ");
								int exitMyCurrencyLoop = sc.nextInt();
								if (exitMyCurrencyLoop == 0) {
									myCurrency = false;
								}
							}

							List<Subject> mySubjects = new ArrayList<>();

							Subject subject1 = new Subject();
							System.out.println("Enter Student Subject Name :");
							String sSn = sc.next();
							st1.push(sSn);
							subject1.setnameOfSubject(sSn);
							System.out.println("Enter Student Subject Id :");
							Integer sSi = sc.nextInt();
							String subId = Integer.toString(sSi);
							st1.push(subId);
							subject1.setidOfSubject(sSi);

							List<Mark> myMarks = new ArrayList<>();

							System.out.println("Enter Mark Of Assignment1 :");
							Integer ma = sc.nextInt();
							String m = Integer.toString(ma);
							st1.push(m);
							mark1.setmarkOfAssignment1(ma);
							System.out.println("Enter Mark Of Assignment2 :");
							Integer ma1 = sc.nextInt();
							String m1 = Integer.toString(ma1);
							st1.push(m1);
							mark1.setmarkOfAssignment2(ma1);
							System.out.println("Enter Mark Of Test1 :");
							Integer mt = sc.nextInt();
							String mOfT1 = Integer.toString(mt);
							st1.push(mOfT1);
							mark1.setmarkOfTest1(mt);
							System.out.println("Enter Mark Of Test2 :");
							Integer mt1 = sc.nextInt();
							String mOfT2 = Integer.toString(mt1);
							st1.push(mOfT2);
							mark1.setmarkOfTest2(mt1);

							myMarks.add(mark1);

							subject1.setmarkList(myMarks);

							mySubjects.add(subject1);

							student1.setlistSubjects(mySubjects);

							myStudents.add(student1);

							school1.setListStudents(myStudents);

							mySchools.add(school1);

							System.out.println(" \n ");
							System.out.println(" Would You Like To Add More Students ? \n"
									+ "Please Press 1 If You Want To add More Students \n" + "Please press 0 To Exit");
							Integer s = sc.nextInt();
							String moreS = Integer.toString(s);
							st1.push(moreS);
							if (s == 0) {
								studentDetails = false;
								System.out.println("Would You Like To Add A New School ?"
										+ "Please Press 1 If You Want To add New School \n" + "Please press 0 To Exit");
								Integer a = sc.nextInt();
								String moreSh = Integer.toString(a);
								st1.push(moreSh);

								if (a == 0) {
									userNeed = false;

								}

							}
						}
					}

					try {

						FileOutputStream fout = new FileOutputStream("output.txt");
						ObjectOutputStream out = new ObjectOutputStream(fout);
						out.writeObject(st1);
						out.flush();
						out.close();
						System.out.println("Serialization And DeSerialization Is SuccessFul ");
					}

					catch (Exception e) {
						System.out.println(e);
					}
					break;
				case 2:

					for (School sch : mySchools) {
						System.out.println("School Name Is:\t" + sch.getschoolName() + "\n"
								+ "School Registration Number Is:\t" + sch.getschoolRegistrtaionNumber() + "\n");
						for (Student std : sch.getListStudents()) {
							System.out.println("Student Name Is:\t" + std.getnameOfStudent() + "\n" + "Student Id Is:\t"
									+ std.getidOfStudent() + "\n" + "Student Date Of Birth Is:\t"
									+ std.getdobOfStudent());

							for (Subject sub : std.getlistSubjects()) {
								System.out.println("Student Subject Name Is:\t" + sub.getnameOfSubject() + "\n"
										+ "Student Subject Id Is:\t" + sub.getidOfSubject() + "\n");

								for (Mark mar : sub.getmarkList()) {
									System.out.println("Student Mark Of Assignment1 Is :\t" + mar.getmarkOfAssignment1()
											+ "\n" + "Student Mark Of Assignment2 Is:\t" + mar.getmarkOfAssignment2()
											+ "\n" + "Student Mark Of Test1 Is :\t" + mar.getmarkOfTest1());
								}

							}
						}
					}
					try {

						ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
						Stack<String> stackFromFile = (Stack<String>) in.readObject();
						System.out.println("Stack from File is " + stackFromFile);
						in.close();
					} catch (Exception e) {
						System.out.println(e);
					}

					break;
				case 3:

					while (st1.empty() == false) {
						System.out.println(st1.pop());
					}

					break;
				case 4:
					for (String email : listOfEmails) {
						if (emails.add(email) == false) {
							System.out.println("The Dublicated Emails Are : " + email);
						}
					}
					break;
				case 5:
					System.out.println(studentsFees);
					break;
				case 6:
					Boolean myMaths = true;
					while (myMaths) {
						System.out.println("\t Choose A Mathematical Problem :");
						System.out.println(" \t 1 : Get The Factorial Of A Number ");
						System.out.println(" \t 2 : Get The Fibonacci Of A Number ");
						System.out.println(" \t 3 : Get The Subtraction Of Two Numbers ");
						System.out.println(" \t 4 : Get The Addition Of Two Numbers ");
						System.out.println(" \t 0 : If You Are Done Press 0 To Exit  ");
						int mProblem = sc.nextInt();
						String mP = Integer.toString(mProblem);
						st1.push(mP);
						if (mProblem == 1) {
							System.out.println("Enter The Number To Be Factored ");
							Integer num = sc.nextInt();
							String n = Integer.toString(num);
							st1.push(n);
							BigInteger fact = factorial(num);
							System.out.println("The Factorial of " + num + " is: " + fact);
						} else if (mProblem == 2) {
							System.out.println("Enter The Length Of Your Fibonacci");
							int fibLength = sc.nextInt();
							String fL = Integer.toString(fibLength);
							st1.push(fL);
							System.out.println("Enter The First Number");
							int num1 = sc.nextInt();
							String n1 = Integer.toString(num1);
							st1.push(n1);
							System.out.println("Enter The Second Number");
							int num2 = sc.nextInt();
							String n2 = Integer.toString(num2);
							st1.push(n2);
							int num3 = 0;
							String n3 = Integer.toString(num3);
							st1.push(n3);
							System.out.println(num1 + " " + num2);
							for (int i = 0; i < fibLength; i++) {
								num3 = num1 + num2;
								num1 = num2;
								num2 = num3;
								System.out.println(num3);
							}
						} else if (mProblem == 3) {
							System.out.println("Enter The First Number");
							int snum1 = sc.nextInt();
							String sn1 = Integer.toString(snum1);
							st1.push(sn1);
							System.out.println("Enter The Second Number");
							int snum2 = sc.nextInt();
							String sn2 = Integer.toString(snum2);
							st1.push(sn2);
							int snum3 = 0;
							String sn3 = Integer.toString(snum3);
							st1.push(sn3);
							snum3 = snum2 - snum1;
							System.out.println("The result Of The Subtraction " + snum3);
						} else if (mProblem == 4) {
							System.out.println("Enter The First Number");
							int anum1 = sc.nextInt();
							String an1 = Integer.toString(anum1);
							st1.push(an1);
							System.out.println("Enter The Second Number");
							int anum2 = sc.nextInt();
							String an2 = Integer.toString(anum2);
							st1.push(an2);
							int anum3 = 0;
							String an3 = Integer.toString(anum3);
							st1.push(an3);
							anum3 = anum2 + anum1;
							System.out.println("The result Of The Addition " + anum3);
						} else if (mProblem == 0) {
							myMaths = false;
						}

					}

					break;
				case 7:

					mark1.getAssignmentTotalMark();
					mark1.getTestTotalMark();
					mark1.getStudentStatus();

				}

			} while (exit);

			login = false;
			System.out.println(" Access Denied ");

		}

	}
}
