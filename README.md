# Spring Boot - Liquibase - Hibernate
This project is a demo for the following technology stack:
- Spring Boot
- Spring Data
- Liquibase
- Gradle

# Workflow: Generate initial changelog 
1. Run `sblh:deleteChangelogs` & `sblh:deleteH2Database`
3. Run `sblh:generateLiquibaseChangelog` and `sblh:deleteChangelogs`
4. Set `liquibase.enabled` to `false` 
5. Run and stop `App` to let spring create the database schema based on the entities
6. Run again `sblh:generateLiquibaseChangelog` to generate the new changelog 
7. Set `liquibase.enabled` to `true` again
8. Delete `sblh:deleteH2Database`
9. Finally run `App` again

To update the initial changelog file repeat the steps above.

# Workflow: Generate diff
Just run `sblh:generateLiquibaseDiff` and include the generated file into 
the changelog-master.yaml file.


