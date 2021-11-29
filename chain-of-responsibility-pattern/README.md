
One Scenario

We have an online ordering system.
We want to restrict access to the system so that only authenticated users can create orders.
Also, users who have administrative permissions must have full access to all orders.

So, all the checks must be performed sequentially. 
- The application can attempt to authenticate a user to the system 
  whenever it received a request that contains the user's credentials.
  - if credentials arent correct then the authentication fails. 
    Then there is no reason to proceed with any other checks.

Later we might need to implement several more of those sequential checks.. like
- need to add extra validation step to sanitize the data in a request 
  - in case it's unsafe to pass raw data straight to the ordering system
- need a check tht filters requested failed requests coming from the same IP address 
  - in case the system is vulnerable to brute force

and so on....

Cons:
- there are too many checks and change one check may be affected the others..
- even sometimes, might duplicate the code when some checks are needed in other component 
of the system because they may not need all of them..



Chain of responsibility
-> each check should be extracted to its own class (handler) with a single method that performs the check
-> the request, along with its data, is pass to this method as an argument.
-> link these handles into a chain..
-> the requests travels along the chain until all the handlers have had a chance to process it.

In this case, a handler performs the processing 
and then decides whether to pass the request further down the chain.
Assuming the request contains the right data, all the handlers can execute their primary behavior,
whether it's authentication checks or other check.

=====
second scenario
pass request and keep checking until finding the right handler to handler the request.
like robotic call -> operator -> professional engineer
=====



Use it when program is expected to process different kinds of requests,
but exact types of requests and their sequences are unknown beforehand.

the pattern lets us link several handlers into one chain. Once we received a request,
ask each handler whether it can process it. 
Hence, all the handlers get a chance to process the requests
and can stop once the request get handled.

The order of handlers can be changed at tun time.


Difference with decorator!
- Very similar, both rely on recursive composition to pass the execution 
  through a series of objects.

- CoR can execute arbitrary operations independently of each other 
- CoR can stop passing the request further at any point.

- Decorators can extend object's behavior while keeping it consistent with base interface.
- Decorators aren't allowed to break the flow of the request.