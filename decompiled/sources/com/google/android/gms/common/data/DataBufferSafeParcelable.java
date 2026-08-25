package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class DataBufferSafeParcelable<T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private static final java.lang.String[] zaa = null;
    private final android.os.Parcelable.Creator<T> zab;

    static {
            java.lang.String r0 = "data"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.google.android.gms.common.data.DataBufferSafeParcelable.zaa = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public DataBufferSafeParcelable(@androidx.annotation.NonNull com.google.android.gms.common.data.DataHolder r1, @androidx.annotation.NonNull android.os.Parcelable.Creator<T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zab = r2
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void addValue(@androidx.annotation.NonNull com.google.android.gms.common.data.DataHolder.Builder r3, @androidx.annotation.NonNull T r4) {
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r4.writeToParcel(r0, r1)
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            byte[] r1 = r0.marshall()
            java.lang.String r2 = "data"
            r4.put(r2, r1)
            r3.withRow(r4)
            r0.recycle()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.data.DataHolder.Builder buildDataHolder() {
            java.lang.String[] r0 = com.google.android.gms.common.data.DataBufferSafeParcelable.zaa
            com.google.android.gms.common.data.DataHolder$Builder r0 = com.google.android.gms.common.data.DataHolder.builder(r0)
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public T get(int r4) {
            r3 = this;
            com.google.android.gms.common.data.DataHolder r0 = r3.mDataHolder
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0
            int r1 = r0.getWindowIndex(r4)
            java.lang.String r2 = "data"
            byte[] r4 = r0.getByteArray(r2, r4, r1)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r1 = r4.length
            r2 = 0
            r0.unmarshall(r4, r2, r1)
            r0.setDataPosition(r2)
            android.os.Parcelable$Creator<T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> r4 = r3.zab
            java.lang.Object r4 = r4.createFromParcel(r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r4 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r4
            r0.recycle()
            return r4
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = r0.get(r1)
            return r1
    }
}
