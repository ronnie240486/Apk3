package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class IdentitySet<K> extends java.util.IdentityHashMap<K, java.lang.Integer> {
    private static final java.lang.Integer PLACE_HOLDER = null;

    static {
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            io.realm.internal.IdentitySet.PLACE_HOLDER = r0
            return
    }

    public IdentitySet() {
            r0 = this;
            r0.<init>()
            return
    }

    public void add(K r2) {
            r1 = this;
            java.lang.Integer r0 = io.realm.internal.IdentitySet.PLACE_HOLDER
            r1.put(r2, r0)
            return
    }
}
