package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTittleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTittleDao;
import kodlamaio.hrms.entities.concretes.JobTittle;


@Service
public class JobTittleManager implements JobTittleService {
	
	private JobTittleDao jobTittleDao;
	
	@Autowired
	public JobTittleManager(JobTittleDao jobTittleDao) {
		super();
		this.jobTittleDao=jobTittleDao;
	}

	public List<JobTittle> getJobTittle() {
		return this.jobTittleDao.findAll();
	}



}
