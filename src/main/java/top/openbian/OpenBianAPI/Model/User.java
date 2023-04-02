package top.openbian.OpenBianAPI.Model;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UID;
    @Column
    private String Name;
    @Column
    private String Password;
    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() { return Password; }
    public void setPassword(String Password) { this.Password = Password; }
}