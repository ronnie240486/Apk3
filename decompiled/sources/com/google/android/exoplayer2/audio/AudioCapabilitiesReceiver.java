package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioCapabilitiesReceiver {

    @androidx.annotation.Nullable
    public com.google.android.exoplayer2.audio.AudioCapabilities audioCapabilities;
    private final android.content.Context context;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.ExternalSurroundSoundSettingObserver externalSurroundSoundSettingObserver;
    private final android.os.Handler handler;
    private final com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener listener;

    @androidx.annotation.Nullable
    private final android.content.BroadcastReceiver receiver;
    private boolean registered;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class ExternalSurroundSoundSettingObserver extends android.database.ContentObserver {
        private final android.content.ContentResolver resolver;
        private final android.net.Uri settingUri;
        public final /* synthetic */ com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver this$0;

        public ExternalSurroundSoundSettingObserver(com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver r1, android.os.Handler r2, android.content.ContentResolver r3, android.net.Uri r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.resolver = r3
                r0.settingUri = r4
                return
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r2) {
                r1 = this;
                com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver r2 = r1.this$0
                android.content.Context r0 = com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.access$200(r2)
                com.google.android.exoplayer2.audio.AudioCapabilities r0 = com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(r0)
                com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.access$100(r2, r0)
                return
        }

        public void register() {
                r3 = this;
                android.content.ContentResolver r0 = r3.resolver
                android.net.Uri r1 = r3.settingUri
                r2 = 0
                r0.registerContentObserver(r1, r2, r3)
                return
        }

        public void unregister() {
                r1 = this;
                android.content.ContentResolver r0 = r1.resolver
                r0.unregisterContentObserver(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public final class HdmiAudioPlugBroadcastReceiver extends android.content.BroadcastReceiver {
        public final /* synthetic */ com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver this$0;

        private HdmiAudioPlugBroadcastReceiver(com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ HdmiAudioPlugBroadcastReceiver(com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver r1, com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                boolean r0 = r1.isInitialStickyBroadcast()
                if (r0 != 0) goto Lf
                com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver r0 = r1.this$0
                com.google.android.exoplayer2.audio.AudioCapabilities r2 = com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(r2, r3)
                com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.access$100(r0, r2)
            Lf:
                return
        }
    }

    public interface Listener {
        void onAudioCapabilitiesChanged(com.google.android.exoplayer2.audio.AudioCapabilities r1);
    }

    public AudioCapabilitiesReceiver(android.content.Context r4, com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener r5) {
            r3 = this;
            r3.<init>()
            android.content.Context r4 = r4.getApplicationContext()
            r3.context = r4
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$Listener r5 = (com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.Listener) r5
            r3.listener = r5
            android.os.Handler r5 = com.google.android.exoplayer2.util.Util.createHandlerForCurrentOrMainLooper()
            r3.handler = r5
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 0
            r2 = 21
            if (r0 < r2) goto L24
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver r0 = new com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver
            r0.<init>(r3, r1)
            goto L25
        L24:
            r0 = r1
        L25:
            r3.receiver = r0
            android.net.Uri r0 = com.google.android.exoplayer2.audio.AudioCapabilities.getExternalSurroundSoundGlobalSettingUri()
            if (r0 == 0) goto L36
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver r1 = new com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver
            android.content.ContentResolver r4 = r4.getContentResolver()
            r1.<init>(r3, r5, r4, r0)
        L36:
            r3.externalSurroundSoundSettingObserver = r1
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver r0, com.google.android.exoplayer2.audio.AudioCapabilities r1) {
            r0.onNewAudioCapabilities(r1)
            return
    }

    public static /* synthetic */ android.content.Context access$200(com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver r0) {
            android.content.Context r0 = r0.context
            return r0
    }

    private void onNewAudioCapabilities(com.google.android.exoplayer2.audio.AudioCapabilities r2) {
            r1 = this;
            boolean r0 = r1.registered
            if (r0 == 0) goto L13
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = r1.audioCapabilities
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L13
            r1.audioCapabilities = r2
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$Listener r0 = r1.listener
            r0.onAudioCapabilitiesChanged(r2)
        L13:
            return
    }

    public com.google.android.exoplayer2.audio.AudioCapabilities register() {
            r5 = this;
            boolean r0 = r5.registered
            if (r0 == 0) goto Ld
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = r5.audioCapabilities
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = (com.google.android.exoplayer2.audio.AudioCapabilities) r0
            return r0
        Ld:
            r0 = 1
            r5.registered = r0
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver r0 = r5.externalSurroundSoundSettingObserver
            if (r0 == 0) goto L17
            r0.register()
        L17:
            android.content.BroadcastReceiver r0 = r5.receiver
            r1 = 0
            if (r0 == 0) goto L2d
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.media.action.HDMI_AUDIO_PLUG"
            r0.<init>(r2)
            android.content.Context r2 = r5.context
            android.content.BroadcastReceiver r3 = r5.receiver
            android.os.Handler r4 = r5.handler
            android.content.Intent r1 = r2.registerReceiver(r3, r0, r1, r4)
        L2d:
            android.content.Context r0 = r5.context
            com.google.android.exoplayer2.audio.AudioCapabilities r0 = com.google.android.exoplayer2.audio.AudioCapabilities.getCapabilities(r0, r1)
            r5.audioCapabilities = r0
            return r0
    }

    public void unregister() {
            r2 = this;
            boolean r0 = r2.registered
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.audioCapabilities = r0
            android.content.BroadcastReceiver r0 = r2.receiver
            if (r0 == 0) goto L11
            android.content.Context r1 = r2.context
            r1.unregisterReceiver(r0)
        L11:
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver r0 = r2.externalSurroundSoundSettingObserver
            if (r0 == 0) goto L18
            r0.unregister()
        L18:
            r0 = 0
            r2.registered = r0
            return
    }
}
