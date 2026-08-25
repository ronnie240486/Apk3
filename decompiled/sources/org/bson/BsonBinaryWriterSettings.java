package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonBinaryWriterSettings {
    private final int maxDocumentSize;

    public BsonBinaryWriterSettings() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r0)
            return
    }

    public BsonBinaryWriterSettings(int r1) {
            r0 = this;
            r0.<init>()
            r0.maxDocumentSize = r1
            return
    }

    public int getMaxDocumentSize() {
            r1 = this;
            int r0 = r1.maxDocumentSize
            return r0
    }
}
