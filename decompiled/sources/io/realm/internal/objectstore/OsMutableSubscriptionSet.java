package io.realm.internal.objectstore;

/* JADX INFO: loaded from: classes2.dex */
public class OsMutableSubscriptionSet extends io.realm.internal.objectstore.OsSubscriptionSet implements io.realm.mongodb.sync.MutableSubscriptionSet {
    public OsMutableSubscriptionSet(long r1, io.realm.internal.RealmProxyMediator r3, io.realm.internal.async.RealmThreadPoolExecutor r4, io.realm.internal.async.RealmThreadPoolExecutor r5) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5)
            return
    }

    private io.realm.mongodb.sync.Subscription addSubscription(io.realm.mongodb.sync.Subscription r7, boolean r8) {
            r6 = this;
            boolean r0 = r7 instanceof io.realm.internal.UnmanagedSubscription
            if (r0 == 0) goto L1d
            io.realm.internal.UnmanagedSubscription r7 = (io.realm.internal.UnmanagedSubscription) r7
            long r0 = r6.getNativePtr()
            java.lang.String r2 = r7.getName()
            long r3 = r7.getQueryPointer()
            r5 = r8
            long r7 = nativeInsertOrAssign(r0, r2, r3, r5)
            io.realm.internal.objectstore.OsSubscription r0 = new io.realm.internal.objectstore.OsSubscription
            r0.<init>(r7)
            return r0
        L1d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Only unmanaged subscriptions are allowed as input. This subscription was managed."
            r7.<init>(r8)
            throw r7
    }

    private static native long nativeCommit(long r0);

    private static native long nativeInsertOrAssign(long r0, java.lang.String r2, long r3, boolean r5);

    private static native boolean nativeRemove(long r0, long r2);

    private static native boolean nativeRemoveAll(long r0);

    private static native boolean nativeRemoveAllForType(long r0, java.lang.String r2);

    private static native boolean nativeRemoveNamed(long r0, java.lang.String r2);

    public io.realm.mongodb.sync.Subscription add(io.realm.mongodb.sync.Subscription r2) {
            r1 = this;
            r0 = 1
            io.realm.mongodb.sync.Subscription r2 = r1.addSubscription(r2, r0)
            return r2
    }

    public io.realm.mongodb.sync.Subscription addOrUpdate(io.realm.mongodb.sync.Subscription r2) {
            r1 = this;
            r0 = 0
            io.realm.mongodb.sync.Subscription r2 = r1.addSubscription(r2, r0)
            return r2
    }

    public long commit() {
            r2 = this;
            long r0 = r2.getNativePtr()
            long r0 = nativeCommit(r0)
            return r0
    }

    public boolean remove(io.realm.mongodb.sync.Subscription r5) {
            r4 = this;
            boolean r0 = r5 instanceof io.realm.internal.objectstore.OsSubscription
            if (r0 == 0) goto L13
            long r0 = r4.getNativePtr()
            io.realm.internal.objectstore.OsSubscription r5 = (io.realm.internal.objectstore.OsSubscription) r5
            long r2 = r5.getNativePtr()
            boolean r5 = nativeRemove(r0, r2)
            return r5
        L13:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only managed Subscriptions can be removed."
            r5.<init>(r0)
            throw r5
    }

    public boolean remove(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getNativePtr()
            boolean r3 = nativeRemoveNamed(r0, r3)
            return r3
    }

    public boolean removeAll() {
            r2 = this;
            long r0 = r2.getNativePtr()
            boolean r0 = nativeRemoveAll(r0)
            return r0
    }

    public <T extends io.realm.RealmModel> boolean removeAll(java.lang.Class<T> r4) {
            r3 = this;
            long r0 = r3.getNativePtr()
            io.realm.internal.RealmProxyMediator r2 = r3.schema
            java.lang.String r4 = r2.getSimpleClassName(r4)
            boolean r4 = nativeRemoveAllForType(r0, r4)
            return r4
    }

    public boolean removeAll(java.lang.String r3) {
            r2 = this;
            long r0 = r2.getNativePtr()
            boolean r3 = nativeRemoveAllForType(r0, r3)
            return r3
    }
}
