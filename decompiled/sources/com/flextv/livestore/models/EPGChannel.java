package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class EPGChannel extends io.realm.RealmObject implements java.io.Serializable, io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface {

    @com.google.gson.annotations.SerializedName("epg_channel_id")
    private java.lang.String Id;

    @com.google.gson.annotations.SerializedName("added")
    private java.lang.String added;

    @com.google.gson.annotations.SerializedName("category_id")
    private java.lang.String category_id;
    private java.lang.String category_name;
    private int cell;
    private int channelID;

    @com.google.gson.annotations.SerializedName("custom_sid")
    private java.lang.String custom_sid;

    @com.google.gson.annotations.SerializedName("direct_source")
    private java.lang.String direct_source;
    private boolean is_favorite;
    private boolean is_locked;
    private boolean is_recent;

    @com.google.gson.annotations.SerializedName("name")
    private java.lang.String name;

    @com.google.gson.annotations.SerializedName("num")
    private java.lang.String num;
    private long recent_pos;
    public boolean selected;

    @com.google.gson.annotations.SerializedName("stream_icon")
    private java.lang.String stream_icon;

    @com.google.gson.annotations.SerializedName("stream_id")
    private java.lang.String stream_id;

    @com.google.gson.annotations.SerializedName("stream_type")
    private java.lang.String stream_type;

    @com.google.gson.annotations.SerializedName("tv_archive")
    private java.lang.String tv_archive;

    @com.google.gson.annotations.SerializedName("tv_archive_duration")
    private java.lang.String tv_archive_duration;
    private java.lang.String url;

    public EPGChannel() {
            r3 = this;
            r3.<init>()
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            r0 = r3
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            r0.realm$injectObjectContext()
        Ld:
            java.lang.String r0 = ""
            r3.realmSet$num(r0)
            r3.realmSet$name(r0)
            r3.realmSet$stream_type(r0)
            java.lang.String r1 = "-1"
            r3.realmSet$stream_id(r1)
            r3.realmSet$stream_icon(r0)
            r3.realmSet$Id(r0)
            r3.realmSet$added(r0)
            r3.realmSet$category_id(r1)
            r3.realmSet$custom_sid(r0)
            java.lang.String r1 = "0"
            r3.realmSet$tv_archive(r1)
            r3.realmSet$direct_source(r0)
            r3.realmSet$tv_archive_duration(r0)
            r0 = 0
            r3.realmSet$is_locked(r0)
            r3.realmSet$is_favorite(r0)
            r3.realmSet$is_recent(r0)
            r1 = 0
            r3.realmSet$recent_pos(r1)
            r1 = -1
            r3.realmSet$cell(r1)
            r3.realmSet$channelID(r0)
            return
    }

    public EPGChannel(java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r3 = this;
            r3.<init>()
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            r0 = r3
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            r0.realm$injectObjectContext()
        Ld:
            java.lang.String r0 = ""
            r3.realmSet$num(r0)
            r3.realmSet$name(r0)
            r3.realmSet$stream_type(r0)
            java.lang.String r1 = "-1"
            r3.realmSet$stream_id(r1)
            r3.realmSet$stream_icon(r0)
            r3.realmSet$Id(r0)
            r3.realmSet$added(r0)
            r3.realmSet$category_id(r1)
            r3.realmSet$custom_sid(r0)
            java.lang.String r1 = "0"
            r3.realmSet$tv_archive(r1)
            r3.realmSet$direct_source(r0)
            r3.realmSet$tv_archive_duration(r0)
            r0 = 0
            r3.realmSet$is_locked(r0)
            r3.realmSet$is_favorite(r0)
            r3.realmSet$is_recent(r0)
            r1 = 0
            r3.realmSet$recent_pos(r1)
            r1 = -1
            r3.realmSet$cell(r1)
            r3.realmSet$channelID(r0)
            r3.realmSet$stream_icon(r4)
            r3.realmSet$name(r5)
            r3.realmSet$channelID(r6)
            r3.realmSet$Id(r7)
            r3.realmSet$num(r8)
            r3.realmSet$stream_id(r9)
            return
    }

    public EPGChannel(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            boolean r0 = r3 instanceof io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto Ld
            r0 = r3
            io.realm.internal.RealmObjectProxy r0 = (io.realm.internal.RealmObjectProxy) r0
            r0.realm$injectObjectContext()
        Ld:
            java.lang.String r0 = ""
            r3.realmSet$num(r0)
            r3.realmSet$name(r0)
            r3.realmSet$stream_type(r0)
            java.lang.String r1 = "-1"
            r3.realmSet$stream_id(r1)
            r3.realmSet$stream_icon(r0)
            r3.realmSet$Id(r0)
            r3.realmSet$added(r0)
            r3.realmSet$category_id(r1)
            r3.realmSet$custom_sid(r0)
            java.lang.String r1 = "0"
            r3.realmSet$tv_archive(r1)
            r3.realmSet$direct_source(r0)
            r3.realmSet$tv_archive_duration(r0)
            r0 = 0
            r3.realmSet$is_locked(r0)
            r3.realmSet$is_favorite(r0)
            r3.realmSet$is_recent(r0)
            r1 = 0
            r3.realmSet$recent_pos(r1)
            r1 = -1
            r3.realmSet$cell(r1)
            r3.realmSet$channelID(r0)
            r3.realmSet$stream_icon(r4)
            r3.realmSet$name(r5)
            r3.realmSet$Id(r6)
            return
    }

    @androidx.annotation.Nullable
    public static com.flextv.livestore.models.EPGChannel fromM3UItem(iptv.m3u.parser.M3UItem r5) {
            java.lang.String r0 = "."
            com.flextv.livestore.models.EPGChannel r1 = new com.flextv.livestore.models.EPGChannel     // Catch: java.lang.Exception -> Ld6
            r1.<init>()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r2 = r5.getGroupTitle()     // Catch: java.lang.Exception -> Ld6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Ld6
            if (r2 == 0) goto L14
            java.lang.String r2 = "All"
            goto L18
        L14:
            java.lang.String r2 = r5.getGroupTitle()     // Catch: java.lang.Exception -> Ld6
        L18:
            r1.setCategory_name(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r2 = r5.getChannelId()     // Catch: java.lang.Exception -> Ld6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Ld6
            if (r2 != 0) goto L2c
            java.lang.String r2 = r5.getChannelId()     // Catch: java.lang.Exception -> Ld6
            r1.setId(r2)     // Catch: java.lang.Exception -> Ld6
        L2c:
            java.lang.String r2 = r5.getChannelName()     // Catch: java.lang.Exception -> Ld6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Ld6
            if (r2 != 0) goto L3d
            java.lang.String r2 = r5.getChannelName()     // Catch: java.lang.Exception -> Ld6
            r1.setName(r2)     // Catch: java.lang.Exception -> Ld6
        L3d:
            java.lang.String r2 = r5.getStreamURL()     // Catch: java.lang.Exception -> Ld6
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Ld6
            if (r2 != 0) goto Lc4
            java.lang.String r2 = r5.getStreamURL()     // Catch: java.lang.Exception -> Ld6
            r1.setUrl(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r2 = r5.getStreamURL()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = "live"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r3 = ""
            java.lang.String r4 = "/"
            if (r2 == 0) goto L9a
            java.lang.String r2 = r1.getUrl()     // Catch: java.lang.Exception -> L7e
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.lang.Exception -> L7e
            r4 = 6
            r2 = r2[r4]     // Catch: java.lang.Exception -> L7e
            boolean r4 = r2.contains(r0)     // Catch: java.lang.Exception -> L7e
            if (r4 == 0) goto L7a
            java.lang.String[] r0 = r2.split(r0)     // Catch: java.lang.Exception -> L7e
            r2 = 0
            r0 = r0[r2]     // Catch: java.lang.Exception -> L7e
            r1.setStream_id(r0)     // Catch: java.lang.Exception -> L7e
            goto Lc4
        L7a:
            r1.setStream_id(r2)     // Catch: java.lang.Exception -> L7e
            goto Lc4
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r0.<init>()     // Catch: java.lang.Exception -> Ld6
            r0.append(r3)     // Catch: java.lang.Exception -> Ld6
            java.util.Random r2 = new java.util.Random     // Catch: java.lang.Exception -> Ld6
            r2.<init>()     // Catch: java.lang.Exception -> Ld6
            int r2 = r2.nextInt()     // Catch: java.lang.Exception -> Ld6
            r0.append(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Ld6
            r1.setStream_id(r0)     // Catch: java.lang.Exception -> Ld6
            goto Lc4
        L9a:
            java.lang.String r0 = r1.getUrl()     // Catch: java.lang.Exception -> La9
            java.lang.String[] r0 = r0.split(r4)     // Catch: java.lang.Exception -> La9
            r2 = 5
            r0 = r0[r2]     // Catch: java.lang.Exception -> La9
            r1.setStream_id(r0)     // Catch: java.lang.Exception -> La9
            goto Lc4
        La9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r0.<init>()     // Catch: java.lang.Exception -> Ld6
            r0.append(r3)     // Catch: java.lang.Exception -> Ld6
            java.util.Random r2 = new java.util.Random     // Catch: java.lang.Exception -> Ld6
            r2.<init>()     // Catch: java.lang.Exception -> Ld6
            int r2 = r2.nextInt()     // Catch: java.lang.Exception -> Ld6
            r0.append(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Ld6
            r1.setStream_id(r0)     // Catch: java.lang.Exception -> Ld6
        Lc4:
            java.lang.String r0 = r5.getLogoURL()     // Catch: java.lang.Exception -> Ld6
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Ld6
            if (r0 != 0) goto Ld5
            java.lang.String r5 = r5.getLogoURL()     // Catch: java.lang.Exception -> Ld6
            r1.setStream_icon(r5)     // Catch: java.lang.Exception -> Ld6
        Ld5:
            return r1
        Ld6:
            r5 = move-exception
            r5.printStackTrace()
            r5 = 0
            return r5
    }

    public java.lang.String getAdded() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$added()
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
            java.lang.String r0 = ""
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$category_name()
        Ld:
            return r0
    }

    public int getCell() {
            r1 = this;
            int r0 = r1.realmGet$cell()
            return r0
    }

    public int getChannelID() {
            r1 = this;
            int r0 = r1.realmGet$channelID()
            return r0
    }

    public java.lang.String getCustom_sid() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$custom_sid()
            return r0
    }

    public java.lang.String getDirect_source() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$direct_source()
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$Id()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.realmGet$Id()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$name()
            if (r0 != 0) goto La
            java.lang.String r0 = "unknown channel"
            goto Le
        La:
            java.lang.String r0 = r1.realmGet$name()
        Le:
            return r0
    }

    public java.lang.String getNum() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$num()
            if (r0 != 0) goto L9
            java.lang.String r0 = "0"
            goto Ld
        L9:
            java.lang.String r0 = r1.realmGet$num()
        Ld:
            return r0
    }

    public long getRecent_pos() {
            r2 = this;
            long r0 = r2.realmGet$recent_pos()
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

    public java.lang.String getTv_archive() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$tv_archive()
            return r0
    }

    public java.lang.String getTv_archive_duration() {
            r1 = this;
            java.lang.String r0 = r1.realmGet$tv_archive_duration()
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

    public boolean isIs_recent() {
            r1 = this;
            boolean r0 = r1.realmGet$is_recent()
            return r0
    }

    public boolean isSelected() {
            r1 = this;
            boolean r0 = r1.realmGet$selected()
            return r0
    }

    public boolean is_favorite() {
            r1 = this;
            boolean r0 = r1.realmGet$is_favorite()
            return r0
    }

    public boolean is_locked() {
            r1 = this;
            boolean r0 = r1.realmGet$is_locked()
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$Id() {
            r1 = this;
            java.lang.String r0 = r1.Id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$added() {
            r1 = this;
            java.lang.String r0 = r1.added
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$category_id() {
            r1 = this;
            java.lang.String r0 = r1.category_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$category_name() {
            r1 = this;
            java.lang.String r0 = r1.category_name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public int realmGet$cell() {
            r1 = this;
            int r0 = r1.cell
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public int realmGet$channelID() {
            r1 = this;
            int r0 = r1.channelID
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$custom_sid() {
            r1 = this;
            java.lang.String r0 = r1.custom_sid
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$direct_source() {
            r1 = this;
            java.lang.String r0 = r1.direct_source
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$is_favorite() {
            r1 = this;
            boolean r0 = r1.is_favorite
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$is_locked() {
            r1 = this;
            boolean r0 = r1.is_locked
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$is_recent() {
            r1 = this;
            boolean r0 = r1.is_recent
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$num() {
            r1 = this;
            java.lang.String r0 = r1.num
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public long realmGet$recent_pos() {
            r2 = this;
            long r0 = r2.recent_pos
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public boolean realmGet$selected() {
            r1 = this;
            boolean r0 = r1.selected
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$stream_icon() {
            r1 = this;
            java.lang.String r0 = r1.stream_icon
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$stream_id() {
            r1 = this;
            java.lang.String r0 = r1.stream_id
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$stream_type() {
            r1 = this;
            java.lang.String r0 = r1.stream_type
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$tv_archive() {
            r1 = this;
            java.lang.String r0 = r1.tv_archive
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$tv_archive_duration() {
            r1 = this;
            java.lang.String r0 = r1.tv_archive_duration
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public java.lang.String realmGet$url() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$Id(java.lang.String r1) {
            r0 = this;
            r0.Id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$added(java.lang.String r1) {
            r0 = this;
            r0.added = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$category_id(java.lang.String r1) {
            r0 = this;
            r0.category_id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$category_name(java.lang.String r1) {
            r0 = this;
            r0.category_name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$cell(int r1) {
            r0 = this;
            r0.cell = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$channelID(int r1) {
            r0 = this;
            r0.channelID = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$custom_sid(java.lang.String r1) {
            r0 = this;
            r0.custom_sid = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$direct_source(java.lang.String r1) {
            r0 = this;
            r0.direct_source = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$is_favorite(boolean r1) {
            r0 = this;
            r0.is_favorite = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$is_locked(boolean r1) {
            r0 = this;
            r0.is_locked = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$is_recent(boolean r1) {
            r0 = this;
            r0.is_recent = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$name(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$num(java.lang.String r1) {
            r0 = this;
            r0.num = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$recent_pos(long r1) {
            r0 = this;
            r0.recent_pos = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$selected(boolean r1) {
            r0 = this;
            r0.selected = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$stream_icon(java.lang.String r1) {
            r0 = this;
            r0.stream_icon = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$stream_id(java.lang.String r1) {
            r0 = this;
            r0.stream_id = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$stream_type(java.lang.String r1) {
            r0 = this;
            r0.stream_type = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$tv_archive(java.lang.String r1) {
            r0 = this;
            r0.tv_archive = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
    public void realmSet$tv_archive_duration(java.lang.String r1) {
            r0 = this;
            r0.tv_archive_duration = r1
            return
    }

    @Override // io.realm.com_flextv_livestore_models_EPGChannelRealmProxyInterface
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

    public void setCell(int r1) {
            r0 = this;
            r0.realmSet$cell(r1)
            return
    }

    public void setChannelID(int r1) {
            r0 = this;
            r0.realmSet$channelID(r1)
            return
    }

    public void setCustom_sid(java.lang.String r1) {
            r0 = this;
            r0.realmSet$custom_sid(r1)
            return
    }

    public void setDirect_source(java.lang.String r1) {
            r0 = this;
            r0.realmSet$direct_source(r1)
            return
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.realmSet$Id(r1)
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

    public void setNum(java.lang.String r1) {
            r0 = this;
            r0.realmSet$num(r1)
            return
    }

    public void setRecent_pos(long r1) {
            r0 = this;
            r0.realmSet$recent_pos(r1)
            return
    }

    public void setSelected(boolean r1) {
            r0 = this;
            r0.realmSet$selected(r1)
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

    public void setTv_archive(java.lang.String r1) {
            r0 = this;
            r0.realmSet$tv_archive(r1)
            return
    }

    public void setTv_archive_duration(java.lang.String r1) {
            r0 = this;
            r0.realmSet$tv_archive_duration(r1)
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.realmSet$url(r1)
            return
    }
}
