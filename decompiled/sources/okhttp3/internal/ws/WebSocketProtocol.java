package okhttp3.internal.ws;

/* JADX INFO: compiled from: WebSocketProtocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0006J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020$J\u000e\u0010%\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "()V", "ACCEPT_MAGIC", "", "B0_FLAG_FIN", "", "B0_FLAG_RSV1", "B0_FLAG_RSV2", "B0_FLAG_RSV3", "B0_MASK_OPCODE", "B1_FLAG_MASK", "B1_MASK_LENGTH", "CLOSE_CLIENT_GOING_AWAY", "CLOSE_MESSAGE_MAX", "", "CLOSE_NO_STATUS_CODE", "OPCODE_BINARY", "OPCODE_CONTINUATION", "OPCODE_CONTROL_CLOSE", "OPCODE_CONTROL_PING", "OPCODE_CONTROL_PONG", "OPCODE_FLAG_CONTROL", "OPCODE_TEXT", "PAYLOAD_BYTE_MAX", "PAYLOAD_LONG", "PAYLOAD_SHORT", "PAYLOAD_SHORT_MAX", "acceptHeader", "key", "closeCodeExceptionMessage", "code", "toggleMask", "", "cursor", "Lokio/Buffer$UnsafeCursor;", "", "validateCloseCode", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class WebSocketProtocol {

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.ws.WebSocketProtocol INSTANCE = null;
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    static {
            okhttp3.internal.ws.WebSocketProtocol r0 = new okhttp3.internal.ws.WebSocketProtocol
            r0.<init>()
            okhttp3.internal.ws.WebSocketProtocol.INSTANCE = r0
            return
    }

    private WebSocketProtocol() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String acceptHeader(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            okio.ByteString r3 = r0.encodeUtf8(r3)
            okio.ByteString r3 = r3.sha1()
            java.lang.String r3 = r3.base64()
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String closeCodeExceptionMessage(int r3) {
            r2 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r0) goto L25
            r0 = 5000(0x1388, float:7.006E-42)
            if (r3 < r0) goto L9
            goto L25
        L9:
            r0 = 1006(0x3ee, float:1.41E-42)
            r1 = 1004(0x3ec, float:1.407E-42)
            if (r1 > r3) goto L11
            if (r0 >= r3) goto L1a
        L11:
            r0 = 2999(0xbb7, float:4.202E-42)
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r1 <= r3) goto L18
            goto L23
        L18:
            if (r0 < r3) goto L23
        L1a:
            java.lang.String r0 = "Code "
            java.lang.String r1 = " is reserved and may not be used."
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
            goto L2b
        L23:
            r3 = 0
            goto L2b
        L25:
            java.lang.String r0 = "Code must be in range [1000,5000): "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
        L2b:
            return r3
    }

    public final void toggleMask(@org.jetbrains.annotations.NotNull okio.Buffer.UnsafeCursor r8, @org.jetbrains.annotations.NotNull byte[] r9) {
            r7 = this;
            java.lang.String r0 = "cursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r9.length
            r1 = 0
        Lc:
            byte[] r2 = r8.data
            int r3 = r8.start
            int r4 = r8.end
            if (r2 == 0) goto L24
        L14:
            if (r3 >= r4) goto L24
            int r1 = r1 % r0
            r5 = r2[r3]
            r6 = r9[r1]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L14
        L24:
            int r2 = r8.next()
            r3 = -1
            if (r2 != r3) goto Lc
            return
    }

    public final void validateCloseCode(int r2) {
            r1 = this;
            java.lang.String r2 = r1.closeCodeExceptionMessage(r2)
            if (r2 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lc
            return
        Lc:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
