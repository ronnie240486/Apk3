package io.realm.internal;

/* JADX INFO: loaded from: classes.dex */
public class UnmanagedSubscription implements io.realm.mongodb.sync.Subscription {
    private final java.util.Date createdAt;

    @javax.annotation.Nullable
    private final java.lang.String name;
    private final java.lang.String objectType;
    private final java.lang.String queryDesc;
    private final long queryPtr;
    private final java.util.Date updatedAt;

    public UnmanagedSubscription(@javax.annotation.Nullable java.lang.String r2, io.realm.RealmQuery r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.createdAt = r0
            r1.updatedAt = r0
            r1.name = r2
            java.lang.String r2 = r3.getTypeQueried()
            r1.objectType = r2
            java.lang.String r2 = r3.getDescription()
            r1.queryDesc = r2
            long r2 = r3.getQueryPointer()
            r1.queryPtr = r2
            return
    }

    public java.util.Date getCreatedAt() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getObjectType() {
            r1 = this;
            java.lang.String r0 = r1.objectType
            return r0
    }

    public java.lang.String getQuery() {
            r1 = this;
            java.lang.String r0 = r1.queryDesc
            return r0
    }

    public long getQueryPointer() {
            r2 = this;
            long r0 = r2.queryPtr
            return r0
    }

    public java.util.Date getUpdatedAt() {
            r1 = this;
            r0 = 0
            return r0
    }
}
