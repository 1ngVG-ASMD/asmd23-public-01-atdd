ThisBuild / version := "0.1.1"
ThisBuild / scalaVersion := "3.3.3"
lazy val root = (project in file("."))
  .settings(
    name := "asmd23-01-atdd",
    libraryDependencies ++= Seq(
        "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
        "io.cucumber" % "cucumber-java" % "7.19.0" % Test,
        "io.cucumber" %% "cucumber-scala" % "8.25.1" % Test,
        "io.cucumber" % "cucumber-junit" % "7.19.0" % Test,
        "junit" % "junit" % "4.13.2",
        "com.novocode" % "junit-interface" % "0.11" % Test
    )
)
