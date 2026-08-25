package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "WebImageCreator")
public final class WebImage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.images.WebImage> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUrl", id = 2)
    private final android.net.Uri zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWidth", id = 3)
    private final int zac;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getHeight", id = 4)
    private final int zad;

    static {
            com.google.android.gms.common.images.zah r0 = new com.google.android.gms.common.images.zah
            r0.<init>()
            com.google.android.gms.common.images.WebImage.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public WebImage(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.net.Uri r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    public WebImage(@androidx.annotation.NonNull android.net.Uri r2) throws java.lang.IllegalArgumentException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public WebImage(@androidx.annotation.NonNull android.net.Uri r2, int r3, int r4) throws java.lang.IllegalArgumentException {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            r1.zad = r4
            if (r2 == 0) goto L1c
            if (r3 < 0) goto L13
            if (r4 < 0) goto L13
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "width and height must not be negative"
            r2.<init>(r3)
            throw r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "url cannot be null"
            r2.<init>(r3)
            throw r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public WebImage(@androidx.annotation.NonNull org.json.JSONObject r5) throws java.lang.IllegalArgumentException {
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L13
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L13
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L13
        L13:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            boolean r2 = r5 instanceof com.google.android.gms.common.images.WebImage
            if (r2 != 0) goto Lc
            goto L25
        Lc:
            com.google.android.gms.common.images.WebImage r5 = (com.google.android.gms.common.images.WebImage) r5
            android.net.Uri r2 = r4.zab
            android.net.Uri r3 = r5.zab
            boolean r2 = com.google.android.gms.common.internal.Objects.equal(r2, r3)
            if (r2 == 0) goto L25
            int r2 = r4.zac
            int r3 = r5.zac
            if (r2 != r3) goto L25
            int r2 = r4.zad
            int r5 = r5.zad
            if (r2 != r5) goto L25
            return r0
        L25:
            return r1
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.zad
            return r0
    }

    @androidx.annotation.NonNull
    public android.net.Uri getUrl() {
            r1 = this;
            android.net.Uri r0 = r1.zab
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.zac
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.net.Uri r1 = r3.zab
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zac
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zad
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public org.json.JSONObject toJson() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "url"
            android.net.Uri r2 = r3.zab     // Catch: org.json.JSONException -> L20
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "width"
            int r2 = r3.zac     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
            java.lang.String r1 = "height"
            int r2 = r3.zad     // Catch: org.json.JSONException -> L20
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L20
        L20:
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.US
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zac
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r4.zad
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            android.net.Uri r2 = r4.zab
            java.lang.String r2 = r2.toString()
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "Image %dx%d %s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            android.net.Uri r1 = r4.getUrl()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            int r6 = r4.getWidth()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            int r6 = r4.getHeight()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
