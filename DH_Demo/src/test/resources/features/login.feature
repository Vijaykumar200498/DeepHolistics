Feature: Launching & Login DeepHolistics App
  Want to Launch the app in Emulator or Real Device and Login as user


  Scenario: Launch the app in device
    Given Launching the app
    And Verify the launch
    Then Click on Learn more button
    Then Click on Visit Website
    Then Navigate to Login Screen

  Scenario: Login into the app as existing User
    Given click on login button
    Then Select the country code
    And Enter the mobile number "7598928864"
    And Click on Get otp
    Then Enter the Otp into the field "6789"
    And Click on Continue button
    And Verify the Home Screen Showing or Not

  Scenario: Logout from the app
    Given Click on profile from tab bar
    Then Swipedown to find the logout button and click
    Then Check the Logout alert
    And click on yes

@Smoke
  Scenario: Launch the app in device2
    Given Launching the app
    And Verify the launch
    Then Click on Learn more button
    Then Click on Visit Website
    Then Navigate to Login Screen
    Given click on login button
    Then Select the country code1
    And Enter the mobile number "7488855136"
    And Click on Get otp
    Then Enter the Otp into the field "6789"
    And Click on Continue button
    And Verify the Home Screen Showing or Not
