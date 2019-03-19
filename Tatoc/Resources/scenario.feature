@Tactoc 
Feature: Automate tatoc
  
Scenario: We see a heading "TAP Utility Server" when we open the websites
Given We are in homepage of website
Then We see a heading in the top left of the screen

Scenario: We see a option named Basic course option link in the homepage of the website 
Given We are in homepage of website
Then We see a option of basic course in the page

Scenario: We see a heading of Tap Group on the homepage 
Given We are in homepage of website
Then We see a heading of Tap Group

Scenario: We see new page when we click the basic course link
Given We are in homepage of website
When we click the basic course option
Then we are redirected to a new page with heading Grid Gate 

Scenario: We see a heading of Site Admin on the homepage  
Given We are in homepage of website
Then We see a heading of Site Admin


Scenario: We see a option named Advanced course option link in the homepage of the website 
Given We are in homepage of website
Then We see a option of advanced course in the page

Scenario: We see new page when we click the advanced course link
Given We are in homepage of website
When we click the advanced course option
Then we are redirected to a new page with heading Hover menu 


Scenario: We see new page when we click the green box grid we are redirected to a new page
Given We are in Grid Gate page
When we click the green box 
Then we are redirected to a new page with heading Frame Dungeon

Scenario: We are redirected to a error page if we click proceed without repainting box on frame dungeon page
Given We are in the frame Dungeon Page
When We click on proceed link
Then we are redirected to a error page

#Scenario: We have to click repaint link untill the boxes colours are same to proceed 
#Given We are in the frame Dungeon Page
#When we click on repaint link till both boxes have same colour 
#Then we are redirected on drag page


Scenario: We see new page when we click the green box grid we are redirected to a new page
Given We are in Grid Gate page
When we click the red box 
Then we are redirected to a error page

Scenario: We see instructions for two boxes when we are at Frame Dungeon page
Given We are in the frame Dungeon Page
Then we see different instructions at the page 
 
Scenario: We see a dropbox in the Drag me page
Given We are in the drag page
Then we see a dropbox in the page


Scenario: We can click to proceed after we drag and drop the elements
Given We are in the drag page
When we drag the divisions 
Then we click to proceed for getting redirected to new page


Scenario: We are redirected to a form when we click "Launch Pop Up Windows link" on PopUp windows page
Given we are in PopUp windows page
When we click the Launch window link
Then we are redirected to a form page

Scenario: We are redirected to a new page after creating cookie on cookie handling page
Given we are in cookie handling page
When we create token cookie and click on proceed 
Then end page is displayed



 

