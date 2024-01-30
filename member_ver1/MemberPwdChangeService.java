package member_ver1;

public class MemberPwdChangeService {

  private MemberDAO dao;

  public MemberPwdChangeService() {
    this.dao = new MemberDAO();
  }

  // 비번 변경 요청함수
  public void changePwd(String[] userInputs) {
    String email = userInputs[1];
    String oldPwd = userInputs[2];
    String newPwd = userInputs[3];

    // 이메일에 해당하는 회원유무
    MemberVO vo = dao.selectOne(email);
    if (vo == null) {
      System.out.println("입력한 이메일과 일치하는 회원정보가 없습니다.");
      return;
    }

    // 가져온 vo객체의 pwd 값을 변경
    if (vo.getPwd().equals(oldPwd)) {
      vo.setPwd(newPwd);
    } else {
      System.out.println("입력한 비번이 등록되어 있는 비번과 일치하지 않습니다.");
      return;
    }

    // 회원정보 수정요청
    dao.update(vo);

  }
}