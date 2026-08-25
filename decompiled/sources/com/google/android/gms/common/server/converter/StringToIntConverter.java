package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<java.lang.String, java.lang.Integer> {

    @androidx.annotation.NonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.StringToIntConverter> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> zab;
    private final android.util.SparseArray<java.lang.String> zac;

    static {
            com.google.android.gms.common.server.converter.zad r0 = new com.google.android.gms.common.server.converter.zad
            r0.<init>()
            com.google.android.gms.common.server.converter.StringToIntConverter.CREATOR = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public StringToIntConverter() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zab = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.zac = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public StringToIntConverter(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.ArrayList<com.google.android.gms.common.server.converter.zac> r5) {
            r3 = this;
            r3.<init>()
            r3.zaa = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3.zab = r4
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r3.zac = r4
            int r4 = r5.size()
            r0 = 0
        L18:
            if (r0 >= r4) goto L2a
            java.lang.Object r1 = r5.get(r0)
            com.google.android.gms.common.server.converter.zac r1 = (com.google.android.gms.common.server.converter.zac) r1
            java.lang.String r2 = r1.zab
            int r1 = r1.zac
            r3.add(r2, r1)
            int r0 = r0 + 1
            goto L18
        L2a:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.server.converter.StringToIntConverter add(@androidx.annotation.NonNull java.lang.String r3, int r4) {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r2.zab
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r1)
            android.util.SparseArray<java.lang.String> r0 = r2.zac
            r0.put(r4, r3)
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r6, int r7) {
            r5 = this;
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            int r0 = r5.zaa
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.zab
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.common.server.converter.zac r3 = new com.google.android.gms.common.server.converter.zac
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r5.zab
            java.lang.Object r4 = r4.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.<init>(r2, r4)
            r0.add(r3)
            goto L19
        L3a:
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r6, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r7)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
            r1 = this;
            r0 = 7
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @androidx.annotation.Nullable
    public final /* bridge */ /* synthetic */ java.lang.Integer zac(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.zab
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L16
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r1.zab
            java.lang.String r0 = "gms_unknown"
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
        L16:
            return r2
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ java.lang.String zad(@androidx.annotation.NonNull java.lang.Integer r3) {
            r2 = this;
            java.lang.Integer r3 = (java.lang.Integer) r3
            android.util.SparseArray<java.lang.String> r0 = r2.zac
            int r3 = r3.intValue()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L1b
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r2.zab
            java.lang.String r1 = "gms_unknown"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1b
            return r1
        L1b:
            return r3
    }
}
