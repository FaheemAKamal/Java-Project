package sample;

//Faheem Kamal

import javafx.scene.image.Image;

public class Contact {
    private String first_name;
    private String middle_name;
    private String last_name;
    private String address;
    private String phonenum;
    private String cellnum;
    private String jobtitle;
    private Image picture;

    public String getFirst_name(){
        return first_name;
    }
    public String getMiddle_name(){
        return middle_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhonenum(){
        return phonenum;
    }
    public String getCellnum(){
        return cellnum;
    }
    public Image getPicture() {
        return picture;
    }
    public String getJobtitle(){ return jobtitle; }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
    public void setCellnum(String cellnum) {
        this.cellnum = cellnum;
    }
    public void setPicture(Image picture) {
        this.picture = picture;
    }
    public void setJobtitle(String jobtitle) { this.jobtitle = jobtitle; }
}
