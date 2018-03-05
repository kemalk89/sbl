# Spring Boot - Liquibase - Hibernate
This project is a demo for the following technology stack:
- Spring Boot
- Spring Data
- Liquibase
- Gradle

# Workflow: Generate initial changelog 
1. If exists: Delete the h2 database from the disk
2. If exists: Delete the changelog file 
3. Run `generateChangelog` and than delete generated changelog
4. Set `liquibase.enabled` to `false` 
5. Run and stop `App` to let spring create the database schema based on the entities
6. Run again `generateChangelog` to generate the new changelog 
7. Set `liquibase.enabled` to `true` again
8. Delete the h2 database from the disk
9. Finally run `App` again

To update the initial changelog file repeat the steps above.

# Workflow: Generate diff
TODO


