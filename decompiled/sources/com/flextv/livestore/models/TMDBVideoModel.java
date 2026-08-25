package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class TMDBVideoModel implements java.io.Serializable {
    public java.lang.String id;
    public java.lang.String key;
    public java.lang.String name;
    public java.lang.String published_at;
    public java.lang.String site;
    public java.lang.String type;

    public TMDBVideoModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getPublished_at() {
            r1 = this;
            java.lang.String r0 = r1.published_at
            return r0
    }

    public java.lang.String getSite() {
            r1 = this;
            java.lang.String r0 = r1.site
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "TMDBVideoModel{name='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.name
            r2 = 39
            java.lang.String r3 = ", key='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.key
            java.lang.String r3 = ", site='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.site
            java.lang.String r3 = ", type='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.type
            java.lang.String r3 = ", published_at='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.published_at
            java.lang.String r3 = ", id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.id
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
