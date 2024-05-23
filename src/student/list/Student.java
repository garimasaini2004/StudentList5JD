/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.list;

/**
 *
 * @author admin
 */
public class Student {
    private String name;
    private String studentid;

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getAddress() {
        return address;
    }
    private String address;
}
