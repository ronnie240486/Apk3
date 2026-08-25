package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class MovieCreditResponse {
    public java.util.List<com.flextv.livestore.models.MovieCreditModel> cast;

    public MovieCreditResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<com.flextv.livestore.models.MovieCreditModel> getCast() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r0 = r1.cast
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "MovieCreditResponse{cast="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<com.flextv.livestore.models.MovieCreditModel> r1 = r2.cast
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
