package fr.eni.movielibrary.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import fr.eni.movielibrary.bo.Member;

public interface MemberRepository extends CrudRepository<Member, Long>{

}
