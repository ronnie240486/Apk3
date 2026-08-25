package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class EntityBuffer<T> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private boolean zaa;
    private java.util.ArrayList<java.lang.Integer> zab;

    private final void zab() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zaa     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L8a
            com.google.android.gms.common.data.DataHolder r0 = r7.mDataHolder     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0     // Catch: java.lang.Throwable -> L8c
            int r0 = r0.getCount()     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L8c
            r7.zab = r1     // Catch: java.lang.Throwable -> L8c
            r2 = 1
            if (r0 <= 0) goto L88
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L8c
            r1.add(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r7.getPrimaryDataMarkerColumn()     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.common.data.DataHolder r4 = r7.mDataHolder     // Catch: java.lang.Throwable -> L8c
            int r4 = r4.getWindowIndex(r3)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.common.data.DataHolder r5 = r7.mDataHolder     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = r5.getString(r1, r3, r4)     // Catch: java.lang.Throwable -> L8c
            r4 = 1
        L34:
            if (r4 >= r0) goto L88
            com.google.android.gms.common.data.DataHolder r5 = r7.mDataHolder     // Catch: java.lang.Throwable -> L8c
            int r5 = r5.getWindowIndex(r4)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.common.data.DataHolder r6 = r7.mDataHolder     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r6.getString(r1, r4, r5)     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L57
            boolean r5 = r6.equals(r3)     // Catch: java.lang.Throwable -> L8c
            if (r5 != 0) goto L54
            java.util.ArrayList<java.lang.Integer> r3 = r7.zab     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L8c
            r3.add(r5)     // Catch: java.lang.Throwable -> L8c
            r3 = r6
        L54:
            int r4 = r4 + 1
            goto L34
        L57:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L8c
            int r2 = r2 + 78
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = "Missing value for markerColumn: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L8c
            r3.append(r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = ", at row: "
            r3.append(r1)     // Catch: java.lang.Throwable -> L8c
            r3.append(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = ", for window: "
            r3.append(r1)     // Catch: java.lang.Throwable -> L8c
            r3.append(r5)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L88:
            r7.zaa = r2     // Catch: java.lang.Throwable -> L8c
        L8a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            return
        L8c:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L8c
            throw r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final T get(int r3) {
            r2 = this;
            r2.zab()
            r2.zaa(r3)
            if (r3 < 0) goto L61
            java.util.ArrayList<java.lang.Integer> r0 = r2.zab
            int r0 = r0.size()
            if (r3 != r0) goto L11
            goto L61
        L11:
            java.util.ArrayList<java.lang.Integer> r0 = r2.zab
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r3 != r0) goto L34
            com.google.android.gms.common.data.DataHolder r0 = r2.mDataHolder
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0
            int r0 = r0.getCount()
            java.util.ArrayList<java.lang.Integer> r1 = r2.zab
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L4e
        L34:
            java.util.ArrayList<java.lang.Integer> r0 = r2.zab
            int r1 = r3 + 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.ArrayList<java.lang.Integer> r1 = r2.zab
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L4e:
            int r0 = r0 - r1
            r1 = 1
            if (r0 != r1) goto L61
            int r3 = r2.zaa(r3)
            com.google.android.gms.common.data.DataHolder r0 = r2.mDataHolder
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0
            r0.getWindowIndex(r3)
        L61:
            java.lang.Object r3 = r2.getEntry()
            return r3
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @com.google.android.gms.common.annotation.KeepForSdk
    public int getCount() {
            r1 = this;
            r1.zab()
            java.util.ArrayList<java.lang.Integer> r0 = r1.zab
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.Object getEntry();

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.lang.String getPrimaryDataMarkerColumn();

    public final int zaa(int r4) {
            r3 = this;
            if (r4 < 0) goto L17
            java.util.ArrayList<java.lang.Integer> r0 = r3.zab
            int r0 = r0.size()
            if (r4 >= r0) goto L17
            java.util.ArrayList<java.lang.Integer> r0 = r3.zab
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 53
            r1.<init>(r2)
            java.lang.String r2 = "Position "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is out of bounds for this buffer"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
