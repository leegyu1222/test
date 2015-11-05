package com.work.spring03.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.spring03.dto.Member;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	/** 로그인  */
	public String login(String userid, String userpw) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("userid", userid);
		hashmap.put("userpw", userpw);
		return sqlSession.selectOne("selectLogin", hashmap);
	}
	
	/** 회원 등록 */
	public int join(Member dto) {
		return sqlSession.insert("insertMember", dto);
	}
	

	
	
	
//	/* 로그인 */
//	public String login(String userid, String userpw){
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		String sql = "select grade from members_test where userid = ? and userpw= ?";
//		
//		try{
//			conn = getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, userid);
//			pstmt.setString(2, userpw);
//			rs = pstmt.executeQuery();
//			if(rs.next()){
//				return rs.getString("grade");
//			}
//		}catch(SQLException e){
//			System.out.println(e.getSQLState());
//		}finally{
//			close(conn,pstmt,rs);
//		}
//		
//		return null;
//	}
//	
//	/* 회원가입 */
//	public int join(Member member){
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		String sql = "insert into members_test values (?, ?, ?, ?, ?, ?, 'N', 0)";
//		
//		try{
//			conn = getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, member.getUserid());
//			pstmt.setString(2, member.getUserpw());
//			pstmt.setString(3, member.getName());
//			pstmt.setString(4, member.getMobile());
//			pstmt.setString(5, member.getEmail());
//			pstmt.setString(6, Utility.getCurrentDate());
//			return pstmt.executeUpdate();
//			
//			
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		return 0;
//	}
}
