package okhttp3.internal.ws;

/* JADX INFO: compiled from: MessageDeflater.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"EMPTY_DEFLATE_BLOCK", "Lokio/ByteString;", "LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION", "", "okhttp"}, k = 2, mv = {1, 4, 1})
public final class MessageDeflaterKt {
    private static final okio.ByteString EMPTY_DEFLATE_BLOCK = null;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "000000ffff"
            okio.ByteString r0 = r0.decodeHex(r1)
            okhttp3.internal.ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK = r0
            return
    }

    public static final /* synthetic */ okio.ByteString access$getEMPTY_DEFLATE_BLOCK$p() {
            okio.ByteString r0 = okhttp3.internal.ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            return r0
    }
}
