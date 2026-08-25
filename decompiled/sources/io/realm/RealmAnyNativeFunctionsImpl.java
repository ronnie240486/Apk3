package io.realm;

/* JADX INFO: loaded from: classes.dex */
public class RealmAnyNativeFunctionsImpl implements io.realm.internal.RealmAnyNativeFunctions {
    public RealmAnyNativeFunctionsImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void callRawPredicate(io.realm.internal.TableQuery r5, @javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r6, java.lang.String r7, io.realm.RealmAny... r8) {
            r4 = this;
            int r0 = r8.length
            long[] r0 = new long[r0]
            r1 = 0
        L4:
            int r2 = r8.length     // Catch: java.lang.IllegalStateException -> L16
            if (r1 >= r2) goto L12
            r2 = r8[r1]     // Catch: java.lang.IllegalStateException -> L16
            long r2 = r2.getNativePtr()     // Catch: java.lang.IllegalStateException -> L16
            r0[r1] = r2     // Catch: java.lang.IllegalStateException -> L16
            int r1 = r1 + 1
            goto L4
        L12:
            r5.rawPredicateWithPointers(r6, r7, r0)
            return
        L16:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Unmanaged Realm objects are not valid query arguments"
            r6.<init>(r7, r5)
            throw r6
    }

    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void handleItem(long r3, io.realm.RealmAny r5) {
            r2 = this;
            long r0 = r5.getNativePtr()
            io.realm.internal.objectstore.OsObjectBuilder.nativeAddRealmAnyListItem(r3, r0)
            return
    }

    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void handleItem(long r4, java.util.Map.Entry<java.lang.String, io.realm.RealmAny> r6) {
            r3 = this;
            java.lang.Object r0 = r6.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.getValue()
            io.realm.RealmAny r6 = (io.realm.RealmAny) r6
            long r1 = r6.getNativePtr()
            io.realm.internal.objectstore.OsObjectBuilder.nativeAddRealmAnyDictionaryEntry(r4, r0, r1)
            return
    }
}
