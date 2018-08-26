package controllers;



import filters.HttpResponse;
import io.ebean.Ebean;
import io.ebean.SqlQuery;
import io.ebean.SqlUpdate;
import play.mvc.Controller;
import play.mvc.Result;


public class DataBaseController extends Controller{
	
	public Result deleteDB() {
		
		try {
			this.deleteDataBase();
		}catch(RuntimeException e){
			return HttpResponse.buildResponseError(request(), INTERNAL_SERVER_ERROR, e.toString());
		}
		
		return HttpResponse.buildResponseOk(request(),"Database deleted");
	}

	private void deleteDataBase() {
		
		SqlUpdate sqlRemoveReferences = Ebean.createSqlUpdate("alter table piece_tag drop constraint if exists fk_piece_tag_piece;\n" + 
				"drop index if exists ix_piece_tag_piece");
		
		SqlUpdate sqlCleanReferences = Ebean.createSqlUpdate("alter table piece_tag drop constraint if exists fk_piece_tag_tag;\n" + 
				"drop index if exists ix_piece_tag_tag");
		
		SqlUpdate sqlDropTablePieces = Ebean.createSqlUpdate("drop table if exists piece");
		SqlUpdate sqlDropTableOfReferences = Ebean.createSqlUpdate("drop table if exists piece_tag");
		SqlUpdate sqlDropTableOfTags = Ebean.createSqlUpdate("drop table if exists tag");
		
		Ebean.execute(sqlRemoveReferences);
		Ebean.execute(sqlCleanReferences);
		Ebean.execute(sqlDropTablePieces);
		Ebean.execute(sqlDropTableOfReferences);
		Ebean.execute(sqlDropTableOfTags);
				
	}

	public Result resetDB() {
		
		try {
			this.deleteDataBase();
		}catch(RuntimeException e){
			return HttpResponse.buildResponseError(request(), INTERNAL_SERVER_ERROR, "Error deleting tables");
		}
		
		try {
			this.createDataBase();
		}catch(RuntimeException e){
			return HttpResponse.buildResponseError(request(), INTERNAL_SERVER_ERROR, "Error creating tables");
		}
		
		return HttpResponse.buildResponseOk(request(),"Database reset");

	}

	private void createDataBase() {
		
		SqlUpdate sqlCreateTablePiece = Ebean.createSqlUpdate("create table piece (\n" + 
				"  id                            bigint auto_increment not null,\n" + 
				"  name                          varchar(255),\n" + 
				"  weight                        integer,\n" + 
				"  material                      varchar(255),\n" + 
				"  prize                         integer,\n" + 
				"  lifetime                      varchar(255),\n" + 
				"  description                   varchar(255),\n" + 
				"  def                           boolean default false not null,\n" + 
				"  constraint pk_piece primary key (id)\n)");
		
		SqlUpdate sqlCreateTablePieceTag = Ebean.createSqlUpdate("create table piece_tag (\n" + 
				"  piece_id                      bigint not null,\n" + 
				"  tag_id                        bigint not null,\n" + 
				"  constraint pk_piece_tag primary key (piece_id,tag_id)\n" + 
				");\n");
		
		SqlUpdate sqlCreateTableTag = Ebean.createSqlUpdate("create table tag (\n" + 
				"  id                            bigint auto_increment not null,\n" + 
				"  name                          varchar(255) not null,\n" + 
				"  constraint pk_tag primary key (id)\n)");
		
		SqlUpdate sqlAddPieceTagConstraints1 = Ebean.createSqlUpdate("alter table piece_tag add constraint fk_piece_tag_piece foreign key (piece_id) references piece (id) on delete restrict on update restrict;\n" + 
				"create index ix_piece_tag_piece on piece_tag (piece_id)");

		SqlUpdate sqlAddPieceTagConstraints2 = Ebean.createSqlUpdate("alter table piece_tag add constraint fk_piece_tag_tag foreign key (tag_id) references tag (id) on delete restrict on update restrict;\n" + 
				"create index ix_piece_tag_tag on piece_tag (tag_id)");
		
		Ebean.execute(sqlCreateTablePiece);
		Ebean.execute(sqlCreateTablePieceTag);
		Ebean.execute(sqlCreateTableTag);
		Ebean.execute(sqlAddPieceTagConstraints1);
		Ebean.execute(sqlAddPieceTagConstraints2);

	}
}
