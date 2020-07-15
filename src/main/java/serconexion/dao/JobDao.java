package serconexion.dao;

import serconexion.data.entity.Job;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public abstract interface JobDao {

    int insertJob(UUID idJob, Job job);

    default int insertJob(Job job){
        UUID idJob = UUID.randomUUID();
        return insertJob(idJob,job);
    }

    List<Job> selectAllJobs();

    Optional<Job> selectJobById(UUID idJob);

    int deleteJobById(UUID idJob);

    int updateJobById(UUID idJob, Job job);

    //int descriptionJob(UUID idJob, Job job);

    //int locationJob(UUID idJob, Job job);
}
