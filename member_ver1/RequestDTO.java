package member_ver1;

//사용자로부터 전달받은 데이터를 저장할 클래스 - Data Transfer Object
public class RequestDTO {

  // 이메일 이름 암호 암호확인
  private String email;
  private String name;
  private String pwd;
  private String confirmPwd;

  // 생성자함수
  public RequestDTO(String email, String name, String pwd, String confirmPwd) {
    this.email = email;
    this.name = name;
    this.pwd = pwd;
    this.confirmPwd = confirmPwd;
  }

  // 게터와 세터
  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getConfirmPwd() {
    return confirmPwd;
  }

  public void setConfirmPwd(String confirmPwd) {
    this.confirmPwd = confirmPwd;
  }

  // 입력한 두개의 비번 일치여부 확인
  public boolean comparePwd() {
    return pwd.equals(confirmPwd);
  }

}