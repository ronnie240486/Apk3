package com.flextv.livestore.helper;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceHelper {
    private static final java.lang.String APP_INFO_MODEL = "APP_INFO_MODEL";
    private static final java.lang.String CATEGORY_POS = "category_pos";
    private static final java.lang.String CHANNEL_POS = "channel_pos";
    private static final java.lang.String DEVICE_KEY = "device_key";
    private static final java.lang.String DEVICE_TYPE = "device_type";
    private static final java.lang.String EPISODE_MODELS = "episode_models";
    private static final java.lang.String EPISODE_RESUME_MODEL = "episode_resume_model";
    private static final java.lang.String EXTERNAL_PLAYER = "external_player";
    private static final java.lang.String FIRST_LUNCH = "first_lunch";
    private static final java.lang.String FORWARD_STEP = "forward_step";
    private static final java.lang.String INVISIBLE_LIVE_CATEGORIES = "invisible_live_categories";
    private static final java.lang.String INVISIBLE_SERIES_CATEGORIES = "invisible_series_categories";
    private static final java.lang.String INVISIBLE_VOD_CATEGORIES = "invisible_vod_categories";
    private static final java.lang.String IS_DEMO = "is_demo";
    private static final java.lang.String IS_GRID = "is_grid";
    private static final java.lang.String IS_M3U = "is_m3u";
    private static final java.lang.String IS_PLAYLIST_CHANGED = "is_changed";
    private static final java.lang.String LANGUAGE_CODE = "language_code";
    private static final java.lang.String LAST_EPG_DATE = "last_epg_date";
    private static final java.lang.String LAST_M3U_DATE = "LastM3uDate";
    private static final java.lang.String LAST_PLAYLIST_DATE = "last_playlist_date";
    private static final java.lang.String LIVE_CATEGORY = "live_category";
    private static final java.lang.String LIVE_FAV_NAMES = "live_fav_names";
    private static final java.lang.String LIVE_LOCK_NAMES = "live_lock_names";
    private static final java.lang.String LIVE_ORDER = "live_order";
    private static final java.lang.String LIVE_STREAM_FORMAT = "live_stream_format";
    private static final java.lang.String LOGIN_MODEL = "login_models";
    private static final java.lang.String MAC_ADDRESS = "mac_address";
    private static final java.lang.String MY_GROUP = "my_group";
    private static final java.lang.String PARENT_CONTROL = "parent_control";
    private static final java.lang.String PASSWORD = "password";
    private static final java.lang.String PLAYLIST_POSITION = "playlist_position";
    private static final java.lang.String PREF_FILE = "PREF";
    private static final java.lang.String SERIES_CATEGORY = "series_category";
    private static final java.lang.String SERIES_FAV_NAMES = "series_fav_names";
    private static final java.lang.String SERIES_ORDER = "series_order";
    private static final java.lang.String SERIES_RECENT_NAMES = "series_recent_models";
    private static final java.lang.String SERVER_URL = "server_url";
    private static final java.lang.String SUBTITLE_BG_COLOR = "subtitle_bg_color";
    private static final java.lang.String SUBTITLE_COLOR = "subtitle_color";
    private static final java.lang.String SUBTITLE_ENABLE = "subtitle_enable";
    private static final java.lang.String SUBTITLE_FONT = "subtitle_font";
    private static final java.lang.String SUBTITLE_LOGIN = "subtitle_login";
    private static final java.lang.String TIME_FORMAT = "time_format";
    private static final java.lang.String UPDATE_PERIOD = "update_period";
    private static final java.lang.String USERNAME = "user_name";
    private static final java.lang.String USER_ID = "user_id";
    private static final java.lang.String VOD_CATEGORY = "vod_category";
    private static final java.lang.String VOD_FAV_NAMES = "vod_fav_names";
    private static final java.lang.String VOD_ORDER = "vod_order";
    private static final java.lang.String VOD_RESUME_MODEL = "vod_resume_model";
    public com.google.gson.Gson gson;
    public android.content.SharedPreferences settings;

















    public PreferenceHelper(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            r2.gson = r0
            java.lang.String r0 = "PREF"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.settings = r3
            return
    }

    public java.util.List<com.flextv.livestore.models.CategoryModel> getSharedLiveCategoryModels() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "live_category"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L25
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L13
            goto L25
        L13:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L2b
            com.flextv.livestore.helper.PreferenceHelper$5 r2 = new com.flextv.livestore.helper.PreferenceHelper$5     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L2b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            return r0
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            r0.<init>()     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public com.flextv.livestore.models.AppInfoModel getSharedPreferenceAppInfo() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "APP_INFO_MODEL"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L1f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L14
            goto L1f
        L14:
            com.google.gson.Gson r2 = r4.gson     // Catch: java.lang.Exception -> L1f
            java.lang.Class<com.flextv.livestore.models.AppInfoModel> r3 = com.flextv.livestore.models.AppInfoModel.class
            java.lang.Object r1 = r2.fromJson(r1, r3)     // Catch: java.lang.Exception -> L1f
            com.flextv.livestore.models.AppInfoModel r1 = (com.flextv.livestore.models.AppInfoModel) r1     // Catch: java.lang.Exception -> L1f
            return r1
        L1f:
            return r0
    }

    public int getSharedPreferenceCategoryPos() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1c
            r2.<init>()     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "category_pos"
            r2.append(r3)     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = r4.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L1c
            r2.append(r3)     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L1c
            int r0 = r1.getInt(r2, r0)     // Catch: java.lang.Exception -> L1c
        L1c:
            return r0
    }

    public int getSharedPreferenceChannelPos() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1c
            r2.<init>()     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = "channel_pos"
            r2.append(r3)     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = r4.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L1c
            r2.append(r3)     // Catch: java.lang.Exception -> L1c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L1c
            int r0 = r1.getInt(r2, r0)     // Catch: java.lang.Exception -> L1c
        L1c:
            return r0
    }

    public java.lang.String getSharedPreferenceDeviceKey() {
            r3 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> La
            java.lang.String r2 = "device_key"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> La
        La:
            return r0
    }

    public java.lang.String getSharedPreferenceDeviceType() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "device_type"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L15
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            return r0
    }

    public java.util.List<com.flextv.livestore.models.EpisodeModel> getSharedPreferenceEpisodeModels() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "episode_models"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L25
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L13
            goto L25
        L13:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L2b
            com.flextv.livestore.helper.PreferenceHelper$16 r2 = new com.flextv.livestore.helper.PreferenceHelper$16     // Catch: java.lang.Exception -> L2b
            r2.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L2b
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L2b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2b
            return r0
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2b
            r0.<init>()     // Catch: java.lang.Exception -> L2b
            return r0
        L2b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public int getSharedPreferenceExternalPlayer() {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "external_player"
            int r0 = r1.getInt(r2, r0)     // Catch: java.lang.Exception -> L9
        L9:
            return r0
    }

    public boolean getSharedPreferenceFirstLunch() {
            r3 = this;
            r0 = 1
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "first_lunch"
            boolean r0 = r1.getBoolean(r2, r0)     // Catch: java.lang.Exception -> L9
        L9:
            return r0
    }

    public int getSharedPreferenceForwardSetting() {
            r3 = this;
            r0 = 10
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> La
            java.lang.String r2 = "forward_step"
            int r0 = r1.getInt(r2, r0)     // Catch: java.lang.Exception -> La
        La:
            return r0
    }

    public boolean getSharedPreferenceISM3U() {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "is_m3u"
            boolean r0 = r1.getBoolean(r2, r0)     // Catch: java.lang.Exception -> L9
        L9:
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceInvisibleLiveCategories() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "invisible_live_categories"
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3e
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            goto L38
        L26:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3e
            com.flextv.livestore.helper.PreferenceHelper$13 r2 = new com.flextv.livestore.helper.PreferenceHelper$13     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3e
            return r0
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceInvisibleSeriesCategories() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "invisible_series_categories"
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3e
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            goto L38
        L26:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3e
            com.flextv.livestore.helper.PreferenceHelper$15 r2 = new com.flextv.livestore.helper.PreferenceHelper$15     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3e
            return r0
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceInvisibleVodCategories() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "invisible_vod_categories"
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3e
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            goto L38
        L26:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3e
            com.flextv.livestore.helper.PreferenceHelper$14 r2 = new com.flextv.livestore.helper.PreferenceHelper$14     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3e
            return r0
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public boolean getSharedPreferenceIsDemo() {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "is_demo"
            boolean r0 = r1.getBoolean(r2, r0)     // Catch: java.lang.Exception -> L9
        L9:
            return r0
    }

    public boolean getSharedPreferenceIsGrid() {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "is_grid"
            boolean r0 = r1.getBoolean(r2, r0)     // Catch: java.lang.Exception -> L9
        L9:
            return r0
    }

    public boolean getSharedPreferenceIsPlaylistChanged() {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> L9
            java.lang.String r2 = "is_changed"
            boolean r0 = r1.getBoolean(r2, r0)     // Catch: java.lang.Exception -> L9
        L9:
            return r0
    }

    public java.lang.String getSharedPreferenceLanguageCode() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "language_code"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L15
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            return r0
    }

    public java.lang.String getSharedPreferenceLastEpgDate() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            java.lang.String r1 = "last_epg_date"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
    }

    public java.lang.String getSharedPreferenceLastM3uDate() {
            r4 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = "LastM3uDate"
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r4.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L27
            r2.append(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r1 == 0) goto L27
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L27
            if (r2 == 0) goto L26
            goto L27
        L26:
            return r1
        L27:
            return r0
    }

    public long getSharedPreferenceLastPlaylistDate() {
            r4 = this;
            android.content.SharedPreferences r0 = r4.settings
            java.lang.String r1 = "last_playlist_date"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceLiveFavChannels() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "live_fav_names"
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3e
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            goto L38
        L26:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3e
            com.flextv.livestore.helper.PreferenceHelper$9 r2 = new com.flextv.livestore.helper.PreferenceHelper$9     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3e
            return r0
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceLiveLockChannels() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "live_lock_names"
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3e
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            goto L38
        L26:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3e
            com.flextv.livestore.helper.PreferenceHelper$8 r2 = new com.flextv.livestore.helper.PreferenceHelper$8     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3e
            return r0
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public int getSharedPreferenceLiveOrder() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            java.lang.String r1 = "live_order"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public java.lang.String getSharedPreferenceLiveStreamFormat() {
            r4 = this;
            java.lang.String r0 = "ts"
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = "live_stream_format"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L17
            if (r1 == 0) goto L17
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L17
            if (r2 == 0) goto L16
            goto L17
        L16:
            return r1
        L17:
            return r0
    }

    public com.flextv.livestore.models.LoginModel getSharedPreferenceLoginModel() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = "login_models"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L1f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L14
            goto L1f
        L14:
            com.google.gson.Gson r2 = r4.gson     // Catch: java.lang.Exception -> L1f
            java.lang.Class<com.flextv.livestore.models.LoginModel> r3 = com.flextv.livestore.models.LoginModel.class
            java.lang.Object r1 = r2.fromJson(r1, r3)     // Catch: java.lang.Exception -> L1f
            com.flextv.livestore.models.LoginModel r1 = (com.flextv.livestore.models.LoginModel) r1     // Catch: java.lang.Exception -> L1f
            return r1
        L1f:
            return r0
    }

    public java.lang.String getSharedPreferenceMacAddress() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = "mac_address"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L15
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceMyGroupCategory() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "my_group"
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3e
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            goto L38
        L26:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3e
            com.flextv.livestore.helper.PreferenceHelper$3 r2 = new com.flextv.livestore.helper.PreferenceHelper$3     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3e
            return r0
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceMyGroupChannels(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings     // Catch: java.lang.Exception -> L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3c
            r1.<init>()     // Catch: java.lang.Exception -> L3c
            r1.append(r3)     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = r2.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3c
            r1.append(r3)     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = ""
            java.lang.String r3 = r0.getString(r3, r1)     // Catch: java.lang.Exception -> L3c
            if (r3 == 0) goto L36
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L24
            goto L36
        L24:
            com.google.gson.Gson r0 = r2.gson     // Catch: java.lang.Exception -> L3c
            com.flextv.livestore.helper.PreferenceHelper$4 r1 = new com.flextv.livestore.helper.PreferenceHelper$4     // Catch: java.lang.Exception -> L3c
            r1.<init>()     // Catch: java.lang.Exception -> L3c
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Exception -> L3c
            java.lang.Object r3 = r0.fromJson(r3, r1)     // Catch: java.lang.Exception -> L3c
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L3c
            return r3
        L36:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3c
            r3.<init>()     // Catch: java.lang.Exception -> L3c
            return r3
        L3c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
    }

    public java.lang.String getSharedPreferenceParentPassword() {
            r3 = this;
            java.lang.String r0 = "0000"
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = "parent_control"
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto L14
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L14
            if (r2 == 0) goto L13
            goto L14
        L13:
            return r1
        L14:
            return r0
    }

    public java.lang.String getSharedPreferencePassword() {
            r3 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> Le
            java.lang.String r2 = "password"
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> Le
            if (r1 != 0) goto Ld
            return r0
        Ld:
            return r1
        Le:
            return r0
    }

    public int getSharedPreferencePlaylistPosition() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            java.lang.String r1 = "playlist_position"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public java.util.List<com.flextv.livestore.models.ResumeSeriesModel> getSharedPreferenceRecentSeriesNames() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "series_recent_models"
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3f
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L39
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L27
            goto L39
        L27:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3f
            com.flextv.livestore.helper.PreferenceHelper$12 r2 = new com.flextv.livestore.helper.PreferenceHelper$12     // Catch: java.lang.Exception -> L3f
            r2.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3f
            return r0
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            return r0
        L3f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<com.flextv.livestore.models.ResumeModel> getSharedPreferenceResumeModel() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "vod_resume_model"
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3f
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L39
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L27
            goto L39
        L27:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3f
            com.flextv.livestore.helper.PreferenceHelper$1 r2 = new com.flextv.livestore.helper.PreferenceHelper$1     // Catch: java.lang.Exception -> L3f
            r2.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3f
            return r0
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            return r0
        L3f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<com.flextv.livestore.models.CategoryModel> getSharedPreferenceSeriesCategoryModel() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "series_category"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L26
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L14
            goto L26
        L14:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L2c
            com.flextv.livestore.helper.PreferenceHelper$7 r2 = new com.flextv.livestore.helper.PreferenceHelper$7     // Catch: java.lang.Exception -> L2c
            r2.<init>()     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L2c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2c
            return r0
        L26:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2c
            r0.<init>()     // Catch: java.lang.Exception -> L2c
            return r0
        L2c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceSeriesFavNames() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "series_fav_names"
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3f
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L39
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L27
            goto L39
        L27:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3f
            com.flextv.livestore.helper.PreferenceHelper$11 r2 = new com.flextv.livestore.helper.PreferenceHelper$11     // Catch: java.lang.Exception -> L3f
            r2.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3f
            return r0
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            return r0
        L3f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public int getSharedPreferenceSeriesOrder() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            java.lang.String r1 = "series_order"
            r2 = 1
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public java.util.List<com.flextv.livestore.models.ResumeModel> getSharedPreferenceSeriesResumeModel() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r1.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "episode_resume_model"
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3e
            r1.append(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L38
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            goto L38
        L26:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3e
            com.flextv.livestore.helper.PreferenceHelper$2 r2 = new com.flextv.livestore.helper.PreferenceHelper$2     // Catch: java.lang.Exception -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3e
            return r0
        L38:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3e
            r0.<init>()     // Catch: java.lang.Exception -> L3e
            return r0
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.lang.String getSharedPreferenceServerUrl() {
            r3 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = "server_url"
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> Lf
            if (r1 != 0) goto Le
            return r0
        Le:
            return r1
        Lf:
            return r0
    }

    public java.lang.String getSharedPreferenceSubtitleBgColor() {
            r3 = this;
            java.lang.String r0 = "#00ffffff"
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> Lb
            java.lang.String r2 = "subtitle_bg_color"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> Lb
        Lb:
            return r0
    }

    public java.lang.String getSharedPreferenceSubtitleColor() {
            r3 = this;
            java.lang.String r0 = "#ffffff"
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> Lb
            java.lang.String r2 = "subtitle_color"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> Lb
        Lb:
            return r0
    }

    public boolean getSharedPreferenceSubtitleEnable() {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> La
            java.lang.String r2 = "subtitle_enable"
            boolean r0 = r1.getBoolean(r2, r0)     // Catch: java.lang.Exception -> La
        La:
            return r0
    }

    public int getSharedPreferenceSubtitleSize() {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> La
            java.lang.String r2 = "subtitle_font"
            int r0 = r1.getInt(r2, r0)     // Catch: java.lang.Exception -> La
        La:
            return r0
    }

    public com.flextv.livestore.models.SubTitleUserModel getSharedPreferenceSubtitleUserModel() {
            r4 = this;
            r0 = 0
            android.content.SharedPreferences r1 = r4.settings     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = "subtitle_login"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L20
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L15
            goto L20
        L15:
            com.google.gson.Gson r2 = r4.gson     // Catch: java.lang.Exception -> L20
            java.lang.Class<com.flextv.livestore.models.SubTitleUserModel> r3 = com.flextv.livestore.models.SubTitleUserModel.class
            java.lang.Object r1 = r2.fromJson(r1, r3)     // Catch: java.lang.Exception -> L20
            com.flextv.livestore.models.SubTitleUserModel r1 = (com.flextv.livestore.models.SubTitleUserModel) r1     // Catch: java.lang.Exception -> L20
            return r1
        L20:
            return r0
    }

    public int getSharedPreferenceTimeFormat() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            java.lang.String r1 = "time_format"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public int getSharedPreferenceUpdatePeriod() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            java.lang.String r1 = "update_period"
            r2 = 1
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public java.lang.String getSharedPreferenceUserId() {
            r3 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> Lb
            java.lang.String r2 = "user_id"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> Lb
        Lb:
            return r0
    }

    public java.lang.String getSharedPreferenceUsername() {
            r3 = this;
            java.lang.String r0 = ""
            android.content.SharedPreferences r1 = r3.settings     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = "user_name"
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> Lf
            if (r1 != 0) goto Le
            return r0
        Le:
            return r1
        Lf:
            return r0
    }

    public java.util.List<com.flextv.livestore.models.CategoryModel> getSharedPreferenceVodCategory() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "vod_category"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L26
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto L14
            goto L26
        L14:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L2c
            com.flextv.livestore.helper.PreferenceHelper$6 r2 = new com.flextv.livestore.helper.PreferenceHelper$6     // Catch: java.lang.Exception -> L2c
            r2.<init>()     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L2c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2c
            return r0
        L26:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2c
            r0.<init>()     // Catch: java.lang.Exception -> L2c
            return r0
        L2c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public java.util.List<java.lang.String> getSharedPreferenceVodFavNames() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings     // Catch: java.lang.Exception -> L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "vod_fav_names"
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = r3.getSharedPreferenceUserId()     // Catch: java.lang.Exception -> L3f
            r1.append(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L39
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L27
            goto L39
        L27:
            com.google.gson.Gson r1 = r3.gson     // Catch: java.lang.Exception -> L3f
            com.flextv.livestore.helper.PreferenceHelper$10 r2 = new com.flextv.livestore.helper.PreferenceHelper$10     // Catch: java.lang.Exception -> L3f
            r2.<init>()     // Catch: java.lang.Exception -> L3f
            java.lang.reflect.Type r2 = r2.getType()     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = r1.fromJson(r0, r2)     // Catch: java.lang.Exception -> L3f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L3f
            return r0
        L39:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3f
            r0.<init>()     // Catch: java.lang.Exception -> L3f
            return r0
        L3f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public int getSharedPreferenceVodOrder() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            java.lang.String r1 = "vod_order"
            r2 = 1
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public void removeKeys(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r1 = r2.getSharedPreferenceUserId()
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.remove(r3)
            r0.commit()
            return
    }

    public void setSharedPreferenceAppInfo(com.flextv.livestore.models.AppInfoModel r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r3 = r1.toJson(r3)
            java.lang.String r1 = "APP_INFO_MODEL"
            r0.putString(r1, r3)
            r0.apply()
            r0.commit()
            return
    }

    public void setSharedPreferenceCategoryPos(int r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "category_pos"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.putInt(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceChannelPos(int r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "channel_pos"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.putInt(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceDeviceKey(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "device_key"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceDeviceType(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "device_type"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceEpisodeModels(java.util.List<com.flextv.livestore.models.EpisodeModel> r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r3 = r1.toJson(r3)
            java.lang.String r1 = "episode_models"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceExternalPlayer(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "external_player"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceFirstLunch(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "first_lunch"
            r0.putBoolean(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceForwardSetting(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "forward_step"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceISM3U(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "is_m3u"
            r0.putBoolean(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceInvisibleLiveCategories(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "invisible_live_categories"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceInvisibleSeriesCategories(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "invisible_series_categories"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceInvisibleVodCategories(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "invisible_vod_categories"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceIsDemo(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "is_demo"
            r0.putBoolean(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceIsGrid(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "is_grid"
            r0.putBoolean(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceIsPlaylistChanged(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "is_changed"
            r0.putBoolean(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceLanguageCode(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "language_code"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceLastEpgDate(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "last_epg_date"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceLastM3uDate(java.lang.String r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "LastM3uDate"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceLastPlaylistDate(long r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "last_playlist_date"
            r0.putLong(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceLiveCategory(java.util.List<com.flextv.livestore.models.CategoryModel> r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r3 = r1.toJson(r3)
            java.lang.String r1 = "live_category"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceLiveFavChannels(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "live_fav_names"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceLiveLockChannels(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "live_lock_names"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceLiveOrder(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "live_order"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceLiveStreamFormat(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "live_stream_format"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceLoginModel(com.flextv.livestore.models.LoginModel r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r3 = r1.toJson(r3)
            java.lang.String r1 = "login_models"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceMacAddress(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "mac_address"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceMyGroupCategory(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "my_group"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            r0.commit()
            return
    }

    public void setSharedPreferenceMyGroupChannels(java.lang.String r3, java.util.List<java.lang.String> r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r1 = r2.getSharedPreferenceUserId()
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r4 = r1.toJson(r4)
            r0.putString(r3, r4)
            r0.apply()
            r0.commit()
            return
    }

    public void setSharedPreferenceParentPassword(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "parent_control"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferencePassword(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "password"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferencePlaylistPosition(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "playlist_position"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceRecentSeriesNames(java.util.List<com.flextv.livestore.models.ResumeSeriesModel> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "series_recent_models"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceResumeModel(java.util.List<com.flextv.livestore.models.ResumeModel> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "vod_resume_model"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            r0.commit()
            return
    }

    public void setSharedPreferenceSeriesCategory(java.util.List<com.flextv.livestore.models.CategoryModel> r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r3 = r1.toJson(r3)
            java.lang.String r1 = "series_category"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceSeriesFavNames(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "series_fav_names"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceSeriesOrder(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "series_order"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceSeriesResumeModel(java.util.List<com.flextv.livestore.models.ResumeModel> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "episode_resume_model"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            r0.commit()
            return
    }

    public void setSharedPreferenceServerUrl(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "server_url"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceSubtitleBgColor(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "subtitle_bg_color"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceSubtitleColor(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "subtitle_color"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceSubtitleEnable(boolean r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "subtitle_enable"
            r0.putBoolean(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceSubtitleLoginModel(com.flextv.livestore.models.SubTitleUserModel r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r3 = r1.toJson(r3)
            java.lang.String r1 = "subtitle_login"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceSubtitleSize(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "subtitle_font"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceTimeFormat(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "time_format"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceUpdatePeriod(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "update_period"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceUserId(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "user_id"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceUsername(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "user_name"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceVodCategory(java.util.List<com.flextv.livestore.models.CategoryModel> r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            com.google.gson.Gson r1 = r2.gson
            java.lang.String r3 = r1.toJson(r3)
            java.lang.String r1 = "vod_category"
            r0.putString(r1, r3)
            r0.apply()
            return
    }

    public void setSharedPreferenceVodFavNames(java.util.List<java.lang.String> r4) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "vod_fav_names"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getSharedPreferenceUserId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.gson.Gson r2 = r3.gson
            java.lang.String r4 = r2.toJson(r4)
            r0.putString(r1, r4)
            r0.apply()
            return
    }

    public void setSharedPreferenceVodOrder(int r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.settings
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "vod_order"
            r0.putInt(r1, r3)
            r0.apply()
            return
    }
}
