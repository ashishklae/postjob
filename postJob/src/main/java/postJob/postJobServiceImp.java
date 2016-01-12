package postJob;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static java.util.stream.Collectors.toList;

@Service
public class postJobServiceImp  implements postJobService {

	@Autowired
	private final postJobRepository repository;
	
	@Autowired
	 public postJobServiceImp(postJobRepository repository) {
       this.repository = repository;
   }
	
	@Override
	public postJobDTO create(postJobDTO pj) {
		
		PostJob  persisted = new PostJob();
		//persisted.save(persisted);
        return convertToDTO(persisted);
		
	}
	
	
	 @Override
	 public postJobDTO update(postJobDTO UID) {
		PostJob updated = findpostJobById(UID.getUserid());
        updated.update(UID.getUserid(), UID.getSummary(),UID.getCategory(),UID.getSubCategory(),UID.getState(), UID.getPrivate(), UID.getBudget(),UID.getCity(),UID.getDuration(),UID.getINR(), UID.getReferenceDocs(), UID.getStatus(), UID.getDateTimeOfPost(), UID.getDescription(), UID.getLocation());
        updated = repository.save(updated);
        return convertToDTO(updated);
     }

	 @Override
	 public List<postJobDTO> findAll() {
		List<PostJob> postJobEntries = repository.findAll();
        return convertToDTOs(postJobEntries);
	 }
	
	  private List<postJobDTO> convertToDTOs(List<PostJob> models) {
	        return models.stream()
	                .map(this::convertToDTO)
	                .collect(toList());
	    }

	  @Override
		public postJobDTO findById(long id) {
			PostJob job = findpostJobById(id);
	        return convertToDTO(job);
		}
	 
	 private PostJob findpostJobById(long id) {
        Optional<PostJob> result = repository.findOne(id);
        return result.orElseThrow(() -> new  PostJobNotFoundException(id));
     }
	//
	
	  private postJobDTO convertToDTO(PostJob model) {
		 postJobDTO dto = new postJobDTO();
	 
	        dto.setUserid(model.getUserid());
	        dto.setSummary(model.getSummary());
	        dto.setCategory(model.getCategory());
	        dto.setSubCategory(model.getSubCategory());
	        dto.setDescription(model.getDescription());
	        dto.setReferenceDocs(model.getReferenceDocs());
	        dto.setBudget(model.getBudget());
	        dto.setINR(model.getINR());
	        dto.setLocation(model.getLocation());
	        dto.setCity(model.getCity());
	        dto.setState(model.getState());
	        dto.setDuration(model.getDuration());
	        dto.setDateTimeOfPost(model.getDateTimeOfPost());
	        dto.setStatus(model.getStatus());
	        dto.setPrivate(model.getPrivate());
	 
	        return dto;
	    }




	

	

	
}
