package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
final class AudioFocusManager {
    private static final int AUDIOFOCUS_GAIN = 1;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final int AUDIOFOCUS_NONE = 0;
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 1;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 3;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 0;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final java.lang.String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
    private android.media.AudioFocusRequest audioFocusRequest;
    private int audioFocusState;
    private final android.media.AudioManager audioManager;
    private int focusGainToRequest;
    private final com.google.android.exoplayer2.AudioFocusManager.AudioFocusListener focusListener;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.AudioFocusManager.PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier;

    public class AudioFocusListener implements android.media.AudioManager.OnAudioFocusChangeListener {
        private final android.os.Handler eventHandler;
        public final /* synthetic */ com.google.android.exoplayer2.AudioFocusManager this$0;

        public static /* synthetic */ void $r8$lambda$hDsXdOav9vPHI2rafi8uE7GFL_o(com.google.android.exoplayer2.AudioFocusManager.AudioFocusListener r0, int r1) {
                r0.lambda$onAudioFocusChange$0(r1)
                return
        }

        public AudioFocusListener(com.google.android.exoplayer2.AudioFocusManager r1, android.os.Handler r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.eventHandler = r2
                return
        }

        private /* synthetic */ void lambda$onAudioFocusChange$0(int r2) {
                r1 = this;
                com.google.android.exoplayer2.AudioFocusManager r0 = r1.this$0
                com.google.android.exoplayer2.AudioFocusManager.access$000(r0, r2)
                return
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int r3) {
                r2 = this;
                android.os.Handler r0 = r2.eventHandler
                com.google.android.exoplayer2.AudioFocusManager$AudioFocusListener$$ExternalSyntheticLambda0 r1 = new com.google.android.exoplayer2.AudioFocusManager$AudioFocusListener$$ExternalSyntheticLambda0
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface PlayerControl {
        void executePlayerCommand(int r1);

        void setVolumeMultiplier(float r1);
    }

    public AudioFocusManager(android.content.Context r2, android.os.Handler r3, com.google.android.exoplayer2.AudioFocusManager.PlayerControl r4) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.volumeMultiplier = r0
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r1.audioManager = r2
            r1.playerControl = r4
            com.google.android.exoplayer2.AudioFocusManager$AudioFocusListener r2 = new com.google.android.exoplayer2.AudioFocusManager$AudioFocusListener
            r2.<init>(r1, r3)
            r1.focusListener = r2
            r2 = 0
            r1.audioFocusState = r2
            return
    }

    private void abandonAudioFocusDefault() {
            r2 = this;
            android.media.AudioManager r0 = r2.audioManager
            com.google.android.exoplayer2.AudioFocusManager$AudioFocusListener r1 = r2.focusListener
            r0.abandonAudioFocus(r1)
            return
    }

    private void abandonAudioFocusIfHeld() {
            r2 = this;
            int r0 = r2.audioFocusState
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lf
            r2.abandonAudioFocusV26()
            goto L12
        Lf:
            r2.abandonAudioFocusDefault()
        L12:
            r0 = 0
            r2.setAudioFocusState(r0)
            return
    }

    @androidx.annotation.RequiresApi(26)
    private void abandonAudioFocusV26() {
            r2 = this;
            android.media.AudioFocusRequest r0 = r2.audioFocusRequest
            if (r0 == 0) goto L9
            android.media.AudioManager r1 = r2.audioManager
            r1.abandonAudioFocusRequest(r0)
        L9:
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.AudioFocusManager r0, int r1) {
            r0.handlePlatformAudioFocusChange(r1)
            return
    }

