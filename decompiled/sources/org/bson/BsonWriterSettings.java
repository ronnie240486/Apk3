package org.bson;

/* JADX INFO: loaded from: classes3.dex */
public class BsonWriterSettings {
    private final int maxSerializationDepth;

    public BsonWriterSettings() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public BsonWriterSettings(int r1) {
            r0 = this;
            r0.<init>()
            r0.maxSerializationDepth = r1
            return
    }

    public int getMaxSerializationDepth() {
            r1 = this;
            int r0 = r1.maxSerializationDepth
            return r0
    }
}
