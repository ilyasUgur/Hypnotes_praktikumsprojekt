#Custom Service option should be selectable in the Select Service Type section
#Location dropdown menu should be functional
#Various options should be visible in the location dropdown menu
#Any location should be selectable in the location drop down menu
#Repeat Options dropdown menu should be functional
#Various options should appear in the Repeat Options dropdown menu
#Any option should be selectable in the Repeat Options section
#When Does not repat is selected, the repat option should not appear
#Repeat times drop down menu should be visible when any of the Daily, Weekly, Monthly options are selected in the Repeat Options section
#A number should be selectable from the Repeat times dropdown menu
#Service Name must be functional and a valid name should be able to enter
#Price must be functional and a valid price should be able to enter
#Duration must be functional and a valid duration should be able to enter
#Date must be functional and a valid date should be able to enter
#Time Start must be functional and a valid Time Start should be able to enter
#Time End must be functional and a valid Time End should be able to enter
#Registered Clients, New Client (Enter Manually) options should be visible under the Select Service Type heading.
#New Client (Enter Manually) should be selectable
#When the New Client (Enter Manually) option is checked, the Enter Client Manually section should appear.
#Headings in the Enter Client Manually section must be functional
#A valid First Name should be able to enter in the First Name field
#A valid Last Name should be able to enter in the Last Name field
#A valid Phone should be able to enter in the Phone field
#A valid Email should be able to enter in the Email field
#After the necessary actions, the Submit button should be clickable
#When the user click to Submit button , a message should appear that the meeting has been created.
#The message New Meeting Created should appear

Feature: As a user, I should be able to perform various actions to create an appointment with
  the Custom Service- New Client (Enter Manually) options

  Scenario:
    Given user goes to therapist login page
    When user clicks scheduling
    And  user clicks Calender
