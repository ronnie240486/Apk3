package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0002\b#J.\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "()V", "BINARY", "", "", "[Ljava/lang/String;", "CONNECTION_PREFACE", "Lokio/ByteString;", "FLAGS", "FLAG_ACK", "", "FLAG_COMPRESSED", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_END_STREAM", "FLAG_NONE", "FLAG_PADDED", "FLAG_PRIORITY", "FRAME_NAMES", "INITIAL_MAX_FRAME_SIZE", "TYPE_CONTINUATION", "TYPE_DATA", "TYPE_GOAWAY", "TYPE_HEADERS", "TYPE_PING", "TYPE_PRIORITY", "TYPE_PUSH_PROMISE", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_WINDOW_UPDATE", "formatFlags", "type", "flags", "formattedType", "formattedType$okhttp", "frameLog", "inbound", "", "streamId", "length", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Http2 {
    private static final java.lang.String[] BINARY = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString CONNECTION_PREFACE = null;
    private static final java.lang.String[] FLAGS = null;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final java.lang.String[] FRAME_NAMES = null;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Http2 INSTANCE = null;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
            okhttp3.internal.http2.Http2 r0 = new okhttp3.internal.http2.Http2
            r0.<init>()
            okhttp3.internal.http2.Http2.INSTANCE = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okhttp3.internal.http2.Http2.CONNECTION_PREFACE = r0
            java.lang.String r1 = "DATA"
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "RST_STREAM"
            java.lang.String r5 = "SETTINGS"
            java.lang.String r6 = "PUSH_PROMISE"
            java.lang.String r7 = "PING"
            java.lang.String r8 = "GOAWAY"
            java.lang.String r9 = "WINDOW_UPDATE"
            java.lang.String r10 = "CONTINUATION"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            okhttp3.internal.http2.Http2.FRAME_NAMES = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            okhttp3.internal.http2.Http2.FLAGS = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = 0
        L37:
            r4 = 32
            r5 = 1
            if (r3 >= r0) goto L5a
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = java.lang.Integer.toBinaryString(r3)
            java.lang.String r7 = "Integer.toBinaryString(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r5[r2] = r6
            java.lang.String r6 = "%8s"
            java.lang.String r5 = okhttp3.internal.Util.format(r6, r5)
            r6 = 48
            java.lang.String r4 = kotlin.text.StringsKt.replace$default(r5, r4, r6)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L37
        L5a:
            okhttp3.internal.http2.Http2.BINARY = r1
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String r1 = "END_STREAM"
            r0[r5] = r1
            int[] r1 = new int[r5]
            r1[r2] = r5
            r3 = 8
            java.lang.String r6 = "PADDED"
            r0[r3] = r6
            r0 = 0
        L71:
            java.lang.String r6 = "|PADDED"
            if (r0 >= r5) goto L86
            r7 = r1[r0]
            java.lang.String[] r8 = okhttp3.internal.http2.Http2.FLAGS
            r9 = r7 | 8
            r7 = r8[r7]
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r6)
            r8[r9] = r6
            int r0 = r0 + 1
            goto L71
        L86:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            r7 = 4
            java.lang.String r8 = "END_HEADERS"
            r0[r7] = r8
            java.lang.String r7 = "PRIORITY"
            r0[r4] = r7
            r4 = 36
            java.lang.String r7 = "END_HEADERS|PRIORITY"
            r0[r4] = r7
            r0 = 3
            int[] r4 = new int[r0]
            r4 = {x00f6: FILL_ARRAY_DATA , data: [4, 32, 36} // fill-array
            r7 = 0
        L9e:
            if (r7 >= r0) goto Le1
            r8 = r4[r7]
            r9 = 0
        La3:
            if (r9 >= r5) goto Lde
            r10 = r1[r9]
            java.lang.String[] r11 = okhttp3.internal.http2.Http2.FLAGS
            r12 = r10 | r8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = r11[r10]
            r13.append(r14)
            java.lang.String r14 = "|"
            r13.append(r14)
            r15 = r11[r8]
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            r11[r12] = r13
            r12 = r12 | r3
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r10 = r11[r10]
            r13.append(r10)
            r13.append(r14)
            r10 = r11[r8]
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13, r10, r6)
            r11[r12] = r10
            int r9 = r9 + 1
            goto La3
        Lde:
            int r7 = r7 + 1
            goto L9e
        Le1:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r0 = r0.length
        Le4:
            if (r2 >= r0) goto Lf5
            java.lang.String[] r1 = okhttp3.internal.http2.Http2.FLAGS
            r3 = r1[r2]
            if (r3 != 0) goto Lf2
            java.lang.String[] r3 = okhttp3.internal.http2.Http2.BINARY
            r3 = r3[r2]
            r1[r2] = r3
        Lf2:
            int r2 = r2 + 1
            goto Le4
        Lf5:
            return
    }

    private Http2() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatFlags(int r3, int r4) {
            r2 = this;
            if (r4 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            r0 = 2
            if (r3 == r0) goto L51
            r0 = 3
            if (r3 == r0) goto L51
            r0 = 4
            if (r3 == r0) goto L46
            r0 = 6
            if (r3 == r0) goto L46
            r0 = 7
            if (r3 == r0) goto L51
            r0 = 8
            if (r3 == r0) goto L51
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FLAGS
            int r1 = r0.length
            if (r4 >= r1) goto L23
            r0 = r0[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            goto L27
        L23:
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.BINARY
            r0 = r0[r4]
        L27:
            r1 = 5
            if (r3 != r1) goto L37
            r1 = r4 & 4
            if (r1 == 0) goto L37
            java.lang.String r3 = "HEADERS"
            java.lang.String r4 = "PUSH_PROMISE"
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r0, r3, r4)
            goto L45
        L37:
            if (r3 != 0) goto L45
            r3 = r4 & 32
            if (r3 == 0) goto L45
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "COMPRESSED"
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r0, r3, r4)
        L45:
            return r0
        L46:
            r3 = 1
            if (r4 != r3) goto L4c
            java.lang.String r3 = "ACK"
            goto L50
        L4c:
            java.lang.String[] r3 = okhttp3.internal.http2.Http2.BINARY
            r3 = r3[r4]
        L50:
            return r3
        L51:
            java.lang.String[] r3 = okhttp3.internal.http2.Http2.BINARY
            r3 = r3[r4]
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formattedType$okhttp(int r3) {
            r2 = this;
            java.lang.String[] r0 = okhttp3.internal.http2.Http2.FRAME_NAMES
            int r1 = r0.length
            if (r3 >= r1) goto L8
            r3 = r0[r3]
            goto L18
        L8:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            java.lang.String r3 = "0x%02x"
            java.lang.String r3 = okhttp3.internal.Util.format(r3, r0)
        L18:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String frameLog(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = r2.formattedType$okhttp(r6)
            java.lang.String r6 = r2.formatFlags(r6, r7)
            if (r3 == 0) goto Ld
            java.lang.String r3 = "<<"
            goto Lf
        Ld:
            java.lang.String r3 = ">>"
        Lf:
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r1 = 0
            r7[r1] = r3
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7[r3] = r4
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r7[r3] = r4
            r3 = 3
            r7[r3] = r0
            r3 = 4
            r7[r3] = r6
            java.lang.String r3 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r3 = okhttp3.internal.Util.format(r3, r7)
            return r3
    }
}
