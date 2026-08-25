package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class SeriesModel extends io.realm.RealmObject implements java.io.Serializable, io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface {

    @com.google.gson.annotations.SerializedName("cast")
    private java.lang.String cast;

    @com.google.gson.annotations.SerializedName("category_id")
    private java.lang.String category_id;
    private java.lang.String category_name;

    @com.google.gson.annotations.SerializedName("director")
    private java.lang.String director;
    private int episode_pos;

    @com.google.gson.annotations.SerializedName("genre")
    private java.lang.String genre;
    private boolean is_favorite;
    private boolean is_recent;
    private boolean is_watched;

    @com.google.gson.annotations.SerializedName("last_modified")
    private java.lang.String last_modified;

    @com.google.gson.annotations.SerializedName("name")
    private java.lang.String name;

    @com.google.gson.annotations.SerializedName("num")
    private int num;

    @com.google.gson.annotations.SerializedName("plot")
    private java.lang.String plot;

    @com.google.gson.annotations.SerializedName("rating")
    private java.lang.String rating;

    @com.google.gson.annotations.SerializedName("rating_5based")
    private float rating_5based;

    @com.google.gson.annotations.SerializedName("releaseDate")
    private java.lang.String releaseDate;
    private int season_pos;

    @com.google.gson.annotations.SerializedName("series_id")
    private java.lang.String series_id;

    @com.google.gson.annotations.SerializedName("cover")
    private java.lang.String stream_icon;

    @com.google.gson.annotations.SerializedName("")
    private java.lang.String stream_type;

    @com.google.gson.annotations.SerializedName("tmdb")
    public java.lang.String tmdb;
    private java.lang.String url;

    @com.google.gson.annotations.SerializedName("youtube_trailer")
    private java.lang.String youtube;

    public SeriesModel() {
            r1 = this;
            r1.<init>()
            boolean r0 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            r0 = r1
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            r0.realm$injectObjectContext()
        Ld:
            r0 = 0
            r1.realmSet$season_pos(r0)
            r1.realmSet$episode_pos(r0)
            r1.realmSet$is_watched(r0)
            r1.realmSet$is_favorite(r0)
            r1.realmSet$is_recent(r0)
            return
    }

    public java.lang.String getCast() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$cast()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$cast()
        Ld:
            return r0
    }

    public java.lang.String getCategory_id() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$category_id()
            return r0
    }

    public java.lang.String getCategory_name() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$category_name()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.String r0 = r1.realmGet$category_name()
            return r0
    }

    public java.lang.String getDirector() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$director()
            return r0
    }

    public int getEpisode_pos() {
            r1 = this;
            int r0 = r1.realmGet$episode_pos()
            return r0
    }

    public java.lang.String getGenre() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$genre()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$genre()
        Ld:
            return r0
    }

    public java.lang.String getLast_modified() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$last_modified()
            if (r0 == 0) goto L16
            java.lang.String r0 = r1.realmGet$last_modified()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L16
        L11:
            java.lang.String r0 = r1.realmGet$last_modified()
            return r0
        L16:
            java.lang.String r0 = "0"
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$name()
            return r0
    }

    public int getNum() {
            r1 = this;
            int r0 = r1.realmGet$num()
            return r0
    }

    public java.lang.String getPlot() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$plot()
            return r0
    }

    public float getRating() {
            r2 = this;
            r0 = 0
            java.lang.String r1 = r2.realmGet$rating()     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1d
            java.lang.String r1 = r2.realmGet$rating()     // Catch: java.lang.Exception -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L12
            goto L1d
        L12:
            java.lang.String r1 = r2.realmGet$rating()     // Catch: java.lang.Exception -> L1d
            float r0 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.Exception -> L1d
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
        L1d:
            return r0
    }

    public float getRating_5based() {
            r1 = this;
            float r0 = r1.realmGet$rating_5based()
            return r0
    }

    public java.lang.String getReleaseDate() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$releaseDate()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$releaseDate()
        Ld:
            return r0
    }

    public int getSeason_pos() {
            r1 = this;
            int r0 = r1.realmGet$season_pos()
            return r0
    }

    public java.lang.String getSeries_id() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$series_id()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$series_id()
        Ld:
            return r0
    }

    public java.lang.String getStream_icon() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$stream_icon()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.String r0 = r1.realmGet$stream_icon()
            return r0
    }

    public java.lang.String getStream_type() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$stream_type()
            return r0
    }

    public java.lang.String getTmdb() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$tmdb()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$tmdb()
        Ld:
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$url()
            return r0
    }

    public java.lang.String getYoutube() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$youtube()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.String r0 = r1.realmGet$youtube()
            return r0
    }

    public boolean isIs_favorite() {
            r1 = this;
            boolean r0 = r1.realmGet$is_favorite()
            return r0
    }

    public boolean isIs_recent() {
            r1 = this;
            boolean r0 = r1.realmGet$is_recent()
            return r0
    }

    public boolean isIs_watched() {
            r1 = this;
            boolean r0 = r1.realmGet$is_watched()
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$cast() {
            r1 = this;
            java.lang.String r0 = r1.cast
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$category_id() {
            r1 = this;
            java.lang.String r0 = r1.category_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r1 = this;
            java.lang.String r0 = r1.category_name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$director() {
            r1 = this;
            java.lang.String r0 = r1.director
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public int realmGet$episode_pos() {
            r1 = this;
            int r0 = r1.episode_pos
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$genre() {
            r1 = this;
            java.lang.String r0 = r1.genre
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public boolean realmGet$is_favorite() {
            r1 = this;
            boolean r0 = r1.is_favorite
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public boolean realmGet$is_recent() {
            r1 = this;
            boolean r0 = r1.is_recent
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public boolean realmGet$is_watched() {
            r1 = this;
            boolean r0 = r1.is_watched
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$last_modified() {
            r1 = this;
            java.lang.String r0 = r1.last_modified
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public int realmGet$num() {
            r1 = this;
            int r0 = r1.num
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$plot() {
            r1 = this;
            java.lang.String r0 = r1.plot
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$rating() {
            r1 = this;
            java.lang.String r0 = r1.rating
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public float realmGet$rating_5based() {
            r1 = this;
            float r0 = r1.rating_5based
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$releaseDate() {
            r1 = this;
            java.lang.String r0 = r1.releaseDate
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public int realmGet$season_pos() {
            r1 = this;
            int r0 = r1.season_pos
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$series_id() {
            r1 = this;
            java.lang.String r0 = r1.series_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r1 = this;
            java.lang.String r0 = r1.stream_icon
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$stream_type() {
            r1 = this;
            java.lang.String r0 = r1.stream_type
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$tmdb() {
            r1 = this;
            java.lang.String r0 = r1.tmdb
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public java.lang.String realmGet$youtube() {
            r1 = this;
            java.lang.String r0 = r1.youtube
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$cast(java.lang.String r1) {
            r0 = this;
            r0.cast = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$category_id(java.lang.String r1) {
            r0 = this;
            r0.category_id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r1) {
            r0 = this;
            r0.category_name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$director(java.lang.String r1) {
            r0 = this;
            r0.director = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$episode_pos(int r1) {
            r0 = this;
            r0.episode_pos = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$genre(java.lang.String r1) {
            r0 = this;
            r0.genre = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$is_favorite(boolean r1) {
            r0 = this;
            r0.is_favorite = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$is_recent(boolean r1) {
            r0 = this;
            r0.is_recent = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$is_watched(boolean r1) {
            r0 = this;
            r0.is_watched = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$last_modified(java.lang.String r1) {
            r0 = this;
            r0.last_modified = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$name(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$num(int r1) {
            r0 = this;
            r0.num = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$plot(java.lang.String r1) {
            r0 = this;
            r0.plot = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$rating(java.lang.String r1) {
            r0 = this;
            r0.rating = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$rating_5based(float r1) {
            r0 = this;
            r0.rating_5based = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$releaseDate(java.lang.String r1) {
            r0 = this;
            r0.releaseDate = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$season_pos(int r1) {
            r0 = this;
            r0.season_pos = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$series_id(java.lang.String r1) {
            r0 = this;
            r0.series_id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r1) {
            r0 = this;
            r0.stream_icon = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$stream_type(java.lang.String r1) {
            r0 = this;
            r0.stream_type = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$tmdb(java.lang.String r1) {
            r0 = this;
            r0.tmdb = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$url(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_SeriesModelRealmProxyInterface
    public void realmSet$youtube(java.lang.String r1) {
            r0 = this;
            r0.youtube = r1
            return
    }

    public void setCast(java.lang.String r1) {
            r0 = this;
            r0.realmSet$cast(r1)
            return
    }

    public void setCategory_id(java.lang.String r1) {
            r0 = this;
            r0.realmSet$category_id(r1)
            return
    }

    public void setCategory_name(java.lang.String r1) {
            r0 = this;
            r0.realmSet$category_name(r1)
            return
    }

    public void setDirector(java.lang.String r1) {
            r0 = this;
            r0.realmSet$director(r1)
            return
    }

    public void setEpisode_pos(int r1) {
            r0 = this;
            r0.realmSet$episode_pos(r1)
            return
    }

    public void setGenre(java.lang.String r1) {
            r0 = this;
            r0.realmSet$genre(r1)
            return
    }

    public void setIs_favorite(boolean r1) {
            r0 = this;
            r0.realmSet$is_favorite(r1)
            return
    }

    public void setIs_recent(boolean r1) {
            r0 = this;
            r0.realmSet$is_recent(r1)
            return
    }

    public void setIs_watched(boolean r1) {
            r0 = this;
            r0.realmSet$is_watched(r1)
            return
    }

    public void setLast_modified(java.lang.String r1) {
            r0 = this;
            r0.realmSet$last_modified(r1)
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.realmSet$name(r1)
            return
    }

    public void setNum(int r1) {
            r0 = this;
            r0.realmSet$num(r1)
            return
    }

    public void setPlot(java.lang.String r1) {
            r0 = this;
            r0.realmSet$plot(r1)
            return
    }

    public void setRating(java.lang.String r1) {
            r0 = this;
            r0.realmSet$rating(r1)
            return
    }

    public void setRating_5based(float r1) {
            r0 = this;
            r0.realmSet$rating_5based(r1)
            return
    }

    public void setReleaseDate(java.lang.String r1) {
            r0 = this;
            r0.realmSet$releaseDate(r1)
            return
    }

    public void setSeason_pos(int r1) {
            r0 = this;
            r0.realmSet$season_pos(r1)
            return
    }

    public void setSeries_id(java.lang.String r1) {
            r0 = this;
            r0.realmSet$series_id(r1)
            return
    }

    public void setStream_icon(java.lang.String r1) {
            r0 = this;
            r0.realmSet$stream_icon(r1)
            return
    }

    public void setStream_type(java.lang.String r1) {
            r0 = this;
            r0.realmSet$stream_type(r1)
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.realmSet$url(r1)
            return
    }

    public void setYoutube(java.lang.String r1) {
            r0 = this;
            r0.realmSet$youtube(r1)
            return
    }
}
