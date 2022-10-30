package menuForStudents;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
		HashMap<String, Double> studentsFees = new HashMap<>();
		HashMap<String, HashMap<String, Double>> studentsFeesAmount = new HashMap<>();
		Double studentFeesAmount = 0.0;
		Double studentsFeesCalculatedAmount = 0.0;
		Double amount;
		List<String> listOfEmails = new ArrayList<>();
		List<School> mySchools = new ArrayList<>();

		System.out.println(" \n ");

		System.out.println("\t Welcome To My School Registration System Where You can Keep \n"
				+ "\t All Your Data and modify It Any Time and Anywhere !\n \t Please Provide Your Us With Information ! "
				+ " \n \t To Start The Journey Select One Of The Options Provided Below Please  ! ");
		System.out.println(" \n ");
		Boolean login = true;
		while (login = true) {
			System.out.println(" Please Enter The User Name: ");
			String uName = sc.nextLine();

//			if (!uName.equals("Rawdha")) {
//				System.out.println(" Oops ! User Name Is Not Found ! Try Again ");
//				continue;
//			}
			if (uName.equals(uName)) {
				System.out.println(" Please Enter The User's passowrd: ");
				String uPas = sc.nextLine();

				if (uName.equals(uName) && uPas.equals(uPas)) {
					System.out.println(" Welcome Rawdha ! Access Accepted !! ");
				} else {
					login = false;
					System.out.println(" Access Denied ");
					continue;
				}
				do {
					System.out.println(" \n ");

					System.out.println(" \t Select One Option : ");
					System.out.println(" \t 1 : My Students Details   ");
					System.out.println(" \t 2 : Show Me My School Details ");
					System.out.println(" \t 3 : Show Me My History ");
					System.out.println(" \t 4 : Show Me My Duplicated Data ");
					System.out.println(" \t 5 : Show Me My Fees ");
					System.out.println(" \t 6 : Coding Mathematical Problems ");

					System.out.println(" \n ");

					String option = sc.next();
					int op = Integer.parseInt(option);
					switch (op) {
					case 1:

						while (userNeed) {

							School school1 = new School();
							System.out.println("Enter School Name :");
							studentDetails = true;// reseting the loop to true
							String schN = sc.next();
							st1.push(schN);
							school1.setSchoolName(schN);
							System.out.println("Enter School Registrtaion Number :");
							Integer regN = sc.nextInt();
							String ScoolReg = Integer.toString(regN);
							st1.push(ScoolReg);
							school1.setSchoolRegisterationNumber(regN);

							List<Student> myStudents = new ArrayList<>();

							while (studentDetails) {

								Student student1 = new Student();
								System.out.println("Enter Student Name :");
								String stdN = sc.next();
								st1.push(stdN);
								student1.setnameOfStudent(stdN);
								System.out.println("Enter Student Id :");
								Integer sId = sc.nextInt();
								String stdidS = Integer.toString(sId);
								st1.push(stdidS);
								student1.setidOfStudent(sId);
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

								while (myCurrency) {
									System.out.println("Choose Currency :");
									System.out.println("1 : British pound");
									System.out.println("2 : US dollar ");
									System.out.println("3 : Swiss franc ");
									System.out.println("4 : Japanese yen");
									currency = sc.nextInt();
									System.out.println("Enter Student's  Fees Amount :");
									studentFeesAmount = sc.nextDouble();
									if (currency == 1) {
										currencyName = "British pound";
										studentsFeesCalculatedAmount = studentFeesAmount * 2.28754;
									} else if (currency == 2) {
										currencyName = "US dollar";
										studentsFeesCalculatedAmount = studentFeesAmount * 2.59503;
									} else if (currency == 3) {
										currencyName = "Swiss franc";
										studentsFeesCalculatedAmount = studentFeesAmount * 2.59009;
									} else if (currency == 4) {
										currencyName = "Japanese yen";
										studentsFeesCalculatedAmount = studentFeesAmount * 386.446;
									}
									studentsFees.put(currencyName, studentsFeesCalculatedAmount);
									studentsFeesAmount.put(stdN, studentsFees);
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

								Mark mark1 = new Mark();
								System.out.println("Enter Mark Of Assignment1 :");
								Integer ma = sc.nextInt();
								String m = Integer.toString(ma);
								st1.push(m);
//        	 mark1.setmarkOfAssignment1(ma);
//        	 System.out.println("Enter Mark Of Assignment2 :");
//        	 Integer ma1=sc.nextInt();
//        	 st1.push(ma1);
//        	 mark1.setmarkOfAssignment2(ma1);
//        	 System.out.println("Enter Mark Of Assignment3 :");
//        	 Integer ma2=sc.nextInt();
//        	 st1.push(ma2);
//        	 mark1.setmarkOfAssignment3(ma2);
								System.out.println("Enter Mark Of Test1 :");
								Integer mt = sc.nextInt();
								String mOfT1 = Integer.toString(mt);
								st1.push(mOfT1);
								mark1.setmarkOfTest1(mt);
//        	 System.out.println("Enter Mark Of Test2 :");
//        	 Integer mt1=sc.nextInt();
//        	 st1.push(mt1);
//        	 mark1.setmarkOfTest2(mt1);
//        	 System.out.println("Enter Mark Of Test3 :");
//        	 Integer mt2=sc.nextInt();
//        	 st1.push(mt2);
//        	 mark1.setmarkOfTest3(mt2);

								myMarks.add(mark1);

								subject1.setmarkList(myMarks);

								mySubjects.add(subject1);

								student1.setlistSubjects(mySubjects);

								myStudents.add(student1);

								school1.setListStudents(myStudents);

								mySchools.add(school1);

								

								System.out.println(" \n ");
								System.out.println(" Would You Like To Add More Students ? \n"
										+ "Please Press 1 If You Want To add More Students \n"
										+ "Please press 0 To Exit");
								Integer s = sc.nextInt();
								String moreS = Integer.toString(s);
								st1.push(moreS);
								if (s == 0) {
									studentDetails = false;
									System.out.println("Would You Like To Add A New School ?"
											+ "Please Press 1 If You Want To add New School \n"
											+ "Please press 0 To Exit");
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

							// while (st1.empty() == false) { out.writeObject(st1.pop()); }

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
								System.out.println("Student Name Is:\t" + std.getnameOfStudent() + "\n"
										+ "Student Id Is:\t" + std.getidOfStudent() + "\n"
										+ "Student Date Of Birth Is:\t" + std.getdobOfStudent());

								for (Subject sub : std.getlistSubjects()) {
									System.out.println("Student Subject Name Is:\t" + sub.getnameOfSubject() + "\n"
											+ "Student Subject Id Is:\t" + sub.getidOfSubject() + "\n");

									for (Mark mar : sub.getmarkList()) {
										System.out.println("Student Mark Of Assignment1 Is :\t"
												+ mar.getmarkOfAssignment1() + "\n" +
//				  "Student Mark Of Assignment2 Is:\t"+mar.getmarkOfAssignment2()+"\n"+
//				  "Student Mark Of Assignment3 Is:\t"+mar.getmarkOfAssignment3()+"\n"+
												"Student Mark Of Test1 Is :\t" + mar.getmarkOfTest1());
//				  "Student Mark Of Test2 Is :\t"+mar.getmarkOfTest2()+"\n"+
//				 "Student Mark Of Test3 Is :\t"+mar.getmarkOfTest3());
									}

								}
							}
						}
						try {

							ObjectInputStream in = new ObjectInputStream(new FileInputStream("output.txt"));
							 st1 = (Stack) in.readObject();
							System.out.println("Stack is "+st1 );
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
							System.out.println(" \t 3 : If You Are Done Press 3 To Exit  ");
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
								int num3;
								System.out.println(num1 + " " + num2);
								for (int i = 0; i < fibLength; i++) {
									num3 = num1 + num2;
									num1 = num2;
									num2 = num3;
									System.out.println(num3);
								}
							} else if (mProblem == 3) {
								myMaths = false;
							}

						}

						break;

					}

				} while (exit);
			}
			login = false;
			System.out.println(" Access Denied ");

		}

	}
}
