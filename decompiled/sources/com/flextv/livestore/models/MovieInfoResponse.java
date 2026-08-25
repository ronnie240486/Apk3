package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class MovieInfoResponse implements java.io.Serializable {
    public com.flextv.livestore.models.MovieInfo info;

    public MovieInfoResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.flextv.livestore.models.MovieInfo getInfo() {
            r1 = this;
            com.flextv.livestore.models.MovieInfo r0 = r1.info
            return r0
    }

    public void setInfo(com.flextv.livestore.models.MovieInfo r1) {
            r0 = this;
            r0.info = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MovieInfoResponse{info="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            com.flextv.livestore.models.MovieInfo r1 = r2.info
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
