package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes3.dex */
public class CLParsingException extends java.lang.Exception {
    private final java.lang.String mElementClass;
    private final int mLineNumber;
    private final java.lang.String mReason;

    public CLParsingException(java.lang.String r1, androidx.constraintlayout.core.parser.CLElement r2) {
            r0 = this;
            r0.<init>()
            r0.mReason = r1
            if (r2 == 0) goto L14
            java.lang.String r1 = r2.getStrClass()
            r0.mElementClass = r1
            int r1 = r2.getLine()
            r0.mLineNumber = r1
            goto L1c
        L14:
            java.lang.String r1 = "unknown"
            r0.mElementClass = r1
            r1 = 0
            r0.mLineNumber = r1
        L1c:
            return
    }

    public java.lang.String reason() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mReason
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r3.mElementClass
            r0.append(r1)
            java.lang.String r1 = " at line "
            r0.append(r1)
            int r1 = r3.mLineNumber
            java.lang.String r2 = ")"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CLParsingException ("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2.hashCode()
            r0.append(r1)
            java.lang.String r1 = ") : "
            r0.append(r1)
            java.lang.String r1 = r2.reason()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
