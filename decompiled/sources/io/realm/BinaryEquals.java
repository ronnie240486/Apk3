package io.realm;

/* JADX INFO: compiled from: RealmMapEntrySet.java */
/* JADX INFO: loaded from: classes2.dex */
class BinaryEquals<K> extends io.realm.EqualsHelper<K, byte[]> {
    public BinaryEquals() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.realm.EqualsHelper
    public final boolean compareInternal(@org.jetbrains.annotations.Nullable byte[] r1, @org.jetbrains.annotations.Nullable byte[] r2) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            byte[] r2 = (byte[]) r2
            boolean r1 = java.util.Arrays.equals(r1, r2)
            return r1
    }
}
