package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class CastResponse {
    public java.util.List<com.flextv.livestore.models.CastModel> cast;
    public int id;

    public CastResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<com.flextv.livestore.models.CastModel> getCast() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CastModel> r0 = r1.cast
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CastResponse{id="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = ", cast="
            r0.append(r1)
            java.util.List<com.flextv.livestore.models.CastModel> r1 = r2.cast
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
