package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Bishwo on 12/7/15.
 */
@Entity
public class ToolType extends Model {
    @Id
    public Long id;

    @Constraints.Required
    public String name;

    @OneToMany
    public List<Gadget> gadgetList;

    public static Finder<Long, ToolType> find = new Finder<Long, ToolType>(ToolType.class);
}
