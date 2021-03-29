package example

class Email(val username: String, val domainName: String)

object Email {
    def fromString(emailString: String): Option[Email] = {
        emailString.split('@') match {
            case Array(a, b) => Some(new Email(a, b))
            case _ => None
        }
    }
}
    object main extends App{
        val scalaCenterEmail = Email.fromString("scala.center@epfl.ch")
        scalaCenterEmail match {
            case Some(email) => println(
                s"""Registered an email
                   |Username: ${email.username}
                   |Domain name: ${email.domainName}""".stripMargin)
            case None => println("Error: could not parse email")
        }
    }
