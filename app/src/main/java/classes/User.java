package classes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import enumerations.UserPrivilege;
import enumerations.Userstatus;

public class User implements Serializable {

 //   @SerializedName("id")
    private Integer id;
 //   @SerializedName("login")
    private String login;
//    @SerializedName("email")
    private String email;
//    @SerializedName("fullname")
    private String fullname;
//    @SerializedName("status")
    private Userstatus status;
 //   @SerializedName("privilege")
    private UserPrivilege privilege;
 //   @SerializedName("passwd")
    private String passwd;
 //   @SerializedName("lastAccess")
    private java.sql.Date lastAccess;
 //   @SerializedName("lastPasswdChange")
    private java.sql.Date lastPasswdChange;
 //   private Set<UserPlant> plants;
 //   private Set<Equipment> equipments;
}
