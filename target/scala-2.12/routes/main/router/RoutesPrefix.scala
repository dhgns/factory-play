
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Delfin/eclipse-workspace/Recambios/conf/routes
// @DATE:Thu Aug 23 21:11:46 CEST 2018


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
