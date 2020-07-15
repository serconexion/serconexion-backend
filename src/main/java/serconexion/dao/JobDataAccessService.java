
package serconexion.dao;

import org.springframework.stereotype.Repository;
import serconexion.data.entity.Job;


import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("postgres")
public abstract class JobDataAccessService implements JobDao {


    @Override
    public int insertJob(UUID idJob, Job job) {
        return 0;
    }

    @Override
    public int insertJob(Job job) {
        return 0;
    }

    @Override
    public List<Job> selectAllJobs() {
        return null;
    }


    @Override
    public Optional<Job> selectJobById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteJobById(UUID id) {
        return 0;
    }

    @Override
    public int updateJobById(UUID id, Job user) {
        return 0;
    }

    /*@Override
    public String descriptionJob(UUID idJob, Job job) {
        return null;
    }

    @Override
    public String locationJob(UUID idJob, Job job) {
        return null;
    }*/


}

