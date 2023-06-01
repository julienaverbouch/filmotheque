package fr.eni.movielibrary.dao.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bo.Member;
import fr.eni.movielibrary.dao.MemberDAO;

@Component
@Profile("jpa")
public class MemberDAOJPAImpl implements MemberDAO{
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	public List<Member> findAll() {
		return (List<Member>) memberRepository.findAll();
	}

	@Override
	public Member findById(long id) {
		Optional<Member> member = memberRepository.findById(id);
		return member.get();
	}

	@Override
	public void remove(long id) {
		memberRepository.deleteById(id);
		
	}

	@Override
	public void save(Member member) {
		memberRepository.save(member);
		
	}

}
