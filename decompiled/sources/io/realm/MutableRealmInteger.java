package io.realm;

/* JADX INFO: loaded from: classes.dex */
public abstract class MutableRealmInteger implements java.lang.Comparable<io.realm.MutableRealmInteger>, io.realm.internal.ManageableObject {

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Managed<T extends io.realm.RealmModel> extends io.realm.MutableRealmInteger {
        public Managed() {
                r0 = this;
                r0.<init>()
                return
        }

        private io.realm.BaseRealm getRealm() {
                r1 = this;
                io.realm.ProxyState r0 = r1.getProxyState()
                io.realm.BaseRealm r0 = r0.getRealm$realm()
                return r0
        }

        private io.realm.internal.Row getRow() {
                r1 = this;
                io.realm.ProxyState r0 = r1.getProxyState()
                io.realm.internal.Row r0 = r0.getRow$realm()
                return r0
        }

        private void setValue(@javax.annotation.Nullable java.lang.Long r10, boolean r11) {
                r9 = this;
                io.realm.internal.Row r0 = r9.getRow()
                io.realm.internal.Table r1 = r0.getTable()
                long r4 = r0.getObjectKey()
                long r2 = r9.getColumnIndex()
                if (r10 != 0) goto L17
                r6 = r11
                r1.setNull(r2, r4, r6)
                goto L1f
            L17:
                long r6 = r10.longValue()
                r8 = r11
                r1.setLong(r2, r4, r6, r8)
            L1f:
                return
        }

        @Override // io.realm.MutableRealmInteger, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(io.realm.MutableRealmInteger r1) {
                r0 = this;
                io.realm.MutableRealmInteger r1 = (io.realm.MutableRealmInteger) r1
                int r1 = super.compareTo2(r1)
                return r1
        }

        @Override // io.realm.MutableRealmInteger
        public final void decrement(long r1) {
                r0 = this;
                long r1 = -r1
                r0.increment(r1)
                return
        }

        @Override // io.realm.MutableRealmInteger
        public final java.lang.Long get() {
                r4 = this;
                io.realm.internal.Row r0 = r4.getRow()
                r0.checkIfAttached()
                long r1 = r4.getColumnIndex()
                boolean r3 = r0.isNull(r1)
                if (r3 == 0) goto L13
                r0 = 0
                goto L1b
            L13:
                long r0 = r0.getLong(r1)
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
            L1b:
                return r0
        }

        public abstract long getColumnIndex();

        public abstract io.realm.ProxyState<T> getProxyState();

