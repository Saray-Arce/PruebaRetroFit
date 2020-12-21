package retrofit;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xmlpull.v1.XmlPullParserFactory;

import interfaces.UserInterface;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class UserAPIClient {
    private static String API_BASE_URL = "";

    public static UserInterface findUserByLoginAndPasswd(String login, String password) {
        OkHttpClient.Builder httpClient =  new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(
                        SimpleXmlConverterFactory.create()
                );

        Retrofit retrofit = builder.client(httpClient.build()).build();
        UserInterface userInterface = retrofit.create(UserInterface.class);

        return userInterface;
    }
}
