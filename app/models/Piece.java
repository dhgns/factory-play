package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import play.libs.Json;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.Required;

@Entity
public class Piece extends Model {
	
	@Id
	@JsonIgnore
	private Long id;
	
	@Required
	@EmbeddedId
	private String name;
	
	private Integer weight;
	private String material;
	private Integer prize;
	private String lifetime;
	private String description;
	
	private boolean def;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Tag> tags = new ArrayList<Tag>();
	
	public static final Finder<Long,Piece> find = new Finder <>(Piece.class);

	public static List<Piece> getPieces() {
		return find.all();
	}
	
	public static Piece findByName(String pieceName) {
		return find.query()
				.where()
				.eq("NAME", pieceName)
				.findOne();		
	}

	public static Piece findById(Long id) {		
		return find.query()
				.where()
				.eq("id", id)
				.findOne();
	}	

	public void addTag (String tagName) {
		Tag tag = Tag.findTagByName(tagName);
		
		if(tag == null) {
			tag = new Tag(tagName);
			tag.save();
		}
		
		tag.getPieces().add(this);
		tag.update();
		this.tags.add(tag);
		
		this.update();
	}
	
	public Piece () {
		super();
	}
	
	public Piece (String name) {
		super();
		this.name = name;
	}
	
	public Piece (String name, Integer weight, String material, Integer prize, String lifetime, String description) {
		this.name = name;
		this.weight = weight;
		this.material = material;
		this.prize = prize;
		this.lifetime = lifetime;
		this.description = description;
	}
	
	public Piece(String name, String description, Integer prize, Integer weight, String material,
			String lifetime, boolean def) {
	
		this.name = name;
		this.description = description;
		this.prize = prize;
		this.weight = weight;
		this.material = material;
		this.lifetime = lifetime;
		this.setDef(def);
		
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Integer getPrize() {
		return prize;
	}

	public void setPrize(Integer prize) {
		this.prize = prize;
	}
	
	public String getLifetime() {
		return lifetime;
	}

	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescripcion(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDef() {
		return def;
	}

	public void setDef(boolean def) {
		this.def = def;
	}
	
	public List<Tag> getTags(){
		return this.tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	

	public static boolean exist(String name) {
		
		Piece piece = Piece.findByName(name);
		
		return piece != null;
	}	
	
	public JsonNode toJson(){
		return Json.toJson(this);
	}

	public static List<Piece> findByTag(Tag tag) {
		return  find.query()
				.where()
				.eq("tags", tag)
				.findList();
	}

	 
}
