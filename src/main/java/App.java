import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/job", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String position = request.queryParams("position");
      String company = request.queryParams("company");
      String location = request.queryParams("location");
      String description = request.queryParams("description");
      String startDate = request.queryParams("start-date");
      String endDate = request.queryParams("end-date");
      Job newJob = new Job(position, company, location, description, startDate, endDate);
      request.session().attribute("job", newJob);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
