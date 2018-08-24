
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Delfin/eclipse-workspace/Recambios/conf/routes
// @DATE:Thu Aug 23 21:11:46 CEST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDataBaseController DataBaseController = new controllers.ReverseDataBaseController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFactoryController FactoryController = new controllers.ReverseFactoryController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTagsController TagsController = new controllers.ReverseTagsController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDataBaseController DataBaseController = new controllers.javascript.ReverseDataBaseController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFactoryController FactoryController = new controllers.javascript.ReverseFactoryController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTagsController TagsController = new controllers.javascript.ReverseTagsController(RoutesPrefix.byNamePrefix());
  }

}
