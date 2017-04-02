package ifpb.edu.br.keys_app.network;

import java.util.List;

import ifpb.edu.br.keys_app.models.Chave;
import ifpb.edu.br.keys_app.models.Sine;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Mateus on 28/03/2017.
 */

public interface APIServices {

    @GET("/listar")
    Call<List<Chave>> getChaves();

/*    @GET(" ")
    Call<List<Sine>> getSinesBR();*/

    /*@GET("cod/{cod}")
    Call<List<Sine>> getSinePorCod(@Path("cod") String cod);

    @GET("emprego/latitude/{lat}/longitude/{long}/raio/{raio}")
    Call<List<Sine>> getSinesGPS(
            @Path("lat") Double lat,
            @Path("long") Double longitude,
            @Path("raio") String raio
    );*/
}