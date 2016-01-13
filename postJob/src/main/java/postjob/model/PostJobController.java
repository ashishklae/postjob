package postjob.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/job")
public class PostJobController {
	private final PostJobService service;
	
	@Autowired
	PostJobController(PostJobService service) {
      this.service = service;
    }
	
	/*PostJob*/
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	PostJobDTO CreatePostJob(@RequestBody  PostJobDTO created) {
       return service.create(created);
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.ACCEPTED)
	PostJobDTO EditPostJob(@RequestBody  PostJobDTO updated) {
	  return service.update(updated);
	}
	 /*Browse PostJobs */
    @RequestMapping(method = RequestMethod.GET)
	List<PostJobDTO> findAll() {
	  return service.findAll();
	 }
    
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    PostJobDTO findById(@PathVariable("id") String id) {
        return service.findById(id);
    }
   
}
