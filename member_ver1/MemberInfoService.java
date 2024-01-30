package member_ver1;

import java.text.SimpleDateFormat;

public class MemberInfoService {

  private MemberDAO dao;

  public MemberInfoService() {
    dao = new MemberDAO();
  }

  public void printMember(String email) {

    MemberVO vo = dao.selectOne(email);

    if (vo == null) {
      System.out.println("입력한 이메일과 일치하는 회원정보가 없습니다.");
      return;
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String regDate = sdf.format(vo.getRegDate());

    System.out.printf("회원정보 - 이름:%s, 이메일:%s, 비번:%s, 등록일:%s\n", vo.getName(), vo.getEmail(),
        vo.getPwd(), regDate);
  }

}