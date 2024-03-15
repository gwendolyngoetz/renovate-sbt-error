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
      caffeine,
      guice,
      javaJdbc,
      javaWs,
      "com.jayway.jsonpath" % "json-path" % "2.9.0",
      "org.thymeleaf" % "thymeleaf" % "3.1.2.RELEASE",
      "org.commonmark" % "commonmark" % "0.21.0",
      "org.commonmark" % "commonmark-ext-autolink" % "0.21.0",
      "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.9",
      "org.pac4j" %% "play-pac4j" % "11.1.0-PLAY2.8",
      "org.pac4j" % "pac4j-core" % "5.7.2",
      "org.pac4j" % "pac4j-http" % "5.7.2",
      "org.pac4j" % "pac4j-oidc" % "5.7.2",
      "org.pac4j" % "pac4j-saml" % "5.7.2",
      "org.apache.shiro" % "shiro-crypto-cipher" % "1.13.0",
      "ch.qos.logback" % "logback-classic" % "1.4.8"
    )
  )
