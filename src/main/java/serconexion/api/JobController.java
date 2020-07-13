package serconexion.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serconexion.service.JobService;
import serconexion.data.entity.Job;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/user")
@RestController //cambiar a lo apropiado para app

public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public void addJob( @RequestBody Job job){ jobService.addJob(job);    }

    @GetMapping
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping(path = "{idJob}")
    public Job getJobById(@PathVariable("idJob") UUID idJob){
        return jobService.getJobById(idJob).orElse(null);
    }

    @DeleteMapping(path = "{idJob}")
    public void deleteJobById(@PathVariable("idJob") UUID idJob){
        jobService.deleteJob(idJob);
    }
    @PutMapping(path = "{idJob}")

    public void updateJob(@PathVariable("idJob") UUID idJob, @RequestBody Job jobToUpdate){
        jobService.updateJob(idJob,jobToUpdate);
    }

    @GetMapping(path = "{idJob}")
    public String getLocationById(@PathVariable("idJob") UUID idJob, @RequestBody Job job){
        return jobService.locationJob(idJob,job);
    }

    @GetMapping(path = "{idJob}")
    public String getDescriptionById(@PathVariable("idJob") UUID idJob, @RequestBody Job job){
        return jobService.descriptionJob(idJob,job);
    }
}
