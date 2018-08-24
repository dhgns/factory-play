package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import play.mvc.Result;
import play.mvc.Controller;

import models.Piece;
import models.Tag;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

import filters.HttpResponse;

public class FactoryController extends Controller {
	
	/**
	 * This action method creates a new Piece and add it to the DB
	 * It add also the tags for the piece in case there are someone 
	 * @return
	 */
    public Result addPiece() {
		JsonNode data = request().body().asJson();
		
		if(data == null)
			return HttpResponse.buildResponseError(request(), BAD_REQUEST,"Sorry, the data provided is not valid");
		
		Piece piece = getPieceFromJSONData(data);
		
		if(Piece.exist(piece.getName()))
			return HttpResponse.buildResponseOk(request(),"Piece already Exist");
		
		ArrayList <String> tags = getTagsFromJSONData(data);
		
		piece.save();
		
		for(String tag : tags) {
			piece.addTag(tag);
		}
		
		if(Piece.findByName(piece.getName()) == null) 
			return internalServerError("Internal Server Error");
		
		return HttpResponse.buildResponseOk(request(),"New Piece Added");
    }
    
    /**
     * This action method retrieve a piece from the DB
     * @param name
     * @return
     */
	public Result retrievePiece(String name) {		
		Piece piece = Piece.findByName(name);
		
		Object ret = null;
		if(piece != null)
			ret = piece;
		else
			ret = "No existe la pieza buscada";
		
		return HttpResponse.buildResponseOk(request(),ret);
    
    }
    
    public Result updatePiece() {
		JsonNode data = request().body().asJson();
		
		String name = data.path("name").asText();
		
		Piece piece = Piece.findByName(name);
		
		if(piece == null)
			return HttpResponse.buildResponseError(request(), BAD_REQUEST, "Piece not found");
		
		piece = getPieceFromJSONData(data);
		
		if(piece == null)
			return HttpResponse.buildResponseError(request(), BAD_REQUEST, "Piece data not valid");
		
		piece.update();

		return HttpResponse.buildResponseOk(request(), "Piece updated");
    
    }
    
    public Result deletePiece() {
		JsonNode data = request().body().asJson();
		
		String name = data.path("name").asText();
		
		Piece p = Piece.findByName(name);
		
		if(p == null) {
			return HttpResponse.buildResponseOk(request(),"No existe el objeto deseado");
		}
		
		if(p.delete()) {
			return HttpResponse.buildResponseOk(request(),"Piece deleted");
		}else {
			return HttpResponse.buildResponseError(request(), INTERNAL_SERVER_ERROR, "Error on deleting");
		}
    }
    
	public Result getPieces() {
		List<Piece> pieces = Piece.getPieces();
		
		Object ret;
		if(pieces == null || pieces.isEmpty())
			ret = "No se han encontrado piezas";
		else
			ret = pieces;
		
		return HttpResponse.buildResponseOk(request(),ret);

    }
	
	/**
	 * This action method will retrieve the list of pieces found by the passed Tag
	 * @param tag
	 * @return
	 */
	public Result findPiecesByTag(String tagName) {
		if(tagName == null)
			return HttpResponse.buildResponseError(request(), BAD_REQUEST, "Tag not valid");
		
		Tag tag = Tag.findTagByName(tagName);
		if(tag == null)
			return HttpResponse.buildResponseError(request(), BAD_REQUEST, "Tag not found");

		
		Set<Piece> pieces = tag.getPieces();
		
		List<Piece> retPieces = new ArrayList();
		
		for(Piece piece : pieces)
			retPieces.add(Piece.findById(piece.getId()));
		
		if(retPieces.isEmpty())
			return HttpResponse.buildResponseOk(request(), "Pieces not found");
		
		return HttpResponse.buildResponseOk(request(), retPieces);
			
	}
    
	/**
     * This method extract all the tags from the body of the request
     * and parses it to a String array of tags
     * @param data
     * @return Array of Strings with the tags
     */
    private ArrayList<String> getTagsFromJSONData(JsonNode data){
    		
    		ArrayNode tagsJson = (ArrayNode) data.path("tags");
    		
    		ArrayList <String> tags = new ArrayList<>();
    		
    		for(JsonNode jsonNode : tagsJson) {
    			tags.add(jsonNode.asText());
    		}
    		
    		return tags;	
    }
    
    /**
     * This method extract the JSON data from the body 
     * and parse it like a Piece object model
     * @param data
     * @return Piece 
     */
    private Piece getPieceFromJSONData(JsonNode data) {
		
    		String name = data.path("name").textValue();
		String material = data.path("material").textValue();
		String description = data.path("description").textValue();
		String lifetime = data.path("lifetime").textValue();
		
		Integer weight = data.path("weight").intValue();
		Integer prize = data.path("prize").intValue();
		boolean def = data.path("default").booleanValue();
		
		Piece p = new Piece(name, description, prize, weight, material, lifetime, def);
		
		return p;
	}
	
}
