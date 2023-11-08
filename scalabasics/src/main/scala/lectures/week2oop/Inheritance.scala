package lectures.week2oop

object Inheritance {
  class Person {
    def greet: String = "Hello"
    private def block(): String = "That's an a private method"

    protected def onlyForHeirs(): String = "You are my blood!"
  }

  class Student extends Person

  val student = new Student
  /*
  If we specified that class A inherits another class B
  then class A will have all methods, that class B has,
  except methods with a "private" access. If a method
  in class B has a "protected" access, then we will have
  an opportunity to call this method addressing to class A.
  -------------------------
  println(student.greet) --> "Hello"
  println(student.block) --> Exception!
  println(student.onlyForHeirs) --> "You are my blood!"
  -------------------------
   */
  //-------------------Exercise-----------------------------
  class Button(label: String = "test") {
    def click(): String = s"button -$label- has been clicked"
  }

  class RoundedButton(label: String) extends Button(label) {
    override def click(): String = "rounded " + super.click()
  }

  abstract class Event {
    def trigger(eventName: String): Unit
  }
  //-------------------Exercise-----------------------------
  class Listener(val eventName: String, var event: Event) {
    def register(evt: Event): Unit = {
      event = evt
    }

    def sendNotification(): Unit = {
      event.trigger(eventName)
    }
  }

  val notification: Listener = new Listener("mousedown", null)
  notification.register((eventName: String) =>
    print(s"trigger $eventName event")
  /*
    This works because Scala supports a "Single Abstract Method".
    One abstract method means that either a default  method or
    an abstract  method whose implementation is available
    by default is allowed.
   */
  )
  //-------------------Exercise-----------------------------
  trait Configs {
    val ACCOUNT_TYPE_DEFAULT = "free"
    val ACCOUNT_TYPE_PAID = "paid"
    val SUBSCRIPTION_STATUS = "active"
  }

  object Settings {
    case class AccountSettings(email: String, password: String, picture: String)
    case class SubscriptionSettings(
        payment: String,
        notifications: String,
        expiration: String
    )
  }

  trait Subscriber {
    def subscribe(settings: Settings.SubscriptionSettings): Unit = println(
      "subscribed"
    )
  }

  trait Unsubscriber {
    def unsubscribe(): Unit = println("unsubscribed")
  }

  abstract class Account(
      accountID: String,
      settings: Settings.AccountSettings
  ) {
    def info(): Unit
  }

  class FreeAccount(accountID: String, settings: Settings.AccountSettings)
      extends Account(accountID, settings)
      with Configs
      with Subscriber {
    override def info(): Unit = println(s"Account Type: $ACCOUNT_TYPE_DEFAULT")
  }

  class PaidAccount(accountID: String, settings: Settings.AccountSettings)
      extends Account(accountID, settings)
      with Configs
      with Unsubscriber {
    override def info(): Unit = {
      println(s"Account Type: $ACCOUNT_TYPE_PAID")
      println(s"Subscription Status: $SUBSCRIPTION_STATUS")
    }
  }
  //--------------------------------------------------------
  class Exceptions {
    def intOrNothing(hasException: Boolean): Int =
      if (hasException) throw new RuntimeException()
      else 200

    /*
    This way we can catch an exception, but this is a bad practice
   */
    try {
      intOrNothing(true)
    } catch {
      case e: RuntimeException => print("RTE")
    } finally {
      println("I will be there no matter what")
    }
    /*
    Ideally, "finally" shouldn't contain nothing, except a side
    effects (info for logs or closing resources after working with there,
    for example file closing or disconnect with data base)
    */
  }

  /*
  This way we can create our custom exception
   */
  class MyException extends Exception
}
