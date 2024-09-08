- Architecture :  Hexagonal pattern (Port and Adapters).
        NB: For the sake of simplicity I put the annoation directly on the domain model, but ideally it should be externalized to a dedicated model in the application layer.
- Under the folder Infrastructure, the file docker-compose conatins all the necessary dependancies for running the APP (docker-compose up -d).
- Keycloak configuration : Realm, Client and Users.
- Actuator activation : to check the health, monitor the application.
- JIB configuration : Gradle plugin for easier docker image creation and push to dockerHub.
- Unit Test, only for the domain, the heart of the application: mockito.
