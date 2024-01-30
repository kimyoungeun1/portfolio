package member_ver1;

import java.util.Date;

public class MemberVO {

  private String name;
  private String email;
  private String pwd;
  private Date regDate;

  public MemberVO() {
  }

  public MemberVO(String name, String email, String pwd, Date regDate) {
    this.name = name;
    this.email = email;
    this.pwd = pwd;
    this.regDate = regDate;
  }

  @Override
  public String toString() {
    return "MemberVO [name=" + name + ", email=" + email + ", pwd=" + pwd + ", regDate=" + regDate
        + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }
}