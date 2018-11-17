import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class Instructor implements Serializable {
    private String firstName;
    private String lastName;
    private String department;
    private String email;

    public Instructor(String firstName, String lastName, String department, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }
    public String getName() {
        return firstName;
    }
    public void setSur(String lastName) {
        this.lastName = lastName;
    }
    public String getSur() {
        return lastName;
    }
    public void setDep(String department) {
        this.department = department;
    }
    public String getDep() {
        return department;
    }
    public void setMail(String email) {
        this.email = email;
    }
    public String getMail() {
        return email;
    }

    public boolean equals(Object b) {
        if(b != null && this.getClass() == b.getClass())
            if(this.firstName.equals(((Instructor)b).firstName))
                return true;
        return false;
    }

    public String toString() {
        return firstName+" "+lastName+" - "+department+" - "+email;
    }

    public void serialize(Vector<Instructor> v) {
        try {
            FileOutputStream f = new FileOutputStream("course.out");
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