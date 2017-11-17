
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab2upload/WMDD1CoreDesignLab /conf/routes
// @DATE:Fri Nov 17 17:51:05 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
