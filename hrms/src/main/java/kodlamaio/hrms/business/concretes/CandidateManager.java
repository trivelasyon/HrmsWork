package kodlamaio.hrms.business.concretes;

import java.util.List;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;;


public class CandidateManager implements CandidateService{
	
	private User user;
	private CandidateDao candidateDao;
	private UserDao userDao;
	List<String>candidateIdentityList;

	
	public CandidateManager(User user,CandidateDao candidateDao,UserDao userDao) {
		super();
		this.user=user;
		this.candidateDao=candidateDao;
		this.userDao=userDao;
	}
	
	//bos birakilan alan kontrol
	
	@Override
	public boolean candidateUserControl(Candidate candidate) {
		if(candidate.getName() !=null || candidate.getSurName() !=null || candidate.getIdentityNumber() !=null || this.user.getEMail() !=null || this.user.getPassword() !=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Candidate identity number daha önce eklendi mi kontrol

	@Override
	public boolean candidateIdentityControl(Candidate candidate) {
		
		candidateIdentityList=this.candidateDao.getAllIdentity();
		
		if(candidateIdentityList.contains(candidate.getIdentityNumber()))
				{
			return false;
		}
		else {
			return true;
		}
	}

	//Candidate mail daha önce eklendi mi kontrol ?
	
	@Override
	public boolean candidateUserEmailControl() {
		if(this.userDao.getAllEmail().contains(this.user.getEMail()))
		{
			return false;
		}
		else {
			return true;
		}
		
		
	}
}

	

