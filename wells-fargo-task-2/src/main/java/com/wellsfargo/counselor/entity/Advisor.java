package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String advisorname;

    @Column(nullable = false)
    private String loginid;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    public Advisor(String advisorname, String loginid, String password, String phone, String email) {
        this.advisorname = advisorname;
        this.loginid = loginid;
        this.password = password;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getadvisorname() {
        return advisorname;
    }

    public void setadvisorname(String firstName) {
        this.advisorname = advisorname;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String lastName) {
        this.loginid = loginid;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
