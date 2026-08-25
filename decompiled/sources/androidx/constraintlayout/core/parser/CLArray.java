package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class CLArray extends androidx.constraintlayout.core.parser.CLContainer {
    public CLArray(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLArray r0 = new androidx.constraintlayout.core.parser.CLArray
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final java.lang.String toFormattedJSON(int r7, int r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.toJSON()
            if (r8 > 0) goto L18
            int r2 = r1.length()
            int r2 = r2 + r7
            r3 = 80
            if (r2 >= r3) goto L18
            r0.append(r1)
            goto L55
        L18:
            java.lang.String r1 = "[\n"
            r0.append(r1)
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r6.mElements
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L24:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.core.parser.CLElement r3 = (androidx.constraintlayout.core.parser.CLElement) r3
            if (r2 != 0) goto L38
            java.lang.String r4 = ",\n"
            r0.append(r4)
            goto L39
        L38:
            r2 = 0
        L39:
            int r4 = r7 + 2
            r6.addIndent(r0, r4)
            int r5 = r8 + (-1)
            java.lang.String r3 = r3.toFormattedJSON(r4, r5)
            r0.append(r3)
            goto L24
        L48:
            java.lang.String r8 = "\n"
            r0.append(r8)
            r6.addIndent(r0, r7)
            java.lang.String r7 = "]"
            r0.append(r7)
        L55:
            java.lang.String r7 = r0.toString()
            return r7
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final java.lang.String toJSON() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r1 = 0
            r2 = 1
            r3 = 0
        La:
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r4 = r5.mElements
            int r4 = r4.size()
            if (r3 >= r4) goto L2d
            if (r2 != 0) goto L1a
            java.lang.String r4 = ", "
            r0.append(r4)
            goto L1b
        L1a:
            r2 = 0
        L1b:
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r4 = r5.mElements
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.core.parser.CLElement r4 = (androidx.constraintlayout.core.parser.CLElement) r4
            java.lang.String r4 = r4.toJSON()
            r0.append(r4)
            int r3 = r3 + 1
            goto La
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
