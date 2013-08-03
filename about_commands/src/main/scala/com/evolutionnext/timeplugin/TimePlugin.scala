package com.evolutionnext.timeplugin

import sbt.{TaskKey, Plugin}
import org.joda.time.DateTime

/**
 *
 * @author Daniel Hinojosa
 * @since 8/3/13 3:35 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
class TimePlugin extends Plugin {
  lazy val timeSettings = Seq(currentDateTime := new DateTime().toString)


  val currentDateTime = TaskKey[String]("current-date-time", "Display current date time in ISO-8601 format in system timezone")
}
