package member_ver1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

  // 데이터베이스 저장소 역할을 대행하는 Map 객체
  private static Map<String, MemberVO> memMap = new HashMap<String, MemberVO>();

  // MemberVO 타입의 데이터를 받아 DB에 저장하는 함수
  public void insert(MemberVO vo) {
    memMap.put(vo.getEmail(), vo);
  }

  // 전달받은 이메일로 등록된 회원유무 확인함수
  public MemberVO selectOne(String email) {
    return memMap.get(email);// MemberVO 객체 리턴
  }

  // 전체회원 목록
  public Collection<MemberVO> selectList() {
    return memMap.values();
  }// end of selectList

  // 회원정보 수정
  public void update(MemberVO vo) {
    memMap.put(vo.getEmail(), vo);
  }

}