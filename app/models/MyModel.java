package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyModel extends BaseModel {

    @Id
    public Long id;

    public String name;

    public static Finder<Long, MyModel> find = new Finder(Long.class, MyModel.class);
}
