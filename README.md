# kata-creational-patterns

This is a simple project intended to explore the use of creational design patterns

## Program description
The program instructs an Embassy to send diplomatic messages to different leaders

Creating & sending messages takes real time
This can be demonstrated by editing main:sendMessages to send more messages

## Task
Apply creational design patterns to reduce the executions time, especially when sending more messages

### Possible changes
 - Extract the creation of SecretMessage to a function (e.g. Factory Method)
 - Apply polymorphism to create multiple Message types (e.g. Factory Method)
 - Extract Crypher to a shared instance to educe repeated delays (e.g. Singleton, Prototype)
 - Create a customisable messages/instructions (e.g. Builder)
 
 Note: There is no right/wrong solution only changes your find interesting & informative

