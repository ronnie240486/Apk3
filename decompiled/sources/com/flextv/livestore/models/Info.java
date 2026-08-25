package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class Info implements java.io.Serializable {
    private java.lang.String movie_image;
    private java.lang.String plot;
    private java.lang.String rating;
    private java.lang.String releasedate;
    private java.lang.String tmdb_id;

    public Info() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getMovie_image() {
            r1 = this;
            java.lang.String r0 = r1.movie_image
            return r0
    }

    public java.lang.String getPlot() {
            r1 = this;
            java.lang.String r0 = r1.plot
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getRating() {
            r1 = this;
            java.lang.String r0 = r1.rating
            return r0
    }

    public java.lang.String getReleasedate() {
            r1 = this;
            java.lang.String r0 = r1.releasedate
            return r0
    }

    public java.lang.String getTmdb_id() {
            r1 = this;
            java.lang.String r0 = r1.tmdb_id
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public void setMovie_image(java.lang.String r1) {
            r0 = this;
            r0.movie_image = r1
            return
    }

    public void setPlot(java.lang.String r1) {
            r0 = this;
            r0.plot = r1
            return
    }

    public void setRating(java.lang.String r1) {
            r0 = this;
            r0.rating = r1
            return
    }

    public void setReleasedate(java.lang.String r1) {
            r0 = this;
            r0.releasedate = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "Info{movie_image='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.movie_image
            r2 = 39
            java.lang.String r3 = ", plot='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.plot
            java.lang.String r3 = ", releasedate='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.releasedate
            java.lang.String r3 = ", rating='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.rating
            java.lang.String r3 = ", tmdb_id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.tmdb_id
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
