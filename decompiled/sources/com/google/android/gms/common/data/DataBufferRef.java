package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class DataBufferRef {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.android.gms.common.data.DataHolder mDataHolder;

    @com.google.android.gms.common.annotation.KeepForSdk
    public int mDataRow;
    private int zaa;

    @com.google.android.gms.common.annotation.KeepForSdk
    public DataBufferRef(@androidx.annotation.NonNull com.google.android.gms.common.data.DataHolder r1, int r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            r0.mDataHolder = r1
            r0.zaa(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.data.DataBufferRef
            r1 = 0
            if (r0 == 0) goto L33
            com.google.android.gms.common.data.DataBufferRef r4 = (com.google.android.gms.common.data.DataBufferRef) r4
            int r0 = r4.mDataRow
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r3.mDataRow
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L33
            int r0 = r4.zaa
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r3.zaa
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L33
            com.google.android.gms.common.data.DataHolder r4 = r4.mDataHolder
            com.google.android.gms.common.data.DataHolder r0 = r3.mDataHolder
            if (r4 != r0) goto L33
            r4 = 1
            return r4
        L33:
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasColumn(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            boolean r2 = r0.hasColumn(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.mDataRow
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zaa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.common.data.DataHolder r1 = r3.mDataHolder
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isDataValid() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.mDataHolder
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void zaa(int r3) {
            r2 = this;
            r0 = 0
            if (r3 < 0) goto Lc
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            int r1 = r1.getCount()
            if (r3 >= r1) goto Lc
            r0 = 1
        Lc:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            r2.mDataRow = r3
            com.google.android.gms.common.data.DataHolder r0 = r2.mDataHolder
            int r3 = r0.getWindowIndex(r3)
            r2.zaa = r3
            return
    }
}
