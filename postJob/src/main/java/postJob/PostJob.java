   package postJob;

   import org.springframework.data.annotation.Id;
   import org.springframework.data.mongodb.core.mapping.Document;
 @Document
 public final class PostJob {
	
	@Id
	private long id;
   
   public int getUserid() {
	return userid;
}
public String getSummary() {
	return Summary;
}
public String getCategory() {
	return Category;
}
public String getSubCategory() {
	return SubCategory;
}
public String getDescription() {
	return Description;
}
public String getReferenceDocs() {
	return ReferenceDocs;
}
public int getBudget() {
	return Budget;
}
public String getINR() {
	return INR;
}
public String getLocation() {
	return Location;
}
public String getCity() {
	return City;
}
public String getState() {
	return State;
}
public String getDuration() {
	return Duration;
}
public String getDateTimeOfPost() {
	return dateTimeOfPost;
}
public String getStatus() {
	return Status;
}
public String getPrivate() {
	return Private;
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

        public void update(int userid, String summary, String category, String subCategory, String description,
		String referenceDocs, int budget, String iNR, String location, String city, String state, String duration,
		String dateTimeOfPost, String status, String private1) {
	
	this.userid = userid;
	Summary = summary;
	Category = category;
	SubCategory = subCategory;
	Description = description;
	ReferenceDocs = referenceDocs;
	Budget = budget;
	INR = iNR;
	Location = location;
	City = city;
	State = state;
	Duration = duration;
	this.dateTimeOfPost = dateTimeOfPost;
	Status = status;
	Private = private1;
}
public PostJob() {
	
}
   
   
  }
