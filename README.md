This is sample demo application of spring boot. It demonstrate the basic behavior of contoller and some simple annotations. 
it gives two Rest end points.
1. http://localhost:8080/stations
2. http://localhost:8080/stations/{id}  // With this end point, Path variable behavior can be observed.

   This application contains Controller, Repository (Station Repository), Staion (pojo data modelclass).
   No external data store is added. Data is maintained inside StationRepository as:

   private List<Station> stations =  Arrays.asList(new Station("one","HYD"), new Station("two","BLR"));

   Observe below annotations:-

   @GetMapping("/stations")
   @GetMapping("/stations/{id}")
   @Autowired -- With this option repository object injected to the controller. For this, Repository class must be Bean. (@Repository connverts Repo class into a Bean )

   @RestController -- @Controller + @ResponseBody
   @RespnseEntity -- Data + Status Code
   @RequestBody deserializes json to object.

   Packaged to be installed:
   -------------------------
   Spring Boot Extension Pack for VS code
   Java Extension Pack for VS code
   Spring Boot starter Web
   Spring boot Dev tools

   Useful Definitions
   ------------------
   Annotations - Adds the logic to an application without adding any code.
   Eg: @Controller - Converts class into controller. Class becomes entry point for all controllers.

   Bean is an object that Spring stores and manages for you.
   @Component automatically is bean.

   @Configuration marks the class as a source of Bean definations.
   @Bean -- Bean defination is an annotated method that return dependency.

   Eg:
   @Configuration
  public class AppConfig{

	    @Bean
	    public GradeService gradeService(){
      return new GradeService();
	}
}

   
