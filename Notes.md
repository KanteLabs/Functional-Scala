

- Scala Project Structure
    + my-project/
      - project/ (project information (sbt version, plugins, ...))
      - src/ (source code directory)
      - target/ (compiled results)
      - build.sbt (build file defining the whole project)
        - example: 
            ```scala
            scalaVersion := "2.12.6"
            name         := "my-project"

            libraryDependencies ++= Seq(...)
            ```

# Scala
Scala is both a functional and object-oriented language. Everything in Scala is an object, and doesn't include primitive data types like Java (int, double, boolean). Instead those values are all objects.

# Variables
Immutable variables are define using `val`.
