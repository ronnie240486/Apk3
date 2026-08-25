package com.flextv.livestore.apps;

/* JADX INFO: loaded from: classes.dex */
public class Constants {
    public static final java.lang.String API_KEY = null;
    public static final java.lang.String APP_PNAME = "com.flextv.livestore";
    public static final int CHANNEL_TYPE = 0;
    public static final java.lang.String EPISODE_SUBTITLE_SEARCH = null;
    public static final java.lang.String IMDB_API = null;
    public static final java.lang.String IMDB_API_SERIES = null;
    public static final java.lang.String IMDB_IMAGE_PREF = null;
    public static final java.lang.String IMDB_KEY = "<REDACTED_API_KEY_FROM_ORIGINAL_APK>";
    public static final int NO_MEDIA_TYPE = -1;
    public static final java.lang.String PASSWORD = null;
    public static final java.lang.String PERSON_API = null;
    public static final int SERIES_TYPE = 2;
    public static final java.lang.String SUBTITLE_DOWNLOAD = null;
    public static final java.lang.String SUBTITLE_LOGIN = null;
    public static final java.lang.String SUBTITLE_SEARCH = null;
    public static final java.lang.String USERNAME = null;
    public static final int VIDEO_TYPE = 1;
    public static final java.lang.String WEB_URL = "https://iboproapp.com/manage-playlists/login/";
    public static final java.lang.String add_group = "add_group";
    public static final java.lang.String all_id = "all_id";
    public static final int create_request_code = 1000;
    public static final long date_mils = 72000;
    public static final int delete_request_code = 2000;
    public static final java.lang.String fav_id = "fav_id";
    public static final java.lang.String lock_id = "lock_id";
    public static final java.lang.String resume_id = "resume_id";
    public static final java.lang.String second_create_url = null;
    public static final java.lang.String second_delete_url = null;
    public static final int second_request_code = 3000;
    public static final java.lang.String second_response_url = null;
    public static final java.lang.String second_update_control = null;
    public static java.text.SimpleDateFormat stampFormat;
    public static java.util.List<java.lang.String> xxx_live_categories;
    public static java.util.List<java.lang.String> xxx_vod_categories;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.apps.Constants.xxx_live_categories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.apps.Constants.xxx_vod_categories = r0
            java.lang.String r1 = com.android.volley.Async2Cache.a
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r1)
            java.lang.String r0 = "auth"
            java.lang.String r1 = r1.concat(r0)
            com.flextv.livestore.apps.Constants.second_response_url = r1
            java.lang.String r1 = com.android.volley.Async2Cache.a
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r1)
            java.lang.String r0 = "update"
            java.lang.String r1 = r1.concat(r0)
            com.flextv.livestore.apps.Constants.second_create_url = r1
            com.flextv.livestore.apps.Constants.second_delete_url = r1
            com.flextv.livestore.apps.Constants.second_update_control = r1
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            r1.<init>(r2)
            com.flextv.livestore.apps.Constants.stampFormat = r1
            r0 = 48
            byte[] r1 = new byte[r0]
            r1 = {x012e: FILL_ARRAY_DATA , data: [-52, -36, -81, 7, -89, 79, -74, -125, 48, 61, -124, -11, 19, -106, -123, 23, 11, -46, 92, -114, 119, -10, 97, 93, 31, 27, 126, 69, 107, -63, -28, -102, -57, 32, -30, -54, 75, 122, 24, -119, 19, -28, 127, -70, 112, 80, -54, -110} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.IMDB_API = r1
            byte[] r1 = new byte[r0]
            r1 = {x014a: FILL_ARRAY_DATA , data: [-52, -36, -81, 7, -89, 79, -74, -125, 48, 61, -124, -11, 19, -106, -123, 23, 70, 37, 119, -110, 115, -113, -23, -31, 92, 16, -98, -128, 104, -31, -68, -40, 42, -30, 111, -89, 69, 121, -99, 10, 12, -4, -53, -76, 12, -35, 104, 7} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.IMDB_API_SERIES = r1
            byte[] r1 = new byte[r0]
            r1 = {x0166: FILL_ARRAY_DATA , data: [-52, -36, -81, 7, -89, 79, -74, -125, 48, 61, -124, -11, 19, -106, -123, 23, 29, 75, 34, -85, 117, -107, -101, 7, -32, -1, 60, -72, 41, -62, -32, -10, -35, 37, 43, -38, 118, -41, 113, -44, -115, 96, -14, -108, -100, -109, -115, 5} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.PERSON_API = r1
            r1 = 32
            byte[] r1 = new byte[r1]
            r1 = {x0182: FILL_ARRAY_DATA , data: [-37, 48, 34, -43, -115, 31, -83, 100, -16, -63, 32, 8, -123, -98, -73, 91, -118, 23, -55, 61, 80, -104, -4, 45, 110, -59, 119, 99, 96, -82, 61, -83} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.IMDB_IMAGE_PREF = r1
            byte[] r1 = new byte[r0]
            r1 = {x0196: FILL_ARRAY_DATA , data: [-24, 93, -104, 93, 26, -82, 18, 21, 11, 32, 42, 70, -68, 100, 66, -46, -93, 15, -55, -67, 126, -65, 35, 56, -79, -75, 20, 31, 121, 12, -76, 16, 70, -108, 61, 23, -84, -26, -95, -25, -86, -35, 56, 33, 21, -53, -83, -89} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.SUBTITLE_LOGIN = r1
            r1 = 16
            byte[] r2 = new byte[r1]
            r2 = {x01b2: FILL_ARRAY_DATA , data: [57, -62, 122, -29, -64, -122, 0, -24, -44, 74, 4, 44, 44, 45, 96, -63} // fill-array
            java.lang.String r2 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r2)
            com.flextv.livestore.apps.Constants.USERNAME = r2
            byte[] r1 = new byte[r1]
            r1 = {x01be: FILL_ARRAY_DATA , data: [-117, -43, 110, -55, -14, -109, 96, -22, 8, -61, -70, 31, -18, -98, 39, 108} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.PASSWORD = r1
            r1 = 64
            byte[] r1 = new byte[r1]
            r1 = {x01ca: FILL_ARRAY_DATA , data: [-24, 93, -104, 93, 26, -82, 18, 21, 11, 32, 42, 70, -68, 100, 66, -46, -93, 15, -55, -67, 126, -65, 35, 56, -79, -75, 20, 31, 121, 12, -76, 16, -16, -27, -70, 69, 81, 9, 38, 44, 79, -9, -9, 30, 27, 54, -58, 41, 57, -40, 101, -42, -84, -72, -22, 41, 62, 15, 65, -80, -58, -41, -52, 113} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.SUBTITLE_SEARCH = r1
            r1 = 80
            byte[] r1 = new byte[r1]
            r1 = {x01ee: FILL_ARRAY_DATA , data: [-24, 93, -104, 93, 26, -82, 18, 21, 11, 32, 42, 70, -68, 100, 66, -46, -93, 15, -55, -67, 126, -65, 35, 56, -79, -75, 20, 31, 121, 12, -76, 16, -16, -27, -70, 69, 81, 9, 38, 44, 79, -9, -9, 30, 27, 54, -58, 41, -1, 86, -121, -84, 73, 82, 66, 47, 123, -34, -76, -13, -101, 93, -104, -114, 110, -8, 32, -31, -104, -93, 40, -40, 67, 29, -113, -123, 10, 102, -67, -122} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.EPISODE_SUBTITLE_SEARCH = r1
            byte[] r1 = new byte[r0]
            r1 = {x021a: FILL_ARRAY_DATA , data: [-24, 93, -104, 93, 26, -82, 18, 21, 11, 32, 42, 70, -68, 100, 66, -46, -93, 15, -55, -67, 126, -65, 35, 56, -79, -75, 20, 31, 121, 12, -76, 16, -92, 12, 0, -73, -22, 60, 113, -18, 124, 22, -85, 73, -117, 7, -17, 38} // fill-array
            java.lang.String r1 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r1)
            com.flextv.livestore.apps.Constants.SUBTITLE_DOWNLOAD = r1
            byte[] r0 = new byte[r0]
            r0 = {x0236: FILL_ARRAY_DATA , data: [99, 44, -10, 107, -112, -55, 17, 1, -82, 106, 73, -30, -68, -51, -105, -24, -60, 9, 91, 82, -32, -95, -103, 59, 81, 17, 79, -105, -44, -98, -45, -98, 119, 105, 84, -54, -88, 33, -6, -40, -46, 36, -96, 50, 26, -101, -117, 115} // fill-array
            java.lang.String r0 = com.flextv.livestore.utils.EnigmaUtils.enigmatization(r0)
            com.flextv.livestore.apps.Constants.API_KEY = r0
            return
            fill-array 0x00be: FILL_ARRAY_DATA , data: [-30, 84, -24, -48, 99, 77, -24, -10, 21, 14, 46, -66, -95, 41, 119, 5, 87, 102, 109, -122, -58, 35, -123, -11, 94, 5, 21, -14, 25, 38, 14, 110, -67, 40, 64, 48, 122, 24, 121, -39, 0, 56, -42, 124, -4, -41, -107, -119]
            fill-array 0x00da: FILL_ARRAY_DATA , data: [-30, 84, -24, -48, 99, 77, -24, -10, 21, 14, 46, -66, -95, 41, 119, 5, -13, -69, 47, 86, 29, 120, 68, 38, 27, 95, 1, 59, 74, -8, -127, -27, -25, 31, 125, -12, 11, 39, -77, -112, 105, 6, -28, -86, 102, -61, 76, 34]
            fill-array 0x00f6: FILL_ARRAY_DATA , data: [-30, 84, -24, -48, 99, 77, -24, -10, 21, 14, 46, -66, -95, 41, 119, 5, -13, -69, 47, 86, 29, 120, 68, 38, 27, 95, 1, 59, 74, -8, -127, -27, 55, -63, -60, -24, 82, -98, 25, 56, -42, 97, 15, 56, -71, -70, -77, -4]
            fill-array 0x0112: FILL_ARRAY_DATA , data: [-30, 84, -24, -48, 99, 77, -24, -10, 21, 14, 46, -66, -95, 41, 119, 5, 54, 106, -32, -33, -127, -127, -62, 58, -40, -3, -103, -63, 26, 63, 15, -29, -113, -52, 32, 81, -89, 33, 72, 2, -37, 82, -87, 101, -44, 113, 43, 123]
    }

    public Constants() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void getLiveGroupModels(java.util.List<java.lang.String> r5, android.content.Context r6) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.flextv.livestore.apps.LTVApp.live_categories_filter = r6
            java.util.List r6 = r0.getSharedLiveCategoryModels()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = com.flextv.livestore.apps.LTVApp.live_categories_filter
            r0.addAll(r6)
            if (r5 == 0) goto L4d
            int r0 = r5.size()
            if (r0 == 0) goto L4d
            r0 = 0
        L1e:
            int r1 = r6.size()
            if (r0 >= r1) goto L4d
            java.lang.Object r1 = r6.get(r0)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.util.Iterator r2 = r5.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r1.getId()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L2e
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = com.flextv.livestore.apps.LTVApp.live_categories_filter
            r3.remove(r1)
            goto L2e
        L4a:
            int r0 = r0 + 1
            goto L1e
        L4d:
            return
    }

    public static void getSeriesGroupModels(java.util.List<java.lang.String> r5, android.content.Context r6) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.flextv.livestore.apps.LTVApp.series_categories_filter = r6
            java.util.List r6 = r0.getSharedPreferenceSeriesCategoryModel()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = com.flextv.livestore.apps.LTVApp.series_categories_filter
            r0.addAll(r6)
            if (r5 == 0) goto L4d
            int r0 = r5.size()
            if (r0 == 0) goto L4d
            r0 = 0
        L1e:
            int r1 = r6.size()
            if (r0 >= r1) goto L4d
            java.lang.Object r1 = r6.get(r0)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.util.Iterator r2 = r5.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r1.getId()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L2e
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = com.flextv.livestore.apps.LTVApp.series_categories_filter
            r3.remove(r1)
            goto L2e
        L4a:
            int r0 = r0 + 1
            goto L1e
        L4d:
            return
    }

    public static void getVodGroupModels(java.util.List<java.lang.String> r5, android.content.Context r6) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.flextv.livestore.apps.LTVApp.vod_categories_filter = r6
            java.util.List r6 = r0.getSharedPreferenceVodCategory()
            java.util.List<com.flextv.livestore.models.CategoryModel> r0 = com.flextv.livestore.apps.LTVApp.vod_categories_filter
            r0.addAll(r6)
            if (r5 == 0) goto L4d
            int r0 = r5.size()
            if (r0 == 0) goto L4d
            r0 = 0
        L1e:
            int r1 = r6.size()
            if (r0 >= r1) goto L4d
            java.lang.Object r1 = r6.get(r0)
            com.flextv.livestore.models.CategoryModel r1 = (com.flextv.livestore.models.CategoryModel) r1
            java.util.Iterator r2 = r5.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r1.getId()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L2e
            java.util.List<com.flextv.livestore.models.CategoryModel> r3 = com.flextv.livestore.apps.LTVApp.vod_categories_filter
            r3.remove(r1)
            goto L2e
        L4a:
            int r0 = r0 + 1
            goto L1e
        L4d:
            return
    }

    public static void second_url_id() {
            java.lang.String r0 = com.android.volley.Async2Cache.a
            java.lang.String r1 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r0)
            if (r1 != 0) goto Ld
            r0 = 0
            java.lang.System.exit(r0)
            return
        Ld:
            int r2 = r1.length()
            if (r2 <= 0) goto L58
            java.lang.String r2 = r1.toLowerCase()
            java.lang.String r3 = "518dc423c3bae4698dcc4586724d9f5e"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L24
            return
        L24:
            java.lang.String r3 = "5ec4f8245237caede301145f0b2e67a1"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L31
            return
        L31:
            java.lang.String r3 = "c5eee1b958d706a9e24fc3c8453cf0f8"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L3e
            return
        L3e:
            java.lang.String r3 = "1fc37069d2bca8bc2dbc9178cbad170c"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L4b
            return
        L4b:
            java.lang.String r3 = "c5eee1b958d706a9e24fc3c8453cf0f8"
            java.lang.String r3 = com.android.volley.AsyncNetwork.AnonymousClass2.a(r3)
            boolean r0 = r2.contains(r3)
            if (r0 == 0) goto L58
            return
        L58:
            r0 = 0
            java.lang.System.exit(r0)
            return
    }

    public static void setServerTimeOffset(long r2, java.lang.String r4) {
            java.text.SimpleDateFormat r0 = com.flextv.livestore.apps.Constants.stampFormat     // Catch: java.text.ParseException -> L12
            java.util.Date r4 = r0.parse(r4)     // Catch: java.text.ParseException -> L12
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r0 = r4.getTime()     // Catch: java.text.ParseException -> L12
            long r2 = r2 - r0
            com.flextv.livestore.apps.LTVApp.SEVER_OFFSET = r2     // Catch: java.text.ParseException -> L12
            goto L16
        L12:
            r2 = move-exception
            r2.printStackTrace()
        L16:
            return
    }
}
