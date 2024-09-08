Feature: Sending The Notification

  Scenario Outline: Send App Notification to Customer
    Given Click notification button
    And Click on App Notification Option
    And Click on send notification
    And Click the User UUID Field and enter the ID "<uuid>"
    And Click Notification type and select the type "<Type>"
   	When User click on the Send Notification button
   	
   #	Then Confirmation Alert showing for sending the notification
    And Click on Yes option
    #Then End User receives the Notification in mobile
    #But Click on Cancel Alert should close
    #Then Close the Notification window

    Examples: 
      | uuid                                 | Type    |
      | 03294cc2-ad52-471e-946c-30d71b29dc66 | CGM     |
      #| 621c0332-0c60-4d8a-a448-f75609e7830f | Removal |