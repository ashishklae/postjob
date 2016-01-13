package postjob.model;

public class PostJobNotFoundException  extends RuntimeException  {
	private static final long serialVersionUID = -2859292084648724403L;
	private final String id;
	
	public String getId() {
		return id;
	}

	public PostJobNotFoundException(String id) {
		this.id = id;
	}

}
