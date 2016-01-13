package postjob.model;

public class PostJobDTO {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private  int userid;
	   private String Summary;
	   private String Category;
	   private String SubCategory;
	   private String Description;
	   private String ReferenceDocs;
	   private  int Budget;
	   private String INR;
	   private String Location;
	   private String City;
	   private String State;
	   private String Duration;
	   private String dateTimeOfPost;
	   private String Status;
	   private String Private;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getSubCategory() {
		return SubCategory;
	}
	public void setSubCategory(String subCategory) {
		SubCategory = subCategory;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getReferenceDocs() {
		return ReferenceDocs;
	}
	public void setReferenceDocs(String referenceDocs) {
		ReferenceDocs = referenceDocs;
	}
	public int getBudget() {
		return Budget;
	}
	public void setBudget(int budget) {
		Budget = budget;
	}
	public String getINR() {
		return INR;
	}
	public void setINR(String iNR) {
		INR = iNR;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getDateTimeOfPost() {
		return dateTimeOfPost;
	}
	public void setDateTimeOfPost(String dateTimeOfPost) {
		this.dateTimeOfPost = dateTimeOfPost;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getPrivate() {
		return Private;
	}
	public void setPrivate(String private1) {
		Private = private1;
	}
	public PostJobDTO() {
		
	

}}
