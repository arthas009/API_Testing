# API_Testing
API Testing examples with testng, rest assured and Java.

Suites are performing test steps for the following endpoints:

Scenario:
You work as Software Development in Test role in our API team built recently. As a team, you’ll start to develop an API that does 4 operations (addition, subtraction, multiplication and, division) and calculates the sum of numbers from 1 to n. The team will start to develop this task 2 weeks later, but you’re planning to develop test automation as of today. We expect you to create a test automation project for the following scenarios which you agreed with the team.

API should only do GET and POST
Must have a User Endpoint and use the received header after logging in
API header also must get a username, password. Otherwise it should return bad request
The endpoint of API should be add, subtraction, multiplication, division. Query should take params as params list and perform the relevant operation. Response should also return the relevant result with result = . It should only be able to POST to these endpoints. It should be able to take up to 5 parameters as parameters.
Example:

request : POST API_URL/add?params=1,2
response : result = 3, user=info
request : POST API_URL/multiplication?params=3,2,3
response : result = 18, user=info
request : API_URL/division?params=55,11
response :POST result = 5, user=info
Another endpoint of the API will be sum and the GET endpoint will return the sum of numbers from 1 to the entered value. This endpoint should only be able to take 1 parameter.
Example:

request : Get API_URL/sum?params=5
response : result = 15, user=info
request : Get API_URL/sum?params=4
response : result = 10, user=info
PS: You should remember that you do not have an API project that performs these operations. You can benefit from various practices. The best practice is to pay attention to assertions and status codes in API tests.
