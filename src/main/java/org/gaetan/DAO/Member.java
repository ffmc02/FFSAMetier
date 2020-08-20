package org.gaetan.DAO;

public class Member {
    private int id;
    private String Name;
    private String Firstname;
    private String Email;
    private String Password;

    public Member(int id, String pseudo, String email) {
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getEmail() {
        return Email;
    }

    public Member(int id, String name, String firstname, String email, String password) {
        this.id = id;
        Name = name;
        Firstname = firstname;
        Email = email;
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
