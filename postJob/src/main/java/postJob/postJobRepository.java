package postJob;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.Repository;



public interface postJobRepository extends Repository<PostJob,Long> {
	
	List<PostJob> findAll();
    Optional<PostJob> findOne(long id);
    PostJob save(PostJob saved);
}
