package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class FreezableUtils {
    public FreezableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(@androidx.annotation.NonNull java.util.ArrayList<E> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L20
            java.lang.Object r3 = r4.get(r2)
            com.google.android.gms.common.data.Freezable r3 = (com.google.android.gms.common.data.Freezable) r3
            java.lang.Object r3 = r3.freeze()
            r0.add(r3)
            int r2 = r2 + 1
            goto Le
        L20:
            return r0
    }

    @androidx.annotation.NonNull
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(@androidx.annotation.NonNull E[] r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.length
            r0.<init>(r1)
            r1 = 0
        L7:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            java.lang.Object r2 = r2.freeze()
            r0.add(r2)
            int r1 = r1 + 1
            goto L7
        L16:
            return r0
    }

    @androidx.annotation.NonNull
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeIterable(@androidx.annotation.NonNull java.lang.Iterable<E> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            com.google.android.gms.common.data.Freezable r1 = (com.google.android.gms.common.data.Freezable) r1
            java.lang.Object r1 = r1.freeze()
            r0.add(r1)
            goto L9
        L1d:
            return r0
    }
}
