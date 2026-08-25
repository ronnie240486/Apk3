package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
public class JsonParseException extends java.lang.RuntimeException {
    private static final long serialVersionUID = -6722022620020198727L;

    public JsonParseException() {
            r0 = this;
            r0.<init>()
            return
    }

    public JsonParseException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JsonParseException(java.lang.String r1, java.lang.Object... r2) {
            r0 = this;
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            return
    }

    public JsonParseException(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
