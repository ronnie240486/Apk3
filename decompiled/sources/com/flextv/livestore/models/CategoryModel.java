package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes3.dex */
public class CategoryModel implements java.io.Serializable {

    @com.google.gson.annotations.SerializedName("category_id")
    private java.lang.String id;

    @com.google.gson.annotations.SerializedName("category_name")
    private java.lang.String name;

    public CategoryModel(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.name = r2
            return
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            java.lang.String r0 = r2.name
            if (r0 == 0) goto L22
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L22
        Lb:
            java.lang.String r0 = r2.name
            java.lang.String r1 = "!@#%"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1f
            java.lang.String r0 = r2.name
            java.lang.String[] r0 = r0.split(r1)
            r1 = 1
            r0 = r0[r1]
            return r0
        L1f:
            java.lang.String r0 = r2.name
            return r0
        L22:
            java.lang.String r0 = "Unknown category"
            return r0
    }

    public void setId(java.lang.String r1) {
            r0 = this;
            r0.id = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "CategoryModel{category_id='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.id
            r2 = 39
            java.lang.String r3 = ", category_name='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.name
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
