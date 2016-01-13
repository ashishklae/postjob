package postjob.model;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.Repository;



public interface PostJobRepository extends Repository<PostJob,String> {
	
	List<PostJob> findAll();
    Optional<PostJob> findOne(String id);
    PostJob save(PostJob saved);
}
