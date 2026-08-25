package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
class PrettyPrintTreeMap<K, V> extends java.util.TreeMap<K, V> {
    public PrettyPrintTreeMap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "( "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = 123(0x7b, float:1.72E-43)
            r0.append(r3)
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 58
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = "}, "
            r0.append(r2)
            goto Le
        L39:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L4e
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            java.lang.String r3 = ""
            r0.replace(r1, r2, r3)
        L4e:
            java.lang.String r1 = " )"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
