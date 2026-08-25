package org.bson.types;

/* JADX INFO: loaded from: classes3.dex */
public final class BSONTimestamp implements java.lang.Comparable<org.bson.types.BSONTimestamp>, java.io.Serializable {
    private static final long serialVersionUID = -3268482672267936464L;
    private final int inc;
    private final java.util.Date time;

    public BSONTimestamp() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.inc = r0
            r0 = 0
            r1.time = r0
            return
    }

    public BSONTimestamp(int r6, int r7) {
            r5 = this;
            r5.<init>()
            java.util.Date r0 = new java.util.Date
            long r1 = (long) r6
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r0.<init>(r1)
            r5.time = r0
            r5.inc = r7
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.bson.types.BSONTimestamp r1) {
            r0 = this;
            org.bson.types.BSONTimestamp r1 = (org.bson.types.BSONTimestamp) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.bson.types.BSONTimestamp r3) {
            r2 = this;
            int r0 = r2.getTime()
            int r1 = r3.getTime()
            if (r0 == r1) goto L14
            int r0 = r2.getTime()
            int r3 = r3.getTime()
        L12:
            int r0 = r0 - r3
            return r0
        L14:
            int r0 = r2.getInc()
            int r3 = r3.getInc()
            goto L12
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.bson.types.BSONTimestamp
            r2 = 0
            if (r1 == 0) goto L22
            org.bson.types.BSONTimestamp r5 = (org.bson.types.BSONTimestamp) r5
            int r1 = r4.getTime()
            int r3 = r5.getTime()
            if (r1 != r3) goto L20
            int r1 = r4.getInc()
            int r5 = r5.getInc()
            if (r1 != r5) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
        L22:
            return r2
    }

    public int getInc() {
            r1 = this;
            int r0 = r1.inc
            return r0
    }

    public int getTime() {
            r4 = this;
            java.util.Date r0 = r4.time
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            long r0 = r0.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            int r1 = (int) r0
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.inc
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.getTime()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "TS time:"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.util.Date r1 = r2.time
            r0.append(r1)
            java.lang.String r1 = " inc:"
            r0.append(r1)
            int r1 = r2.inc
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
