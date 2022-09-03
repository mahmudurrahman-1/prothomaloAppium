## Create automated scripts to test prothom alo mobile app

### write automation script to automate the below scenarios

**Scenario: 01** Sujon read news from sections category using big font

> **_Given:_** Sujon open the prothomalo app  
> **_And:_** Sujon Selects Section     
> **_And:_** Sujon choose ধর্ম from sections     
> **_And:_** Sujon filter news by Islam   
> **_And:_** Sujon finds "headline" and clicked on that   
> **_When:_** Sujon click on top right font   
> **_Then:_** Sujon selects first and click ok

**Scenario: 02** Sujon login to application

> **_Given:_** Sujon open the prothomalo app  
> **_And:_** Sujon clicks on my app    
> **_And:_** Sujon select login to enter     
> **_When:_** Sujon enters email and password  
> **_Then:_** Sujon successfully login

**Scenario: 03** Sujon search News by google mic

> **_Given:_** Sujon open the app  
> **_And:_** Sujon click on the search icon down     
> **_When:_** ujon give input from excel into the input field  
> **_Then:_** Sujon Scroll down and select on news

### Additional functionalities, that may be covered:

1. The more, the better. Only if it makes sense. Use your imagination and write some additional tests if you feel you
   can cover other important functionalities.
2. Please include any third party test reporting tools(Ex. Extent Report, Allure report) in your automation project.
3. Please use Excel/csv file as external test data provider and your automation script have the ability to read and
   write data from excel/csv for above scenario(Ex. Billing/shipping address and all the quoted value in scenario step
   can be read from excel as test data)

### Using automation framework is a must:

You can feel free to choose the framework with page object modal design pattern, that suits you best, along with the
Java or other programming language as you preferred.

### Record a video of tests execution:

Record a video to show how your tests are interacting with the mobile app(In Emulator). Attach the video as part of your
solution.
