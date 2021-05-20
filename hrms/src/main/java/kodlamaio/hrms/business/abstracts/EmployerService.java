package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
boolean EmployerEmailControl();
boolean EmployerUserControl(Employer employer);
}
