package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
public interface DrmSessionEventListener {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DrmSessionEventListener$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$onDrmKeysLoaded(com.google.android.exoplayer2.drm.DrmSessionEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                return
        }

        public static void $default$onDrmKeysRemoved(com.google.android.exoplayer2.drm.DrmSessionEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                return
        }

        public static void $default$onDrmKeysRestored(com.google.android.exoplayer2.drm.DrmSessionEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                return
        }

        @java.lang.Deprecated
        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.drm.DrmSessionEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                return
        }

        public static void $default$onDrmSessionAcquired(com.google.android.exoplayer2.drm.DrmSessionEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, int r3) {
                return
        }

        public static void $default$onDrmSessionManagerError(com.google.android.exoplayer2.drm.DrmSessionEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, java.lang.Exception r3) {
                return
        }

        public static void $default$onDrmSessionReleased(com.google.android.exoplayer2.drm.DrmSessionEventListener r0, int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2) {
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public static final class ListenerAndHandler {
            public android.os.Handler handler;
            public com.google.android.exoplayer2.drm.DrmSessionEventListener listener;

            public ListenerAndHandler(android.os.Handler r1, com.google.android.exoplayer2.drm.DrmSessionEventListener r2) {
                    r0 = this;
                    r0.<init>()
                    r0.handler = r1
                    r0.listener = r2
                    return
            }
        }

        public static /* synthetic */ void $r8$lambda$Go5N0OXEIhSEKTymQYW4yGQpa2E(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r0, com.google.android.exoplayer2.drm.DrmSessionEventListener r1) {
                r0.lambda$drmSessionReleased$5(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$VPDG80VEycbvsI4byl49iBfpehI(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r0, com.google.android.exoplayer2.drm.DrmSessionEventListener r1) {
                r0.lambda$drmKeysRemoved$4(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$VS4q-9oF8IRPGvxstW7pqSGMYR4, reason: not valid java name */
        public static /* synthetic */ void m217$r8$lambda$VS4q9oF8IRPGvxstW7pqSGMYR4(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r0, com.google.android.exoplayer2.drm.DrmSessionEventListener r1) {
                r0.lambda$drmKeysLoaded$1(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$c4cPBl_Z-DrC5MJRv-wOn14Vn00, reason: not valid java name */
        public static /* synthetic */ void m218$r8$lambda$c4cPBl_ZDrC5MJRvwOn14Vn00(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r0, com.google.android.exoplayer2.drm.DrmSessionEventListener r1) {
                r0.lambda$drmKeysRestored$3(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$eIlxixoq5EOGzuz7iie-NWOglWE, reason: not valid java name */
        public static /* synthetic */ void m219$r8$lambda$eIlxixoq5EOGzuz7iieNWOglWE(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r0, com.google.android.exoplayer2.drm.DrmSessionEventListener r1, java.lang.Exception r2) {
                r0.lambda$drmSessionManagerError$2(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$xLBvWT_5jMYrnZeEFJL0zYPleFg(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher r0, com.google.android.exoplayer2.drm.DrmSessionEventListener r1, int r2) {
                r0.lambda$drmSessionAcquired$0(r1, r2)
                return
        }

        public EventDispatcher() {
                r3 = this;
                java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                r0.<init>()
                r1 = 0
                r2 = 0
                r3.<init>(r0, r1, r2)
                return
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> r1, int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r3) {
                r0 = this;
                r0.<init>()
                r0.listenerAndHandlers = r1
                r0.windowIndex = r2
                r0.mediaPeriodId = r3
                return
        }

        private /* synthetic */ void lambda$drmKeysLoaded$1(com.google.android.exoplayer2.drm.DrmSessionEventListener r3) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDrmKeysLoaded(r0, r1)
                return
        }

        private /* synthetic */ void lambda$drmKeysRemoved$4(com.google.android.exoplayer2.drm.DrmSessionEventListener r3) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDrmKeysRemoved(r0, r1)
                return
        }

        private /* synthetic */ void lambda$drmKeysRestored$3(com.google.android.exoplayer2.drm.DrmSessionEventListener r3) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDrmKeysRestored(r0, r1)
                return
        }

        private /* synthetic */ void lambda$drmSessionAcquired$0(com.google.android.exoplayer2.drm.DrmSessionEventListener r3, int r4) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDrmSessionAcquired(r0, r1)
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDrmSessionAcquired(r0, r1, r4)
                return
        }

        private /* synthetic */ void lambda$drmSessionManagerError$2(com.google.android.exoplayer2.drm.DrmSessionEventListener r3, java.lang.Exception r4) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDrmSessionManagerError(r0, r1, r4)
                return
        }

        private /* synthetic */ void lambda$drmSessionReleased$5(com.google.android.exoplayer2.drm.DrmSessionEventListener r3) {
                r2 = this;
                int r0 = r2.windowIndex
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r2.mediaPeriodId
                r3.onDrmSessionReleased(r0, r1)
                return
        }

        public void addEventListener(android.os.Handler r3, com.google.android.exoplayer2.drm.DrmSessionEventListener r4) {
                r2 = this;
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
                com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r2.listenerAndHandlers
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = new com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler
                r1.<init>(r3, r4)
                r0.add(r1)
                return
        }

        public void drmKeysLoaded() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r5.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener r2 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r4 = 2
                r3.<init>(r5, r2, r4)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r3)
                goto L6
            L20:
                return
        }

        public void drmKeysRemoved() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r5.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener r2 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r4 = 1
                r3.<init>(r5, r2, r4)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r3)
                goto L6
            L20:
                return
        }

        public void drmKeysRestored() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r5.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener r2 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r4 = 3
                r3.<init>(r5, r2, r4)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r3)
                goto L6
            L20:
                return
        }

        public void drmSessionAcquired(int r5) {
                r4 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r4.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener r2 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.util.ListenerSet$$ExternalSyntheticLambda1
                r3.<init>(r4, r2, r5)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r3)
                goto L6
            L1f:
                return
        }

        public void drmSessionManagerError(java.lang.Exception r6) {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r5.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener r2 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.util.Util$$ExternalSyntheticLambda1
                r4 = 2
                r3.<init>(r5, r2, r6, r4)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r3)
                goto L6
            L20:
                return
        }

        public void drmSessionReleased() {
                r5 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r5.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener r2 = r1.listener
                android.os.Handler r1 = r1.handler
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0 r3 = new com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0
                r4 = 0
                r3.<init>(r5, r2, r4)
                com.google.android.exoplayer2.util.Util.postOrRun(r1, r3)
                goto L6
            L20:
                return
        }

        public void removeEventListener(com.google.android.exoplayer2.drm.DrmSessionEventListener r4) {
                r3 = this;
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r0 = r3.listenerAndHandlers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler r1 = (com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler) r1
                com.google.android.exoplayer2.drm.DrmSessionEventListener r2 = r1.listener
                if (r2 != r4) goto L6
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r2 = r3.listenerAndHandlers
                r2.remove(r1)
                goto L6
            L1c:
                return
        }

        @androidx.annotation.CheckResult
        public com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher withParameters(int r3, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r2 = this;
                com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher r0 = new com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher
                java.util.concurrent.CopyOnWriteArrayList<com.google.android.exoplayer2.drm.DrmSessionEventListener$EventDispatcher$ListenerAndHandler> r1 = r2.listenerAndHandlers
                r0.<init>(r1, r3, r4)
                return r0
        }
    }

    void onDrmKeysLoaded(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2);

    void onDrmKeysRemoved(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2);

    void onDrmKeysRestored(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2);

    @java.lang.Deprecated
    void onDrmSessionAcquired(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2);

    void onDrmSessionAcquired(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, int r3);

    void onDrmSessionManagerError(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2, java.lang.Exception r3);

    void onDrmSessionReleased(int r1, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r2);
}
