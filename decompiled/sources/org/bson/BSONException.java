package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BSONException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -4415279469780082174L;
    private java.lang.Integer errorCode;

    public BSONException(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r2 = 0
            r0.errorCode = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.errorCode = r1
            return
    }

    public BSONException(int r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r2 = 0
            r0.errorCode = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.errorCode = r1
            return
    }

    public BSONException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.errorCode = r1
            return
    }

    public BSONException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.errorCode = r1
            return
    }

    public java.lang.Integer getErrorCode() {
            r1 = this;
            java.lang.Integer r0 = r1.errorCode
            return r0
    }

    public boolean hasErrorCode() {
            r1 = this;
            java.lang.Integer r0 = r1.errorCode
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
