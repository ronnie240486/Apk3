package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class Season implements java.io.Serializable {
    private java.lang.String air_date;
    private java.lang.String category_name;
    private java.lang.String cover;
    private java.lang.String cover_big;
    private java.util.List<com.flextv.livestore.models.EpisodeModel> episodeModels;
    private java.lang.String episode_count;
    private java.lang.String id;
    private java.lang.String name;
    private java.lang.String overview;
    private int season_number;

    public Season() {
            r0 = this;
            r0.<init>()
            return
    }

    public Season(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.season_number = r2
            r0.cover = r3
            return
    }

    public java.lang.String getAir_date() {
            r1 = this;
            java.lang.String r0 = r1.air_date
            return r0
    }

    public java.lang.String getCategory_name() {
            r1 = this;
            java.lang.String r0 = r1.category_name
            return r0
    }

    public java.lang.String getCover() {
            r1 = this;
            java.lang.String r0 = r1.cover
            return r0
    }

    public java.lang.String getCover_big() {
            r1 = this;
            java.lang.String r0 = r1.cover_big
            return r0
    }

    public java.util.List<com.flextv.livestore.models.EpisodeModel> getEpisodeModels() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.EpisodeModel> r0 = r1.episodeModels
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            return r0
    }

    public java.lang.String getEpisode_count() {
            r1 = this;
            java.lang.String r0 = r1.episode_count
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            java.lang.String r0 = r1.episode_count
            return r0
        Le:
            java.lang.String r0 = "0"
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getOverview() {
            r1 = this;
            java.lang.String r0 = r1.overview
            return r0
    }

    public int getSeason_number() {
            r1 = this;
            int r0 = r1.season_number
            return r0
    }

    public void setAir_date(java.lang.String r1) {
            r0 = this;
            r0.air_date = r1
            return
    }

    public void setCategory_name(java.lang.String r1) {
            r0 = this;
            r0.category_name = r1
            return
    }

    public void setCover(java.lang.String r1) {
            r0 = this;
            r0.cover = r1
            return
    }

    public void setCover_big(java.lang.String r1) {
            r0 = this;
            r0.cover_big = r1
            return
    }

    public void setEpisodeModels(java.util.List<com.flextv.livestore.models.EpisodeModel> r1) {
            r0 = this;
            r0.episodeModels = r1
            return
    }

    public void setEpisode_count(java.lang.String r1) {
            r0 = this;
            r0.episode_count = r1
            return
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public void setOverview(java.lang.String r1) {
            r0 = this;
            r0.overview = r1
            return
    }

    public void setSeason_number(int r1) {
            r0 = this;
            r0.season_number = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "Season{air_date='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.air_date
            r2 = 39
            java.lang.String r3 = ", episode_count='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.episode_count
            java.lang.String r3 = ", id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.id
            java.lang.String r3 = ", name='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.name
            java.lang.String r3 = ", overview='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.overview
            java.lang.String r3 = ", season_number="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            int r1 = r4.season_number
            r0.append(r1)
            java.lang.String r1 = ", cover='"
            r0.append(r1)
            java.lang.String r1 = r4.cover
            java.lang.String r3 = ", cover_big='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.cover_big
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
