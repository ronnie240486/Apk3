package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLString extends androidx.constraintlayout.core.parser.CLElement {
    public CLString(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLString r0 = new androidx.constraintlayout.core.parser.CLString
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final java.lang.String toFormattedJSON(int r2, int r3) {
            r1 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r1.addIndent(r3, r2)
            java.lang.String r2 = "'"
            r3.append(r2)
            java.lang.String r0 = r1.content()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final java.lang.String toJSON() {
            r3 = this;
            java.lang.String r0 = "'"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r2 = r3.content()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
