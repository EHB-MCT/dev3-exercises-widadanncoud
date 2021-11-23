import java.util.*
import java.sql.*

fun main (){
    val credentials = Credentials()

    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" + //db_name = username
                credentials.databaseName,
        connectionProps
    )

}

