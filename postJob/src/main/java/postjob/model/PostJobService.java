package postjob.model;

import java.util.List;



public interface PostJobService {
	
	PostJobDTO create(PostJobDTO pj);
	
	List<PostJobDTO> findAll();
 
	PostJobDTO findById(String id);
	
    PostJobDTO update(PostJobDTO UID);

	
}
