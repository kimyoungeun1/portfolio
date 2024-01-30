package member_ver1;

import java.util.Date;

public class MemberRegisterSerivce {

  private MemberDAO dao;

  public MemberRegisterSerivce() {
    this.dao = new MemberDAO();
  }

  public void regist(RequestDTO dto) {

    MemberVO vo = new MemberVO(dto.getName(), dto.getEmail(), dto.getPwd(), new Date());

    // 기존에 등록된 회원인지 확인
    if (dao.selectOne(dto.getEmail()) != null) {
      System.out.println("이미 등록된 회원의 이메일과 중복됩니다.");
      return;
    }

    dao.insert(vo);// MemberDAO 메소드를 통해 DB에 등록
    System.out.println("등록했습니다.");

  }// end of regist

}