package serconexion.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import serconexion.model.User;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgresql")
public class PostgreSqlUserDaoImpl implements UserDao {

    private static class UserRowMapper implements RowMapper<User>{

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            String id = resultSet.getString("idUser");
            UUID uuid = UUID.fromString(id);
            user.setIdUser(uuid);
            user.setName(resultSet.getString("Name"));
            user.setLastName(resultSet.getString("LastName"));
            user.setEmail((resultSet.getString("Email")));
            user.setPassword((resultSet.getString("Password")));
            user.setRole(resultSet.getString("Role"));
            user.setEnabled(resultSet.getBoolean("Enabeld"));
            user.setCreatedAt(resultSet.getDate("CreatedAt"));
            user.setUpdatedAt(resultSet.getDate("UpdatedAt"));
            user.setIdentificationDocument(resultSet.getInt("IdentificationDocument"));
            user.setBalance(resultSet.getDouble("Balance"));
            user.setRating(resultSet.getDouble("Rating"));
            /*
            Array result = resultSet.getArray("AllRatings");
            user.setAllRatings(Arrays.asList(@NotNull result));
            Array Place = resultSet.getArray("ListPlaces");
            user.setListPlaces(Arrays.asList(@NotNUll Place));
            Array card = resultSet.getArray("CreditCard");
            user.setCreditCards(Arrays.asList(@NotNUll card));
            */
            return user;
        }
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public int insertUser(User user) {
        LocalDate fecha = LocalDate.now();
        final String sql = "INSERT INTO User(idUser,Name,LastName,IdentificationDocument,Email,PassWord,Role,CreatedAt) VALUES(?,?,?,?,?,?,?,?) ";
        final String password =user.getPassword();
        final UUID id = user.getIdUser();
        final String email= user.getEmail();
        final String name=user.getName();
        final String lastName= user.getLastName();
        final String role = user.getRole();
        final int identificationDocument = user.getIdentificationDocument();
        final Date createdAt = Date.valueOf(fecha);
        jdbcTemplate.update(sql,new Object[]{id,name,lastName,identificationDocument,email,password,role, createdAt,id});
        return 0;
    }

    @Override
    public List<User> selectAllUsers() {

        //SELECT select_list FROM table_name
        final String sql = "SELECT * FROM User";
        List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
        return users;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    //-----------------------------------------------------------------------------
    //Si puedes cambiar el optional, para que nos de una valor, te lo agradeceria
    //-----------------------------------------------------------------------------

    public User selectUserbyId(UUID id) {
        //SELECT select_list FROM table_name WHERE column = value
        //String ID = id.toString(); --- No se si se pueda colocar con UUID en sql el id
        final String sql = "SELECT * FROM User WHERE ID =?";
        User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
        return user;
    }

    @Override
    public int deleteUserById(UUID id) {
        //DELETE FROM table_name WHERE column = value
        final String sql = "DELETE FROM User WHERE ID =?";
        jdbcTemplate.update(sql,id);
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        //UPDATE table_name SET column1=value, column2=value... WHERE column = value
        LocalDate fecha = LocalDate.now();
        final String password =user.getPassword();
        final String email= user.getEmail();
        final String name=user.getName();
        final String lastName= user.getLastName();
        final Date update = Date.valueOf(fecha); user.setUpdatedAt(Date.valueOf(fecha));
        final String sql = "UPDATE User SET Name=?, Password=?,Email =?,LastName=?,UpdatedAt=? WHERE ID =?";
        jdbcTemplate.update(sql,new Object[]{name,password,email,lastName,update,id});
        return 0;
    }
}
