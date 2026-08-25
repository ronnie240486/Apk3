package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public final class UdpDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    public static final int DEFAULT_MAX_PACKET_SIZE = 2000;
    public static final int DEFAULT_SOCKET_TIMEOUT_MILLIS = 8000;
    public static final int UDP_PORT_UNSET = -1;

    @androidx.annotation.Nullable
    private java.net.InetAddress address;

    @androidx.annotation.Nullable
    private java.net.MulticastSocket multicastSocket;
    private boolean opened;
    private final java.net.DatagramPacket packet;
    private final byte[] packetBuffer;
    private int packetRemaining;

    @androidx.annotation.Nullable
    private java.net.DatagramSocket socket;
    private final int socketTimeoutMillis;

    @androidx.annotation.Nullable
    private android.net.Uri uri;

    /* JADX INFO: loaded from: classes.dex */
    public static final class UdpDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        public UdpDataSourceException(java.lang.Throwable r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public UdpDataSource() {
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            r1.<init>(r0)
            return
    }

    public UdpDataSource(int r2) {
            r1 = this;
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.<init>(r2, r0)
            return
    }

    public UdpDataSource(int r3, int r4) {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            r2.socketTimeoutMillis = r4
            byte[] r4 = new byte[r3]
            r2.packetBuffer = r4
            java.net.DatagramPacket r0 = new java.net.DatagramPacket
            r1 = 0
            r0.<init>(r4, r1, r3)
            r2.packet = r0
            return
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() {
            r3 = this;
            r0 = 0
            r3.uri = r0
            java.net.MulticastSocket r1 = r3.multicastSocket
            if (r1 == 0) goto L14
            java.net.InetAddress r2 = r3.address     // Catch: java.io.IOException -> L12
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)     // Catch: java.io.IOException -> L12
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch: java.io.IOException -> L12
            r1.leaveGroup(r2)     // Catch: java.io.IOException -> L12
        L12:
            r3.multicastSocket = r0
        L14:
            java.net.DatagramSocket r1 = r3.socket
            if (r1 == 0) goto L1d
            r1.close()
            r3.socket = r0
        L1d:
            r3.address = r0
            r0 = 0
            r3.packetRemaining = r0
            boolean r1 = r3.opened
            if (r1 == 0) goto L2b
            r3.opened = r0
            r3.transferEnded()
        L2b:
            return
    }

    public int getLocalPort() {
            r1 = this;
            java.net.DatagramSocket r0 = r1.socket
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = r0.getLocalPort()
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @androidx.annotation.Nullable
    public android.net.Uri getUri() {
            r1 = this;
            android.net.Uri r0 = r1.uri
            return r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec r4) throws com.google.android.exoplayer2.upstream.UdpDataSource.UdpDataSourceException {
            r3 = this;
            android.net.Uri r0 = r4.uri
            r3.uri = r0
            java.lang.String r0 = r0.getHost()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r1 = r3.uri
            int r1 = r1.getPort()
            r3.transferInitializing(r4)
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r3.address = r0     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            java.net.InetAddress r2 = r3.address     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r0.<init>(r2, r1)     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            java.net.InetAddress r1 = r3.address     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            boolean r1 = r1.isMulticastAddress()     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            if (r1 == 0) goto L3d
            java.net.MulticastSocket r1 = new java.net.MulticastSocket     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r1.<init>(r0)     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r3.multicastSocket = r1     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            java.net.InetAddress r0 = r3.address     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r1.joinGroup(r0)     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            java.net.MulticastSocket r0 = r3.multicastSocket     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r3.socket = r0     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            goto L44
        L3d:
            java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r1.<init>(r0)     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r3.socket = r1     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
        L44:
            java.net.DatagramSocket r0 = r3.socket     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            int r1 = r3.socketTimeoutMillis     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r0.setSoTimeout(r1)     // Catch: java.io.IOException -> L54 java.lang.SecurityException -> L5d
            r0 = 1
            r3.opened = r0
            r3.transferStarted(r4)
            r0 = -1
            return r0
        L54:
            r4 = move-exception
            com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException r0 = new com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException
            r1 = 2001(0x7d1, float:2.804E-42)
            r0.<init>(r4, r1)
            throw r0
        L5d:
            r4 = move-exception
            com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException r0 = new com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException
            r1 = 2006(0x7d6, float:2.811E-42)
            r0.<init>(r4, r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] r3, int r4, int r5) throws com.google.android.exoplayer2.upstream.UdpDataSource.UdpDataSourceException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.packetRemaining
            if (r0 != 0) goto L33
            java.net.DatagramSocket r0 = r2.socket     // Catch: java.io.IOException -> L21 java.net.SocketTimeoutException -> L2a
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.io.IOException -> L21 java.net.SocketTimeoutException -> L2a
            java.net.DatagramSocket r0 = (java.net.DatagramSocket) r0     // Catch: java.io.IOException -> L21 java.net.SocketTimeoutException -> L2a
            java.net.DatagramPacket r1 = r2.packet     // Catch: java.io.IOException -> L21 java.net.SocketTimeoutException -> L2a
            r0.receive(r1)     // Catch: java.io.IOException -> L21 java.net.SocketTimeoutException -> L2a
            java.net.DatagramPacket r0 = r2.packet
            int r0 = r0.getLength()
            r2.packetRemaining = r0
            r2.bytesTransferred(r0)
            goto L33
        L21:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException r4 = new com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException
            r5 = 2001(0x7d1, float:2.804E-42)
            r4.<init>(r3, r5)
            throw r4
        L2a:
            r3 = move-exception
            com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException r4 = new com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException
            r5 = 2002(0x7d2, float:2.805E-42)
            r4.<init>(r3, r5)
            throw r4
        L33:
            java.net.DatagramPacket r0 = r2.packet
            int r0 = r0.getLength()
            int r1 = r2.packetRemaining
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r1, r5)
            byte[] r1 = r2.packetBuffer
            java.lang.System.arraycopy(r1, r0, r3, r4, r5)
            int r3 = r2.packetRemaining
            int r3 = r3 - r5
            r2.packetRemaining = r3
            return r5
    }
}
