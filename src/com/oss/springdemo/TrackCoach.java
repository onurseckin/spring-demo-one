package com.oss.springdemo;

public class TrackCoach implements Coach {

  private FortuneService fortuneService;

  public TrackCoach() {
    // created dummy empty constructor to silence MyApp.java file
  }

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  @Override
  public String getDailyFortune() {
    return "Just Do It:" + fortuneService.getFortune();
  }

}
