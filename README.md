# SBT-Assignment
- Create a module namely, common.
- Add library dependency for scalactic, scalaz
- In the same module, add test dependency for scalatest and mockito-scala
- Create another module namely, rest
- Add dependency for akka-http, akka-stream, akka-actor and json4s-native
- In the rest module, add test dependencies for akka-stream-testkit, akka-http-testkit, akka-testkit
- Add plugins to the project- codesquad-sbt-plugin and scalastyle-sbt-plugin
- Finally add one last module "root" and aggregate all other modules in this root module
