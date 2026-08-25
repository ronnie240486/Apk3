package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class EpisodeInfoModel extends io.realm.RealmObject implements java.io.Serializable, io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface {

    @com.google.gson.annotations.SerializedName("bitrate")
    private int bitrate;

    @com.google.gson.annotations.SerializedName("duration")
    private java.lang.String duration;

    @com.google.gson.annotations.SerializedName("duration_secs")
    private int duration_secs;

    @com.google.gson.annotations.SerializedName("movie_image")
    private java.lang.String movie_image;

    @com.google.gson.annotations.SerializedName("name")
    private java.lang.String name;

    @com.google.gson.annotations.SerializedName("plot")
    private java.lang.String plot;

    @com.google.gson.annotations.SerializedName("rating")
    private java.lang.String rating;

    @com.google.gson.annotations.SerializedName("releasedate")
    private java.lang.String releasedate;

    @com.google.gson.annotations.SerializedName("tmdb_id")
    public java.lang.String tmdb_id;

    public EpisodeInfoModel() {
            r1 = this;
            r1.<init>()
            boolean r0 = r1 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            r0 = r1
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            r0.realm$injectObjectContext()
        Ld:
            return
    }

    public int getBitrate() {
            r1 = this;
            int r0 = r1.realmGet$bitrate()
            return r0
    }

    public java.lang.String getDuration() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$duration()
            return r0
    }

    public int getDuration_secs() {
            r1 = this;
            int r0 = r1.realmGet$duration_secs()
            return r0
    }

    public java.lang.String getMovie_image() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$movie_image()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$movie_image()
        Ld:
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$name()
            return r0
    }

    public java.lang.String getPlot() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$plot()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$plot()
        Ld:
            return r0
    }

    public float getRating() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$rating()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r1.realmGet$rating()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L1a
        L11:
            java.lang.String r0 = r1.realmGet$rating()
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public java.lang.String getReleasedate() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$releasedate()
            return r0
    }

    public java.lang.String getTmdb_id() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$tmdb_id()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$tmdb_id()
        Ld:
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public int realmGet$bitrate() {
            r1 = this;
            int r0 = r1.bitrate
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$duration() {
            r1 = this;
            java.lang.String r0 = r1.duration
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public int realmGet$duration_secs() {
            r1 = this;
            int r0 = r1.duration_secs
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$movie_image() {
            r1 = this;
            java.lang.String r0 = r1.movie_image
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$plot() {
            r1 = this;
            java.lang.String r0 = r1.plot
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$rating() {
            r1 = this;
            java.lang.String r0 = r1.rating
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$releasedate() {
            r1 = this;
            java.lang.String r0 = r1.releasedate
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public java.lang.String realmGet$tmdb_id() {
            r1 = this;
            java.lang.String r0 = r1.tmdb_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$bitrate(int r1) {
            r0 = this;
            r0.bitrate = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$duration(java.lang.String r1) {
            r0 = this;
            r0.duration = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$duration_secs(int r1) {
            r0 = this;
            r0.duration_secs = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$movie_image(java.lang.String r1) {
            r0 = this;
            r0.movie_image = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$name(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$plot(java.lang.String r1) {
            r0 = this;
            r0.plot = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$rating(java.lang.String r1) {
            r0 = this;
            r0.rating = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$releasedate(java.lang.String r1) {
            r0 = this;
            r0.releasedate = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeInfoModelRealmProxyInterface
    public void realmSet$tmdb_id(java.lang.String r1) {
            r0 = this;
            r0.tmdb_id = r1
            return
    }

    public void setMovie_image(java.lang.String r1) {
            r0 = this;
            r0.realmSet$movie_image(r1)
            return
    }

    public void setPlot(java.lang.String r1) {
            r0 = this;
            r0.realmSet$plot(r1)
            return
    }

    public void setTmdb_id(java.lang.String r1) {
            r0 = this;
            r0.realmSet$tmdb_id(r1)
            return
    }
}
