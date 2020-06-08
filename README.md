# Spring Boot Flyway - Postgres
---

#### Configure the Database.

Use Docker as Database.

```shell
docker pull postgres
```

Run docker container.

```shell
docker run \
  --name some-postgres \
  -e POSTGRES_PASSWORD={PASSWORD} \
  -e POSTGRES_USER={USER} \
  -e POSTGRES_DB={DATABASE} \
  -p 127.0.0.1:5432:5432/tcp \
  -d postgres
```

> You can use localhost insted 127.0.0.1
> Use 5432 as postgres DB Port standard

Create Database.

```sql
CREATE USER {USER};
CREATE DATABASE {DATABASE};
GRANT ALL PRIVILEGES ON DATABASE {DATABASE} TO {USER};
```

#### Configure Enviroment Variables.

```properties
JDBC_TYPE=postgresql
HOST=127.0.0.1
PORT=5432
DATABASE={DATABASE}
USER={USER}
PASSWORD={PASSWORD}
HIBERNATE_DIALECT=org.hibernate.dialect.PostgreSQLDialect
```

Postgres Specific Configuration.

Make sure to include the following parameters in your application.properties

```properties
#Method org.postgresql.jdbc.PgConnection.createClob() is not yet implemented.
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
```

