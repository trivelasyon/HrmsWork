package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.User;

public class EmployerManager implements EmployerService {

	private User user;
	private UserDao userDao;
	
	public EmployerManager(User user, UserDao userDao) {
		super();
		this.user=user;
		this.userDao=userDao;
	}
	
	
	//employer mail daha önce eklendi mi , kontrol
	
	@Override
	public boolean EmployerEmailControl() {
		if(this.userDao.getAllEmail().contains(this.user.getEMail()))
		{
			return false;
		}
		else {
			return true;
		}
	}

	//employer boş birakilan alan kontrol

	@Override
	public boolean EmployerUserControl(Employer employer) {
		if(employer.getName() !=null || employer.getPhone() !=null || employer.getWeb_site() !=null || this.user.getEMail() !=null || this.user.getPassword() !=null) {
			return true;
		}
		else {
			return false;
		}
	}

}
