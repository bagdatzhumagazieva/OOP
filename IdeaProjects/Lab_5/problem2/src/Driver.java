import java.io.*;
import java.util.*;

public class Driver {
    public static Date enterTime = new Date();
    public boolean equals(Object b) {
        if(b != null && this.getClass() == b.getClass())
            if(this.enterTime.equals(((Driver)b).enterTime))
                return true;
        return false;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));


        Vector<Textbook> books = new Vector<>();
        Vector<Instructor> instruct = new Vector<>();
        Vector<Course> courses = new Vector<>();

        Instructor ins = new Instructor("Askar", "Akshabaev", "FIT", "a.@gmail.com");
        Instructor ins1 = new Instructor("Beysenbek", "Baisakov", "FIT", "b.@gmail.com");
        instruct.add(ins);
        instruct.add(ins1);
        Textbook b1 = new Textbook("Algorithms", "Cormen", "254V6");
        Textbook b2 = new Textbook("Algorithm", "Beisenbek", "456D5");
        books.add(b1);
        books.add(b2);
        Course c1 = new Course("Ptogramming principles", ins, b1);
        Course c2 = new Course("Object oriented programming", ins1, b2);
        courses.add(c1);
        courses.add(c2);

        String userName;
        int password;

        try {

            exit:while(true) {
                System.out.println("\n1) Admin \n2) User \n3) Exit");
                int AdminOrUser = Integer.parseInt(console.readLine());

                if(AdminOrUser == 1) {
                    BufferedReader ad = new BufferedReader(new FileReader("name.txt"));
                    PrintWriter ad1 = new PrintWriter(new FileWriter("admin.txt"), true);

                    System.out.println("Enter your username and password");
                    userName = console.readLine(); // username console
                    password = (console.readLine()).hashCode(); // hashed password console
                    String name = ad.readLine().substring(10); // username file
                    String pass = ad.readLine().substring(10); // password file
                    ad.close();

                    // Checking the password and username
                    if(name.equals(userName) && Integer.parseInt(pass) == password) {
                        admin:while(true) {

                            //String line = ad.readLine();
                            Instructor i = null;

                            ad1.write(enterTime+" admin logged in to a system");
                            ad1.println();

                            System.out.println("\n1) Add new course \n2) Add new instructor  \n3) Add new textbook \n4) Exit");
                            int choice = Integer.parseInt(console.readLine());

                            //Add course
                            if(choice == 1) {
                                System.out.println("Enter the name of course");
                                String courseTitle = console.readLine();
                                String firstName = null, lastName = null;
                                String author = null, title = null;

                                //Instructor
                                System.out.println("\n1) Add new insructor \n2) Choose from existing instructor");
                                int addOrChoose = Integer.parseInt(console.readLine());
                                if(addOrChoose == 1) {
                                    System.out.println("Enter instructor's full name, department, email");
                                    firstName = console.readLine();
                                    lastName = console.readLine();
                                    String dep = console.readLine();
                                    String email = console.readLine();
                                    i = new Instructor(firstName, lastName, dep, email);
                                    instruct.add(i);
                                    ad1.write(enterTime + " admin added new instructor "+i.toString());
                                    ad1.println();
                                }
                                if(addOrChoose == 2) {
                                    int cnt = 1;
                                    Iterator it = instruct.iterator();
                                    while (it.hasNext()) {
                                        System.out.println(cnt+ ")"+it.next());
                                        cnt++;
                                    }
                                    int numbInst =  Integer.parseInt(console.readLine());
                                    ad1.write(enterTime + "admin chose instructor "+ instruct.get(numbInst-1));
                                    ad1.println();
                                }

                                //Books
                                System.out.println("\n1) Add new book \n2) Choose from existing books");
                                int addOrChoose1 = Integer.parseInt(console.readLine());
                                Textbook t = null;
                                if(addOrChoose1 == 1) {
                                    System.out.println("Enter title of a book, author and it's code");
                                    title = console. readLine();
                                    author = console.readLine();
                                    String isbn = console.readLine();
                                    t = new Textbook(title, author, isbn);
                                    books.add(t);
                                    ad1.write(enterTime + "admin added new book "+ t.toString());
                                    ad1.println();
                                }
                                if(addOrChoose1 == 2) {
                                    int cnt = 1;
                                    Iterator it = books.iterator();
                                    while (it.hasNext()) {
                                        System.out.println(cnt+ ")"+it.next());
                                        cnt++;
                                    }
                                    int numbInst =  Integer.parseInt(console.readLine());
                                    ad1.write(enterTime + "admin chose book "+ books.get(numbInst-1));
                                    ad1.println();
                                }
                                // Write in history
                                Course c = new Course(courseTitle, i, t);
                                courses.add(c);
                                ad1.write(enterTime + " admin added new course " + courseTitle);
                                ad1.println();
								/*ad1.write(enterTime + " admin added new instructor " + firstName+" "+lastName);
								ad1.println();
								ad1.write(enterTime + " admin added new book " + author+" "+title);
								ad1.println();*/
                                System.out.println("\n 1) Return back \n 2) Exit");
                                int choice1 = Integer.parseInt(console.readLine());
                                if(choice1==1) continue admin;
                                if(choice1==2) {System.out.println("Bye!!!"); break exit;}


                                c.serialize(courses);
                            }

                            // Add instructor
                            if(choice == 2) {
                                System.out.println("Enter instructor's full name, department and email");
                                String firstName = console.readLine();
                                String lastName = console.readLine();
                                String department = console.readLine();
                                String email = console.readLine();
                                i = new Instructor(firstName, lastName, department, email);
                                instruct.add(i);
                                ad1.write(enterTime + " admin added new instructor "+i.toString());
                                ad1.println();

                                System.out.println("\n 1) Return back \n 2) Exit");
                                int choice1 = Integer.parseInt(console.readLine());
                                if(choice1==1) continue admin;
                                if(choice1==2) {System.out.println("Bye!!!"); break exit;}


                                i.serialize(instruct);
                            }

                            // Add book
                            if(choice == 3) {
                                System.out.println("Enter book's title, author and code");
                                String title = console.readLine();
                                String author = console.readLine();
                                String isbn = console.readLine();
                                Textbook t = new Textbook(title, author, isbn);
                                books.add(t);
                                ad1.write(enterTime + " admin added new books "+t.toString());
                                ad1.println();

                                t.serialize(books);

                                ad1.close();

                                System.out.println("\n 1) Return back \n 2) Exit");
                                int choice1 = Integer.parseInt(console.readLine());
                                if(choice1==1) continue admin;
                                if(choice1==2) {System.out.println("Bye!!!"); break exit;}
                                break;
                            }
                            if(choice == 4) {
                                System.out.println("Bye!!!"); break exit;
                            }
                        }
                    }
                    else {
                        System.out.println("Wrong username or password!!!");
                        continue exit;
                    }
                }
                if(AdminOrUser == 2) {

                    user:while(true) {

                        //BufferedReader us = new BufferedReader(new FileReader("admin.txt"));
                        BufferedWriter us1 = new BufferedWriter(new FileWriter("admin.txt"));

                        us1.write(enterTime+" user logged in to a system");
                        System.out.println("\n1) Courses \n2) Instructors \n3) Books \n4) Exit");
                        int choice = Integer.parseInt(console.readLine());

                        // Watch courses
                        if(choice == 1) {
                            FileInputStream fis = new FileInputStream("course.out");
                            ObjectInputStream oin = new ObjectInputStream(fis);
                            Course co = (Course) oin.readObject();
                            System.out.println(co);
                            Iterator it = courses.iterator();
                            while (it.hasNext()) {
                                System.out.println(it.next());
                            }
                            us1.write("User watched courses");
                            System.out.println("\n 1) Return back \n 2) Exit");
                            int choice1 = Integer.parseInt(console.readLine());
                            if(choice1==1) continue user;
                            if(choice1==2) {System.out.println("Bye!!!"); break exit;}
                            break;
                        }

                        // Watch instructors
                        if(choice == 2) {
                            FileInputStream fis = new FileInputStream("instr.out");
                            ObjectInputStream oin = new ObjectInputStream(fis);
                            Instructor in = (Instructor) oin.readObject();
                            //System.out.println(in);
                            Iterator it = instruct.iterator();
                            while (it.hasNext()) {
                                System.out.println(it.next());
                            }
                            us1.write("User watched instructors");
                            System.out.println("\n 1) Return back \n 2) Exit");
                            int choice1 = Integer.parseInt(console.readLine());
                            if(choice1==1) continue user;
                            if(choice1==2) {System.out.println("Bye!!!"); break exit;}
                            break;
                        }

                        // Watch books
                        if(choice == 3) {
                            FileInputStream fis = new FileInputStream("book.out");
                            ObjectInputStream oin = new ObjectInputStream(fis);
                            Vector<Textbook> bo = (Vector<Textbook>) oin.readObject();
                            System.out.println(bo);
									/*Iterator it = (Iterator) books.iterator();
								    while (it.hasNext()) {
								      System.out.println(it.next());
									}*/
                            us1.write("User watched books");
                            System.out.println("\n 1) Return back \n 2) Exit");
                            int choice1 = Integer.parseInt(console.readLine());
                            if(choice1==1) continue user;
                            if(choice1==2) {System.out.println("Bye!!!"); break exit;}
                            break;
                        }
                        if(choice == 4) {
                            System.out.println("Bye!!!"); break exit;
                        }
                    }
                }
                if(AdminOrUser == 3) {
                    System.out.println("Bye!!!"); break exit;
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}