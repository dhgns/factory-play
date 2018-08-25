package controllers;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import filters.HttpResponse;
import models.Tag;
import play.mvc.*;


public class TagsController extends Controller {
	
	/**
	 * This action method creates a new Tag and add it to the DB
	 * @return
	 */
    public Result addTag() {
    		
		JsonNode data = request().body().asJson();
		
		String tagName = getTagFromJSONData(data);
		
		if(tagName == null)
			return HttpResponse.buildResponseError(request(), BAD_REQUEST, "Json data not valid");

		if(Tag.exist(tagName))
			return HttpResponse.buildResponseOk(request(), "Tag already Exist");
	
		Tag tag = new Tag(tagName);
		tag.save();
		
		if(Tag.findTagByName(tag.getName()) == null) 
			return HttpResponse.buildResponseError(request(), INTERNAL_SERVER_ERROR, "Internal Server Error");
		
		return HttpResponse.buildResponseOk(request(),"New Piece Added");
		  
    }
 	
    private String getTagFromJSONData(JsonNode data) {
	    	String tagName;
	    	try {
			tagName = data.path("tag").toString();
	    	}catch(Exception e) {
	    		tagName = null;
	    	}
    
		return tagName;
	}

	/**
     * This action method retrieve a tag from the DB
     * @param name
     * @return
     */
	public Result retrieveTag(String tag) {		
		Tag retTag = Tag.findTagByName(tag);
					
		return HttpResponse.buildResponseOk(request(),retTag);
    
    }
    
	/**
     * This action method retrieve a tag from the DB
     * @param name
     * @return
     */
	public Result getTags() {		
		List<Tag> tags = Tag.findTags();
		
		return HttpResponse.buildResponseOk(request(),tags);
    }
    
}
