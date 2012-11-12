package models;

import play.db.ebean.Model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseModel extends Model {
}
