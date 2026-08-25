package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
class JsonStreamBuffer implements org.bson.json.JsonBuffer {
    private char[] buffer;
    private int bufferCount;
    private int bufferStartPos;
    private boolean eof;
    private final int initialBufferSize;
    private int lastChar;
    private final java.util.List<java.lang.Integer> markedPositions;
    private int position;
    private final java.io.Reader reader;
    private boolean reuseLastChar;

    public JsonStreamBuffer(java.io.Reader r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.markedPositions = r0
            r0 = 16
            r1.initialBufferSize = r0
            r1.reader = r2
            r1.resetBuffer()
            return
    }

    private void addToBuffer(char r5) {
            r4 = this;
            java.util.List<java.lang.Integer> r0 = r4.markedPositions
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            int r0 = r4.bufferCount
            char[] r1 = r4.buffer
            int r2 = r1.length
            if (r0 != r2) goto L1a
            int r2 = r1.length
            int r2 = r2 * 2
            char[] r2 = new char[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.buffer = r2
        L1a:
            char[] r0 = r4.buffer
            int r1 = r4.bufferCount
            r0[r1] = r5
            int r1 = r1 + 1
            r4.bufferCount = r1
        L24:
            return
    }

    private void resetBuffer() {
            r1 = this;
            r0 = -1
            r1.bufferStartPos = r0
            r0 = 0
            r1.bufferCount = r0
            int r0 = r1.initialBufferSize
            char[] r0 = new char[r0]
            r1.buffer = r0
            return
    }

    @Override // org.bson.json.JsonBuffer
    public void discard(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.markedPositions
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r0.indexOf(r3)
            r0 = -1
            if (r3 != r0) goto Le
            return
        Le:
            java.util.List<java.lang.Integer> r0 = r2.markedPositions
            int r1 = r0.size()
            java.util.List r3 = r0.subList(r3, r1)
            r3.clear()
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
            r2 = this;
            int r0 = r2.bufferCount
            if (r0 != 0) goto L8
            int r0 = r2.position
            r2.bufferStartPos = r0
        L8:
            java.util.List<java.lang.Integer> r0 = r2.markedPositions
            int r1 = r2.position
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L21
            java.util.List<java.lang.Integer> r0 = r2.markedPositions
            int r1 = r2.position
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L21:
            int r0 = r2.position
            return r0
    }

    @Override // org.bson.json.JsonBuffer
    public int read() {
            r6 = this;
            boolean r0 = r6.eof
            if (r0 != 0) goto L57
            boolean r0 = r6.reuseLastChar
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L17
            r0 = 0
            r6.reuseLastChar = r0
            int r0 = r6.lastChar
            r6.lastChar = r1
            int r1 = r6.position
            int r1 = r1 + r2
            r6.position = r1
            return r0
        L17:
            int r0 = r6.position
            int r3 = r6.bufferStartPos
            int r4 = r0 - r3
            int r5 = r6.bufferCount
            if (r4 >= r5) goto L2d
            char[] r1 = r6.buffer
            int r3 = r0 - r3
            char r1 = r1[r3]
            r6.lastChar = r1
            int r0 = r0 + r2
            r6.position = r0
            return r1
        L2d:
            java.util.List<java.lang.Integer> r0 = r6.markedPositions
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L38
            r6.resetBuffer()
        L38:
            java.io.Reader r0 = r6.reader     // Catch: java.io.IOException -> L50
            int r0 = r0.read()     // Catch: java.io.IOException -> L50
            if (r0 == r1) goto L46
            r6.lastChar = r0     // Catch: java.io.IOException -> L50
            char r3 = (char) r0     // Catch: java.io.IOException -> L50
            r6.addToBuffer(r3)     // Catch: java.io.IOException -> L50
        L46:
            int r3 = r6.position     // Catch: java.io.IOException -> L50
            int r3 = r3 + r2
            r6.position = r3     // Catch: java.io.IOException -> L50
            if (r0 != r1) goto L4f
            r6.eof = r2     // Catch: java.io.IOException -> L50
        L4f:
            return r0
        L50:
            r0 = move-exception
            org.bson.json.JsonParseException r1 = new org.bson.json.JsonParseException
            r1.<init>(r0)
            throw r1
        L57:
            org.bson.json.JsonParseException r0 = new org.bson.json.JsonParseException
            java.lang.String r1 = "Trying to read past EOF."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.bson.json.JsonBuffer
    public void reset(int r4) {
            r3 = this;
            int r0 = r3.position
            if (r4 > r0) goto L30
            java.util.List<java.lang.Integer> r0 = r3.markedPositions
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L28
            int r1 = r3.position
            if (r4 == r1) goto L18
            r1 = 0
            r3.reuseLastChar = r1
        L18:
            java.util.List<java.lang.Integer> r1 = r3.markedPositions
            int r2 = r1.size()
            java.util.List r0 = r1.subList(r0, r2)
            r0.clear()
            r3.position = r4
            return
        L28:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "mark invalidated"
            r4.<init>(r0)
            throw r4
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "mark cannot reset ahead of position, only back"
            r4.<init>(r0)
            throw r4
    }

    @Override // org.bson.json.JsonBuffer
    public void unread(int r2) {
            r1 = this;
            r0 = 0
            r1.eof = r0
            r0 = -1
            if (r2 == r0) goto L12
            int r0 = r1.lastChar
            if (r0 != r2) goto L12
            r2 = 1
            r1.reuseLastChar = r2
            int r0 = r1.position
            int r0 = r0 - r2
            r1.position = r0
        L12:
            return
    }
}
