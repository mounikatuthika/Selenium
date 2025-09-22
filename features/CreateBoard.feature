Feature: Create a New board on Trello
  Scenario: Log into Trello and create a board
    Given User is on Chrome browser
    When User launches the Url "https://trello.com/"
    And User clicks on login button
    And User enters valid credentials username as "mounikachinni.982@gmail.com" and password as "Mahanth@123"
    When User clicks on Create a new board
    And User Enters Board Title as "Automation Test Board"
    And User clicks on create button and wait for the new board to load
    Then Validate board Title as "Automation Test Board"
    And validate board URL contains "/b/" and you are inside the board
    When User clicks on Trello logo or go to home
    Then Under Recently viewed confirm board appears as "Automation Test Board" and clicks on it works
    And close the browser
