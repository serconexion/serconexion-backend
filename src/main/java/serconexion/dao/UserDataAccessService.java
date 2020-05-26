package serconexion.dao;

import org.springframework.stereotype.Repository;
import serconexion.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserDataAccessService implements UserDao {
    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    /*
        @Override
        public List<User> selectAllUsers() {
            return List<User>(new User(UUID.randomUUID(),"FROM POSTGRES DB","FROM POSTGRES DB",
                    "FROM POSTGRES DB","FROM POSTGRES DB","FROM POSTGRES DB")) ;
        }
    */
    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        return 0;
    }
}
