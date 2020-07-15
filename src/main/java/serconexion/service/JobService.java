package serconexion.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import serconexion.dao.JobDao;
import serconexion.data.entity.Job;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public abstract class JobService implements JobDao {
    private final JobDao jobDao;

    public JobService(@Qualifier("postgres") JobDao jobDao) {
        this.jobDao = jobDao;
    }


    public int addJob(Job job){
        return jobDao.insertJob(job);
    }

    public List<Job> getAllJobs(){
        return jobDao.selectAllJobs();
    }

    public Optional<Job> getJobById(UUID id){
        return jobDao.selectJobById(id);
    }

    public int deleteJob(UUID id){
        return jobDao.deleteJobById(id);
    }

    public int updateJob(UUID id, Job newUser){
        return jobDao.updateJobById(id,newUser);
    }

    //public String descriptionJob(UUID idJob, Job job) { return jobDao.descriptionJob(idJob,job);}

    //public String locationJob(UUID idJob, Job job) { return jobDao.locationJob(idJob,job);}

}