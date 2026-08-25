package io.realm;

import io.realm.RealmModel;

/* JADX INFO: loaded from: classes.dex */
public interface RealmObjectChangeListener<T extends io.realm.RealmModel> {
    void onChange(T r1, @javax.annotation.Nullable io.realm.ObjectChangeSet r2);
}
