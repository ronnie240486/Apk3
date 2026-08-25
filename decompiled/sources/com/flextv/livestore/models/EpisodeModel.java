package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class EpisodeModel extends io.realm.RealmObject implements java.io.Serializable, io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface {
    private java.lang.String category_name;

    @com.google.gson.annotations.SerializedName("container_extension")
    private java.lang.String container_extension;
    private java.lang.String episode_num;

    @com.google.gson.annotations.SerializedName("id")
    private java.lang.String id;
    private com.flextv.livestore.models.EpisodeInfoModel info;

    @com.google.gson.annotations.SerializedName("season")
    private int season;
    private java.lang.String season_name;
    private java.lang.String series_name;
    private java.lang.String stream_icon;

    @com.google.gson.annotations.SerializedName("title")
    private java.lang.String title;
    private java.lang.String url;

    public EpisodeModel() {
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

    @androidx.annotation.Nullable
    public static com.flextv.livestore.models.EpisodeModel fromM3UItem(iptv.m3u.parser.M3UItem r8) {
            com.flextv.livestore.models.EpisodeModel r0 = new com.flextv.livestore.models.EpisodeModel     // Catch: java.lang.Exception -> L92
            r0.<init>()     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = r8.getGroupTitle()     // Catch: java.lang.Exception -> L92
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L92
            if (r1 == 0) goto L12
            java.lang.String r1 = "All"
            goto L16
        L12:
            java.lang.String r1 = r8.getGroupTitle()     // Catch: java.lang.Exception -> L92
        L16:
            r0.setCategory_name(r1)     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = r8.getChannelName()     // Catch: java.lang.Exception -> L92
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L92
            if (r1 != 0) goto L6f
            java.lang.String r1 = r8.getChannelName()     // Catch: java.lang.Exception -> L92
            r0.setTitle(r1)     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = r0.getTitle()     // Catch: java.lang.Exception -> L92
            java.lang.String r2 = " "
            java.lang.String[] r1 = r1.split(r2)     // Catch: java.lang.Exception -> L92
            int r2 = r1.length     // Catch: java.lang.Exception -> L92
            r3 = 0
            r4 = 0
        L37:
            if (r4 >= r2) goto L6f
            r5 = r1[r4]     // Catch: java.lang.Exception -> L92
            java.lang.String r6 = "S\\d{2}"
            boolean r6 = r5.matches(r6)     // Catch: java.lang.Exception -> L92
            if (r6 == 0) goto L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L92
            r6.<init>()     // Catch: java.lang.Exception -> L92
            java.lang.String r7 = r0.getTitle()     // Catch: java.lang.Exception -> L92
            java.lang.String[] r7 = r7.split(r5)     // Catch: java.lang.Exception -> L92
            r7 = r7[r3]     // Catch: java.lang.Exception -> L92
            r6.append(r7)     // Catch: java.lang.Exception -> L92
            r6.append(r5)     // Catch: java.lang.Exception -> L92
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L92
            r0.setSeason_name(r6)     // Catch: java.lang.Exception -> L92
            java.lang.String r6 = r0.getTitle()     // Catch: java.lang.Exception -> L92
            java.lang.String[] r5 = r6.split(r5)     // Catch: java.lang.Exception -> L92
            r5 = r5[r3]     // Catch: java.lang.Exception -> L92
            r0.setSeries_name(r5)     // Catch: java.lang.Exception -> L92
        L6c:
            int r4 = r4 + 1
            goto L37
        L6f:
            java.lang.String r1 = r8.getStreamURL()     // Catch: java.lang.Exception -> L92
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L92
            if (r1 != 0) goto L80
            java.lang.String r1 = r8.getStreamURL()     // Catch: java.lang.Exception -> L92
            r0.setUrl(r1)     // Catch: java.lang.Exception -> L92
        L80:
            java.lang.String r1 = r8.getLogoURL()     // Catch: java.lang.Exception -> L92
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L92
            if (r1 != 0) goto L91
            java.lang.String r8 = r8.getLogoURL()     // Catch: java.lang.Exception -> L92
            r0.setStream_icon(r8)     // Catch: java.lang.Exception -> L92
        L91:
            return r0
        L92:
            r8 = move-exception
            r8.printStackTrace()
            r8 = 0
            return r8
    }

    public java.lang.String getCategory_name() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$category_name()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$category_name()
        Ld:
            return r0
    }

    public java.lang.String getContainer_extension() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$container_extension()
            return r0
    }

    public java.lang.String getEpisode_num() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$episode_num()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$episode_num()
        Ld:
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$id()
            return r0
    }

    public com.flextv.livestore.models.EpisodeInfoModel getInfo() {
            r1 = this;
            com.flextv.livestore.models.EpisodeInfoModel r0 = r1.realmGet$info()
            return r0
    }

    public int getSeason() {
            r1 = this;
            int r0 = r1.realmGet$season()
            return r0
    }

    public java.lang.String getSeason_name() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$season_name()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$season_name()
        Ld:
            return r0
    }

    public java.lang.String getSeries_name() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$series_name()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$series_name()
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

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$title()
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$url()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$url()
        Ld:
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r1 = this;
            java.lang.String r0 = r1.category_name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$container_extension() {
            r1 = this;
            java.lang.String r0 = r1.container_extension
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$episode_num() {
            r1 = this;
            java.lang.String r0 = r1.episode_num
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$id() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public com.flextv.livestore.models.EpisodeInfoModel realmGet$info() {
            r1 = this;
            com.flextv.livestore.models.EpisodeInfoModel r0 = r1.info
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public int realmGet$season() {
            r1 = this;
            int r0 = r1.season
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$season_name() {
            r1 = this;
            java.lang.String r0 = r1.season_name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$series_name() {
            r1 = this;
            java.lang.String r0 = r1.series_name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r1 = this;
            java.lang.String r0 = r1.stream_icon
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$title() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r1) {
            r0 = this;
            r0.category_name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$container_extension(java.lang.String r1) {
            r0 = this;
            r0.container_extension = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$episode_num(java.lang.String r1) {
            r0 = this;
            r0.episode_num = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$id(java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$info(com.flextv.livestore.models.EpisodeInfoModel r1) {
            r0 = this;
            r0.info = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$season(int r1) {
            r0 = this;
            r0.season = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$season_name(java.lang.String r1) {
            r0 = this;
            r0.season_name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$series_name(java.lang.String r1) {
            r0 = this;
            r0.series_name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r1) {
            r0 = this;
            r0.stream_icon = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$title(java.lang.String r1) {
            r0 = this;
            r0.title = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EpisodeModelRealmProxyInterface
    public void realmSet$url(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }

    public void setCategory_name(java.lang.String r1) {
            r0 = this;
            r0.realmSet$category_name(r1)
            return
    }

    public void setContainer_extension(java.lang.String r1) {
            r0 = this;
            r0.realmSet$container_extension(r1)
            return
    }

    public void setEpisode_num(java.lang.String r1) {
            r0 = this;
            r0.realmSet$episode_num(r1)
            return
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.realmSet$id(r1)
            return
    }

    public void setInfo(com.flextv.livestore.models.EpisodeInfoModel r1) {
            r0 = this;
            r0.realmSet$info(r1)
            return
    }

    public void setSeason(int r1) {
            r0 = this;
            r0.realmSet$season(r1)
            return
    }

    public void setSeason_name(java.lang.String r1) {
            r0 = this;
            r0.realmSet$season_name(r1)
            return
    }

    public void setSeries_name(java.lang.String r1) {
            r0 = this;
            r0.realmSet$series_name(r1)
            return
    }

    public void setStream_icon(java.lang.String r1) {
            r0 = this;
            r0.realmSet$stream_icon(r1)
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.realmSet$title(r1)
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.realmSet$url(r1)
            return
    }
}
