package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public interface BandwidthMeter {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.BandwidthMeter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$getTimeToFirstByteEstimateUs(com.google.android.exoplayer2.upstream.BandwidthMeter r2) {
                r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface EventListener {

        public static final class EventDispatcher {
            private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> listeners;

            public static final class HandlerAndListener {
                private final android.os.Handler handler;
                private final com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener listener;
                private boolean released;

                public HandlerAndListener(android.os.Handler r1, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r2) {
                        r0 = this;
                        r0.<init>()
                        r0.handler = r1
                        r0.listener = r2
                        return
                }

                public static /* synthetic */ com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener access$000(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener r0) {
                        com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener r0 = r0.listener
                        return r0
                }

                public static /* synthetic */ boolean access$100(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener r0) {
                        boolean r0 = r0.released
                        return r0
                }

                public static /* synthetic */ android.os.Handler access$200(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener r0) {
                        android.os.Handler r0 = r0.handler
                        return r0
                }

                public void release() {
                        r1 = this;
                        r0 = 1
                        r1.released = r0
                        return
                }
            }

            public static /* synthetic */ void $r8$lambda$nFe8JM0eb3rkRThsno_aLxYrVHE(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener r0, int r1, long r2, long r4) {
                    lambda$bandwidthSample$0(r0, r1, r2, r4)
                    return
            }

            public EventDispatcher() {
                    r1 = this;
                    r1.<init>()
                    java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                    r0.<init>()
                    r1.listeners = r0
                    return
            }

            private static /* synthetic */ void lambda$bandwidthSample$0(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener r6, int r7, long r8, long r10) {
                    com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener r0 = com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener.access$000(r6)
                    r1 = r7
                    r2 = r8
                    r4 = r10
                    r0.onBandwidthSample(r1, r2, r4)
                    return
            }

            public void addListener(android.os.Handler r3, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r4) {
                    r2 = this;
                    com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                    com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
                    r2.removeListener(r4)
                    java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener> r0 = r2.listeners
                    com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener r1 = new com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener
                    r1.<init>(r3, r4)
                    r0.add(r1)
                    return
            }

            public void bandwidthSample(int r11, long r12, long r14) {
                    r10 = this;
                    java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener> r0 = r10.listeners
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2a
                    java.lang.Object r1 = r0.next()
                    r3 = r1
                    com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener r3 = (com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener) r3
                    boolean r1 = com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener.access$100(r3)
                    if (r1 != 0) goto L6
                    android.os.Handler r1 = com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener.access$200(r3)
                    com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$$ExternalSyntheticLambda0 r9 = new com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$$ExternalSyntheticLambda0
                    r2 = r9
                    r4 = r11
                    r5 = r12
                    r7 = r14
                    r2.<init>(r3, r4, r5, r7)
                    r1.post(r9)
                    goto L6
                L2a:
                    return
            }

            public void removeListener(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r4) {
                    r3 = this;
                    java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener> r0 = r3.listeners
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L21
                    java.lang.Object r1 = r0.next()
                    com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener r1 = (com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener) r1
                    com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener r2 = com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener.access$000(r1)
                    if (r2 != r4) goto L6
                    r1.release()
                    java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener$EventDispatcher$HandlerAndListener> r2 = r3.listeners
                    r2.remove(r1)
                    goto L6
                L21:
                    return
            }
        }

        void onBandwidthSample(int r1, long r2, long r4);
    }

    void addEventListener(android.os.Handler r1, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r2);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.upstream.TransferListener getTransferListener();

    void removeEventListener(com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener r1);
}
