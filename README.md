# State Machine with Proxy Pattern

To get code running on localhost:

1. Change directories to the same level with bin/ (example StateProject\bin)

2. Run rmiregistry in background:
rmiregistry &

3. Run:
java StateMachineTestDrive localhost true false true
results in florida
false true false results in texas

4. In a different window, run:
java StateMonitorTestDrive localhost
