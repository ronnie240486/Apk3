package io.realm;

/* JADX INFO: compiled from: ManagedListOperator.java */
/* JADX INFO: loaded from: classes.dex */
final class LongListOperator<T> extends io.realm.ManagedListOperator<T> {
    public LongListOperator(io.realm.BaseRealm r1, io.realm.internal.OsList r2, java.lang.Class<T> r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // io.realm.ManagedListOperator
    public void appendValue(java.lang.Object r4) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            java.lang.Number r4 = (java.lang.Number) r4
            long r1 = r4.longValue()
            r0.addLong(r1)
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void checkValidValue(@javax.annotation.Nullable java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte"
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

    @Override // io.realm.ManagedListOperator
    @javax.annotation.Nullable
    public T get(int r4) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            java.lang.Object r4 = r0.getValue(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            java.lang.Class<T> r0 = r3.clazz
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto L14
            return r4
        L14:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto L25
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.cast(r4)
            return r4
        L25:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 != r1) goto L36
            short r4 = r4.shortValue()
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            java.lang.Object r4 = r0.cast(r4)
            return r4
        L36:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto L47
            byte r4 = r4.byteValue()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            java.lang.Object r4 = r0.cast(r4)
            return r4
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected element type: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Class<T> r1 = r3.clazz
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // io.realm.ManagedListOperator
    public void insertValue(int r4, java.lang.Object r5) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            java.lang.Number r5 = (java.lang.Number) r5
            long r4 = r5.longValue()
            r0.insertLong(r1, r4)
            return
    }

    @Override // io.realm.ManagedListOperator
    public final void setValue(int r4, java.lang.Object r5) {
            r3 = this;
            io.realm.internal.OsList r0 = r3.osList
            long r1 = (long) r4
            java.lang.Number r5 = (java.lang.Number) r5
            long r4 = r5.longValue()
            r0.setLong(r1, r4)
            return
    }
}
