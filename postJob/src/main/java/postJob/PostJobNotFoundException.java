package postJob;

public class PostJobNotFoundException  extends RuntimeException  {
	private static final long serialVersionUID = -2859292084648724403L;
	private final long id;
	
	public long getId() {
		return id;
	}

	public PostJobNotFoundException(long id) {
		this.id = id;
	}

}
