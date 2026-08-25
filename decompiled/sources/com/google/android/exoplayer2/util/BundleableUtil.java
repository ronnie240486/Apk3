package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleableUtil {
    private BundleableUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ensureClassLoader(@androidx.annotation.Nullable android.os.Bundle r1) {
            if (r1 == 0) goto L11
            java.lang.Class<com.google.android.exoplayer2.util.BundleableUtil> r0 = com.google.android.exoplayer2.util.BundleableUtil.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Util.castNonNull(r0)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r1.setClassLoader(r0)
        L11:
            return
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> com.google.common.collect.ImmutableList<T> fromBundleList(com.google.android.exoplayer2.Bundleable.Creator<T> r3, java.util.List<android.os.Bundle> r4) {
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            r1 = 0
        L5:
            int r2 = r4.size()
            if (r1 >= r2) goto L21
            java.lang.Object r2 = r4.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.google.android.exoplayer2.Bundleable r2 = r3.fromBundle(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L5
        L21:
            com.google.common.collect.ImmutableList r3 = r0.build()
            return r3
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> android.util.SparseArray<T> fromBundleSparseArray(com.google.android.exoplayer2.Bundleable.Creator<T> r4, android.util.SparseArray<android.os.Bundle> r5) {
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r5.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r5.size()
            if (r1 >= r2) goto L24
            int r2 = r5.keyAt(r1)
            java.lang.Object r3 = r5.valueAt(r1)
            android.os.Bundle r3 = (android.os.Bundle) r3
            com.google.android.exoplayer2.Bundleable r3 = r4.fromBundle(r3)
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto La
        L24:
            return r0
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> java.util.ArrayList<android.os.Bundle> toBundleArrayList(java.util.Collection<T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            com.google.android.exoplayer2.Bundleable r1 = (com.google.android.exoplayer2.Bundleable) r1
            android.os.Bundle r1 = r1.toBundle()
            r0.add(r1)
            goto Ld
        L21:
            return r0
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> com.google.common.collect.ImmutableList<android.os.Bundle> toBundleList(java.util.List<T> r3) {
            com.google.common.collect.ImmutableList$Builder r0 = com.google.common.collect.ImmutableList.builder()
            r1 = 0
        L5:
            int r2 = r3.size()
            if (r1 >= r2) goto L1b
            java.lang.Object r2 = r3.get(r1)
            com.google.android.exoplayer2.Bundleable r2 = (com.google.android.exoplayer2.Bundleable) r2
            android.os.Bundle r2 = r2.toBundle()
            r0.add(r2)
            int r1 = r1 + 1
            goto L5
        L1b:
            com.google.common.collect.ImmutableList r3 = r0.build()
            return r3
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> android.util.SparseArray<android.os.Bundle> toBundleSparseArray(android.util.SparseArray<T> r4) {
            android.util.SparseArray r0 = new android.util.SparseArray
            int r1 = r4.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r4.size()
            if (r1 >= r2) goto L24
            int r2 = r4.keyAt(r1)
            java.lang.Object r3 = r4.valueAt(r1)
            com.google.android.exoplayer2.Bundleable r3 = (com.google.android.exoplayer2.Bundleable) r3
            android.os.Bundle r3 = r3.toBundle()
            r0.put(r2, r3)
            int r1 = r1 + 1
            goto La
        L24:
            return r0
    }
}
