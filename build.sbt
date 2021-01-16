 name := "Assignment"
 version := "1.0"
 scalaVersion := "2.12.12"
lazy val persistence=project.in(file("persistence")).settings(
libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "3.3.3",
 "org.postgresql" % "postgresql" % "42.2.18",
"com.h2database" % "h2" % "1.4.200" % Test
)
).dependsOn(common)





lazy val common = project.in(file("common")).settings(
    
libraryDependencies ++= Seq("org.json4s" %% "json4s-native" % "3.7.0-M7",
"org.slf4j" % "slf4j-log4j12" % "1.2",
"com.typesafe" % "config" % "1.4.1",
"org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test",
"org.mockito" %% "mockito-scala" % "1.16.15" % "test"
)


)
lazy val root= project.in(file("root")).aggregate(common,persistence)

