package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class MovieData implements java.io.Serializable {
    private java.lang.String added;
    private java.lang.String category_id;
    private java.lang.String container_extension;
    private java.lang.String custom_sid;
    private java.lang.String direct_source;
    private java.lang.String name;
    private java.lang.String stream_id;

    public MovieData() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getAdded() {
            r1 = this;
            java.lang.String r0 = r1.added
            return r0
    }

    public java.lang.String getCategory_id() {
            r1 = this;
            java.lang.String r0 = r1.category_id
            return r0
    }

    public java.lang.String getContainer_extension() {
            r1 = this;
            java.lang.String r0 = r1.container_extension
            return r0
    }

    public java.lang.String getCustom_sid() {
            r1 = this;
            java.lang.String r0 = r1.custom_sid
            return r0
    }

    public java.lang.String getDirect_source() {
            r1 = this;
            java.lang.String r0 = r1.direct_source
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getStream_id() {
            r1 = this;
            java.lang.String r0 = r1.stream_id
            return r0
    }

    public void setAdded(java.lang.String r1) {
            r0 = this;
            r0.added = r1
            return
    }

    public void setCategory_id(java.lang.String r1) {
            r0 = this;
            r0.category_id = r1
            return
    }

    public void setContainer_extension(java.lang.String r1) {
            r0 = this;
            r0.container_extension = r1
            return
    }

    public void setCustom_sid(java.lang.String r1) {
            r0 = this;
            r0.custom_sid = r1
            return
    }

    public void setDirect_source(java.lang.String r1) {
            r0 = this;
            r0.direct_source = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public void setStream_id(java.lang.String r1) {
            r0 = this;
            r0.stream_id = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "MovieData{stream_id='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.stream_id
            r2 = 39
            java.lang.String r3 = ", name='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.name
            java.lang.String r3 = ", added='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.added
            java.lang.String r3 = ", category_id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.category_id
            java.lang.String r3 = ", container_extension='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.container_extension
            java.lang.String r3 = ", custom_sid='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.custom_sid
            java.lang.String r3 = ", direct_source='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.direct_source
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
