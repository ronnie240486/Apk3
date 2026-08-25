package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public interface RealmObjectProxy extends io.realm.RealmModel {

    public static class CacheData<E extends io.realm.RealmModel> {

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
        public int minDepth;
        public final E object;

        public CacheData(int r1, E r2) {
                r0 = this;
                r0.<init>()
                r0.minDepth = r1
                r0.object = r2
                return
        }
    }

    void realm$injectObjectContext();

    io.realm.ProxyState realmGet$proxyState();
}
