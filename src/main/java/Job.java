public class Job {
  private String mPosition;
  private String mCompany;
  private String mLocation;
  private String mDescription;
  private String mStartDate;
  private String mEndDate;

  public Job(String position, String company, String location, String description, String startDate, String endDate) {
    mPosition = position;
    mCompany = company;
    mLocation = location;
    mDescription = description;
    mStartDate = startDate;
    mEndDate = endDate;
  }

  public String getPosition() {
    return mPosition;
  }

  public String getCompany() {
    return mCompany;
  }

  public String getLocation() {
    return mLocation;
  }

  public String getDescription() {
    return mDescription;
  }

  public String getStartDate() {
    return mStartDate;
  }

  public String getEndDate() {
    return mEndDate;
  }
}