    private static int convertAudioAttributesToFocusGain(@androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioAttributes r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            int r1 = r6.usage
            r2 = 3
            java.lang.String r3 = "AudioFocusManager"
            r4 = 2
            r5 = 1
            switch(r1) {
                case 0: goto L33;
                case 1: goto L32;
                case 2: goto L31;
                case 3: goto L30;
                case 4: goto L31;
                case 5: goto L2f;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L2a;
                case 12: goto L2f;
                case 13: goto L2f;
                case 14: goto L32;
                case 15: goto Le;
                case 16: goto L21;
                default: goto Le;
            }
        Le:
            java.lang.String r1 = "Unidentified audio usage: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r6 = r6.usage
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.google.android.exoplayer2.util.Log.w(r3, r6)
            return r0
        L21:
            int r6 = com.google.android.exoplayer2.util.Util.SDK_INT
            r0 = 19
            if (r6 < r0) goto L29
            r6 = 4
            return r6
        L29:
            return r4
        L2a:
            int r6 = r6.contentType
            if (r6 != r5) goto L2f
            return r4
        L2f:
            return r2
        L30:
            return r0
        L31:
            return r4
        L32:
            return r5
        L33:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            com.google.android.exoplayer2.util.Log.w(r3, r6)
            return r5
    }

    private void executePlayerCommand(int r2) {
            r1 = this;
            com.google.android.exoplayer2.AudioFocusManager$PlayerControl r0 = r1.playerControl
            if (r0 == 0) goto L7
            r0.executePlayerCommand(r2)
        L7:
            return
    }

    private void handlePlatformAudioFocusChange(int r3) {
            r2 = this;
            r0 = -3
            r1 = -2
            if (r3 == r0) goto L22
            if (r3 == r1) goto L22
            r0 = -1
            if (r3 == r0) goto L1b
            r0 = 1
            if (r3 == r0) goto L14
            java.lang.String r0 = "Unknown focus change type: "
            java.lang.String r1 = "AudioFocusManager"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m26m(r0, r3, r1)
            return
        L14:
            r2.setAudioFocusState(r0)
            r2.executePlayerCommand(r0)
            return
        L1b:
            r2.executePlayerCommand(r0)
            r2.abandonAudioFocusIfHeld()
            return
        L22:
            if (r3 == r1) goto L30
            boolean r3 = r2.willPauseWhenDucked()
            if (r3 == 0) goto L2b
            goto L30
        L2b:
            r3 = 3
            r2.setAudioFocusState(r3)
            goto L38
        L30:
            r3 = 0
            r2.executePlayerCommand(r3)
            r3 = 2
            r2.setAudioFocusState(r3)
        L38:
            return
    }

    private int requestAudioFocus() {
            r3 = this;
            int r0 = r3.audioFocusState
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r2 = 26
            if (r0 < r2) goto L11
            int r0 = r3.requestAudioFocusV26()
            goto L15
        L11:
            int r0 = r3.requestAudioFocusDefault()
        L15:
            if (r0 != r1) goto L1b
            r3.setAudioFocusState(r1)
            return r1
        L1b:
            r0 = 0
            r3.setAudioFocusState(r0)
            r0 = -1
            return r0
    }

