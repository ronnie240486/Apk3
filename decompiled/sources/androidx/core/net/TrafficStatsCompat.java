package androidx.core.net;

/* JADX INFO: loaded from: classes3.dex */
public final class TrafficStatsCompat {

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void tagDatagramSocket(java.net.DatagramSocket r0) throws java.net.SocketException {
                android.net.TrafficStats.tagDatagramSocket(r0)
                return
        }

        @androidx.annotation.DoNotInline
        public static void untagDatagramSocket(java.net.DatagramSocket r0) throws java.net.SocketException {
                android.net.TrafficStats.untagDatagramSocket(r0)
                return
        }
    }

    private TrafficStatsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void clearThreadStatsTag() {
            android.net.TrafficStats.clearThreadStatsTag()
            return
    }

    @java.lang.Deprecated
    public static int getThreadStatsTag() {
            int r0 = android.net.TrafficStats.getThreadStatsTag()
            return r0
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int r0) {
            android.net.TrafficStats.incrementOperationCount(r0)
            return
    }

    @java.lang.Deprecated
    public static void incrementOperationCount(int r0, int r1) {
            android.net.TrafficStats.incrementOperationCount(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setThreadStatsTag(int r0) {
            android.net.TrafficStats.setThreadStatsTag(r0)
            return
    }

    public static void tagDatagramSocket(@androidx.annotation.NonNull java.net.DatagramSocket r3) throws java.net.SocketException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.net.TrafficStatsCompat.Api24Impl.tagDatagramSocket(r3)
            goto L1d
        La:
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.fromDatagramSocket(r3)
            androidx.core.net.DatagramSocketWrapper r1 = new androidx.core.net.DatagramSocketWrapper
            java.io.FileDescriptor r2 = r0.getFileDescriptor()
            r1.<init>(r3, r2)
            android.net.TrafficStats.tagSocket(r1)
            r0.detachFd()
        L1d:
            return
    }

    @java.lang.Deprecated
    public static void tagSocket(java.net.Socket r0) throws java.net.SocketException {
            android.net.TrafficStats.tagSocket(r0)
            return
    }

    public static void untagDatagramSocket(@androidx.annotation.NonNull java.net.DatagramSocket r3) throws java.net.SocketException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.net.TrafficStatsCompat.Api24Impl.untagDatagramSocket(r3)
            goto L1d
        La:
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.fromDatagramSocket(r3)
            androidx.core.net.DatagramSocketWrapper r1 = new androidx.core.net.DatagramSocketWrapper
            java.io.FileDescriptor r2 = r0.getFileDescriptor()
            r1.<init>(r3, r2)
            android.net.TrafficStats.untagSocket(r1)
            r0.detachFd()
        L1d:
            return
    }

    @java.lang.Deprecated
    public static void untagSocket(java.net.Socket r0) throws java.net.SocketException {
            android.net.TrafficStats.untagSocket(r0)
            return
    }
}
