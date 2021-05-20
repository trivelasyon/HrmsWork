package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import kodlamaio.hrms.entities.concretes.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate,Integer>  {
	
	//sistemdeki identity number ceken kod
	@Query("select identityNumber from candidates")
	List<String>getAllIdentity();
	
}
