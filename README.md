# dynamic-property-configuration

Practicing dynamic property configuration

##### Here is how to use this
1. run centralized-configuration-service server
    * It fetches initial configuration properties
2. run dynamic-property-configuration app
    * First loads bootstrap.properties file

##### Here is how you can test dynamic properties loading
1. Test GET service http://localhost:8080/appname returns the app name
2. Change the property in configured repository to some other name and commit the change
3. Invoke server GET uri http://localhost:8100/namma-tumkur/default to load the latest properties to server
4. Then hit client's actuator POST api to load latest changes to client app http://localhost:8080/actuator/refresh
5. After refresh you can test GET service http://localhost:8080/appname returns new app name