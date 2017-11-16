
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab2upload/addProducts/conf/routes
// @DATE:Thu Nov 16 20:12:33 GMT 2017


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
