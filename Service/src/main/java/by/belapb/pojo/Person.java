package by.belapb.pojo;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by Sukora Stas.
 */
@Entity
@Table
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer age;
    @Column
    private String name;
    @Column
    private String surname;

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null) return false;
        if (age != null ? !age.equals(person.age) : person.age != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return surname != null ? surname.equals(person.surname) : person.surname == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}

