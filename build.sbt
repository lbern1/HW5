name := "HW5"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies ++= {
  val sparkVer = "2.1.0"
  Seq(
    "org.apache.spark" %% "spark-core" % sparkVer % "provided" withSources()
  )
}
        