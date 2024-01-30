package member_ver1;

import java.util.Collection;

public class MemberListService {

  private MemberDAO dao = new MemberDAO();

  // 전체회원정보 목록 출력 함수
  public void printMemberList() {

    Collection<MemberVO> list = dao.selectList();

    list.stream()
        .forEach(vo -> System.out.println("이름:" + vo.getName() + ", 이메일:" + vo.getEmail()));
  }

}