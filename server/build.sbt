import sbt.internal.io.Source
import play.sbt.PlayImport.PlayKeys.playRunHooks
import com.typesafe.sbt.web.SbtWeb
import com.typesafe.sbt.web.Import.pipelineStages
import com.typesafe.sbt.web.Import._
import com.typesafe.sbt.gzip.Import.gzip
import com.typesafe.sbt.digest.Import.digest

lazy val root = (project in file("."))
  .settings(
    name := """test""",
    version := "0.0.1",
    scalaVersion := "2.13.13",
    maintainer := "uat-public-contact@google.com",
    libraryDependencies ++= Seq(
      "org.apache.shiro" % "shiro-crypto-cipher" % "1.13.0",
      "ch.qos.logback" % "logback-classic" % "1.4.8"
    )
  )
