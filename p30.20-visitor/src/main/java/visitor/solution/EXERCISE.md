# Exercise for Visitor pattern

Add a new employee type called "Trainee".

Trainees don't earn any money (of course) but work many hours.

Then write another visitor class that can be used to add up all hours worked.
This visitor affects the `ContractWorker` and the `Trainee` but not the `HiredEmployee`, who
doesn't provide a number of hours worked.