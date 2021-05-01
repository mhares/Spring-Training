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
	
	
	// add method for startup bean
	public void doMyStartupStuff() {
		System.out.println("Track Coach : inside doMyStartupStuff() method ");
	}

	// add method for Cleanup bean
		public void doMyCleanupStuff() {
			System.out.println("Track Coach : inside doMyCleanupStuff() method ");
		}

}
