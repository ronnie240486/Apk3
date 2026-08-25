package io.realm;

/* JADX INFO: compiled from: ManagedListOperator.java */
/* JADX INFO: loaded from: classes2.dex */
final class BooleanListOperator extends io.realm.ManagedListOperator<java.lang.Boolean> {
    public BooleanListOperator(io.realm.BaseRealm r1, io.realm.internal.OsList r2, java.lang.Class<java.lang.Boolean> r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(java.lang.Object r2) {
            r1 = this;
            io.realm.internal.OsList r0 = r1.osList
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.addBoolean(r2)
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void checkValidValue(@javax.annotation.Nullable java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "java.lang.Boolean"
            r2[r3] = r4
            r3 = 1
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2[r3] = r6
            java.lang.String r6 = "Unacceptable value type. Acceptable: %1$s, actual: %2$s ."
            java.lang.String r6 = java.lang.String.format(r1, r6, r2)
            r0.<init>(r6)
            throw r0
    }

    @Override // io.realm.ManagedListOperator
    public boolean forRealmModel() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.ManagedListOperator
    @javax.annotation.Nullable
    public java.lang.Boolean get(int r4) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            java.lang.Object r4 = r0.getValue(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            return r4
    }

    @Override // io.realm.ManagedListOperator
    @javax.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Boolean get(int r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.get(r1)
            return r1
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int r4, java.lang.Object r5) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r0.insertBoolean(r1, r4)
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void setValue(int r4, java.lang.Object r5) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r0.setBoolean(r1, r4)
            return
    }
}
