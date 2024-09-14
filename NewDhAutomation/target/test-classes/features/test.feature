
Feature: Launching & Login DeepHolistics App
  Want to Launch the app in Emulator or Real Device and Login as user

  Scenario: Launch the app in device
    Given Launching the app
    And Verify the launch
    Then Click on Learn more button
    Then Click on Visit Website
    Then Navigate to Login Screen

	Scenario: Login as existing user into the app
    Given click on login button
	#	Then Select the country code
    And Enter the mobile number "7598928864"
    And Click on Get otp
    Then Enter the Otp into the field "6789"
    And Click on Continue button
  # And Verify the Home Screen Showing or Not