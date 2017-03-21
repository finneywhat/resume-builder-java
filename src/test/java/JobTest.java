import org.junit.*;
import static org.junit.Assert.*;

public class JobTest {

  @Test
  public void Job_instantiatesCorrectly_true() {
    Job myJob = new Job("", "", "", "", "", "");
    assertTrue(myJob instanceof Job);
  }

  @Test
  public void Job_instantiatesWithPositionTitle_String() {
    Job myJob = new Job("Back Scrubber", "", "", "", "", "");
    assertEquals("Back Scrubber", myJob.getPosition());
  }

  @Test
  public void Job_instantiatesWithCompanyName_String() {
    Job myJob = new Job("Back Scrubber", "YWCA", "", "", "", "");
    assertEquals("YWCA", myJob.getCompany());
  }

  @Test
  public void Job_instantiatesWithLocation_String() {
    Job myJob = new Job("Back Scrubber", "YWCA", "London", "", "", "");
    assertEquals("London", myJob.getLocation());
  }

  @Test
  public void Job_instantiatesWithDescription_String() {
    Job myJob = new Job("Back Scrubber", "YWCA", "London", "scrub backs", "", "");
    assertEquals("scrub backs", myJob.getDescription());
  }

  @Test
  public void Job_instantiatesWithStartDate_String() {
    Job myJob = new Job("Back Scrubber", "YWCA", "London", "scrub backs", "January 1982", "");
    assertEquals("January 1982", myJob.getStartDate());
  }

  @Test
  public void Job_instantiatesWithEndDate_String() {
    Job myJob = new Job("Back Scrubber", "YWCA", "London", "scrub backs", "January 1982", "February 1982");
    assertEquals("February 1982", myJob.getEndDate());
  }
}
