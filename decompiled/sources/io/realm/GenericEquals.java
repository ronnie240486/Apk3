package io.realm;

/* JADX INFO: compiled from: RealmMapEntrySet.java */
/* JADX INFO: loaded from: classes.dex */
class GenericEquals<K, V> extends io.realm.EqualsHelper<K, V> {
    public GenericEquals() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.realm.EqualsHelper
    public final boolean compareInternal(@org.jetbrains.annotations.Nullable V r1, @org.jetbrains.annotations.Nullable V r2) {
            r0 = this;
            if (r1 != 0) goto L8
            if (r2 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
        L8:
            boolean r1 = r1.equals(r2)
            return r1
    }
}
