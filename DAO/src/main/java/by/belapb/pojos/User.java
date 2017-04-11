package by.belapb.pojos;

import javax.persistence.*;
import java.io.Serializable;
import java.security.PrivateKey;

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

    @Column(name = "id_Role")
    private Integer id_role;

    @Column(name = "Логин")
    private String Login;

    @Column(name = "Пароль")
    private String Password;

    @Column(name = "Фамилия")
    private String SurName;

    @Column(name = "Имя")
    private String FirstName;

    @Column(name = "Отчество")
    private String MiddleName


}
