package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class SntpClient {
    public static final java.lang.String DEFAULT_NTP_HOST = "time.android.com";
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TIMEOUT_MS = 10000;
    private static final int TRANSMIT_TIME_OFFSET = 40;

    @androidx.annotation.GuardedBy("valueLock")
    private static long elapsedRealtimeOffsetMs = 0;

    @androidx.annotation.GuardedBy("valueLock")
    private static boolean isInitialized = false;
    private static final java.lang.Object loaderLock = null;

    @androidx.annotation.GuardedBy("valueLock")
    private static java.lang.String ntpHost = "time.android.com";
    private static final java.lang.Object valueLock = null;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.SntpClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface InitializationCallback {
        void onInitializationFailed(java.io.IOException r1);

        void onInitialized();
    }

    public static final class NtpTimeCallback implements com.google.android.exoplayer2.upstream.Loader.Callback<com.google.android.exoplayer2.upstream.Loader.Loadable> {

        @androidx.annotation.Nullable
        private final com.google.android.exoplayer2.util.SntpClient.InitializationCallback callback;

        public NtpTimeCallback(@androidx.annotation.Nullable com.google.android.exoplayer2.util.SntpClient.InitializationCallback r1) {
                r0 = this;
                r0.<init>()
                r0.callback = r1
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, boolean r6) {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4) {
                r0 = this;
                com.google.android.exoplayer2.util.SntpClient$InitializationCallback r1 = r0.callback
                if (r1 == 0) goto L1f
                boolean r1 = com.google.android.exoplayer2.util.SntpClient.isInitialized()
                if (r1 != 0) goto L1a
                com.google.android.exoplayer2.util.SntpClient$InitializationCallback r1 = r0.callback
                java.io.IOException r2 = new java.io.IOException
                java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
                r3.<init>()
                r2.<init>(r3)
                r1.onInitializationFailed(r2)
                goto L1f
            L1a:
                com.google.android.exoplayer2.util.SntpClient$InitializationCallback r1 = r0.callback
                r1.onInitialized()
            L1f:
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public com.google.android.exoplayer2.upstream.Loader.LoadErrorAction onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable r1, long r2, long r4, java.io.IOException r6, int r7) {
                r0 = this;
                com.google.android.exoplayer2.util.SntpClient$InitializationCallback r1 = r0.callback
                if (r1 == 0) goto L7
                r1.onInitializationFailed(r6)
            L7:
                com.google.android.exoplayer2.upstream.Loader$LoadErrorAction r1 = com.google.android.exoplayer2.upstream.Loader.DONT_RETRY
                return r1
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class NtpTimeLoadable implements com.google.android.exoplayer2.upstream.Loader.Loadable {
        private NtpTimeLoadable() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ NtpTimeLoadable(com.google.android.exoplayer2.util.SntpClient.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
                r0 = this;
                return
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws java.io.IOException {
                r4 = this;
                java.lang.Object r0 = com.google.android.exoplayer2.util.SntpClient.access$100()
                monitor-enter(r0)
                java.lang.Object r1 = com.google.android.exoplayer2.util.SntpClient.access$200()     // Catch: java.lang.Throwable -> L2c
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L2c
                boolean r2 = com.google.android.exoplayer2.util.SntpClient.access$300()     // Catch: java.lang.Throwable -> L29
                if (r2 == 0) goto L13
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                return
            L13:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
                long r1 = com.google.android.exoplayer2.util.SntpClient.access$400()     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r3 = com.google.android.exoplayer2.util.SntpClient.access$200()     // Catch: java.lang.Throwable -> L2c
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L2c
                com.google.android.exoplayer2.util.SntpClient.access$502(r1)     // Catch: java.lang.Throwable -> L26
                com.google.android.exoplayer2.util.SntpClient.access$302()     // Catch: java.lang.Throwable -> L26
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                return
            L26:
                r1 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
                throw r1     // Catch: java.lang.Throwable -> L2c
            L29:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
                throw r2     // Catch: java.lang.Throwable -> L2c
            L2c:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
                throw r1
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.exoplayer2.util.SntpClient.loaderLock = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.exoplayer2.util.SntpClient.valueLock = r0
            return
    }

    private SntpClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object access$100() {
            java.lang.Object r0 = com.google.android.exoplayer2.util.SntpClient.loaderLock
            return r0
    }

    public static /* synthetic */ java.lang.Object access$200() {
            java.lang.Object r0 = com.google.android.exoplayer2.util.SntpClient.valueLock
            return r0
    }

    public static /* synthetic */ boolean access$300() {
            boolean r0 = com.google.android.exoplayer2.util.SntpClient.isInitialized
            return r0
    }

    public static /* synthetic */ void access$302() {
            r0 = 1
            com.google.android.exoplayer2.util.SntpClient.isInitialized = r0
            return
    }

    public static /* synthetic */ long access$400() throws java.io.IOException {
            long r0 = loadNtpTimeOffsetMs()
            return r0
    }

    public static /* synthetic */ long access$502(long r0) {
            com.google.android.exoplayer2.util.SntpClient.elapsedRealtimeOffsetMs = r0
            return r0
    }

    private static void checkValidServerReply(byte r1, byte r2, int r3, long r4) throws java.io.IOException {
            r0 = 3
            if (r1 == r0) goto L37
            r1 = 4
            if (r2 == r1) goto L16
            r1 = 5
            if (r2 != r1) goto La
            goto L16
        La:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r3 = "SNTP: Untrusted mode: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2)
            r1.<init>(r2)
            throw r1
        L16:
            if (r3 == 0) goto L2b
            r1 = 15
            if (r3 > r1) goto L2b
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 == 0) goto L23
            return
        L23:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "SNTP: Zero transmitTime"
            r1.<init>(r2)
            throw r1
        L2b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "SNTP: Untrusted stratum: "
            java.lang.String r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r3)
            r1.<init>(r2)
            throw r1
        L37:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "SNTP: Unsynchronized server"
            r1.<init>(r2)
            throw r1
    }

    public static long getElapsedRealtimeOffsetMs() {
            java.lang.Object r0 = com.google.android.exoplayer2.util.SntpClient.valueLock
            monitor-enter(r0)
            boolean r1 = com.google.android.exoplayer2.util.SntpClient.isInitialized     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto La
            long r1 = com.google.android.exoplayer2.util.SntpClient.elapsedRealtimeOffsetMs     // Catch: java.lang.Throwable -> L11
            goto Lf
        La:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public static java.lang.String getNtpHost() {
            java.lang.Object r0 = com.google.android.exoplayer2.util.SntpClient.valueLock
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.exoplayer2.util.SntpClient.ntpHost     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static void initialize(@androidx.annotation.Nullable com.google.android.exoplayer2.upstream.Loader r2, @androidx.annotation.Nullable com.google.android.exoplayer2.util.SntpClient.InitializationCallback r3) {
            boolean r0 = isInitialized()
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Lb
            r3.onInitialized()
        Lb:
            return
        Lc:
            if (r2 != 0) goto L15
            com.google.android.exoplayer2.upstream.Loader r2 = new com.google.android.exoplayer2.upstream.Loader
            java.lang.String r0 = "SntpClient"
            r2.<init>(r0)
        L15:
            com.google.android.exoplayer2.util.SntpClient$NtpTimeLoadable r0 = new com.google.android.exoplayer2.util.SntpClient$NtpTimeLoadable
            r1 = 0
            r0.<init>(r1)
            com.google.android.exoplayer2.util.SntpClient$NtpTimeCallback r1 = new com.google.android.exoplayer2.util.SntpClient$NtpTimeCallback
            r1.<init>(r3)
            r3 = 1
            r2.startLoading(r0, r1, r3)
            return
    }

    public static boolean isInitialized() {
            java.lang.Object r0 = com.google.android.exoplayer2.util.SntpClient.valueLock
            monitor-enter(r0)
            boolean r1 = com.google.android.exoplayer2.util.SntpClient.isInitialized     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    private static long loadNtpTimeOffsetMs() throws java.io.IOException {
            java.lang.String r0 = getNtpHost()
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)
            java.net.DatagramSocket r1 = new java.net.DatagramSocket
            r1.<init>()
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setSoTimeout(r2)     // Catch: java.lang.Throwable -> L71
            r2 = 48
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L71
            java.net.DatagramPacket r4 = new java.net.DatagramPacket     // Catch: java.lang.Throwable -> L71
            r5 = 123(0x7b, float:1.72E-43)
            r4.<init>(r3, r2, r0, r5)     // Catch: java.lang.Throwable -> L71
            r0 = 27
            r5 = 0
            r3[r5] = r0     // Catch: java.lang.Throwable -> L71
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L71
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L71
            r0 = 40
            writeTimestamp(r3, r0, r6)     // Catch: java.lang.Throwable -> L71
            r1.send(r4)     // Catch: java.lang.Throwable -> L71
            java.net.DatagramPacket r4 = new java.net.DatagramPacket     // Catch: java.lang.Throwable -> L71
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L71
            r1.receive(r4)     // Catch: java.lang.Throwable -> L71
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L71
            long r8 = r10 - r8
            long r8 = r8 + r6
            r2 = r3[r5]     // Catch: java.lang.Throwable -> L71
            int r2 = r2 >> 6
            r2 = r2 & 3
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L71
            r4 = r3[r5]     // Catch: java.lang.Throwable -> L71
            r4 = r4 & 7
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L71
            r5 = 1
            r5 = r3[r5]     // Catch: java.lang.Throwable -> L71
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 24
            long r6 = readTimestamp(r3, r6)     // Catch: java.lang.Throwable -> L71
            r12 = 32
            long r12 = readTimestamp(r3, r12)     // Catch: java.lang.Throwable -> L71
            long r14 = readTimestamp(r3, r0)     // Catch: java.lang.Throwable -> L71
            checkValidServerReply(r2, r4, r5, r14)     // Catch: java.lang.Throwable -> L71
            long r12 = r12 - r6
            long r14 = r14 - r8
            long r14 = r14 + r12
            r2 = 2
            long r14 = r14 / r2
            long r8 = r8 + r14
            long r8 = r8 - r10
            r1.close()
            return r8
        L71:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r1 = move-exception
            r0.addSuppressed(r1)
        L7a:
            throw r0
    }

    private static long read32(byte[] r5, int r6) {
            r0 = r5[r6]
            int r1 = r6 + 1
            r1 = r5[r1]
            int r2 = r6 + 2
            r2 = r5[r2]
            int r6 = r6 + 3
            r5 = r5[r6]
            r6 = r0 & 128(0x80, float:1.8E-43)
            r3 = 128(0x80, float:1.8E-43)
            if (r6 != r3) goto L18
            r6 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r6 + 128
        L18:
            r6 = r1 & 128(0x80, float:1.8E-43)
            if (r6 != r3) goto L20
            r6 = r1 & 127(0x7f, float:1.78E-43)
            int r1 = r6 + 128
        L20:
            r6 = r2 & 128(0x80, float:1.8E-43)
            if (r6 != r3) goto L28
            r6 = r2 & 127(0x7f, float:1.78E-43)
            int r2 = r6 + 128
        L28:
            r6 = r5 & 128(0x80, float:1.8E-43)
            if (r6 != r3) goto L2f
            r5 = r5 & 127(0x7f, float:1.78E-43)
            int r5 = r5 + r3
        L2f:
            long r3 = (long) r0
            r6 = 24
            long r3 = r3 << r6
            long r0 = (long) r1
            r6 = 16
            long r0 = r0 << r6
            long r3 = r3 + r0
            long r0 = (long) r2
            r6 = 8
            long r0 = r0 << r6
            long r3 = r3 + r0
            long r5 = (long) r5
            long r3 = r3 + r5
            return r3
    }

    private static long readTimestamp(byte[] r5, int r6) {
            long r0 = read32(r5, r6)
            int r6 = r6 + 4
            long r5 = read32(r5, r6)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            return r2
        L15:
            r2 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r5 = r5 * r2
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r5 = r5 / r2
            long r5 = r5 + r0
            return r5
    }

    public static void setNtpHost(java.lang.String r2) {
            java.lang.Object r0 = com.google.android.exoplayer2.util.SntpClient.valueLock
            monitor-enter(r0)
            java.lang.String r1 = com.google.android.exoplayer2.util.SntpClient.ntpHost     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L10
            com.google.android.exoplayer2.util.SntpClient.ntpHost = r2     // Catch: java.lang.Throwable -> L12
            r2 = 0
            com.google.android.exoplayer2.util.SntpClient.isInitialized = r2     // Catch: java.lang.Throwable -> L12
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    private static void writeTimestamp(byte[] r11, int r12, long r13) {
            r0 = 0
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            int r13 = r12 + 8
            java.util.Arrays.fill(r11, r12, r13, r0)
            return
        Ld:
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r13 / r1
            long r5 = r3 * r1
            long r13 = r13 - r5
            r5 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r3 = r3 + r5
            int r5 = r12 + 1
            r6 = 24
            long r7 = r3 >> r6
            int r8 = (int) r7
            byte r7 = (byte) r8
            r11[r12] = r7
            int r12 = r5 + 1
            r7 = 16
            long r8 = r3 >> r7
            int r9 = (int) r8
            byte r8 = (byte) r9
            r11[r5] = r8
            int r5 = r12 + 1
            r8 = 8
            long r9 = r3 >> r8
            int r10 = (int) r9
            byte r9 = (byte) r10
            r11[r12] = r9
            int r12 = r5 + 1
            long r3 = r3 >> r0
            int r0 = (int) r3
            byte r0 = (byte) r0
            r11[r5] = r0
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r13 = r13 * r3
            long r13 = r13 / r1
            int r0 = r12 + 1
            long r1 = r13 >> r6
            int r2 = (int) r1
            byte r1 = (byte) r2
            r11[r12] = r1
            int r12 = r0 + 1
            long r1 = r13 >> r7
            int r2 = (int) r1
            byte r1 = (byte) r2
            r11[r0] = r1
            int r0 = r12 + 1
            long r13 = r13 >> r8
            int r14 = (int) r13
            byte r13 = (byte) r14
            r11[r12] = r13
            double r12 = java.lang.Math.random()
            r1 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r12 = r12 * r1
            int r12 = (int) r12
            byte r12 = (byte) r12
            r11[r0] = r12
            return
    }
}
