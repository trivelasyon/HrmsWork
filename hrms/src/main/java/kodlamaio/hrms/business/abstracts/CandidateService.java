package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService {

	boolean candidateUserControl(Candidate candidate);
	boolean candidateIdentityControl(Candidate candidate);
	boolean candidateUserEmailControl();
}
