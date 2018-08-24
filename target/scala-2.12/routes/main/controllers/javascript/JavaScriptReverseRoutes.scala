
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Delfin/eclipse-workspace/Recambios/conf/routes
// @DATE:Thu Aug 23 21:11:46 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseDataBaseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def deleteDB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DataBaseController.deleteDB",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "db"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseFactoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def retrievePiece: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactoryController.retrievePiece",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "piece/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:20
    def addPiece: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactoryController.addPiece",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "piece"})
        }
      """
    )
  
    // @LINE:26
    def getPieces: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactoryController.getPieces",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pieces"})
        }
      """
    )
  
    // @LINE:27
    def findPiecesByTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactoryController.findPiecesByTag",
      """
        function(tag0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pieces/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tag", tag0))})
        }
      """
    )
  
    // @LINE:22
    def updatePiece: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactoryController.updatePiece",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "piece"})
        }
      """
    )
  
    // @LINE:23
    def deletePiece: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FactoryController.deletePiece",
      """
        function() {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "piece"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseTagsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def addTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TagsController.addTag",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tag"})
        }
      """
    )
  
    // @LINE:33
    def getTags: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TagsController.getTags",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tags"})
        }
      """
    )
  
    // @LINE:31
    def retrieveTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TagsController.retrieveTag",
      """
        function(tag0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tag", tag0))})
        }
      """
    )
  
  }


}
