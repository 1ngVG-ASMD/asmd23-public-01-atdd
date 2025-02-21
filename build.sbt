ThisBuild / version := "0.1.1"
ThisBuild / scalaVersion := "3.3.3"
lazy val root = (project in file("."))
  .settings(
    name := "asmd23-01-atdd",
    libraryDependencies ++= Seq(
        "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
        "io.cucumber" % "cucumber-java" % "6.1.1" % Test,
        "io.cucumber" %% "cucumber-scala" % "8.25.1" % Test,
        "org.scalameta" %% "munit" % "0.7.29" % Test)
)
