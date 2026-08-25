package com.flextv.livestore.helper;

/* JADX INFO: loaded from: classes2.dex */
public class GetSharedInfo {
    public GetSharedInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean checkXUILink(java.lang.String r4) {
            java.lang.String r0 = "playlist"
            java.lang.String r1 = "/"
            boolean r2 = r4.contains(r1)
            r3 = 0
            if (r2 == 0) goto L1f
            boolean r2 = r4.contains(r0)     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L1f
            java.lang.String[] r4 = r4.split(r1)     // Catch: java.lang.Exception -> L1f
            r1 = 3
            r4 = r4[r1]     // Catch: java.lang.Exception -> L1f
            boolean r4 = r4.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L1f
            if (r4 == 0) goto L1f
            r3 = 1
        L1f:
            return r3
    }

    public static java.lang.String getCurrentTimeFormat(android.content.Context r1) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r1)
            int r1 = r0.getSharedPreferenceTimeFormat()
            if (r1 != 0) goto Le
            java.lang.String r1 = "hh:mm a"
            return r1
        Le:
            java.lang.String r1 = "HH:mm"
            return r1
    }

    public static java.util.List<com.flextv.livestore.models.CategoryModel> getDefaultLiveCategory() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r2 = "resume_id"
            java.lang.String r3 = "Recently Viewed"
            r1.<init>(r2, r3)
            r0.add(r1)
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r2 = "fav_id"
            java.lang.String r3 = "Favorite"
            r1.<init>(r2, r3)
            r0.add(r1)
            return r0
    }

    public static java.util.List<com.flextv.livestore.models.CategoryModel> getDefaultVodCategory() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r2 = "all_id"
            java.lang.String r3 = "All"
            r1.<init>(r2, r3)
            r0.add(r1)
            com.flextv.livestore.models.CategoryModel r1 = new com.flextv.livestore.models.CategoryModel
            java.lang.String r2 = "fav_id"
            java.lang.String r3 = "Favorite"
            r1.<init>(r2, r3)
            r0.add(r1)
            return r0
    }

    public static java.lang.String getDomainFromUrl(java.lang.String r3) {
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Exception -> L2e
            r0.<init>(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r3.<init>()     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = r0.getProtocol()     // Catch: java.lang.Exception -> L2e
            r3.append(r2)     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = "://"
            r3.append(r2)     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = r0.getAuthority()     // Catch: java.lang.Exception -> L2e
            r3.append(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L2e
            return r3
        L2e:
            return r1
    }

    public static java.lang.String getDuration(java.lang.String r5, java.lang.String r6) {
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7
            return r5
        L7:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L6f
            int r6 = r6 / 60
            int r0 = r6 / 60
            int r6 = r6 % 60
            java.lang.String r1 = "h"
            java.lang.String r2 = "0"
            r3 = 10
            if (r0 >= r3) goto L2c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r4.<init>()     // Catch: java.lang.Exception -> L6f
            r4.append(r2)     // Catch: java.lang.Exception -> L6f
            r4.append(r0)     // Catch: java.lang.Exception -> L6f
        L24:
            r4.append(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L6f
            goto L35
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r4.<init>()     // Catch: java.lang.Exception -> L6f
            r4.append(r0)     // Catch: java.lang.Exception -> L6f
            goto L24
        L35:
            java.lang.String r1 = "min"
            if (r6 >= r3) goto L4c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r3.<init>()     // Catch: java.lang.Exception -> L6f
            r3.append(r2)     // Catch: java.lang.Exception -> L6f
            r3.append(r6)     // Catch: java.lang.Exception -> L6f
            r3.append(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Exception -> L6f
            goto L5b
        L4c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r2.<init>()     // Catch: java.lang.Exception -> L6f
            r2.append(r6)     // Catch: java.lang.Exception -> L6f
            r2.append(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L6f
        L5b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r1.<init>()     // Catch: java.lang.Exception -> L6f
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = " "
            r1.append(r0)     // Catch: java.lang.Exception -> L6f
            r1.append(r6)     // Catch: java.lang.Exception -> L6f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L6f
        L6f:
            return r5
    }

    public static java.lang.String getEpisodeUrl(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/series/"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r2 = "."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r4, r2, r5)
            return r1
    }

    public static int getLanguagePosition(android.content.Context r5) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r5)
            java.lang.String r5 = r0.getSharedPreferenceLanguageCode()
            com.flextv.livestore.models.AppInfoModel r1 = r0.getSharedPreferenceAppInfo()
            r2 = 0
            r3 = 0
        Lf:
            java.util.List r4 = r1.getLanguageModels()
            int r4 = r4.size()
            if (r3 >= r4) goto L31
            java.util.List r4 = r1.getLanguageModels()
            java.lang.Object r4 = r4.get(r3)
            com.flextv.livestore.models.LanguageModel r4 = (com.flextv.livestore.models.LanguageModel) r4
            java.lang.String r4 = r4.getCode()
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L2e
            return r3
        L2e:
            int r3 = r3 + 1
            goto Lf
        L31:
            java.lang.String r5 = "en"
            r3 = 0
        L34:
            java.util.List r4 = r1.getLanguageModels()
            int r4 = r4.size()
            if (r3 >= r4) goto L59
            java.util.List r4 = r1.getLanguageModels()
            java.lang.Object r4 = r4.get(r3)
            com.flextv.livestore.models.LanguageModel r4 = (com.flextv.livestore.models.LanguageModel) r4
            java.lang.String r4 = r4.getCode()
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L56
            r0.setSharedPreferenceLanguageCode(r5)
            return r3
        L56:
            int r3 = r3 + 1
            goto L34
        L59:
            return r2
    }

    public static java.lang.String getLiveChannelUrl(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/live/"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r2 = "."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r4, r2, r5)
            return r1
    }

    public static java.lang.String getMovieUrl(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/movie/"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r2 = "."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r4, r2, r5)
            return r1
    }

    public static java.lang.String getPasswordFromUrl(java.lang.String r3) {
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            java.lang.String r3 = r3.replaceAll(r0, r1)
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Exception -> L27
            r0.<init>(r3)     // Catch: java.lang.Exception -> L27
            java.lang.String r3 = r0.getQuery()     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "&"
            java.lang.String[] r3 = r3.split(r0)     // Catch: java.lang.Exception -> L27
            r0 = 1
            r3 = r3[r0]     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "="
            java.lang.String[] r3 = r3.split(r2)     // Catch: java.lang.Exception -> L27
            r3 = r3[r0]     // Catch: java.lang.Exception -> L27
            return r3
        L27:
            return r1
    }

    public static int getPlaylistPosition(android.content.Context r1) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r1)
            com.flextv.livestore.models.AppInfoModel r1 = r0.getSharedPreferenceAppInfo()
            int r0 = r0.getSharedPreferencePlaylistPosition()
            java.util.List r1 = r1.getResult()
            int r1 = r1.size()
            int r1 = r1 + (-1)
            if (r0 <= r1) goto L1b
            r1 = 0
            return r1
        L1b:
            return r0
    }

    public static java.lang.String getPlaylistUrl(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "/get.php?username="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "&password="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "&output=ts&type=m3u_plus"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static int getSubtitleBgColorPosition(android.content.Context r3, java.lang.String[] r4) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r3)
            java.lang.String r3 = r0.getSharedPreferenceSubtitleBgColor()
            r0 = 0
            r1 = 0
        Lb:
            int r2 = r4.length
            if (r1 >= r2) goto L1a
            r2 = r4[r1]
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L17
            return r1
        L17:
            int r1 = r1 + 1
            goto Lb
        L1a:
            return r0
    }

    public static int getSubtitleColorPosition(android.content.Context r3, java.lang.String[] r4) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r3)
            java.lang.String r3 = r0.getSharedPreferenceSubtitleColor()
            r0 = 0
            r1 = 0
        Lb:
            int r2 = r4.length
            if (r1 >= r2) goto L1a
            r2 = r4[r1]
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L17
            return r1
        L17:
            int r1 = r1 + 1
            goto Lb
        L1a:
            return r0
    }

    public static java.util.List<com.flextv.livestore.models.SubtitleModel.DataModel> getUniqueSubtitleModels(java.util.List<com.flextv.livestore.models.SubtitleModel.DataModel> r3) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            com.flextv.livestore.models.SubtitleModel$DataModel r1 = (com.flextv.livestore.models.SubtitleModel.DataModel) r1
            com.flextv.livestore.models.SubtitleModel$AttributesModel r2 = r1.getAttributesModel()
            java.lang.String r2 = r2.getLanguage()
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L24
            goto L9
        L24:
            com.flextv.livestore.models.SubtitleModel$AttributesModel r2 = r1.getAttributesModel()
            java.lang.String r2 = r2.getLanguage()
            r0.put(r2, r1)
            goto L9
        L30:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Collection r0 = r0.values()
            r3.<init>(r0)
            return r3
    }

    public static java.lang.String getUsernameFromUrl(java.lang.String r2) {
            java.lang.String r0 = " "
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Exception -> L28
            r0.<init>(r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = r0.getQuery()     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = "&"
            java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Exception -> L28
            r0 = 0
            r2 = r2[r0]     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = "="
            java.lang.String[] r2 = r2.split(r0)     // Catch: java.lang.Exception -> L28
            r0 = 1
            r2 = r2[r0]     // Catch: java.lang.Exception -> L28
            return r2
        L28:
            return r1
    }

    public static java.util.List<java.lang.String> getVodSortLists(com.flextv.livestore.models.WordModels r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r2.getOrder_by_number()
            r0.add(r1)
            java.lang.String r1 = r2.getOrder_by_added()
            r0.add(r1)
            java.lang.String r1 = r2.getOrder_by_rating()
            r0.add(r1)
            java.lang.String r1 = r2.getSort_a_z()
            r0.add(r1)
            java.lang.String r2 = r2.getSort_z_a()
            r0.add(r2)
            return r0
    }

    public static com.flextv.livestore.models.WordModels getWordModel(android.content.Context r5) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r5)
            java.lang.String r5 = r0.getSharedPreferenceLanguageCode()
            com.flextv.livestore.models.AppInfoModel r1 = r0.getSharedPreferenceAppInfo()
            if (r1 == 0) goto L76
            r2 = 0
            r3 = 0
        L11:
            java.util.List r4 = r1.getLanguageModels()
            int r4 = r4.size()
            if (r3 >= r4) goto L41
            java.util.List r4 = r1.getLanguageModels()
            java.lang.Object r4 = r4.get(r3)
            com.flextv.livestore.models.LanguageModel r4 = (com.flextv.livestore.models.LanguageModel) r4
            java.lang.String r4 = r4.getCode()
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L3e
            java.util.List r5 = r1.getLanguageModels()
            java.lang.Object r5 = r5.get(r3)
            com.flextv.livestore.models.LanguageModel r5 = (com.flextv.livestore.models.LanguageModel) r5
            com.flextv.livestore.models.WordModels r5 = r5.getWordModel()
            return r5
        L3e:
            int r3 = r3 + 1
            goto L11
        L41:
            java.lang.String r5 = "en"
        L43:
            java.util.List r3 = r1.getLanguageModels()
            int r3 = r3.size()
            if (r2 >= r3) goto L76
            java.util.List r3 = r1.getLanguageModels()
            java.lang.Object r3 = r3.get(r2)
            com.flextv.livestore.models.LanguageModel r3 = (com.flextv.livestore.models.LanguageModel) r3
            java.lang.String r3 = r3.getCode()
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L73
            r0.setSharedPreferenceLanguageCode(r5)
            java.util.List r5 = r1.getLanguageModels()
            java.lang.Object r5 = r5.get(r2)
            com.flextv.livestore.models.LanguageModel r5 = (com.flextv.livestore.models.LanguageModel) r5
            com.flextv.livestore.models.WordModels r5 = r5.getWordModel()
            return r5
        L73:
            int r2 = r2 + 1
            goto L43
        L76:
            com.flextv.livestore.models.WordModels r5 = new com.flextv.livestore.models.WordModels
            r5.<init>()
            return r5
    }

    public static java.lang.String getXUIPassword(java.lang.String r3) {
            java.lang.String r0 = "playlist/"
            java.lang.String[] r3 = r3.split(r0)
            r0 = 1
            r3 = r3[r0]
            java.lang.String r1 = "/"
            boolean r2 = r3.contains(r1)
            if (r2 == 0) goto L18
            java.lang.String[] r3 = r3.split(r1)
            r3 = r3[r0]
            return r3
        L18:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String getXUIUsername(java.lang.String r2) {
            java.lang.String r0 = "playlist/"
            java.lang.String[] r2 = r2.split(r0)
            r0 = 1
            r2 = r2[r0]
            java.lang.String r0 = "/"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L19
            java.lang.String[] r2 = r2.split(r0)
            r0 = 0
            r2 = r2[r0]
            return r2
        L19:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String getYear(java.lang.String r2) {
            java.lang.String r0 = "yyyy-MM-dd"
            java.lang.String r1 = "yyyy"
            java.lang.String r2 = com.flextv.livestore.utils.Utils.formatDateFromString(r0, r1, r2)     // Catch: java.lang.Exception -> La
        La:
            return r2
    }

    public static boolean isTVDevice(android.content.Context r1) {
            com.flextv.livestore.helper.PreferenceHelper r0 = new com.flextv.livestore.helper.PreferenceHelper
            r0.<init>(r1)
            java.lang.String r1 = r0.getSharedPreferenceDeviceType()
            java.lang.String r0 = "tv"
            boolean r1 = r1.equalsIgnoreCase(r0)
            return r1
    }
}
