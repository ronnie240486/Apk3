package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class CastModel implements java.io.Serializable {
    public boolean adult;
    public int cast_id;
    public java.lang.String character;
    public java.lang.String credit_id;
    public int gender;
    public int id;
    public java.lang.String known_for_department;
    public java.lang.String name;
    public int order;
    public java.lang.String original_name;
    public float popularity;
    public java.lang.String profile_path;

    public CastModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getCast_id() {
            r1 = this;
            int r0 = r1.cast_id
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

    public int getGender() {
            r1 = this;
            int r0 = r1.gender
            return r0
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public java.lang.String getKnown_for_department() {
            r1 = this;
            java.lang.String r0 = r1.known_for_department
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int getOrder() {
            r1 = this;
            int r0 = r1.order
            return r0
    }

    public java.lang.String getOriginal_name() {
            r1 = this;
            java.lang.String r0 = r1.original_name
            return r0
    }

    public float getPopularity() {
            r1 = this;
            float r0 = r1.popularity
            return r0
    }

    public java.lang.String getProfile_path() {
            r1 = this;
            java.lang.String r0 = r1.profile_path
            return r0
    }

    public boolean isAdult() {
            r1 = this;
            boolean r0 = r1.adult
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "CastModel{adult='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            boolean r1 = r4.adult
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", gender="
            r0.append(r2)
            int r2 = r4.gender
            r0.append(r2)
            java.lang.String r2 = ", id="
            r0.append(r2)
            int r2 = r4.id
            r0.append(r2)
            java.lang.String r2 = ", known_for_department='"
            r0.append(r2)
            java.lang.String r2 = r4.known_for_department
            java.lang.String r3 = ", name='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.name
            java.lang.String r3 = ", original_name='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.original_name
            java.lang.String r3 = ", popularity="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            float r2 = r4.popularity
            r0.append(r2)
            java.lang.String r2 = ", profile_path='"
            r0.append(r2)
            java.lang.String r2 = r4.profile_path
            java.lang.String r3 = ", cast_id="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            int r2 = r4.cast_id
            r0.append(r2)
            java.lang.String r2 = ", character='"
            r0.append(r2)
            java.lang.String r2 = r4.character
            java.lang.String r3 = ", credit_id='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            java.lang.String r2 = r4.credit_id
            java.lang.String r3 = ", order="
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2, r1, r3)
            int r1 = r4.order
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }
}
