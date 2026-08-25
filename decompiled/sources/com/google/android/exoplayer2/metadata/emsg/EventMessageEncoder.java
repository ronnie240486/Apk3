package com.google.android.exoplayer2.metadata.emsg;

/* JADX INFO: loaded from: classes3.dex */
public final class EventMessageEncoder {
    private final java.io.ByteArrayOutputStream byteArrayOutputStream;
    private final java.io.DataOutputStream dataOutputStream;

    public EventMessageEncoder() {
            r2 = this;
            r2.<init>()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            r2.byteArrayOutputStream = r0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r0)
            r2.dataOutputStream = r1
            return
    }

    private static void writeNullTerminatedString(java.io.DataOutputStream r0, java.lang.String r1) throws java.io.IOException {
            r0.writeBytes(r1)
            r1 = 0
            r0.writeByte(r1)
            return
    }

    public byte[] encode(com.google.android.exoplayer2.metadata.emsg.EventMessage r4) {
            r3 = this;
            java.io.ByteArrayOutputStream r0 = r3.byteArrayOutputStream
            r0.reset()
            java.io.DataOutputStream r0 = r3.dataOutputStream     // Catch: java.io.IOException -> L39
            java.lang.String r1 = r4.schemeIdUri     // Catch: java.io.IOException -> L39
            writeNullTerminatedString(r0, r1)     // Catch: java.io.IOException -> L39
            java.lang.String r0 = r4.value     // Catch: java.io.IOException -> L39
            if (r0 == 0) goto L11
            goto L13
        L11:
            java.lang.String r0 = ""
        L13:
            java.io.DataOutputStream r1 = r3.dataOutputStream     // Catch: java.io.IOException -> L39
            writeNullTerminatedString(r1, r0)     // Catch: java.io.IOException -> L39
            java.io.DataOutputStream r0 = r3.dataOutputStream     // Catch: java.io.IOException -> L39
            long r1 = r4.durationMs     // Catch: java.io.IOException -> L39
            r0.writeLong(r1)     // Catch: java.io.IOException -> L39
            java.io.DataOutputStream r0 = r3.dataOutputStream     // Catch: java.io.IOException -> L39
            long r1 = r4.id     // Catch: java.io.IOException -> L39
            r0.writeLong(r1)     // Catch: java.io.IOException -> L39
            java.io.DataOutputStream r0 = r3.dataOutputStream     // Catch: java.io.IOException -> L39
            byte[] r4 = r4.messageData     // Catch: java.io.IOException -> L39
            r0.write(r4)     // Catch: java.io.IOException -> L39
            java.io.DataOutputStream r4 = r3.dataOutputStream     // Catch: java.io.IOException -> L39
            r4.flush()     // Catch: java.io.IOException -> L39
            java.io.ByteArrayOutputStream r4 = r3.byteArrayOutputStream     // Catch: java.io.IOException -> L39
            byte[] r4 = r4.toByteArray()     // Catch: java.io.IOException -> L39
            return r4
        L39:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }
}
