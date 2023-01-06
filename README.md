# spring-notes

Notes App made with SpringBoot. It allows creation, manipulation and usage of Notes using MVC architecture.


## Note Creation

Flow is Controller --> Service --> Factory --> Repository. And then the internal Note structure is hidden with a DTO,
which is returned in the response with a 201 CREATED.

## DB

The project uses an H2 DB which means it's in memory. All notes are lost upon application reset.