import SonatypeKeys._

sonatypeSettings

name := "cloudinary-scala-play"

organization := "com.cloudinary"

version := Common.version

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := Common.scalaVersion

crossScalaVersions := Common.scalaVersions

resolvers += "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"

resolvers += Resolver.file("Local Ivy", file(Path.userHome + "/.ivy2/local"))(Resolver.ivyStylePatterns)

libraryDependencies += "com.cloudinary" %% "cloudinary-core-scala" % version.value

pomExtra := {
  <url>http://cloudinary.com</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <connection>scm:git:github.com/cloudinary/cloudinary_scala.git</connection>
    <developerConnection>scm:git:github.com/cloudinary/cloudinary_scala.git</developerConnection>
    <url>github.com/cloudinary/cloudinary_scala.git</url>
  </scm>
  <developers>
     <developer>
        <id>cloudinary</id>
        <name>Cloudinary</name>
        <email>info@cloudinary.com</email>
    </developer>
  </developers>
}
