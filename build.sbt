val commonSettings = Seq(
  scalaVersion := "2.12.1"
)

// initialize := {
//   val _ = initialize.value // run the previous initialization
//   val required = "8"
//   val current  = sys.props("java.specification.version")
//   assert(current == required, s"Unsupported JDK: java.specification.version $current != $required")
// }

lazy val root = (project in file("."))
  .aggregate(exercises, answers)
  .settings(commonSettings)
  .settings(
    name := "fpinscala"
  )

lazy val exercises = (project in file("exercises"))
  .settings(commonSettings)
  .settings(
    name := "exercises"
  )

lazy val answers = (project in file("answers"))
  .settings(commonSettings)
  .settings(
    name := "answers"
  )
