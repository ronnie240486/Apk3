package okio;

/* JADX INFO: renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0082\b\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"FCOMMENT", "", "FEXTRA", "FHCRC", "FNAME", "SECTION_BODY", "", "SECTION_DONE", "SECTION_HEADER", "SECTION_TRAILER", "getBit", "", "bit", "gzip", "Lokio/GzipSource;", "Lokio/Source;", "okio"}, k = 2, mv = {1, 4, 1})
@kotlin.jvm.JvmName(name = "-GzipSourceExtensions")
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    public static final /* synthetic */ boolean access$getBit(int r0, int r1) {
            boolean r0 = getBit(r0, r1)
            return r0
    }

    private static final boolean getBit(int r0, int r1) {
            int r0 = r0 >> r1
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.GzipSource gzip(@org.jetbrains.annotations.NotNull okio.Source r1) {
            java.lang.String r0 = "$this$gzip"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.GzipSource r0 = new okio.GzipSource
            r0.<init>(r1)
            return r0
    }
}
