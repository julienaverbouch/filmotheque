package fr.eni.movielibrary.dao;

import java.util.List;

import fr.eni.movielibrary.bo.Member;

public interface MemberDAO {
	
	public List<Member> findAll();
	
	public Member findById(long id);
	
	public void remove(long id);
	
	public void save(Member member);

}
