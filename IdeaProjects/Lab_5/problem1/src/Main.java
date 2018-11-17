import java.io.*;
import java.util.*;
public class Main {

    static void File(){
        try{
            FileReader fr=new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\Lab5\\untitled\\src\\scores.txt");
            BufferedReader br=new BufferedReader(fr);
            String ss=br.readLine();
            while(ss!=null){
                String[] list = ss.split(" ");
                Student s;
                s = new Student(list[0],list[1],Integer.parseInt(list[2]));
                ss=br.readLine();
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void Write(){
        try{
            FileWriter fw=new FileWriter("grades.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            String grade="";
            for(Student s:
                    Student.students){
                if(Student.scores.last()-10<=s.score)
                    grade="- “A”\n";
                else if(Student.scores.last()-20<=s.score)
                    grade="- “B”\n";
                else if(Student.scores.last()-30<=s.score)
                    grade="- “C”\n";
                else if(Student.scores.last()-40<=s.score)
                    grade="- “D”\n";
                else
                    grade="- “F”\n";
                bw.write(s+grade);
            }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void Statistics(){
        try {
            FileWriter to_file = new FileWriter("grades.txt",true);
            BufferedWriter bw=new BufferedWriter(to_file);
            int mini=Student.scores.first(),maxi=Student.scores.last(),avg=0;
            for (Student s: Student.students
            ) {
                avg+=s.score;
            }
            avg/=Student.students.size();
            bw.write("Avarage - "+avg+"\n");
            bw.write("Maximum - "+maxi+"\n");
            bw.write("Minimum - "+mini+"\n");


            bw.close();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    public static void main(String [] args){
        File();
        Write();
//        Statistics();

    }


}
