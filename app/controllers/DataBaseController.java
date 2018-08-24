package controllers;



import filters.HttpResponse;
import io.ebean.Ebean;
import io.ebean.SqlUpdate;
import play.mvc.Controller;
import play.mvc.Result;


public class DataBaseController extends Controller{
	
	public Result deleteDB() {
		
		SqlUpdate sql = Ebean.createSqlUpdate("DROP TABLE PIECE");
		
		try {
			Ebean.execute(sql);
		}catch(RuntimeException e){
			return HttpResponse.buildResponseError(request(), INTERNAL_SERVER_ERROR, e.toString());
		}
		
		return HttpResponse.buildResponseOk(request(),"Database dropped");
	}

}
