package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class TMDBResponse implements java.io.Serializable {
    public java.lang.String backdrop_path;
    public int id;
    public java.lang.String imdb_id;
    public java.lang.String original_language;
    public java.lang.String overview;
    public java.lang.String poster_path;
    public java.lang.String release_date;
    public int runtime;
    public float vote_average;

    public TMDBResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getBackdrop_path() {
            r1 = this;
            java.lang.String r0 = r1.backdrop_path
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.lang.String getImdb_id() {
            r1 = this;
            java.lang.String r0 = r1.imdb_id
            return r0
    }

    public java.lang.String getOriginal_language() {
            r1 = this;
            java.lang.String r0 = r1.original_language
            return r0
    }

    public java.lang.String getOverview() {
            r1 = this;
            java.lang.String r0 = r1.overview
            return r0
    }

    public java.lang.String getPoster_path() {
            r1 = this;
            java.lang.String r0 = r1.poster_path
            return r0
    }

    public java.lang.String getRelease_date() {
            r1 = this;
            java.lang.String r0 = r1.release_date
            return r0
    }

    public int getRuntime() {
            r1 = this;
            int r0 = r1.runtime
            return r0
    }

    public float getVote_average() {
            r1 = this;
            float r0 = r1.vote_average
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "TMDBResponse{backdrop_path='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.backdrop_path
            r2 = 39
            java.lang.String r3 = ", id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            int r1 = r4.id
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", imdb_id='"
            r0.append(r1)
            java.lang.String r1 = r4.imdb_id
            java.lang.String r3 = ", original_language='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.original_language
            java.lang.String r3 = ", overview='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.overview
            java.lang.String r3 = ", poster_path='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.poster_path
            java.lang.String r3 = ", release_date='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.release_date
            java.lang.String r3 = ", runtime="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            int r1 = r4.runtime
            r0.append(r1)
            java.lang.String r1 = ", vote_average="
            r0.append(r1)
            float r1 = r4.vote_average
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
