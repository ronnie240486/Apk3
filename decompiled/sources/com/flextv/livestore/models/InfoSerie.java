package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class InfoSerie implements java.io.Serializable {
    public com.flextv.livestore.models.ListEpisode episodes;
    public java.util.List<com.flextv.livestore.models.Season> seasons;

    public InfoSerie() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.seasons = r0
            com.flextv.livestore.models.ListEpisode r0 = new com.flextv.livestore.models.ListEpisode
            r0.<init>()
            r1.episodes = r0
            return
    }

    public com.flextv.livestore.models.ListEpisode getEpisodes() {
            r1 = this;
            com.flextv.livestore.models.ListEpisode r0 = r1.episodes
            return r0
    }

    public java.util.List<com.flextv.livestore.models.Season> getSeasons() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.Season> r0 = r1.seasons
            return r0
    }

    public void setEpisodes(com.flextv.livestore.models.ListEpisode r1) {
            r0 = this;
            r0.episodes = r1
            return
    }

    public void setSeasons(java.util.List<com.flextv.livestore.models.Season> r1) {
            r0 = this;
            r0.seasons = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "InfoSerie{seasons="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<com.flextv.livestore.models.Season> r1 = r2.seasons
            r0.append(r1)
            java.lang.String r1 = "episodes="
            r0.append(r1)
            com.flextv.livestore.models.ListEpisode r1 = r2.episodes
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
