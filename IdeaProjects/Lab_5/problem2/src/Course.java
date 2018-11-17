import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class Course implements Serializable {
    private String courseTitle;
    private Textbook t;
    private Instructor ins;

    public Course(String courseTitle, Instructor ins, Textbook t) {
        this.courseTitle = courseTitle;
        this.t = t;
        this.ins = ins;
    }

    public void setCourse(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public String getCourse() {
        return courseTitle;
    }
    public void setTextbook(Textbook t) {
        this.t = t;
    }
    public Textbook getTextbook() {
        return t;
    }
    public void setInstr(Instructor ins) {
        this.ins = ins;
    }
    public Instructor getInstr() {
        return ins;
    }

    public boolean equals(Object b) {
        if(b != null && this.getClass() == b.getClass())
            if(this.courseTitle.equals(((Course)b).courseTitle))
                return true;
        return false;
    }

    public String toString() {
        return courseTitle;
    }

    public void serialize(Vector<Course> v) {
        try {
            FileOutputStream f = new FileOutputStream("instr.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(v);
            o.flush();
            o.close();
            f.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}