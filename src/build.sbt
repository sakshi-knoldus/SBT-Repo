name:="hello",
version:="1.0",
scalaVersion:="2.12.12"

// https://mvnrepository.com/artifact/org.scalactic/scalactic
libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.0-M1"

// https://mvnrepository.com/artifact/org.scalaz/scalaz-core
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.4.0-M7"

// https://mvnrepository.com/artifact/org.typelevel/discipline-scalatest
libraryDependencies += "org.typelevel" %% "discipline-scalatest" % "2.1.4" % Test

// https://mvnrepository.com/artifact/org.mockito/mockito-scala
libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.37" % Test

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-http
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.2.4"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.14"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.14"

// https://mvnrepository.com/artifact/org.json4s/json4s-native
libraryDependencies += "org.json4s" %% "json4s-native" % "3.7.0-M16"

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.14" % Test

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.2.4" % Test

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.14" % Test

lazy val plugins = (project in file("../project/plugins")).enablePlugins()

lazy val main = (project in file("."))
    .enablePlugins(codesquad).dependsOn(plugins).aggregate(plugins)
