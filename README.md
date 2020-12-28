Run Rsocket application and then start the server.

Pull RSC and compile from the below github repository
https://github.com/making/rsc

compile -> mvn clean install

Start rsc server
java -jar rsc.jar --debug --request --data "{'message':'Hello'}" --route request-response tcp://localhost:7000 --stacktrace
