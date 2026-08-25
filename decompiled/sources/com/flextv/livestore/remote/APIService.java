package com.flextv.livestore.remote;

/* JADX INFO: loaded from: classes.dex */
public interface APIService {
    @retrofit2.http.GET("/player_api.php?")
    retrofit2.Call<com.flextv.livestore.models.LoginResponse> authentication(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET
    retrofit2.Call<com.flextv.livestore.models.CastResponse> getCastModels(@retrofit2.http.Url java.lang.String r1);

    @retrofit2.http.Streaming
    @retrofit2.http.GET("/xmltv.php")
    retrofit2.Call<okhttp3.ResponseBody> getEpgXml(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET
    retrofit2.Call<com.flextv.livestore.models.MovieCreditResponse> getMovieCreditModels(@retrofit2.http.Url java.lang.String r1);

    @retrofit2.http.GET
    retrofit2.Call<com.flextv.livestore.models.TMDBResponse> getRSS(@retrofit2.http.Url java.lang.String r1);

    @retrofit2.http.GET
    retrofit2.Call<com.flextv.livestore.models.TMDBVideoResponse> getTmdbVideoModels(@retrofit2.http.Url java.lang.String r1);

    @retrofit2.http.GET("/player_api.php?action=get_simple_data_table")
    retrofit2.Call<com.flextv.livestore.models.CatchUpEpgResponse> get_full_epg(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2, @retrofit2.http.Query("stream_id") java.lang.String r3);

    @retrofit2.http.GET("/player_api.php?action=get_live_categories")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.CategoryModel>> get_live_categories(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_live_streams&category_id=*")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.EPGChannel>> get_live_streams(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_live_streams")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.EPGChannel>> get_second_live_streams(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_series")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.SeriesModel>> get_second_series(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_vod_streams")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.MovieModel>> get_second_vod_streams(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_series&category_id=*")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.SeriesModel>> get_series(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_series_categories")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.CategoryModel>> get_series_categories(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_series_info")
    retrofit2.Call<com.flextv.livestore.models.InfoSerie> get_series_info(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2, @retrofit2.http.Query("series_id") java.lang.String r3);

    @retrofit2.http.GET("/player_api.php?action=get_series_info")
    retrofit2.Call<org.json.JSONObject> get_series_info_response(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2, @retrofit2.http.Query("series_id") java.lang.String r3);

    @retrofit2.http.GET("/player_api.php?action=get_short_epg")
    retrofit2.Call<com.flextv.livestore.models.CatchUpEpgResponse> get_short_epg(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2, @retrofit2.http.Query("stream_id") java.lang.String r3);

    @retrofit2.http.GET("/player_api.php?action=get_vod_categories")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.CategoryModel>> get_vod_categories(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);

    @retrofit2.http.GET("/player_api.php?action=get_vod_info")
    retrofit2.Call<com.flextv.livestore.models.MovieInfoResponse> get_vod_info(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2, @retrofit2.http.Query("vod_id") java.lang.String r3);

    @retrofit2.http.GET("/player_api.php?action=get_vod_streams&category_id=*")
    retrofit2.Call<java.util.List<com.flextv.livestore.models.MovieModel>> get_vod_streams(@retrofit2.http.Query("username") java.lang.String r1, @retrofit2.http.Query("password") java.lang.String r2);
}
