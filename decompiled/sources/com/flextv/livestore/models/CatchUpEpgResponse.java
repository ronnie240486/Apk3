package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class CatchUpEpgResponse implements java.io.Serializable {
    public java.util.List<com.flextv.livestore.models.CatchUpEpg> epg_listings;

    public CatchUpEpgResponse() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.epg_listings = r0
            return
    }

    public java.util.List<com.flextv.livestore.models.CatchUpEpg> getEpg_listings() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r0 = r1.epg_listings
            return r0
    }

    public void setEpg_listings(java.util.List<com.flextv.livestore.models.CatchUpEpg> r1) {
            r0 = this;
            r0.epg_listings = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CatchUpEpgResponse{epg_listings="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.List<com.flextv.livestore.models.CatchUpEpg> r1 = r2.epg_listings
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
