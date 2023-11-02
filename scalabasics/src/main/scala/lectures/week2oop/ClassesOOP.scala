package lectures.week2oop

object ClassesOOP extends App {
  class Student(id: Int, val name: String) {}

  val student = new Student(1, "Tagir")

  class Instructor(val id: Int, val name: String, val surname: String) {
    def fullName() = s"${name.capitalize} ${surname.capitalize}"
  }

  class Course(
      val courseID: Int,
      val title: String,
      releaseYear: String,
      instructor: Instructor
  ) {
    def getId(): String = courseID.toString + instructor.id.toString

    def isTaughtBy(instructor: Instructor): Boolean =
      instructor == this.instructor

    def copyCourse(newReleaseYear: String): Course =
      new Course(this.courseID, this.title, newReleaseYear, this.instructor)
  }
}
