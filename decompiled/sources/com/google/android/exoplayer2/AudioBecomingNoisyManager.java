package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class AudioBecomingNoisyManager {
    private final android.content.Context context;
    private final com.google.android.exoplayer2.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver receiver;
    private boolean receiverRegistered;

    /* JADX INFO: loaded from: classes2.dex */
    public final class AudioBecomingNoisyReceiver extends android.content.BroadcastReceiver implements java.lang.Runnable {
        private final android.os.Handler eventHandler;
        private final com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener listener;
        public final /* synthetic */ com.google.android.exoplayer2.AudioBecomingNoisyManager this$0;

        public AudioBecomingNoisyReceiver(com.google.android.exoplayer2.AudioBecomingNoisyManager r1, android.os.Handler r2, com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.eventHandler = r2
                r0.listener = r3
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                java.lang.String r1 = r2.getAction()
                java.lang.String r2 = "android.media.AUDIO_BECOMING_NOISY"
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L11
                android.os.Handler r1 = r0.eventHandler
                r1.post(r0)
            L11:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                com.google.android.exoplayer2.AudioBecomingNoisyManager r0 = r1.this$0
                boolean r0 = com.google.android.exoplayer2.AudioBecomingNoisyManager.access$000(r0)
                if (r0 == 0) goto Ld
                com.google.android.exoplayer2.AudioBecomingNoisyManager$EventListener r0 = r1.listener
                r0.onAudioBecomingNoisy()
            Ld:
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(android.content.Context r1, android.os.Handler r2, com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener r3) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            com.google.android.exoplayer2.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver r1 = new com.google.android.exoplayer2.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver
            r1.<init>(r0, r2, r3)
            r0.receiver = r1
            return
    }

    public static /* synthetic */ boolean access$000(com.google.android.exoplayer2.AudioBecomingNoisyManager r0) {
            boolean r0 = r0.receiverRegistered
            return r0
    }

    public void setEnabled(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L18
            boolean r0 = r3.receiverRegistered
            if (r0 != 0) goto L18
            android.content.Context r4 = r3.context
            com.google.android.exoplayer2.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver r0 = r3.receiver
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.media.AUDIO_BECOMING_NOISY"
            r1.<init>(r2)
            r4.registerReceiver(r0, r1)
            r4 = 1
            r3.receiverRegistered = r4
            goto L28
        L18:
            if (r4 != 0) goto L28
            boolean r4 = r3.receiverRegistered
            if (r4 == 0) goto L28
            android.content.Context r4 = r3.context
            com.google.android.exoplayer2.AudioBecomingNoisyManager$AudioBecomingNoisyReceiver r0 = r3.receiver
            r4.unregisterReceiver(r0)
            r4 = 0
            r3.receiverRegistered = r4
        L28:
            return
    }
}
