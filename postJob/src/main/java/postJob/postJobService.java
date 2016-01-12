package postJob;

import java.util.List;



public interface postJobService {
	
	postJobDTO create(postJobDTO pj);
	
	List<postJobDTO> findAll();
 
	postJobDTO findById(long id);
	
    postJobDTO update(postJobDTO UID);

	
}
