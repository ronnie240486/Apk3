package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class MovieCreditModel implements java.io.Serializable {
    public java.lang.String backdrop_path;
    public java.lang.String character;
    public java.lang.String credit_id;
    public int id;
    public java.lang.String original_language;
    public java.lang.String original_title;
    public java.lang.String overview;
    public java.lang.String poster_path;
    public java.lang.String release_date;
    public java.lang.String title;
    public float vote_average;
    public int vote_count;

    public MovieCreditModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getBackdrop_path() {
            r1 = this;
            java.lang.String r0 = r1.backdrop_path
            return r0
    }

    public java.lang.String getCharacter() {
            r1 = this;
            java.lang.String r0 = r1.character
            return r0
    }

    public java.lang.String getCredit_id() {
            r1 = this;
            java.lang.String r0 = r1.credit_id
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.lang.String getOriginal_language() {
            r1 = this;
            java.lang.String r0 = r1.original_language
            return r0
    }

    public java.lang.String getOriginal_title() {
            r1 = this;
            java.lang.String r0 = r1.original_title
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

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.title
            return r0
    }

    public float getVote_average() {
            r1 = this;
            float r0 = r1.vote_average
            return r0
    }

    public int getVote_count() {
            r1 = this;
            int r0 = r1.vote_count
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "MovieCreditModels{id='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r4.id
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = "character='"
            r0.append(r2)
            java.lang.String r2 = r4.character
            java.lang.String r3 = ", credit_id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.credit_id
            java.lang.String r3 = ", release_date='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.release_date
            java.lang.String r3 = ", vote_count="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            int r2 = r4.vote_count
            r0.append(r2)
            java.lang.String r2 = ", vote_average="
            r0.append(r2)
            float r2 = r4.vote_average
            r0.append(r2)
            java.lang.String r2 = ", title='"
            r0.append(r2)
            java.lang.String r2 = r4.title
            java.lang.String r3 = ", original_language='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.original_language
            java.lang.String r3 = ", original_title='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.original_title
            java.lang.String r3 = ", backdrop_path='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.backdrop_path
            java.lang.String r3 = ", overview='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.overview
            java.lang.String r3 = ", poster_path='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.poster_path
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
