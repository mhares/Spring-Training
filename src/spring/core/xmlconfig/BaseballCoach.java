package spring.core.xmlconfig;

public class BaseballCoach implements Coach {
	
	
	// define a private field for a dependency
	private FortuneService fortuneService;

	// create constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30m on batting";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
