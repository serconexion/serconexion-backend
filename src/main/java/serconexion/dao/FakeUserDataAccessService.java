package serconexion.dao;

import org.springframework.stereotype.Repository;
import serconexion.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB= new ArrayList<>();
    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id,user.getName(),user.getLastName(),user.getIdentificationDocument(),
                user.getEmail(),user.getPassword()));
        return 1;
    }
}
