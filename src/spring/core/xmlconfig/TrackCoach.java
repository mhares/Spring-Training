package spring.core.xmlconfig;

public class TrackCoach implements Coach {
	
	// define a private field for a dependency
	private FortuneService fortuneService;

	// create constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
