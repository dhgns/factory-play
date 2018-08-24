package filters;

import java.util.ArrayList;
import java.util.List;

import io.ebean.common.BeanList;
import models.Piece;
import models.Tag;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;

import play.mvc.Http.Request;



public class HttpResponse {
	
	
	public static Result buildResponseOk(Request request, Object response) {
		
		//String parser
		if(response.getClass() == String.class) {
    		//By default, our API response on JSON
    		if(request.accepts("application/json")) {
    			return Results.ok("{\"response\":" + "\""+ response + "\"}");
    		}else if(request.accepts("application/xml")) {
    			return  Results.ok("<response>" + response + "</response>");
    		}else {
    			return Results.status(Http.Status.NOT_ACCEPTABLE);
    		}

		}
		
		//Tag parser
		if(response.getClass() == Tag.class){
    		//By default, our API response on JSON
    		if(request.accepts("application/json")) {
    			return Results.ok(((Tag)response).toJson());
    		}else if(request.accepts("application/xml")) {
    			return Results.ok(views.xml.tag.render((Tag)response));
    		}else {
    			return Results.status(Http.Status.NOT_ACCEPTABLE);
    		}

		}
		
		//Piece parser
		if(response.getClass() == Piece.class){
    		//By default, our API response on JSON
    		if(request.accepts("application/json")) {
    			return Results.ok(((Piece) response).toJson());
    		}else if(request.accepts("application/xml")) {
    			return Results.ok(views.xml.piece.render((Piece)response));
    		}else {
    			return Results.status(Http.Status.NOT_ACCEPTABLE);
    		}
		}
		
		//BeanList<?> parser
		if(response.getClass() == BeanList.class) {
			Object itemType = ((List<?>) response).get(0);
			//List<Tag> parser
			if(itemType.getClass() == Tag.class) {
        		//By default, our API response on JSON
        		if(request.accepts("application/json")) {
        			return Results.ok(Json.toJson(response));
        		}else if(request.accepts("application/xml")) {
        			return Results.ok(views.xml.tags.render((List<Tag>)response));
        		}else {
        			return Results.status(Http.Status.NOT_ACCEPTABLE);
        		}
			}
			//List<Piece> parser
			if(itemType.getClass() == Piece.class) {
        		//By default, our API response on JSON
        		if(request.accepts("application/json")) {
        			return Results.ok(Json.toJson(response));
        		}else if(request.accepts("application/xml")) {
        			return Results.ok(views.xml.pieces.render((List<Piece>)response));
        		}else {
        			return Results.status(Http.Status.NOT_ACCEPTABLE);
        		}
			}
		}
		//List<?> parser
		if(response.getClass() == ArrayList.class) {
			Object itemType = ((List<?>) response).get(0);
			//List<Tag> parser
			if(itemType.getClass() == Tag.class) {
        		//By default, our API response on JSON
        		if(request.accepts("application/json")) {
        			return Results.ok(Json.toJson(response));
        		}else if(request.accepts("application/xml")) {
        			return Results.ok(views.xml.tags.render((List<Tag>)response));
        		}else {
        			return Results.status(Http.Status.NOT_ACCEPTABLE);
        		}
			}
			//List<Piece> parser
			if(itemType.getClass() == Piece.class) {
        		//By default, our API response on JSON
        		if(request.accepts("application/json")) {
        			return Results.ok(Json.toJson(response));
        		}else if(request.accepts("application/xml")) {
        			return Results.ok(views.xml.pieces.render((List<Piece>)response));
        		}else {
        			return Results.status(Http.Status.NOT_ACCEPTABLE);
        		}
			}
		}
		
		return Results.internalServerError();
}

	public static Result buildResponseError(Request request, int status, String msg) {
		if(request.accepts("application/json")) {
			String msgRet = "\"response\":"+"\""+msg+"\""+"\"response\"";
			return play.mvc.Results.status(status, msgRet);
		}else if(request.accepts("application/xml")) {
			String msgRet = "<response>"+msg+"</response>";
			return play.mvc.Results.status(status, msgRet);
		}else {
			return play.mvc.Results.status(status);
		}
	}


}
