package postjob.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.stream.Collectors.toList;

@Service
public class PostJobServiceImp  implements PostJobService {

	@Autowired
	private final PostJobRepository repository;

	@Autowired
	 public PostJobServiceImp(PostJobRepository repository) {
       this.repository = repository;
   }

	@Override
	public PostJobDTO create(PostJobDTO pj) {

		PostJob postj = new PostJob(pj);
		repository.save(postj);
		 return convertToDTO(postj);

	}


	 @Override
	 public PostJobDTO update(PostJobDTO UID) {
		PostJob updated = findpostJobById(UID.getId());
        updated.update(UID.getUserid(), UID.getSummary(),UID.getCategory(),UID.getSubCategory(),UID.getState(), UID.getPrivate(), UID.getBudget(),UID.getCity(),UID.getDuration(),UID.getINR(), UID.getReferenceDocs(), UID.getStatus(), UID.getDateTimeOfPost(), UID.getDescription(), UID.getLocation());
        updated = repository.save(updated);
        return convertToDTO(updated);
     }

	 @Override
	 public List<PostJobDTO> findAll() {
		List<PostJob> postJobEntries = repository.findAll();
        return convertToDTOs(postJobEntries);
	 }

	  private List<PostJobDTO> convertToDTOs(List<PostJob> models) {
	        return models.stream()
	                .map(this::convertToDTO)
	                .collect(toList());
	    }

	  @Override
		public PostJobDTO findById(String id) {
			PostJob job = findpostJobById(id);
	        return convertToDTO(job);
		}

	 private PostJob findpostJobById(String id) {
        Optional<PostJob> result = repository.findOne(id);
        return result.orElseThrow(() -> new  PostJobNotFoundException(id));
     }
	//

	  private PostJobDTO convertToDTO(PostJob model) {
		 PostJobDTO dto = new PostJobDTO();

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
