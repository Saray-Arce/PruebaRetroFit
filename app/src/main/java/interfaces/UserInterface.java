package interfaces;

import java.util.List;

import classes.User;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserInterface {

    @POST
    public void create(@Body User user);

    @PUT
    public void edit(@Body User user);

    @DELETE
    public void remove(@Path("id") Integer id);

    @GET
    public User find(@Path("id") Integer id);

    @GET
    public List<User> findAll(@Body List <User> user) ;

    @GET
    public User findUserByLoginAndPasswd(@Path("login") String login, @Path("passwd") String passwd) ;

}
