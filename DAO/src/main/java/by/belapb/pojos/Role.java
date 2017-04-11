package by.belapb.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Sukora Stas.
 */
@Entity
@Table
public class Role implements Serializable{
    private static final long serialVersionUID = -3526130452465478582L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Уровень_доступа")
    private String Value;

    @OneToMany(mappedBy = "role",fetch = FetchType.LAZY)
    private Set<User> id_User;

    public Role(){

    }

    public Role(String value, Set<User> id_User) {
        Value = value;
        this.id_User = id_User;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public Set<User> getId_User() {
        return id_User;
    }

    public void setId_User(Set<User> id_User) {
        this.id_User = id_User;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != null ? !id.equals(role.id) : role.id != null) return false;
        if (Value != null ? !Value.equals(role.Value) : role.Value != null) return false;
        return id_User != null ? id_User.equals(role.id_User) : role.id_User == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (Value != null ? Value.hashCode() : 0);
        result = 31 * result + (id_User != null ? id_User.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", Value='" + Value + '\'' +
                ", id_User=" + id_User +
                '}';
    }
}
