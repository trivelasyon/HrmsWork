package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTittleService;
import kodlamaio.hrms.entities.concretes.JobTittle;

@RestController
@RequestMapping("/api/JobTittles")
public class JobTittleController {
	
	private JobTittleService jobTittleService;
	
	public JobTittleController(JobTittleService jobTittleService) {
		super();
		this.jobTittleService=jobTittleService;
	}
	
	//iş listesi çekilir
	@GetMapping("/getJobList")
	public List<JobTittle> getJobList(){
		return this.jobTittleService.getJobTittle();
	}

	
}
