import org.springframework.stereotype.Repository;

@Repository

public interface UserRepositoryInterface  extends CrudRepository<User, Long>{
    
}
