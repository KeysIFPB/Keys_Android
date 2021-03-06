package ifpb.edu.br.keys_app.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mateus on 28/03/2017.
 */

public class ServerConnection {
    private static final String URL_BASE =
            "http://192.168.0.108:8080/RestEasyApp/";
    // mateus ip:   "http://192.168.2.100:8080/RestEasyApp/";
	


    private static APIServices service;
    private static ServerConnection selfInstance = new ServerConnection();

    public static ServerConnection getInstance() {
        return selfInstance;
    }

    public APIServices getService() {
        return service;
    }

    private ServerConnection() {
        updateServiceAdress();
    }

    public void updateServiceAdress() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(APIServices.class);
    }
}
