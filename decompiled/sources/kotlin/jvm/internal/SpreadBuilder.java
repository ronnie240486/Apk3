package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class SpreadBuilder {
    private final java.util.ArrayList<java.lang.Object> list;

    public SpreadBuilder(int r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.list = r0
            return
    }

    public void add(java.lang.Object r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.list
            r0.add(r2)
            return
    }

    public void addSpread(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            boolean r0 = r4 instanceof java.lang.Object[]
            if (r0 == 0) goto L1d
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
            if (r0 <= 0) goto L59
            java.util.ArrayList<java.lang.Object> r0 = r3.list
            int r1 = r0.size()
            int r2 = r4.length
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            java.util.ArrayList<java.lang.Object> r0 = r3.list
            java.util.Collections.addAll(r0, r4)
            goto L59
        L1d:
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L29
            java.util.ArrayList<java.lang.Object> r0 = r3.list
            java.util.Collection r4 = (java.util.Collection) r4
            r0.addAll(r4)
            goto L59
        L29:
            boolean r0 = r4 instanceof java.lang.Iterable
            if (r0 == 0) goto L43
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()
            java.util.ArrayList<java.lang.Object> r1 = r3.list
            r1.add(r0)
            goto L33
        L43:
            boolean r0 = r4 instanceof java.util.Iterator
            if (r0 == 0) goto L5a
            java.util.Iterator r4 = (java.util.Iterator) r4
        L49:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L59
            java.util.ArrayList<java.lang.Object> r0 = r3.list
            java.lang.Object r1 = r4.next()
            r0.add(r1)
            goto L49
        L59:
            return
        L5a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Don't know how to spread "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r4 = r4.getClass()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int size() {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.list
            int r0 = r0.size()
            return r0
    }

    public java.lang.Object[] toArray(java.lang.Object[] r2) {
            r1 = this;
            java.util.ArrayList<java.lang.Object> r0 = r1.list
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
