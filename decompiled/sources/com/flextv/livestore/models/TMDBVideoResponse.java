package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class TMDBVideoResponse {
    public int id;
    public java.util.List<com.flextv.livestore.models.TMDBVideoModel> results;

    public TMDBVideoResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.util.List<com.flextv.livestore.models.TMDBVideoModel> getResults() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.TMDBVideoModel> r0 = r1.results
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "TMDBVideoResponse{id="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = ", results="
            r0.append(r1)
            java.util.List<com.flextv.livestore.models.TMDBVideoModel> r1 = r2.results
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
