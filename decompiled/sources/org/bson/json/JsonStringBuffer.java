package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class JsonStringBuffer implements org.bson.json.JsonBuffer {
    private final java.lang.String buffer;
    private boolean eof;
    private int position;

    public JsonStringBuffer(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            return
    }

    @Override // org.bson.json.JsonBuffer
    public void discard(int r1) {
            r0 = this;
            return
    }

    @Override // org.bson.json.JsonBuffer
    public int getPosition() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    @Override // org.bson.json.JsonBuffer
    public int mark() {
            r1 = this;
            int r0 = r1.position
            return r0
    }

    @Override // org.bson.json.JsonBuffer
    public int read() {
            r3 = this;
            boolean r0 = r3.eof
            if (r0 != 0) goto L20
            int r0 = r3.position
            java.lang.String r1 = r3.buffer
            int r1 = r1.length()
            if (r0 < r1) goto L13
            r0 = 1
            r3.eof = r0
            r0 = -1
            return r0
        L13:
            java.lang.String r0 = r3.buffer
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            char r0 = r0.charAt(r1)
            return r0
        L20:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.String r1 = "Trying to read past EOF."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.json.JsonBuffer
    public void reset(int r2) {
            r1 = this;
            int r0 = r1.position
            if (r2 > r0) goto L7
            r1.position = r2
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "mark cannot reset ahead of position, only back"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.bson.json.JsonBuffer
    public void unread(int r3) {
            r2 = this;
            r0 = 0
            r2.eof = r0
            r0 = -1
            if (r3 == r0) goto L18
            java.lang.String r0 = r2.buffer
            int r1 = r2.position
            int r1 = r1 + (-1)
            char r0 = r0.charAt(r1)
            if (r0 != r3) goto L18
            int r3 = r2.position
            int r3 = r3 + (-1)
            r2.position = r3
        L18:
            return
    }
}