        @Override // io.realm.MutableRealmInteger
        public final void increment(long r9) {
                r8 = this;
                io.realm.BaseRealm r0 = r8.getRealm()
                r0.checkIfValidAndInTransaction()
                io.realm.internal.Row r0 = r8.getRow()
                io.realm.internal.Table r1 = r0.getTable()
                long r2 = r8.getColumnIndex()
                long r4 = r0.getObjectKey()
                r6 = r9
                r1.incrementLong(r2, r4, r6)
                return
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
                r1 = this;
                io.realm.BaseRealm r0 = r1.getRealm()
                boolean r0 = r0.isFrozen()
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public final boolean isManaged() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public final boolean isValid() {
                r1 = this;
                io.realm.BaseRealm r0 = r1.getRealm()
                boolean r0 = r0.isClosed()
                if (r0 != 0) goto L16
                io.realm.internal.Row r0 = r1.getRow()
                boolean r0 = r0.isValid()
                if (r0 == 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
        }

        @Override // io.realm.MutableRealmInteger
        public final void set(@javax.annotation.Nullable java.lang.Long r3) {
                r2 = this;
                io.realm.ProxyState r0 = r2.getProxyState()
                io.realm.BaseRealm r1 = r0.getRealm$realm()
                r1.checkIfValidAndInTransaction()
                boolean r1 = r0.isUnderConstruction()
                if (r1 != 0) goto L16
                r0 = 0
                r2.setValue(r3, r0)
                return
            L16:
                boolean r0 = r0.getAcceptDefaultValue$realm()
                if (r0 != 0) goto L1d
                return
            L1d:
                r0 = 1
                r2.setValue(r3, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Unmanaged extends io.realm.MutableRealmInteger {

        @javax.annotation.Nullable
        private java.lang.Long value;

        public Unmanaged(@javax.annotation.Nullable java.lang.Long r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // io.realm.MutableRealmInteger, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(io.realm.MutableRealmInteger r1) {
                r0 = this;
                io.realm.MutableRealmInteger r1 = (io.realm.MutableRealmInteger) r1
                int r1 = super.compareTo2(r1)
                return r1
        }

        @Override // io.realm.MutableRealmInteger
        public void decrement(long r1) {
                r0 = this;
                long r1 = -r1
                r0.increment(r1)
                return
        }

        @Override // io.realm.MutableRealmInteger
        @javax.annotation.Nullable
        public java.lang.Long get() {
                r1 = this;
                java.lang.Long r0 = r1.value
                return r0
        }

        @Override // io.realm.MutableRealmInteger
        public void increment(long r3) {
                r2 = this;
                java.lang.Long r0 = r2.value
                if (r0 == 0) goto L10
                long r0 = r0.longValue()
                long r0 = r0 + r3
                java.lang.Long r3 = java.lang.Long.valueOf(r0)
                r2.value = r3
                return
            L10:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "Cannot increment a MutableRealmInteger whose value is null. Set its value first."
                r3.<init>(r4)
                throw r3
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.realm.MutableRealmInteger
        public void set(@javax.annotation.Nullable java.lang.Long r1) {
                r0 = this;
                r0.value = r1
                return
        }
    }

    public MutableRealmInteger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.realm.MutableRealmInteger ofNull() {
            io.realm.MutableRealmInteger$Unmanaged r0 = new io.realm.MutableRealmInteger$Unmanaged
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static io.realm.MutableRealmInteger valueOf(long r0) {
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            io.realm.MutableRealmInteger r0 = valueOf(r0)
            return r0
    }

    public static io.realm.MutableRealmInteger valueOf(java.lang.Long r1) {
            io.realm.MutableRealmInteger$Unmanaged r0 = new io.realm.MutableRealmInteger$Unmanaged
            r0.<init>(r1)
            return r0
    }

    public static io.realm.MutableRealmInteger valueOf(java.lang.String r2) {
            long r0 = java.lang.Long.parseLong(r2)
            io.realm.MutableRealmInteger r2 = valueOf(r0)
            return r2
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final int compareTo2(io.realm.MutableRealmInteger r2) {
            r1 = this;
            java.lang.Long r0 = r1.get()
            java.lang.Long r2 = r2.get()
            if (r0 != 0) goto L10
            if (r2 != 0) goto Le
            r2 = 0
            goto L18
        Le:
            r2 = -1
            goto L18
        L10:
            if (r2 != 0) goto L14
            r2 = 1
            goto L18
        L14:
            int r2 = r0.compareTo(r2)
        L18:
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(io.realm.MutableRealmInteger r1) {
            r0 = this;
            io.realm.MutableRealmInteger r1 = (io.realm.MutableRealmInteger) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public abstract void decrement(long r1);

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof io.realm.MutableRealmInteger
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Long r1 = r3.get()
            io.realm.MutableRealmInteger r4 = (io.realm.MutableRealmInteger) r4
            java.lang.Long r4 = r4.get()
            if (r1 != 0) goto L1b
            if (r4 != 0) goto L19
            goto L1f
        L19:
            r0 = 0
            goto L1f
        L1b:
            boolean r0 = r1.equals(r4)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public abstract java.lang.Long get();

    public final int hashCode() {
            r1 = this;
            java.lang.Long r0 = r1.get()
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public abstract void increment(long r1);

    public final boolean isNull() {
            r1 = this;
            java.lang.Long r0 = r1.get()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final void set(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.set(r1)
            return
    }

    public abstract void set(@javax.annotation.Nullable java.lang.Long r1);
}
