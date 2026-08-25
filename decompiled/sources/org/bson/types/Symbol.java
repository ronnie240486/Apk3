package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public class Symbol implements java.io.Serializable {
    private static final long serialVersionUID = 1326269319883146072L;
    private final java.lang.String symbol;

    public Symbol(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.symbol = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L20
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L20
        L12:
            org.bson.types.Symbol r5 = (org.bson.types.Symbol) r5
            java.lang.String r2 = r4.symbol
            java.lang.String r5 = r5.symbol
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L1f
            return r1
        L1f:
            return r0
        L20:
            return r1
    }

    public java.lang.String getSymbol() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.symbol
            return r0
    }
}
