package io.realm.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface RealmAnyNativeFunctions {
    void callRawPredicate(io.realm.internal.TableQuery r1, @javax.annotation.Nullable io.realm.internal.objectstore.OsKeyPathMapping r2, java.lang.String r3, io.realm.RealmAny... r4);

    void handleItem(long r1, io.realm.RealmAny r3);

    void handleItem(long r1, java.util.Map.Entry<java.lang.String, io.realm.RealmAny> r3);
}
