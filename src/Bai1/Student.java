package Bai1;

import java.time.LocalDate;

public class Student {
private String studentId;
private String studentName;
private int age;
private String sex;
private String phone;
private String address;
private float html;
private float css;
private float javascript;
private float avgMark;

    public Student() {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.html = html;
        this.css = css;
        this.javascript = javascript;
        this.avgMark = avgMark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String setStudentName(String studentName) {
        this.studentName = studentName;
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHtml() {
        return html;
    }

    public void setHtml(float html) {
        this.html = html;
    }

    public float getCss() {
        return css;
    }

    public void setCss(float css) {
        this.css = css;
    }

    public float getJavascript() {
        return javascript;
    }

    public void setJavascript(float javascript) {
        this.javascript = javascript;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }
    public void calAvgMark(){
        this.avgMark = (html+css+2*javascript)/4;
    }

    public String displayData()  {
        return
                " "+
                "Mã sinh viên: " + studentId +"       "+
                " Tên sinh viên: " + studentName +'\n'+
                " Năm sinh: " + (LocalDate.now().getYear() - getAge()+"            "+
                " Giới tính: " + sex +"          "+
                " Điện thoại: " + phone  +'\n'+
                " Địa chỉ: " + address +"        "+
                " Điểm TB: " + (html+css+2*javascript)/4)
                ;
    }
}
