package postJob;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/job")
public class postJobController {
	private final postJobService service;
	
	@Autowired
	postJobController(postJobService service) {
      this.service = service;
    }
	
	/*PostJob*/
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	postJobDTO CreatePostJob(@RequestBody  postJobDTO created) {
       return service.create(created);
    }
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.ACCEPTED)
	postJobDTO EditPostJob(@RequestBody  postJobDTO updated) {
	  return service.update(updated);
	}
	 /*Browse PostJobs */
    @RequestMapping(method = RequestMethod.GET)
	List<postJobDTO> findAll() {
	  return service.findAll();
	 
    }
   
}
