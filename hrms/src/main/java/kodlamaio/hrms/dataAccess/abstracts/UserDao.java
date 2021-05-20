package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserDao,Integer> {
	//sistemdeki emailleri çeken kod
	@Query("select email from users")
	List<String>getAllEmail();
}
