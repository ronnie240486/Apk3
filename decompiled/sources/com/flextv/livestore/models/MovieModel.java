package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class MovieModel extends io.realm.RealmObject implements java.io.Serializable, io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface {

    @com.google.gson.annotations.SerializedName("added")
    private java.lang.String added;

    @com.google.gson.annotations.SerializedName("category_id")
    private java.lang.String category_id;
    private java.lang.String category_name;

    @com.google.gson.annotations.SerializedName("custom_sid")
    private java.lang.String custom_sid;

    @com.google.gson.annotations.SerializedName("container_extension")
    private java.lang.String extension;
    private boolean is_favorite;
    private boolean is_locked;
    private boolean is_recent;

    @com.google.gson.annotations.SerializedName("name")
    private java.lang.String name;

    @com.google.gson.annotations.SerializedName("num")
    private int num;
    private int pro;

    @com.google.gson.annotations.SerializedName("rating")
    private java.lang.String rating;
    private long recent_mil;

    @com.google.gson.annotations.SerializedName("stream_icon")
    private java.lang.String stream_icon;

    @com.google.gson.annotations.SerializedName("stream_id")
    private java.lang.String stream_id;

    @com.google.gson.annotations.SerializedName("stream_type")
    private java.lang.String stream_type;
    private long time;

    @com.google.gson.annotations.SerializedName("tmdb_id")
    private java.lang.String tmdb_id;
    private java.lang.String type;
    private java.lang.String url;

    public MovieModel() {
            r3 = this;
            r3.<init>()
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            r0 = r3
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            r0.realm$injectObjectContext()
        Ld:
            r0 = 0
            r3.realmSet$pro(r0)
            r1 = 0
            r3.realmSet$time(r1)
            r3.realmSet$recent_mil(r1)
            r3.realmSet$is_locked(r0)
            r3.realmSet$is_favorite(r0)
            r3.realmSet$is_recent(r0)
            return
    }

    @androidx.annotation.Nullable
    public static com.flextv.livestore.models.MovieModel fromM3UItem(iptv.m3u.parser.M3UItem r4) {
            com.flextv.livestore.models.MovieModel r0 = new com.flextv.livestore.models.MovieModel     // Catch: java.lang.Exception -> L97
            r0.<init>()     // Catch: java.lang.Exception -> L97
            java.lang.String r1 = r4.getGroupTitle()     // Catch: java.lang.Exception -> L97
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L97
            if (r1 == 0) goto L12
            java.lang.String r1 = "All"
            goto L16
        L12:
            java.lang.String r1 = r4.getGroupTitle()     // Catch: java.lang.Exception -> L97
        L16:
            r0.setCategory_name(r1)     // Catch: java.lang.Exception -> L97
            java.lang.String r1 = r4.getChannelName()     // Catch: java.lang.Exception -> L97
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L97
            if (r1 != 0) goto L2a
            java.lang.String r1 = r4.getChannelName()     // Catch: java.lang.Exception -> L97
            r0.setName(r1)     // Catch: java.lang.Exception -> L97
        L2a:
            java.lang.String r1 = r4.getStreamURL()     // Catch: java.lang.Exception -> L97
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L97
            if (r1 != 0) goto L85
            java.lang.String r1 = r4.getStreamURL()     // Catch: java.lang.Exception -> L97
            r0.setUrl(r1)     // Catch: java.lang.Exception -> L97
            java.lang.String r1 = r0.getUrl()     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "movie"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = "0"
            java.lang.String r3 = "/"
            if (r1 == 0) goto L73
            java.lang.String r1 = r0.getUrl()     // Catch: java.lang.Exception -> L6f
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L6f
            r3 = 6
            r1 = r1[r3]     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = "."
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Exception -> L6f
            if (r3 == 0) goto L6b
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L6f
            r3 = 0
            r1 = r1[r3]     // Catch: java.lang.Exception -> L6f
            r0.setStream_id(r1)     // Catch: java.lang.Exception -> L6f
            goto L85
        L6b:
            r0.setStream_id(r1)     // Catch: java.lang.Exception -> L6f
            goto L85
        L6f:
            r0.setStream_id(r2)     // Catch: java.lang.Exception -> L97
            goto L85
        L73:
            java.lang.String r1 = r0.getUrl()     // Catch: java.lang.Exception -> L82
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Exception -> L82
            r3 = 5
            r1 = r1[r3]     // Catch: java.lang.Exception -> L82
            r0.setStream_id(r1)     // Catch: java.lang.Exception -> L82
            goto L85
        L82:
            r0.setStream_id(r2)     // Catch: java.lang.Exception -> L97
        L85:
            java.lang.String r1 = r4.getLogoURL()     // Catch: java.lang.Exception -> L97
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L97
            if (r1 != 0) goto L96
            java.lang.String r4 = r4.getLogoURL()     // Catch: java.lang.Exception -> L97
            r0.setStream_icon(r4)     // Catch: java.lang.Exception -> L97
        L96:
            return r0
        L97:
            r4 = move-exception
            r4.printStackTrace()
            r4 = 0
            return r4
    }

    public java.lang.String getAdded() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$added()
            if (r0 == 0) goto L16
            java.lang.String r0 = r1.realmGet$added()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L16
        L11:
            java.lang.String r0 = r1.realmGet$added()
            return r0
        L16:
            java.lang.String r0 = "0"
            return r0
    }

    public java.lang.String getCategory_id() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$category_id()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.String r0 = r1.realmGet$category_id()
            return r0
    }

    public java.lang.String getCategory_name() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$category_name()
            if (r0 != 0) goto L9
            java.lang.String r0 = "!@#%"
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$category_name()
        Ld:
            return r0
    }

    public java.lang.String getCustom_sid() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$custom_sid()
            return r0
    }

    public java.lang.String getExtension() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$extension()
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

    public int getPro() {
            r1 = this;
            int r0 = r1.realmGet$pro()
            return r0
    }

    public java.lang.String getRating() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$rating()
            return r0
    }

    public long getRecent_mil() {
            r2 = this;
            long r0 = r2.realmGet$recent_mil()
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

    public java.lang.String getStream_id() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$stream_id()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$stream_id()
        Ld:
            return r0
    }

    public java.lang.String getStream_type() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$stream_type()
            return r0
    }

    public long getTime() {
            r2 = this;
            long r0 = r2.realmGet$time()
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

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$type()
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$url()
            return r0
    }

    public boolean isIs_favorite() {
            r1 = this;
            boolean r0 = r1.realmGet$is_favorite()
            return r0
    }

    public boolean isIs_locked() {
            r1 = this;
            boolean r0 = r1.realmGet$is_locked()
            return r0
    }

    public boolean isIs_recent() {
            r1 = this;
            boolean r0 = r1.realmGet$is_recent()
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$added() {
            r1 = this;
            java.lang.String r0 = r1.added
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$category_id() {
            r1 = this;
            java.lang.String r0 = r1.category_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r1 = this;
            java.lang.String r0 = r1.category_name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$custom_sid() {
            r1 = this;
            java.lang.String r0 = r1.custom_sid
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$extension() {
            r1 = this;
            java.lang.String r0 = r1.extension
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public boolean realmGet$is_favorite() {
            r1 = this;
            boolean r0 = r1.is_favorite
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public boolean realmGet$is_locked() {
            r1 = this;
            boolean r0 = r1.is_locked
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public boolean realmGet$is_recent() {
            r1 = this;
            boolean r0 = r1.is_recent
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public int realmGet$num() {
            r1 = this;
            int r0 = r1.num
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public int realmGet$pro() {
            r1 = this;
            int r0 = r1.pro
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$rating() {
            r1 = this;
            java.lang.String r0 = r1.rating
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public long realmGet$recent_mil() {
            r2 = this;
            long r0 = r2.recent_mil
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r1 = this;
            java.lang.String r0 = r1.stream_icon
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$stream_id() {
            r1 = this;
            java.lang.String r0 = r1.stream_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$stream_type() {
            r1 = this;
            java.lang.String r0 = r1.stream_type
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public long realmGet$time() {
            r2 = this;
            long r0 = r2.time
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$tmdb_id() {
            r1 = this;
            java.lang.String r0 = r1.tmdb_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$added(java.lang.String r1) {
            r0 = this;
            r0.added = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$category_id(java.lang.String r1) {
            r0 = this;
            r0.category_id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r1) {
            r0 = this;
            r0.category_name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$custom_sid(java.lang.String r1) {
            r0 = this;
            r0.custom_sid = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$extension(java.lang.String r1) {
            r0 = this;
            r0.extension = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$is_favorite(boolean r1) {
            r0 = this;
            r0.is_favorite = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$is_locked(boolean r1) {
            r0 = this;
            r0.is_locked = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$is_recent(boolean r1) {
            r0 = this;
            r0.is_recent = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$name(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$num(int r1) {
            r0 = this;
            r0.num = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$pro(int r1) {
            r0 = this;
            r0.pro = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$rating(java.lang.String r1) {
            r0 = this;
            r0.rating = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$recent_mil(long r1) {
            r0 = this;
            r0.recent_mil = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r1) {
            r0 = this;
            r0.stream_icon = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$stream_id(java.lang.String r1) {
            r0 = this;
            r0.stream_id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$stream_type(java.lang.String r1) {
            r0 = this;
            r0.stream_type = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$time(long r1) {
            r0 = this;
            r0.time = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$tmdb_id(java.lang.String r1) {
            r0 = this;
            r0.tmdb_id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$type(java.lang.String r1) {
            r0 = this;
            r0.type = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_MovieModelRealmProxyInterface
    public void realmSet$url(java.lang.String r1) {
            r0 = this;
            r0.url = r1
            return
    }

    public void setAdded(java.lang.String r1) {
            r0 = this;
            r0.realmSet$added(r1)
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

    public void setCustom_sid(java.lang.String r1) {
            r0 = this;
            r0.realmSet$custom_sid(r1)
            return
    }

    public void setExtension(java.lang.String r1) {
            r0 = this;
            r0.realmSet$extension(r1)
            return
    }

    public void setIs_favorite(boolean r1) {
            r0 = this;
            r0.realmSet$is_favorite(r1)
            return
    }

    public void setIs_locked(boolean r1) {
            r0 = this;
            r0.realmSet$is_locked(r1)
            return
    }

    public void setIs_recent(boolean r1) {
            r0 = this;
            r0.realmSet$is_recent(r1)
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

    public void setPro(int r1) {
            r0 = this;
            r0.realmSet$pro(r1)
            return
    }

    public void setRating(java.lang.String r1) {
            r0 = this;
            r0.realmSet$rating(r1)
            return
    }

    public void setRecent_mil(long r1) {
            r0 = this;
            r0.realmSet$recent_mil(r1)
            return
    }

    public void setStream_icon(java.lang.String r1) {
            r0 = this;
            r0.realmSet$stream_icon(r1)
            return
    }

    public void setStream_id(java.lang.String r1) {
            r0 = this;
            r0.realmSet$stream_id(r1)
            return
    }

    public void setStream_type(java.lang.String r1) {
            r0 = this;
            r0.realmSet$stream_type(r1)
            return
    }

    public void setTime(long r1) {
            r0 = this;
            r0.realmSet$time(r1)
            return
    }

    public void setTmdb_id(java.lang.String r1) {
            r0 = this;
            r0.realmSet$tmdb_id(r1)
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.realmSet$type(r1)
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.realmSet$url(r1)
            return
    }
}
