# Spring Boot - Liquibase - Hibernate
This project is a demo for the following technology stack:
- Spring Boot
- Spring Data
- Liquibase
- Gradle

# Workflow: Generate initial changelog 
1. Delete the h2 database from the disk
2. Set `liquibase.enabled` to `false`
3. Run and stop `App` to let spring create the database schema based on the entities
4. Delete changelog file if exists
5. Run again `generateChangelog` to generate the new changelog 
6. Set `liquibase.enabled` to `true` again
7. Repeat step 1
7. Finally run `App` again

To update the initial changelog file repeat the steps above.

# Workflow: Generate diff
TODO


