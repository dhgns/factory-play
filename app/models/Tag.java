package models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;

import io.ebean.ExpressionList;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.PagedList;
import play.libs.Json;

@Entity
public class Tag extends Model
{
	@Id
	@JsonIgnore
	private Long id;
	
	@NotBlank
	private String name;
	
	@ManyToMany(mappedBy = "tags")
	@JsonIgnore
	public Set<Piece> pieces;

	public Tag() {
		super();
	}
	
	public Tag(Long id, String name, Set<Piece> pieces) {
		super();
		this.id = id;
		this.name = name;
		this.pieces = pieces;
	}

	public Tag(String tagName) {
		super();
		this.name = tagName;
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(Set<Piece> pieces) {
		this.pieces = pieces;
	}
	
	private static final Finder<Long, Tag> find = new Finder<Long, Tag>(Tag.class);
	
	public static Tag findTagByName(String name) {
		return find.query().where()
				.eq("NAME", name)
				.findOne();
	}
	
	public JsonNode toJson(){
		return Json.toJson(this);
	}

	public static List<Tag> findTags() {
		return find.all();
	}

	public static boolean exist(String name) {
		Tag tag = Tag.findTagByName(name);
		
		return tag != null;
	}	
}