    private int requestAudioFocusDefault() {
            r4 = this;
            android.media.AudioManager r0 = r4.audioManager
            com.google.android.exoplayer2.AudioFocusManager$AudioFocusListener r1 = r4.focusListener
            com.google.android.exoplayer2.audio.AudioAttributes r2 = r4.audioAttributes
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.audio.AudioAttributes r2 = (com.google.android.exoplayer2.audio.AudioAttributes) r2
            int r2 = r2.usage
            int r2 = com.google.android.exoplayer2.util.Util.getStreamTypeForAudioUsage(r2)
            int r3 = r4.focusGainToRequest
            int r0 = r0.requestAudioFocus(r1, r2, r3)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    private int requestAudioFocusV26() {
            r3 = this;
            android.media.AudioFocusRequest r0 = r3.audioFocusRequest
            if (r0 == 0) goto L8
            boolean r1 = r3.rebuildAudioFocusRequest
            if (r1 == 0) goto L42
        L8:
            if (r0 != 0) goto L12
            android.media.AudioFocusRequest$Builder r0 = new android.media.AudioFocusRequest$Builder
            int r1 = r3.focusGainToRequest
            r0.<init>(r1)
            goto L19
        L12:
            android.media.AudioFocusRequest$Builder r0 = new android.media.AudioFocusRequest$Builder
            android.media.AudioFocusRequest r1 = r3.audioFocusRequest
            r0.<init>(r1)
        L19:
            boolean r1 = r3.willPauseWhenDucked()
            com.google.android.exoplayer2.audio.AudioAttributes r2 = r3.audioAttributes
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.audio.AudioAttributes r2 = (com.google.android.exoplayer2.audio.AudioAttributes) r2
            com.google.android.exoplayer2.audio.AudioAttributes$AudioAttributesV21 r2 = r2.getAudioAttributesV21()
            android.media.AudioAttributes r2 = r2.audioAttributes
            android.media.AudioFocusRequest$Builder r0 = r0.setAudioAttributes(r2)
            android.media.AudioFocusRequest$Builder r0 = r0.setWillPauseWhenDucked(r1)
            com.google.android.exoplayer2.AudioFocusManager$AudioFocusListener r1 = r3.focusListener
            android.media.AudioFocusRequest$Builder r0 = r0.setOnAudioFocusChangeListener(r1)
            android.media.AudioFocusRequest r0 = r0.build()
            r3.audioFocusRequest = r0
            r0 = 0
            r3.rebuildAudioFocusRequest = r0
        L42:
            android.media.AudioManager r0 = r3.audioManager
            android.media.AudioFocusRequest r1 = r3.audioFocusRequest
            int r0 = r0.requestAudioFocus(r1)
            return r0
    }

    private void setAudioFocusState(int r2) {
            r1 = this;
            int r0 = r1.audioFocusState
            if (r0 != r2) goto L5
            return
        L5:
            r1.audioFocusState = r2
            r0 = 3
            if (r2 != r0) goto Le
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            goto L10
        Le:
            r2 = 1065353216(0x3f800000, float:1.0)
        L10:
            float r0 = r1.volumeMultiplier
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            return
        L17:
            r1.volumeMultiplier = r2
            com.google.android.exoplayer2.AudioFocusManager$PlayerControl r0 = r1.playerControl
            if (r0 == 0) goto L20
            r0.setVolumeMultiplier(r2)
        L20:
            return
    }

    private boolean shouldAbandonAudioFocusIfHeld(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L9
            int r2 = r1.focusGainToRequest
            if (r2 == r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private boolean willPauseWhenDucked() {
            r2 = this;
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r2.audioAttributes
            r1 = 1
            if (r0 == 0) goto La
            int r0 = r0.contentType
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    public float getVolumeMultiplier() {
            r1 = this;
            float r0 = r1.volumeMultiplier
            return r0
    }

    public void release() {
            r1 = this;
            r0 = 0
            r1.playerControl = r0
            r1.abandonAudioFocusIfHeld()
            return
    }

    public void setAudioAttributes(@androidx.annotation.Nullable com.google.android.exoplayer2.audio.AudioAttributes r2) {
            r1 = this;
            com.google.android.exoplayer2.audio.AudioAttributes r0 = r1.audioAttributes
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 != 0) goto L1c
            r1.audioAttributes = r2
            int r2 = convertAudioAttributesToFocusGain(r2)
            r1.focusGainToRequest = r2
            r0 = 1
            if (r2 == r0) goto L17
            if (r2 != 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.String r2 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            com.google.android.exoplayer2.util.Assertions.checkArgument(r0, r2)
        L1c:
            return
    }

    public int updateAudioFocus(boolean r2, int r3) {
            r1 = this;
            boolean r3 = r1.shouldAbandonAudioFocusIfHeld(r3)
            r0 = -1
            if (r3 == 0) goto Le
            r1.abandonAudioFocusIfHeld()
            if (r2 == 0) goto Ld
            r0 = 1
        Ld:
            return r0
        Le:
            if (r2 == 0) goto L14
            int r0 = r1.requestAudioFocus()
        L14:
            return r0
    }
}
