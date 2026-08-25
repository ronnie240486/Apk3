package com.google.android.exoplayer2.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPlaybackSessionManager implements com.google.android.exoplayer2.analytics.PlaybackSessionManager {
    public static final com.google.common.base.Supplier<java.lang.String> DEFAULT_SESSION_ID_GENERATOR = null;
    private static final java.util.Random RANDOM = null;
    private static final int SESSION_ID_LENGTH = 12;

    @androidx.annotation.Nullable
    private java.lang.String currentSessionId;
    private com.google.android.exoplayer2.Timeline currentTimeline;
    private com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener listener;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private final com.google.common.base.Supplier<java.lang.String> sessionIdGenerator;
    private final java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor> sessions;
    private final com.google.android.exoplayer2.Timeline.Window window;

    public final class SessionDescriptor {
        private com.google.android.exoplayer2.source.MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final java.lang.String sessionId;
        public final /* synthetic */ com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager this$0;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r1, java.lang.String r2, @androidx.annotation.Nullable int r3, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.sessionId = r2
                r0.windowIndex = r3
                if (r4 != 0) goto Le
                r1 = -1
                goto L10
            Le:
                long r1 = r4.windowSequenceNumber
            L10:
                r0.windowSequenceNumber = r1
                if (r4 == 0) goto L1c
                boolean r1 = r4.isAd()
                if (r1 == 0) goto L1c
                r0.adMediaPeriodId = r4
            L1c:
                return
        }

        public static /* synthetic */ java.lang.String access$000(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r0) {
                java.lang.String r0 = r0.sessionId
                return r0
        }

        public static /* synthetic */ long access$100(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r2) {
                long r0 = r2.windowSequenceNumber
                return r0
        }

        public static /* synthetic */ int access$200(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r0) {
                int r0 = r0.windowIndex
                return r0
        }

        public static /* synthetic */ boolean access$300(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r0) {
                boolean r0 = r0.isCreated
                return r0
        }

        public static /* synthetic */ void access$302(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r1) {
                r0 = 1
                r1.isCreated = r0
                return
        }

        public static /* synthetic */ boolean access$400(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r0) {
                boolean r0 = r0.isActive
                return r0
        }

        public static /* synthetic */ void access$402(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r1) {
                r0 = 1
                r1.isActive = r0
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.MediaSource.MediaPeriodId access$500(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor r0) {
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r0.adMediaPeriodId
                return r0
        }

        private int resolveWindowIndexToNewTimeline(com.google.android.exoplayer2.Timeline r3, com.google.android.exoplayer2.Timeline r4, int r5) {
                r2 = this;
                int r0 = r3.getWindowCount()
                r1 = -1
                if (r5 < r0) goto L10
                int r3 = r4.getWindowCount()
                if (r5 >= r3) goto Le
                goto Lf
            Le:
                r5 = -1
            Lf:
                return r5
            L10:
                com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r0 = r2.this$0
                com.google.android.exoplayer2.Timeline$Window r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.access$600(r0)
                r3.getWindow(r5, r0)
                com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r5 = r2.this$0
                com.google.android.exoplayer2.Timeline$Window r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.access$600(r5)
                int r5 = r5.firstPeriodIndex
            L21:
                com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r0 = r2.this$0
                com.google.android.exoplayer2.Timeline$Window r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.access$600(r0)
                int r0 = r0.lastPeriodIndex
                if (r5 > r0) goto L45
                java.lang.Object r0 = r3.getUidOfPeriod(r5)
                int r0 = r4.getIndexOfPeriod(r0)
                if (r0 == r1) goto L42
                com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r3 = r2.this$0
                com.google.android.exoplayer2.Timeline$Period r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.access$700(r3)
                com.google.android.exoplayer2.Timeline$Period r3 = r4.getPeriod(r0, r3)
                int r3 = r3.windowIndex
                return r3
            L42:
                int r5 = r5 + 1
                goto L21
            L45:
                return r1
        }

        public boolean belongsToSession(int r8, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r9) {
                r7 = this;
                r0 = 1
                r1 = 0
                if (r9 != 0) goto Lb
                int r9 = r7.windowIndex
                if (r8 != r9) goto L9
                goto La
            L9:
                r0 = 0
            La:
                return r0
            Lb:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r8 = r7.adMediaPeriodId
                if (r8 != 0) goto L20
                boolean r8 = r9.isAd()
                if (r8 != 0) goto L1e
                long r8 = r9.windowSequenceNumber
                long r2 = r7.windowSequenceNumber
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
                goto L1f
            L1e:
                r0 = 0
            L1f:
                return r0
            L20:
                long r2 = r9.windowSequenceNumber
                long r4 = r8.windowSequenceNumber
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L35
                int r2 = r9.adGroupIndex
                int r3 = r8.adGroupIndex
                if (r2 != r3) goto L35
                int r9 = r9.adIndexInAdGroup
                int r8 = r8.adIndexInAdGroup
                if (r9 != r8) goto L35
                goto L36
            L35:
                r0 = 0
            L36:
                return r0
        }

        public boolean isFinishedAtEventTime(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r11) {
                r10 = this;
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r11.mediaPeriodId
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lf
                int r0 = r10.windowIndex
                int r11 = r11.windowIndex
                if (r0 == r11) goto Ld
                goto Le
            Ld:
                r1 = 0
            Le:
                return r1
            Lf:
                long r3 = r10.windowSequenceNumber
                r5 = -1
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L18
                return r2
            L18:
                long r5 = r0.windowSequenceNumber
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 <= 0) goto L1f
                return r1
            L1f:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r10.adMediaPeriodId
                if (r3 != 0) goto L24
                return r2
            L24:
                com.google.android.exoplayer2.Timeline r3 = r11.timeline
                java.lang.Object r0 = r0.periodUid
                int r0 = r3.getIndexOfPeriod(r0)
                com.google.android.exoplayer2.Timeline r3 = r11.timeline
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r10.adMediaPeriodId
                java.lang.Object r4 = r4.periodUid
                int r3 = r3.getIndexOfPeriod(r4)
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r11.mediaPeriodId
                long r5 = r4.windowSequenceNumber
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r7 = r10.adMediaPeriodId
                long r7 = r7.windowSequenceNumber
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 < 0) goto L73
                if (r0 >= r3) goto L45
                goto L73
            L45:
                if (r0 <= r3) goto L48
                return r1
            L48:
                boolean r0 = r4.isAd()
                if (r0 == 0) goto L63
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r11 = r11.mediaPeriodId
                int r0 = r11.adGroupIndex
                int r11 = r11.adIndexInAdGroup
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r10.adMediaPeriodId
                int r4 = r3.adGroupIndex
                if (r0 > r4) goto L62
                if (r0 != r4) goto L61
                int r0 = r3.adIndexInAdGroup
                if (r11 <= r0) goto L61
                goto L62
            L61:
                r1 = 0
            L62:
                return r1
            L63:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r11 = r11.mediaPeriodId
                int r11 = r11.nextAdGroupIndex
                r0 = -1
                if (r11 == r0) goto L72
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = r10.adMediaPeriodId
                int r0 = r0.adGroupIndex
                if (r11 <= r0) goto L71
                goto L72
            L71:
                r1 = 0
            L72:
                return r1
            L73:
                return r2
        }

        public void maybeSetWindowSequenceNumber(int r6, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r7) {
                r5 = this;
                long r0 = r5.windowSequenceNumber
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L12
                int r0 = r5.windowIndex
                if (r6 != r0) goto L12
                if (r7 == 0) goto L12
                long r6 = r7.windowSequenceNumber
                r5.windowSequenceNumber = r6
            L12:
                return
        }

        public boolean tryResolvingToNewTimeline(com.google.android.exoplayer2.Timeline r4, com.google.android.exoplayer2.Timeline r5) {
                r3 = this;
                int r0 = r3.windowIndex
                int r4 = r3.resolveWindowIndexToNewTimeline(r4, r5, r0)
                r3.windowIndex = r4
                r0 = 0
                r1 = -1
                if (r4 != r1) goto Ld
                return r0
            Ld:
                com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r3.adMediaPeriodId
                r2 = 1
                if (r4 != 0) goto L13
                return r2
            L13:
                java.lang.Object r4 = r4.periodUid
                int r4 = r5.getIndexOfPeriod(r4)
                if (r4 == r1) goto L1c
                r0 = 1
            L1c:
                return r0
        }
    }

    public static /* synthetic */ java.lang.String $r8$lambda$vmk78wQ9svbZ0HpAtbMXEpmt6SE() {
            java.lang.String r0 = generateDefaultSessionId()
            return r0
    }

    static {
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$$ExternalSyntheticLambda0.INSTANCE
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.DEFAULT_SESSION_ID_GENERATOR = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.RANDOM = r0
            return
    }

    public DefaultPlaybackSessionManager() {
            r1 = this;
            com.google.common.base.Supplier<java.lang.String> r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.DEFAULT_SESSION_ID_GENERATOR
            r1.<init>(r0)
            return
    }

    public DefaultPlaybackSessionManager(com.google.common.base.Supplier<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.sessionIdGenerator = r1
            com.google.android.exoplayer2.Timeline$Window r1 = new com.google.android.exoplayer2.Timeline$Window
            r1.<init>()
            r0.window = r1
            com.google.android.exoplayer2.Timeline$Period r1 = new com.google.android.exoplayer2.Timeline$Period
            r1.<init>()
            r0.period = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.sessions = r1
            com.google.android.exoplayer2.Timeline r1 = com.google.android.exoplayer2.Timeline.EMPTY
            r0.currentTimeline = r1
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.Timeline.Window access$600(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r0) {
            com.google.android.exoplayer2.Timeline$Window r0 = r0.window
            return r0
    }

    public static /* synthetic */ com.google.android.exoplayer2.Timeline.Period access$700(com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager r0) {
            com.google.android.exoplayer2.Timeline$Period r0 = r0.period
            return r0
    }

    private static java.lang.String generateDefaultSessionId() {
            r0 = 12
            byte[] r0 = new byte[r0]
            java.util.Random r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.RANDOM
            r1.nextBytes(r0)
            r1 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)
            return r0
    }

    private com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor getOrAddSession(int r11, @androidx.annotation.Nullable com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r12) {
            r10 = this;
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r0 = r10.sessions
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r0.next()
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r4 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r4
            r4.maybeSetWindowSequenceNumber(r11, r12)
            boolean r5 = r4.belongsToSession(r11, r12)
            if (r5 == 0) goto L10
            long r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$100(r4)
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L4a
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L34
            goto L4a
        L34:
            if (r7 != 0) goto L10
            java.lang.Object r5 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r5 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r5
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r5)
            if (r5 == 0) goto L10
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r4)
            if (r5 == 0) goto L10
            r1 = r4
            goto L10
        L4a:
            r1 = r4
            r2 = r5
            goto L10
        L4d:
            if (r1 != 0) goto L61
            com.google.common.base.Supplier<java.lang.String> r0 = r10.sessionIdGenerator
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r1 = new com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor
            r1.<init>(r10, r0, r11, r12)
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r11 = r10.sessions
            r11.put(r0, r1)
        L61:
            return r1
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"listener"})
    private void updateCurrentSession(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r8) {
            r7 = this;
            com.google.android.exoplayer2.Timeline r0 = r8.timeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r8 = 0
            r7.currentSessionId = r8
            return
        Lc:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r0 = r7.sessions
            java.lang.String r1 = r7.currentSessionId
            java.lang.Object r0 = r0.get(r1)
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r0 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r0
            int r1 = r8.windowIndex
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r8.mediaPeriodId
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r1 = r7.getOrAddSession(r1, r2)
            java.lang.String r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r1)
            r7.currentSessionId = r2
            r7.updateSessions(r8)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r8.mediaPeriodId
            if (r2 == 0) goto L7b
            boolean r2 = r2.isAd()
            if (r2 == 0) goto L7b
            if (r0 == 0) goto L5d
            long r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$100(r0)
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r4 = r8.mediaPeriodId
            long r4 = r4.windowSequenceNumber
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L5d
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r0)
            if (r2 == 0) goto L5d
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r0)
            int r2 = r2.adGroupIndex
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r8.mediaPeriodId
            int r3 = r3.adGroupIndex
            if (r2 != r3) goto L5d
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$500(r0)
            int r0 = r0.adIndexInAdGroup
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r8.mediaPeriodId
            int r2 = r2.adIndexInAdGroup
            if (r0 == r2) goto L7b
        L5d:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r0 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r2 = r8.mediaPeriodId
            java.lang.Object r3 = r2.periodUid
            long r4 = r2.windowSequenceNumber
            r0.<init>(r3, r4)
            int r2 = r8.windowIndex
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r0 = r7.getOrAddSession(r2, r0)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r7.listener
            java.lang.String r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r0)
            java.lang.String r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r1)
            r2.onAdPlaybackStarted(r8, r0, r1)
        L7b:
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r0 = r2.sessions     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L1f
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r4 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r4     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto Le
            r3 = 0
            monitor-exit(r2)
            return r3
        Le:
            int r0 = r3.windowIndex     // Catch: java.lang.Throwable -> L1f
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r1 = r3.mediaPeriodId     // Catch: java.lang.Throwable -> L1f
            r4.maybeSetWindowSequenceNumber(r0, r1)     // Catch: java.lang.Throwable -> L1f
            int r0 = r3.windowIndex     // Catch: java.lang.Throwable -> L1f
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r3.mediaPeriodId     // Catch: java.lang.Throwable -> L1f
            boolean r3 = r4.belongsToSession(r0, r3)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)
            return r3
        L1f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r5) {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.currentSessionId = r0     // Catch: java.lang.Throwable -> L32
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r0 = r4.sessions     // Catch: java.lang.Throwable -> L32
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
        Le:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r1 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r1     // Catch: java.lang.Throwable -> L32
            r0.remove()     // Catch: java.lang.Throwable -> L32
            boolean r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$300(r1)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto Le
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r4.listener     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto Le
            java.lang.String r1 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r1)     // Catch: java.lang.Throwable -> L32
            r3 = 0
            r2.onSessionFinished(r5, r1, r3)     // Catch: java.lang.Throwable -> L32
            goto Le
        L30:
            monitor-exit(r4)
            return
        L32:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    @androidx.annotation.Nullable
    public synchronized java.lang.String getActiveSessionId() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.currentSessionId     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized java.lang.String getSessionForMediaPeriodId(com.google.android.exoplayer2.Timeline r3, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId r4) {
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r4.periodUid     // Catch: java.lang.Throwable -> L15
            com.google.android.exoplayer2.Timeline$Period r1 = r2.period     // Catch: java.lang.Throwable -> L15
            com.google.android.exoplayer2.Timeline$Period r3 = r3.getPeriodByUid(r0, r1)     // Catch: java.lang.Throwable -> L15
            int r3 = r3.windowIndex     // Catch: java.lang.Throwable -> L15
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r3 = r2.getOrAddSession(r3, r4)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r3)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public void setListener(com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessions(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r22) {
            r21 = this;
            r1 = r21
            r0 = r22
            monitor-enter(r21)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r1.listener     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.Timeline r2 = r0.timeline     // Catch: java.lang.Throwable -> L10b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L10b
            if (r2 == 0) goto L14
            monitor-exit(r21)
            return
        L14:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r2 = r1.sessions     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = r1.currentSessionId     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r2 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r2     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch: java.lang.Throwable -> L10b
            if (r3 == 0) goto L49
            if (r2 == 0) goto L49
            long r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$100(r2)     // Catch: java.lang.Throwable -> L10b
            r5 = -1
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L38
            int r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$200(r2)     // Catch: java.lang.Throwable -> L10b
            int r3 = r0.windowIndex     // Catch: java.lang.Throwable -> L10b
            if (r2 == r3) goto L45
            goto L44
        L38:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch: java.lang.Throwable -> L10b
            long r3 = r3.windowSequenceNumber     // Catch: java.lang.Throwable -> L10b
            long r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$100(r2)     // Catch: java.lang.Throwable -> L10b
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L45
        L44:
            r7 = 1
        L45:
            if (r7 == 0) goto L49
            monitor-exit(r21)
            return
        L49:
            int r2 = r0.windowIndex     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r2 = r1.getOrAddSession(r2, r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = r1.currentSessionId     // Catch: java.lang.Throwable -> L10b
            if (r3 != 0) goto L5b
            java.lang.String r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r2)     // Catch: java.lang.Throwable -> L10b
            r1.currentSessionId = r3     // Catch: java.lang.Throwable -> L10b
        L5b:
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch: java.lang.Throwable -> L10b
            if (r3 == 0) goto Ld2
            boolean r3 = r3.isAd()     // Catch: java.lang.Throwable -> L10b
            if (r3 == 0) goto Ld2
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r9 = new com.google.android.exoplayer2.source.MediaSource$MediaPeriodId     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r3 = r0.mediaPeriodId     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r4 = r3.periodUid     // Catch: java.lang.Throwable -> L10b
            long r5 = r3.windowSequenceNumber     // Catch: java.lang.Throwable -> L10b
            int r3 = r3.adGroupIndex     // Catch: java.lang.Throwable -> L10b
            r9.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> L10b
            int r3 = r0.windowIndex     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r3 = r1.getOrAddSession(r3, r9)     // Catch: java.lang.Throwable -> L10b
            boolean r4 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$300(r3)     // Catch: java.lang.Throwable -> L10b
            if (r4 != 0) goto Ld2
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$302(r3)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.Timeline r4 = r0.timeline     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.mediaPeriodId     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r5 = r5.periodUid     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.Timeline$Period r6 = r1.period     // Catch: java.lang.Throwable -> L10b
            r4.getPeriodByUid(r5, r6)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.Timeline$Period r4 = r1.period     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r5 = r0.mediaPeriodId     // Catch: java.lang.Throwable -> L10b
            int r5 = r5.adGroupIndex     // Catch: java.lang.Throwable -> L10b
            long r4 = r4.getAdGroupTimeUs(r5)     // Catch: java.lang.Throwable -> L10b
            long r4 = com.google.android.exoplayer2.util.Util.usToMs(r4)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.Timeline$Period r6 = r1.period     // Catch: java.lang.Throwable -> L10b
            long r6 = r6.getPositionInWindowMs()     // Catch: java.lang.Throwable -> L10b
            long r4 = r4 + r6
            r6 = 0
            long r10 = java.lang.Math.max(r6, r4)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime r15 = new com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime     // Catch: java.lang.Throwable -> L10b
            long r5 = r0.realtimeMs     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.Timeline r7 = r0.timeline     // Catch: java.lang.Throwable -> L10b
            int r8 = r0.windowIndex     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.Timeline r12 = r0.currentTimeline     // Catch: java.lang.Throwable -> L10b
            int r13 = r0.currentWindowIndex     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.source.MediaSource$MediaPeriodId r14 = r0.currentMediaPeriodId     // Catch: java.lang.Throwable -> L10b
            r19 = r2
            r20 = r3
            long r2 = r0.currentPlaybackPositionMs     // Catch: java.lang.Throwable -> L10b
            r16 = r2
            long r2 = r0.totalBufferedDurationMs     // Catch: java.lang.Throwable -> L10b
            r4 = r15
            r0 = r15
            r15 = r16
            r17 = r2
            r4.<init>(r5, r7, r8, r9, r10, r12, r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r2 = r1.listener     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r20)     // Catch: java.lang.Throwable -> L10b
            r2.onSessionCreated(r0, r3)     // Catch: java.lang.Throwable -> L10b
            goto Ld4
        Ld2:
            r19 = r2
        Ld4:
            boolean r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$300(r19)     // Catch: java.lang.Throwable -> L10b
            if (r0 != 0) goto Le9
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$302(r19)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r0 = r1.listener     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r19)     // Catch: java.lang.Throwable -> L10b
            r3 = r22
            r0.onSessionCreated(r3, r2)     // Catch: java.lang.Throwable -> L10b
            goto Leb
        Le9:
            r3 = r22
        Leb:
            java.lang.String r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r19)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = r1.currentSessionId     // Catch: java.lang.Throwable -> L10b
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L10b
            if (r0 == 0) goto L109
            boolean r0 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$400(r19)     // Catch: java.lang.Throwable -> L10b
            if (r0 != 0) goto L109
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$402(r19)     // Catch: java.lang.Throwable -> L10b
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r0 = r1.listener     // Catch: java.lang.Throwable -> L10b
            java.lang.String r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r19)     // Catch: java.lang.Throwable -> L10b
            r0.onSessionActive(r3, r2)     // Catch: java.lang.Throwable -> L10b
        L109:
            monitor-exit(r21)
            return
        L10b:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r0 = r6.listener     // Catch: java.lang.Throwable -> L5d
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L5d
            r0 = 1
            r1 = 0
            if (r8 != 0) goto Lc
            r8 = 1
            goto Ld
        Lc:
            r8 = 0
        Ld:
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r2 = r6.sessions     // Catch: java.lang.Throwable -> L5d
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L5d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5d
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L58
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5d
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r3 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r3     // Catch: java.lang.Throwable -> L5d
            boolean r4 = r3.isFinishedAtEventTime(r7)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L17
            r2.remove()     // Catch: java.lang.Throwable -> L5d
            boolean r4 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$300(r3)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L17
            java.lang.String r4 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r3)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = r6.currentSessionId     // Catch: java.lang.Throwable -> L5d
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L5d
            if (r8 == 0) goto L48
            if (r4 == 0) goto L48
            boolean r5 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$400(r3)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L48
            r5 = 1
            goto L49
        L48:
            r5 = 0
        L49:
            if (r4 == 0) goto L4e
            r4 = 0
            r6.currentSessionId = r4     // Catch: java.lang.Throwable -> L5d
        L4e:
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r4 = r6.listener     // Catch: java.lang.Throwable -> L5d
            java.lang.String r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r3)     // Catch: java.lang.Throwable -> L5d
            r4.onSessionFinished(r7, r3, r5)     // Catch: java.lang.Throwable -> L5d
            goto L17
        L58:
            r6.updateCurrentSession(r7)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            return
        L5d:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime r6) {
            r5 = this;
            monitor-enter(r5)
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r0 = r5.listener     // Catch: java.lang.Throwable -> L58
            com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L58
            com.google.android.exoplayer2.Timeline r0 = r5.currentTimeline     // Catch: java.lang.Throwable -> L58
            com.google.android.exoplayer2.Timeline r1 = r6.timeline     // Catch: java.lang.Throwable -> L58
            r5.currentTimeline = r1     // Catch: java.lang.Throwable -> L58
            java.util.HashMap<java.lang.String, com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor> r1 = r5.sessions     // Catch: java.lang.Throwable -> L58
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L58
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L58
            com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager$SessionDescriptor r2 = (com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor) r2     // Catch: java.lang.Throwable -> L58
            com.google.android.exoplayer2.Timeline r3 = r5.currentTimeline     // Catch: java.lang.Throwable -> L58
            boolean r3 = r2.tryResolvingToNewTimeline(r0, r3)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L30
            boolean r3 = r2.isFinishedAtEventTime(r6)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L16
        L30:
            r1.remove()     // Catch: java.lang.Throwable -> L58
            boolean r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$300(r2)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L16
            java.lang.String r3 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = r5.currentSessionId     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L48
            r3 = 0
            r5.currentSessionId = r3     // Catch: java.lang.Throwable -> L58
        L48:
            com.google.android.exoplayer2.analytics.PlaybackSessionManager$Listener r3 = r5.listener     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager.SessionDescriptor.access$000(r2)     // Catch: java.lang.Throwable -> L58
            r4 = 0
            r3.onSessionFinished(r6, r2, r4)     // Catch: java.lang.Throwable -> L58
            goto L16
        L53:
            r5.updateCurrentSession(r6)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)
            return
        L58:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
