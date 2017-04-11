package by.belapb.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Sukora Stas.
 */
@Entity
@Table
public class User implements Serializable {
    private static final long serialVersionUID = 3651232138379038813L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @Column(name = "id_Role")
//    private Integer id_role;

    @Column(name = "Логин")
    private String Login;

    @Column(name = "Пароль")
    private String Password;

    @Column(name = "Фамилия")
    private String SurName;

    @Column(name = "Имя")
    private String FirstName;

    @Column(name = "Отчество")
    private String MiddleName;

    @Column(name = "Дата_Регистрации")
    private Timestamp Data;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id_Role", nullable = false)
    private Role role;

    public User() {

    }

    public User(String login, String password, String surName, String firstName, String middleName, Timestamp data, Role role) {
        Login = login;
        Password = password;
        SurName = surName;
        FirstName = firstName;
        MiddleName = middleName;
        Data = data;
        this.role = role;
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

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public Timestamp getData() {
        return Data;
    }

    public void setData(Timestamp data) {
        Data = data;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (Login != null ? !Login.equals(user.Login) : user.Login != null) return false;
        if (Password != null ? !Password.equals(user.Password) : user.Password != null) return false;
        if (SurName != null ? !SurName.equals(user.SurName) : user.SurName != null) return false;
        if (FirstName != null ? !FirstName.equals(user.FirstName) : user.FirstName != null) return false;
        if (MiddleName != null ? !MiddleName.equals(user.MiddleName) : user.MiddleName != null) return false;
        if (Data != null ? !Data.equals(user.Data) : user.Data != null) return false;
        return role != null ? role.equals(user.role) : user.role == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (Login != null ? Login.hashCode() : 0);
        result = 31 * result + (Password != null ? Password.hashCode() : 0);
        result = 31 * result + (SurName != null ? SurName.hashCode() : 0);
        result = 31 * result + (FirstName != null ? FirstName.hashCode() : 0);
        result = 31 * result + (MiddleName != null ? MiddleName.hashCode() : 0);
        result = 31 * result + (Data != null ? Data.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Login='" + Login + '\'' +
                ", Password='" + Password + '\'' +
                ", SurName='" + SurName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", Data=" + Data +
                ", role=" + role +
                '}';
    }
}
