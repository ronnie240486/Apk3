package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes3.dex */
final class StreamVolumeManager {
    private static final java.lang.String TAG = "StreamVolumeManager";
    private static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private static final int VOLUME_FLAGS = 1;
    private final android.content.Context applicationContext;
    private final android.media.AudioManager audioManager;
    private final android.os.Handler eventHandler;
    private final com.google.android.exoplayer2.StreamVolumeManager.Listener listener;
    private boolean muted;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.StreamVolumeManager.VolumeChangeReceiver receiver;
    private int streamType;
    private int volume;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.StreamVolumeManager$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Listener {
        void onStreamTypeChanged(int r1);

        void onStreamVolumeChanged(int r1, boolean r2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class VolumeChangeReceiver extends android.content.BroadcastReceiver {
        public final /* synthetic */ com.google.android.exoplayer2.StreamVolumeManager this$0;

        /* JADX INFO: renamed from: $r8$lambda$gbvsk3ezeqRi-ugOdxQIIjQLC1k, reason: not valid java name */
        public static /* synthetic */ void m183$r8$lambda$gbvsk3ezeqRiugOdxQIIjQLC1k(com.google.android.exoplayer2.StreamVolumeManager r0) {
                lambda$onReceive$0(r0)
                return
        }

        private VolumeChangeReceiver(com.google.android.exoplayer2.StreamVolumeManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ VolumeChangeReceiver(com.google.android.exoplayer2.StreamVolumeManager r1, com.google.android.exoplayer2.StreamVolumeManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private static /* synthetic */ void lambda$onReceive$0(com.google.android.exoplayer2.StreamVolumeManager r0) {
                com.google.android.exoplayer2.StreamVolumeManager.access$200(r0)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                com.google.android.exoplayer2.StreamVolumeManager r2 = r1.this$0
                android.os.Handler r2 = com.google.android.exoplayer2.StreamVolumeManager.access$100(r2)
                com.google.android.exoplayer2.StreamVolumeManager r3 = r1.this$0
                com.google.android.exoplayer2.StreamVolumeManager$VolumeChangeReceiver$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.StreamVolumeManager$VolumeChangeReceiver$$ExternalSyntheticLambda0
                r0.<init>(r3)
                r2.post(r0)
                return
        }
    }

    public StreamVolumeManager(android.content.Context r2, android.os.Handler r3, com.google.android.exoplayer2.StreamVolumeManager.Listener r4) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.applicationContext = r2
            r1.eventHandler = r3
            r1.listener = r4
            java.lang.String r3 = "audio"
            java.lang.Object r3 = r2.getSystemService(r3)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkStateNotNull(r3)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r1.audioManager = r3
            r4 = 3
            r1.streamType = r4
            int r4 = getVolumeFromManager(r3, r4)
            r1.volume = r4
            int r4 = r1.streamType
            boolean r3 = getMutedFromManager(r3, r4)
            r1.muted = r3
            com.google.android.exoplayer2.StreamVolumeManager$VolumeChangeReceiver r3 = new com.google.android.exoplayer2.StreamVolumeManager$VolumeChangeReceiver
            r4 = 0
            r3.<init>(r1, r4)
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r0 = "android.media.VOLUME_CHANGED_ACTION"
            r4.<init>(r0)
            r2.registerReceiver(r3, r4)     // Catch: java.lang.RuntimeException -> L41
            r1.receiver = r3     // Catch: java.lang.RuntimeException -> L41
            goto L49
        L41:
            r2 = move-exception
            java.lang.String r3 = "StreamVolumeManager"
            java.lang.String r4 = "Error registering stream volume receiver"
            com.google.android.exoplayer2.util.Log.w(r3, r4, r2)
        L49:
            return
    }

    public static /* synthetic */ android.os.Handler access$100(com.google.android.exoplayer2.StreamVolumeManager r0) {
            android.os.Handler r0 = r0.eventHandler
            return r0
    }

    public static /* synthetic */ void access$200(com.google.android.exoplayer2.StreamVolumeManager r0) {
            r0.updateVolumeAndNotifyIfChanged()
            return
    }

    private static boolean getMutedFromManager(android.media.AudioManager r2, int r3) {
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            boolean r2 = r2.isStreamMute(r3)
            return r2
        Lb:
            int r2 = getVolumeFromManager(r2, r3)
            if (r2 != 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    private static int getVolumeFromManager(android.media.AudioManager r3, int r4) {
            int r3 = r3.getStreamVolume(r4)     // Catch: java.lang.RuntimeException -> L5
            return r3
        L5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not retrieve stream volume for stream type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "StreamVolumeManager"
            com.google.android.exoplayer2.util.Log.w(r2, r1, r0)
            int r3 = r3.getStreamMaxVolume(r4)
            return r3
    }

    private void updateVolumeAndNotifyIfChanged() {
            r3 = this;
            android.media.AudioManager r0 = r3.audioManager
            int r1 = r3.streamType
            int r0 = getVolumeFromManager(r0, r1)
            android.media.AudioManager r1 = r3.audioManager
            int r2 = r3.streamType
            boolean r1 = getMutedFromManager(r1, r2)
            int r2 = r3.volume
            if (r2 != r0) goto L18
            boolean r2 = r3.muted
            if (r2 == r1) goto L21
        L18:
            r3.volume = r0
            r3.muted = r1
            com.google.android.exoplayer2.StreamVolumeManager$Listener r2 = r3.listener
            r2.onStreamVolumeChanged(r0, r1)
        L21:
            return
    }

    public void decreaseVolume() {
            r4 = this;
            int r0 = r4.volume
            int r1 = r4.getMinVolume()
            if (r0 > r1) goto L9
            return
        L9:
            android.media.AudioManager r0 = r4.audioManager
            int r1 = r4.streamType
            r2 = -1
            r3 = 1
            r0.adjustStreamVolume(r1, r2, r3)
            r4.updateVolumeAndNotifyIfChanged()
            return
    }

    public int getMaxVolume() {
            r2 = this;
            android.media.AudioManager r0 = r2.audioManager
            int r1 = r2.streamType
            int r0 = r0.getStreamMaxVolume(r1)
            return r0
    }

    public int getMinVolume() {
            r2 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            android.media.AudioManager r0 = r2.audioManager
            int r1 = r2.streamType
            int r0 = r0.getStreamMinVolume(r1)
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public int getVolume() {
            r1 = this;
            int r0 = r1.volume
            return r0
    }

    public void increaseVolume() {
            r3 = this;
            int r0 = r3.volume
            int r1 = r3.getMaxVolume()
            if (r0 < r1) goto L9
            return
        L9:
            android.media.AudioManager r0 = r3.audioManager
            int r1 = r3.streamType
            r2 = 1
            r0.adjustStreamVolume(r1, r2, r2)
            r3.updateVolumeAndNotifyIfChanged()
            return
    }

    public boolean isMuted() {
            r1 = this;
            boolean r0 = r1.muted
            return r0
    }

    public void release() {
            r3 = this;
            com.google.android.exoplayer2.StreamVolumeManager$VolumeChangeReceiver r0 = r3.receiver
            if (r0 == 0) goto L15
            android.content.Context r1 = r3.applicationContext     // Catch: java.lang.RuntimeException -> La
            r1.unregisterReceiver(r0)     // Catch: java.lang.RuntimeException -> La
            goto L12
        La:
            r0 = move-exception
            java.lang.String r1 = "StreamVolumeManager"
            java.lang.String r2 = "Error unregistering stream volume receiver"
            com.google.android.exoplayer2.util.Log.w(r1, r2, r0)
        L12:
            r0 = 0
            r3.receiver = r0
        L15:
            return
    }

    public void setMuted(boolean r4) {
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L16
            android.media.AudioManager r0 = r3.audioManager
            int r1 = r3.streamType
            if (r4 == 0) goto Lf
            r4 = -100
            goto L11
        Lf:
            r4 = 100
        L11:
            r2 = 1
            r0.adjustStreamVolume(r1, r4, r2)
            goto L1d
        L16:
            android.media.AudioManager r0 = r3.audioManager
            int r1 = r3.streamType
            r0.setStreamMute(r1, r4)
        L1d:
            r3.updateVolumeAndNotifyIfChanged()
            return
    }

    public void setStreamType(int r2) {
            r1 = this;
            int r0 = r1.streamType
            if (r0 != r2) goto L5
            return
        L5:
            r1.streamType = r2
            r1.updateVolumeAndNotifyIfChanged()
            com.google.android.exoplayer2.StreamVolumeManager$Listener r0 = r1.listener
            r0.onStreamTypeChanged(r2)
            return
    }

    public void setVolume(int r4) {
            r3 = this;
            int r0 = r3.getMinVolume()
            if (r4 < r0) goto L18
            int r0 = r3.getMaxVolume()
            if (r4 <= r0) goto Ld
            goto L18
        Ld:
            android.media.AudioManager r0 = r3.audioManager
            int r1 = r3.streamType
            r2 = 1
            r0.setStreamVolume(r1, r4, r2)
            r3.updateVolumeAndNotifyIfChanged()
        L18:
            return
    }
}
