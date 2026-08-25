package okhttp3.internal.http2;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0000J\u0019\u0010\t\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u001a\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Settings;", "", "()V", "headerTableSize", "", "getHeaderTableSize", "()I", "initialWindowSize", "getInitialWindowSize", "set", "values", "", "clear", "", "get", "id", "getEnablePush", "", "defaultValue", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "isSet", "merge", "other", "value", "size", "Companion", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class Settings {
    public static final int COUNT = 10;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.Settings.Companion Companion = null;
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values;

    /* JADX INFO: compiled from: Settings.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Settings$Companion;", "", "()V", "COUNT", "", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "okhttp"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http2.Settings$Companion r0 = new okhttp3.internal.http2.Settings$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Settings.Companion = r0
            return
    }

    public Settings() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.values = r0
            return
    }

    public final void clear() {
            r1 = this;
            r0 = 0
            r1.set = r0
            int[] r0 = r1.values
            kotlin.collections.ArraysKt.fill$default(r0)
            return
    }

    public final int get(int r2) {
            r1 = this;
            int[] r0 = r1.values
            r2 = r0[r2]
            return r2
    }

    public final boolean getEnablePush(boolean r3) {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 4
            r1 = 1
            if (r0 == 0) goto L11
            int[] r3 = r2.values
            r0 = 2
            r3 = r3[r0]
            if (r3 != r1) goto L10
            r3 = 1
            goto L11
        L10:
            r3 = 0
        L11:
            return r3
    }

    public final int getHeaderTableSize() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 2
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 1
            r0 = r0[r1]
            goto Ld
        Lc:
            r0 = -1
        Ld:
            return r0
    }

    public final int getInitialWindowSize() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 7
            r0 = r0[r1]
            goto Lf
        Lc:
            r0 = 65535(0xffff, float:9.1834E-41)
        Lf:
            return r0
    }

    public final int getMaxConcurrentStreams() {
            r2 = this;
            int r0 = r2.set
            r0 = r0 & 16
            if (r0 == 0) goto Lc
            int[] r0 = r2.values
            r1 = 4
            r0 = r0[r1]
            goto Lf
        Lc:
            r0 = 2147483647(0x7fffffff, float:NaN)
        Lf:
            return r0
    }

    public final int getMaxFrameSize(int r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 32
            if (r0 == 0) goto Lb
            int[] r2 = r1.values
            r0 = 5
            r2 = r2[r0]
        Lb:
            return r2
    }

    public final int getMaxHeaderListSize(int r2) {
            r1 = this;
            int r0 = r1.set
            r0 = r0 & 64
            if (r0 == 0) goto Lb
            int[] r2 = r1.values
            r0 = 6
            r2 = r2[r0]
        Lb:
            return r2
    }

    public final boolean isSet(int r3) {
            r2 = this;
            r0 = 1
            int r3 = r0 << r3
            int r1 = r2.set
            r3 = r3 & r1
            if (r3 == 0) goto L9
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final void merge(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.Settings r3) {
            r2 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
        L6:
            r1 = 10
            if (r0 >= r1) goto L1b
            boolean r1 = r3.isSet(r0)
            if (r1 != 0) goto L11
            goto L18
        L11:
            int r1 = r3.get(r0)
            r2.set(r0, r1)
        L18:
            int r0 = r0 + 1
            goto L6
        L1b:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.Settings set(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.values
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.set
            r1 = r1 | r2
            r3.set = r1
            r0[r4] = r5
        L11:
            return r3
    }

    public final int size() {
            r1 = this;
            int r0 = r1.set
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }
}
