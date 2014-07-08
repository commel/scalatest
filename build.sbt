name := "hello"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++=Seq(
			"org.apache.derby" % "derby" % "10.10.2.0",
		       	"com.typesafe.slick" %% "slick" % "2.0.2",
			"org.slf4j" % "slf4j-nop" % "1.6.4")